$(document).ready(function(){
    // header.js
    $(".header-menu-search-input > input").focus(function(){
        $(".header-menu-search-text > span").hide();
    });
    $(".header-menu-search-input > input").blur(function(){
        if($(this).val() == "" || $(this).val == null) {
            $(".header-menu-search-text > span").show();
        }
    });
});