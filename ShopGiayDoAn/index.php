<?php
	include 'inc/header.php';
	

?>
 <div class="main">
    <div class="content">
    	<div class="content_top">
    		<div class="heading">
    		<h3>Sản phẩm bán chạy</h3>
    		</div>
    		<div class="clear"></div>
    	</div>
	      <div class="section group">
	      	<?php
	      	$spnb=$product->sanphamnoibat();
	      	if($spnb){
	      		while($result=$spnb->fetch_assoc()){

	      	?>
	      	<div class="grid_1_of_4 images_1_of_4">
					 <a href="details.php?proid=<?php echo $result['PID'] ?>"><img src="admin/uploads/<?php echo $result['PImage'] ?>" height="150px"  alt="" /></a>
					 <h2><?php echo $result['PName'] ?></h2>
					 <p><?php echo $fm->textShorten($result['PDesciption'], 30) ?></p>
					 <p><span class="price"><?php echo $fm->format_currency($result['PPrice'])." "."VNĐ" ?></span></p>
				     <div class="button"><span><a href="details.php?proid=<?php echo $result['PID'] ?>" class="details">Chi tiết</a></span></div>
				</div>
				<?php
				}
			}
				?>

				<div class="">
				<?php
				if(isset($_GET['trangnb'])){
					$trang = $_GET['trangnb'];
				}else{
					$trang = 1;
				}
				$product_all_nb = $product->get_all_product_nb(); 
				$product_count_nb = mysqli_num_rows($product_all_nb);
				$product_button_nb = ceil($product_count_nb/8);
				$i = 1;
			?>
				<div style="padding-top: 210px"><p style='margin-bottom:500px'></p>
					<p style="margin-bottom: 14px  "> Trang : </p>
				</div>
				<?php

				for($i=1;$i<=$product_button_nb;$i++){
					?>
					<a class="phantrang" <?php if($i==$trang){ echo 'style="background:orange"';} ?> style="margin:0px 10px " href="index.php?trangnb=<?php echo $i ?>"><?php echo $i ?></a>	
					<?php
					
				}
				?>
				
			</div>

				
							
			</div>
			<div class="content_bottom">
				

	       
    		<div class="heading">
    		<h3>Sản phẩm mới</h3>
    		</div>
    		<div class="clear"></div>
    	</div>
			<div class="section group">
				<?php
	      	$spnew=$product->sanphammoi();
	      	if($spnew){
	      		while($result=$spnew->fetch_assoc()){
	      			?>
				<div class="grid_1_of_4 images_1_of_4">
					 <a href="details.php?proid=<?php echo $result['PID'] ?>"><img src="admin/uploads/<?php echo $result['PImage'] ?>" height="150px"  alt="" /></a>
					 <h2><?php echo $result['PName'] ?></h2>
					 <p><?php echo $fm->textShorten($result['PDesciption'], 30) ?></p>
					 <p><span class="price"><?php echo $fm->format_currency($result['PPrice'])." "."VNĐ" ?></span></p>
				     <div class="button"><span><a href="details.php?proid=<?php echo $result['PID'] ?>" class="details">Chi tiết</a></span></div>
				</div>
				<?php
				}
			}
				?>

				<style type="text/css">
				a.phantrang {
				    border: 1px solid #ddd;
				    padding: 10px;
				    background: #414045;
				    color: #fff;
				    cursor: pointer;
				   
				}
				a.phantrang:hover {
				    background: blue;
				}
			</style>
			<div class="">
				<?php
				if(isset($_GET['trang'])){
					$trang = $_GET['trang'];
				}else{
					$trang = 1;
				}
				$product_all = $product->get_all_product(); 
				$product_count = mysqli_num_rows($product_all);
				$product_button = ceil($product_count/8);
				$i = 1;
		
				?>
				<div style="padding-top: 210px"><p style='margin-bottom:500px'></p>
					<p style="margin-bottom: 14px  "> Trang : </p>
				</div>
				<?php
				
				for($i=1;$i<=$product_button;$i++){
					?>
					<a class="phantrang" <?php if($i==$trang){ echo 'style="background:orange"';} ?> style="margin:0px 10px " href="index.php?trang=<?php echo $i ?>"><?php echo $i ?></a>	
					<?php
					
				}
				?>
				
			</div>
    </div>
 </div>
 <?php
 	include 'inc/footer.php';

 ?>


 
