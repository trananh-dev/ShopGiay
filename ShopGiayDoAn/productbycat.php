
<?php
	include 'inc/header.php';
	// include 'inc/slider.php';

?>

<?php
	if(!isset($_GET['catid']) || $_GET['catid']==NULL){
       echo "<script>window.location ='404.php'</script>";
    }else{
        $id = $_GET['catid']; 
    }
    ?>
 <div class="main">
    <div class="content">
    	<?php
	     	 $name_cat = $cat->get_name_by_cat($id);
	      	 if($name_cat){
	      	 	while($result_name = $name_cat->fetch_assoc()){
	      	?>
    	<div class="content_top">
    		<div class="heading">
    		<h3>DANH MỤC : <?php echo $result_name['catName'] ?> </h3>
    		</div>
    		<div class="clear"></div>
    	</div>
    	<?php
			}}
			?>
	      <div class="section group">

	      	<?php
	      	 $productbycat = $cat->get_product_by_cat($id);
	      	 if($productbycat){
	      	 	
	      	 	while($result = $productbycat->fetch_assoc()){
	      	?>
				<div class="grid_1_of_4 images_1_of_4">
					 <a href="details.php?proid=<?php echo $result['PID'] ?>"><img src="admin/uploads/<?php echo $result['PImage'] ?>"  height="200px" ,min-width='200px' alt="" /></a>
					 <h2><?php echo $result['PName'] ?></h2>
					 <p><?php echo $fm->textShorten($result['PDesciption'],100); ?></p>
					 <p><span class="price"><?php echo $fm->format_currency($result['PPrice'])." "."VNĐ" ?></span></p>
				     <div class="button"><span><a href="details.php?proid=<?php echo $result['PID'] ?>" class="details">Chi tiết</a></span></div>
				</div>
				
			

	<?php

			}

		}else{
			echo 'Danh mục hiện tại chưa có sản phẩm';

		}
			?>
	
    </div>
 </div>

</div>
   <?php
 	include 'inc/footer.php';

 ?>
