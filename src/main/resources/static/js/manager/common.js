$(document).ready(function(){
    // header.js
    if(window.location.pathname == "/manager/") {
        $(".header-search").remove();
        $(".header-user").remove();
    }
    $("body").click(function(e){
        if(($(e.target).parents('.header-profile').length > 0 || $(e.target).hasClass('header-profile')) && $('.header-profile').attr("topbar") == "close") {
            $(".header-profile-arrow > img").attr("src", "http://localhost:8080/img/header_menu/upward-arrow.png");
            $('.header-profile').attr("topbar", "open");
            showTopBar();
        }
        else if($('.header-profile').attr("topbar") == "open") {
            $(".header-profile-arrow > img").attr("src", "http://localhost:8080/img/header_menu/downward-arrow.png");
            $('.header-profile').attr("topbar", "close");
            closeTopBar();
        }
    });
    /*$(".header-profile").click(function(){
        if($(this).attr("topbar") == "open") {
            $(".header-profile-arrow > img").attr("src", "http://localhost:8080/img/header_menu/downward-arrow.png");
            $(this).attr("topbar", "close");
            closeTopBar();
        }
        else if($(this).attr("topbar") == "close") {
            $(".header-profile-arrow > img").attr("src", "http://localhost:8080/img/header_menu/upward-arrow.png");
            $(this).attr("topbar", "open");
            showTopBar();
        }
    });*/
});

// header.js
function headerSubmit() {
    let searchWord = $(".header-input").val().trim();
    if(searchWord == "" || searchWord == null) {
        location.href="http://localhost:8080/manager/member";
    }
    $("#header-search-form").submit();
}

function showTopBar() {
    let topBar = "<div class=\"top-bar\">";

    //시설 변경
    if($(".profile-gym").length){
        topBar += "<a href=\"/manager/\"><div class=\"top-bar-li change-gym\">";
        topBar += "시설 변경";
        topBar += "</div></a>";
    }
    //내 정보 설정
    topBar += "<a href=\"/manager/mypage\"><div class=\"top-bar-li my-info\">";
    topBar += "내 정보 설정";
    topBar += "</div></a>";
    // 로그아웃
    topBar += "<a href=\"javascript:void(0)\"><div class=\"top-bar-li logout\">";
    topBar += "로그아웃";
    topBar += "</div></a>";

    topBar += "</div>";

    $(".header-profile").append(topBar);
}

function closeTopBar() {
    $(".top-bar").remove();
}