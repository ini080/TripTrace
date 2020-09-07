<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<%@ include file="/WEB-INF/views/template/header.jsp" %>

<script src="/webjars/jquery/2.2.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script>
	$(document).ready(function(){
		var msg = '${msg}';
		if( msg != null && msg != '' ){
			alert(msg);
		}
	});
</script>



<div id="colorlib-page">
	<%@ include file="/WEB-INF/views/template/aside.jsp" %>

		<div id="colorlib-main">
			<form action="/Main/uploadFile.do" method="post" enctype="multipart/form-data" name="files" id="files">
			<section class="ftco-section ftco-no-pt ftco-no-pb">
				<div class="container px-md-0">
					<div class="row d-flex no-gutters">
						<div class="col-lg-8 col-md-7 order-md-last d-flex align-items-stretch">
							<div class="contact-wrap w-100 p-md-5 p-4">
								<h3 class="mb-4 heading">추억 남기기</h3>
								<form method="POST" id="contactForm" name="contactForm" class="contactForm">
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label class="label" for="title">제목</label>
												<input type="text" class="form-control" name="title" id="title" placeholder="제목">
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<label class="label" for="date">날짜</label>
												<input type="date" class="form-control" name="date" id="date" placeholder="2020-05-05">
											</div>
										</div>
										<div class="col-md-12">
											<div class="form-group">
												<label class="label" for="place">장소</label>
												<input type="text" class="form-control" name="place" id="place" placeholder="사진찍은 장소">
											</div>
										</div>
										<div class="col-md-12">
											<div class="form-group">
												<label class="label" for="message">소개</label>
												<textarea name="message" class="form-control" id="message" cols="30" rows="4" placeholder="Message"></textarea>
											</div>
										</div>

										<div class="col-md-12">
											<div class="form-group">
												<label class="label" for="files">첨부파일</label>
												<input multiple="multiple" type="file" name="files"/>
												<div class="submitting"></div>
											</div>
										</div>

										<div class="col-md-12">
											<div class="form-group">
												<input type="submit" value="등록하기" class="btn btn-primary">
												<div class="submitting"></div>
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>




						<div class="col-lg-4 col-md-5 d-flex align-items-stretch">
							<div class="info-wrap js-fullheight bg-primary w-100 p-md-5 p-4">
								<h3>Let's get in touch</h3>
								<p class="mb-4">We're open for any suggestion or just to have a chat</p>
								<div class="dbox w-100 d-flex align-items-start">
									<div class="icon d-flex align-items-center justify-content-center">
										<span class="fa fa-map-marker"></span>
									</div>
									<div class="text pl-3">
										<p><span>Address:</span> 198 West 21th Street, Suite 721 New York NY 10016</p>
									</div>
								</div>
								<div class="dbox w-100 d-flex align-items-center">
									<div class="icon d-flex align-items-center justify-content-center">
										<span class="fa fa-phone"></span>
									</div>
									<div class="text pl-3">
										<p><span>Phone:</span> <a href="tel://1234567920">+ 1235 2355 98</a></p>
									</div>
								</div>
								<div class="dbox w-100 d-flex align-items-center">
									<div class="icon d-flex align-items-center justify-content-center">
										<span class="fa fa-paper-plane"></span>
									</div>
									<div class="text pl-3">
										<p><span>Email:</span> <a href="mailto:info@yoursite.com">info@yoursite.com</a></p>
									</div>
								</div>
								<div class="dbox w-100 d-flex align-items-center">
									<div class="icon d-flex align-items-center justify-content-center">
										<span class="fa fa-globe"></span>
									</div>
									<div class="text pl-3">
										<p><span>Website</span> <a href="#">yoursite.com</a></p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row d-flex no-gutters">
						<div id="map" class="map"></div>
					</div>
				</div>
			</section>
			</form>
		</div><!-- END COLORLIB-MAIN -->
		</div><!-- END COLORLIB-PAGE -->

<%@ include file="/WEB-INF/views/template/footer.jsp" %>

