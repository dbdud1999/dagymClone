
package com.project.dagymClone.Config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity // 스프링 시큐리티 필터가 스프링 필터 체인에 등록
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean   // 해당 메소드의 리턴되는 오브젝트를 IoC로 등록
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().permitAll()
                .and()
                .formLogin()
                //.usernameParameter("accountId")
                .defaultSuccessUrl("/") // 로그인 성공 후 리다이렉트 주소
                .and()
                .logout()
                //.logoutUrl("account/logout") // 로그아웃 페이지 링크
                //.logoutSuccessUrl("/account/login") // 로그아웃 성공시 리다이렉트 주소
                .deleteCookies("JSESSIONID") // 로그아웃 후 해당 쿠키 삭제
                .invalidateHttpSession(true) // 세션 날리기
                .and()
                .rememberMe()
        ;
    }
}