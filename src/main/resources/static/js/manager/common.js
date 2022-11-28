$(document).ready(function(){
    // header.js
    if(window.location.pathname == "/manager/") {
        $(".header-search").remove();
        $(".header-user").remove();
    }
    $(".header-profile").click(function(){
        console.log($(this).attr("topbar"));
        if($(this).attr("topbar") == "open") {
            $(this).attr("topbar", "close");
            closeTopBar();
        }
        else if($(this).attr("topbar") == "close") {
            $(this).attr("topbar", "open");
            showTopBar();
        }
    });
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
    topBar += "<a href=\"javascript:void(0)\"><div class=\"top-bar-li change-gym\">";
    topBar += "시설 변경";
    topBar += "</div></a>";
    //내 정보 설정
    topBar += "<a href=\"javascript:void(0)\"><div class=\"top-bar-li my-info\">";
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