<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>

<a href="#" class="js-colorlib-nav-toggle colorlib-nav-toggle"><i></i></a>
<aside id="colorlib-aside" role="complementary" class="js-fullheight">

    <h1 id="colorlib-logo" class="mb-4 mb-md-5"><a href="index.html" style="background-image: linear-gradient(to bottom, rgba(255,255,0,0.5), rgba(0,0,255,0.5)), url('https://mdn.mozillademos.org/files/7693/catfront.png');">다솜<i class="fa fa-heart" aria-hidden="true"></i></a></h1>
    <nav id="colorlib-main-menu" role="navigation">
        <ul>
            <li class="colorlib-active"><a href="/Main/home.do">Home</a></li>
            <li ><a href="/Main/Gallery.do">Gallery</a></li>
            <li><a href="/Main/About.do">About</a></li>
            <li><a href="/Main/Pricing.do">Pricing</a></li>
            <li><a href="/Main/Contatct.do">Contact</a></li>
            <li><a href="/Main/WriteBoard.do">글 쓰기</a></li>
        </ul>
    </nav>



    <div class="colorlib-footer">
        <div class="mb-4">
            <!-- 리스트 이미지 토글 버튼 -->
            <div class="toggleWrapper">
                <input type="checkbox" class="dn" id="dn" onchange="fn_changeMode();"/>
                <label for="dn" class="toggle">
                    <span class="toggle__handler">
                      <span class="crater crater--1"></span>
                      <span class="crater crater--2"></span>
                      <span class="crater crater--3"></span>
                    </span>
                    <span class="star star--1"></span>
                    <span class="star star--2"></span>
                    <span class="star star--3"></span>
                    <span class="star star--4"></span>
                    <span class="star star--5"></span>
                    <span class="star star--6"></span>
                </label>
            </div>
            <!-- 리스트 이미지 토글 버튼 -->
        </div>
        <p class="footer">
            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved </p>
        <p>It is made with  <i class="fa fa-heart" aria-hidden="true"></i> </p>
        <p>by <a href="#" target="_blank">JG Heo</a></p>
    </div>
</aside> <!-- END COLORLIB-ASIDE -->