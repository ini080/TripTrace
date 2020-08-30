<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>로그인페이지</title>
    <!--
    <link href="/resources/static/css/kakao_login.css" rel="stylesheet" type="text/css">
    -->
    <link href="/static/css/kakao_login.css" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <script>
        // $(function() {
        //id가 inputTag 인 태그를 클릭하면 동작해요!
        // 	$("#inputTag").click(function() {
        // 		alert('아직은 준비가...');
        // 	});
        // })
    </script>

    <script type="text/javascript">
        function fn_login(){
            var inputId = $("#email").val();
            var inputPw = $("#password").val();

            alert("로그인 : " + inputId + " , " + inputPw);

            $.ajax({
                url: "login",
                type: "POST",
                data: {
                    "loginEmail" : $("#email").val(),
                    "loginPw" : $("#password").val()
        },
                success: function(data){
                   alert(data);
                },
                error: function(){
                    alert("serialize err");
                }
            });
        }

    </script>


</head>
<body>
<form:form id="loginForm" action="/login" method="POST">
    <svg id="ryan" viewBox="0 0 120 120" xmlns="http://www.w3.org/2000/svg">
        <path d="M0,150 C0,65 120,65 120,150" fill="#e0a243" stroke="#000" stroke-width="2.5" />
        <g class="ears">
            <path d="M46,32 L46,30 C46,16 26,16 26,30 L26,32" fill="#e0a243" stroke="#000" stroke-width="2.5" stroke-linecap="round" transform="rotate(-10,38,24)" />
            <path d="M74,32 L74,30 C74,16 94,16 94,30 L94,32" fill="#e0a243" stroke="#000" stroke-width="2.5" stroke-linecap="round" transform="rotate(10,82,24)" />
        </g>
        <circle cx="60" cy="60" r="40" fill="#e0a243" stroke="#000" stroke-width="2.5" />
        <g class="eyes">
            <!-- left eye and eyebrow-->
            <line x1="37" x2="50" y1="46" y2="46" stroke="#000" stroke-width="3" stroke-linecap="round" />
            <circle cx="44" cy="55" r="3" fill="#000" />
            <!-- right eye and eyebrow -->
            <line x1="70" x2="83" y1="46" y2="46" stroke="#000" stroke-width="3" stroke-linecap="round" />
            <circle cx="76" cy="55" r="3" fill="#000" />
        </g>
        <g class="muzzle">
            <path d="M60,66 C58.5,61 49,63 49,69 C49,75 58,77 60,71 M60,66 C61.5,61 71,63 71,69 C71,75 62,77 60,71" fill="#fff" />
            <path d="M60,66 C58.5,61 49,63 49,69 C49,75 58,77 60,71 M60,66 C61.5,61 71,63 71,69 C71,75 62,77 60,71" fill="#fff" stroke="#000" stroke-width="2.5" stroke-linejoin="round" stroke-linecap="round" />
            <polygon points="59,63.5,60,63.4,61,63.5,60,65" fill="#000" stroke="#000" stroke-width="5" stroke-linejoin="round" />
        </g>
        <path d="M40,105 C10,140 110,140 80,105 L80,105 L70,111 L60,105 L50,111 L40,105" fill="#fff" />
    </svg>
    <input type="text" placeholder="email@domain.com" id="email">
    <input type="password" placeholder="Password" id="password">
    <input type="button" value="로그인" onclick="fn_login()">
    <button type="submit">submit</button>
</form:form>


<script src="/static/js/kakao_login.js"></script>
</body>
</html>