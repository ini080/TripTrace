<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<%@ include file="/WEB-INF/views/template/header.jsp" %>


<div id="colorlib-page">
	<%@ include file="/WEB-INF/views/template/aside.jsp" %>


	<div id="colorlib-main">
		<section class="ftco-section ftco-no-pt ftco-no-pb">
			<div class="container px-md-0">
				<div class="row d-flex no-gutters">
					<div class="col-md-12 portfolio-wrap">
						<div class="row no-gutters align-items-center">
							<a href="images/work-1.jpg" class="col-md-6 img image-popup js-halfheight d-flex align-items-center justify-content-center" style="background-image: url(/resources/images/2020-05-05/1.jpg);">
								<div class="icon d-flex align-items-center justify-content-center">
									<span class="fa fa-expand"></span>
								</div>
							</a>
							<div class="col-md-6">
								<div class="text pt-5 pl-0 px-lg-5 pl-md-4 ftco-animate">
									<div class="px-4 px-lg-4">
										<div class="desc">
											<div class="top">
												<span class="subheading">2020-05-05</span>
												<h2 class="mb-4"><a href="gallery.html">전주 한옥마을</a></h2>
											</div>
											<div class="absolute">
												<p>전주 한옥마을 꾸르꾸르 꾸울재앰~</p>
											</div>
											<p><a href="single.html" class="custom-btn">사진 더보기</a></p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>



					<c:forEach var="item" items="${resultList}" varStatus="status">

						<div class="col-md-12 portfolio-wrap">
							<div class="row no-gutters align-items-center">
								<a href="images/work-2.jpg" class="col-md-6 order-md-last img image-popup js-fullheight d-flex align-items-center justify-content-center" style="background-image: url(/resources/images/${item.thumbNailLocation});">
									<div class="icon d-flex align-items-center justify-content-center">
										<span class="fa fa-expand"></span>
									</div>
								</a>
								<div class="col-md-6">
									<div class="text pt-5 px-md-5 ftco-animate">
										<div class="px-4 px-lg-4">
											<div class="desc text-md-right">
												<div class="top">
													<span class="subheading"><c:out value="${item.showDate}" /></span>
													<h2 class="mb-4"><a href="gallery.html"><c:out value="${item.showTitle}" /></a></h2>
												</div>
												<div class="absolute">
													<p><c:out value="${item.showContent}" /></p>
												</div>
												<p><a href="single.html" class="custom-btn">사진 더보기</a></p>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>












			<!--

					<div class="col-md-12 portfolio-wrap">
						<div class="row no-gutters align-items-center">
							<a href="images/work-2.jpg" class="col-md-6 order-md-last img image-popup js-fullheight d-flex align-items-center justify-content-center" style="background-image: url(/resources/main/images/work-2.jpg);">
								<div class="icon d-flex align-items-center justify-content-center">
									<span class="fa fa-expand"></span>
								</div>
							</a>
							<div class="col-md-6">
								<div class="text pt-5 px-md-5 ftco-animate">
									<div class="px-4 px-lg-4">
										<div class="desc text-md-right">
											<div class="top">
												<span class="subheading">Nature</span>
												<h2 class="mb-4"><a href="gallery.html">Green Leaves</a></h2>
											</div>
											<div class="absolute">
												<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove.</p>
											</div>
											<p><a href="single.html" class="custom-btn">View Portfolio</a></p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-12 portfolio-wrap">
						<div class="row no-gutters align-items-center">
							<a href="images/work-3.jpg" class="col-md-6 img image-popup js-fullheight d-flex align-items-center justify-content-center" style="background-image: url(/resources/main/images/work-3.jpg);">
								<div class="icon d-flex align-items-center justify-content-center">
									<span class="fa fa-expand"></span>
								</div>
							</a>
							<div class="col-md-6">
								<div class="text pt-5 pl-0 px-lg-5 pl-md-4 ftco-animate">
									<div class="px-4 px-lg-4">
										<div class="desc">
											<div class="top">
												<span class="subheading">Nature</span>
												<h2 class="mb-4"><a href="gallery.html">Coal</a></h2>
											</div>
											<div class="absolute">
												<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove.</p>
											</div>
											<p><a href="single.html" class="custom-btn">View Portfolio</a></p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-12 portfolio-wrap">
						<div class="row no-gutters align-items-center">
							<a href="images/work-4.jpg" class="col-md-6 order-md-last img image-popup js-fullheight d-flex align-items-center justify-content-center" style="background-image: url(/resources/main/images/work-4.jpg);">
								<div class="icon d-flex align-items-center justify-content-center">
									<span class="fa fa-expand"></span>
								</div>
							</a>
							<div class="col-md-6">
								<div class="text pt-5 px-md-5 ftco-animate">
									<div class="px-4 px-lg-4">
										<div class="desc text-md-right">
											<div class="top">
												<span class="subheading">Nature</span>
												<h2 class="mb-4"><a href="gallery.html">Top Leaf</a></h2>
											</div>
											<div class="absolute">
												<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove.</p>
											</div>
											<p><a href="single.html" class="custom-btn">View Portfolio</a></p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-12 portfolio-wrap">
						<div class="row no-gutters align-items-center">
							<a href="images/work-5.jpg" class="col-md-6 img image-popup js-fullheight d-flex align-items-center justify-content-center" style="background-image: url(/resources/main/images/work-5.jpg);">
								<div class="icon d-flex align-items-center justify-content-center">
									<span class="fa fa-expand"></span>
								</div>
							</a>
							<div class="col-md-6">
								<div class="text pt-5 pl-0 px-lg-5 pl-md-4 ftco-animate">
									<div class="px-4 px-lg-4">
										<div class="desc">
											<div class="top">
												<span class="subheading">Portrait</span>
												<h2 class="mb-4"><a href="gallery.html">Building</a></h2>
											</div>
											<div class="absolute">
												<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove.</p>
											</div>
											<p><a href="single.html" class="custom-btn">View Portfolio</a></p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-12 portfolio-wrap">
						<div class="row no-gutters align-items-center">
							<a href="images/work-6.jpg" class="col-md-6 order-md-last img image-popup js-fullheight d-flex align-items-center justify-content-center" style="background-image: url(/resources/main/images/work-6.jpg);">
								<div class="icon d-flex align-items-center justify-content-center">
									<span class="fa fa-expand"></span>
								</div>
							</a>
							<div class="col-md-6">
								<div class="text pt-5 px-md-5 ftco-animate">
									<div class="px-4 px-lg-4">
										<div class="desc text-md-right">
											<div class="top">
												<span class="subheading">Fashion</span>
												<h2 class="mb-4"><a href="gallery.html">Black Girl Model</a></h2>
											</div>
											<div class="absolute">
												<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove.</p>
											</div>
											<p><a href="single.html" class="custom-btn">View Portfolio</a></p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-12 portfolio-wrap">
						<div class="row no-gutters align-items-center">
							<a href="images/work-7.jpg" class="col-md-6 img image-popup js-fullheight d-flex align-items-center justify-content-center" style="background-image: url(/resources/main/images/work-7.jpg);">
								<div class="icon d-flex align-items-center justify-content-center">
									<span class="fa fa-expand"></span>
								</div>
							</a>
							<div class="col-md-6">
								<div class="text pt-5 pl-0 px-lg-5 pl-md-4 ftco-animate">
									<div class="px-4 px-lg-4">
										<div class="desc">
											<div class="top">
												<span class="subheading">Animals</span>
												<h2 class="mb-4"><a href="gallery.html">Pug Puppy</a></h2>
											</div>
											<div class="absolute">
												<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove.</p>
											</div>
											<p><a href="single.html" class="custom-btn">View Portfolio</a></p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-12 portfolio-wrap">
						<div class="row no-gutters align-items-center">
							<a href="images/work-8.jpg" class="col-md-6 order-md-last img image-popup js-fullheight d-flex align-items-center justify-content-center" style="background-image: url(/resources/main/images/work-8.jpg);">
								<div class="icon d-flex align-items-center justify-content-center">
									<span class="fa fa-expand"></span>
								</div>
							</a>
							<div class="col-md-6">
								<div class="text pt-5 px-md-5 ftco-animate">
									<div class="px-4 px-lg-4">
										<div class="desc text-md-right">
											<div class="top">
												<span class="subheading">Nature</span>
												<h2 class="mb-4"><a href="gallery.html">White Flower</a></h2>
											</div>
											<div class="absolute">
												<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove.</p>
											</div>
											<p><a href="single.html" class="custom-btn">View Portfolio</a></p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-12 portfolio-wrap">
						<div class="row no-gutters align-items-center">
							<a href="images/work-9.jpg" class="col-md-6 img js-fullheight d-flex align-items-center justify-content-center" style="background-image: url(/resources/main/images/work-9.jpg);">
								<div class="icon d-flex align-items-center justify-content-center">
									<span class="fa fa-expand"></span>
								</div>
							</a>
							<div class="col-md-6">
								<div class="text pt-5 pl-0 px-lg-5 pl-md-4 ftco-animate">
									<div class="px-4 px-lg-4">
										<div class="desc">
											<div class="top">
												<span class="subheading">Animals</span>
												<h2 class="mb-4"><a href="gallery.html">Turtle</a></h2>
											</div>
											<div class="absolute">
												<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove.</p>
											</div>
											<p><a href="single.html" class="custom-btn">View Portfolio</a></p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					-->
				</div>

				<div class="row d-flex">
					<div class="col-md-12">
						<a href="#" class="btn-custom-load d-block w-100 text-center py-4">Load more <span class="fa fa-refresh"></span></a>
					</div>
				</div>
			</div>
		</section>
	</div><!-- END COLORLIB-MAIN -->
</div><!-- END COLORLIB-PAGE -->



<%@ include file="/WEB-INF/views/template/footer.jsp" %>
