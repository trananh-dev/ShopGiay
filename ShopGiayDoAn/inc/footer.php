</div>
   <div class="footer">
   	  <div class="wrapper">	
	     <div class="section group">
				<div class="col_1_of_4 span_1_of_4">
						<h4>THÔNG TIN</h4>
						<ul>
						<li><a href="#">Giới thiệu</a></li>
						<li><a href="#">Dịch vụ khách hàng</a></li>
						<li><a href="#"><span>Tìm kiếm</span></a></li>
						
						</ul>
					</div>
				<div class="col_1_of_4 span_1_of_4">
					<h4>Tại sao mua hàng</h4>
						<ul>
						<li><a href="about.html">Về chúng tôi</a></li>
						<li><a href="faq.html">Dịch vụ khách hàng</a></li>
						<li><a href="#">Chính sách bảo mật</a></li>
						
						</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h4>Tài khoản</h4>
						<ul>
							<li><a href="contact.html">Đăng nhập</a></li>
							<li><a href="index.html">Giỏ hàng</a></li>
							<li><a href="#">Sản phẩm yêu thích</a></li>
							
						</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h4>Contact</h4>
						<ul>
							<li><span>0983193347</span></li>
							
						</ul>
						<div class="social-icons">
							<h4>Follow Us</h4>
					   		  <ul>
							      <li class="facebook"><a href="#" target="_blank"> </a></li>
							      <li class="twitter"><a href="#" target="_blank"> </a></li>
							      <li class="googleplus"><a href="#" target="_blank"> </a></li>
							      <li class="contact"><a href="#" target="_blank"> </a></li>
							      <div class="clear"></div>
						     </ul>
   	 					</div>
				</div>
			</div>
			<div class="copy_right">
				<!-- <p>Training with live project &amp; All rights Reseverd </p> -->
		   </div>
     </div>
</div>
    <script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
	  			containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
	 		};
			*/
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
    <a href="#" id="toTop" style="display: block;"><span id="toTopHover" style="opacity: 1;"></span></a>
    <link href="css/flexslider.css" rel='stylesheet' type='text/css' />
	  <script defer src="js/jquery.flexslider.js"></script>
	  <script type="text/javascript">
		$(function(){
		  SyntaxHighlighter.all();
		});
		$(window).load(function(){
		  $('.flexslider').flexslider({
			animation: "slide",
			start: function(slider){
			  $('body').removeClass('loading');
			}
		  });
		});
	  </script>
</body>
</html>
