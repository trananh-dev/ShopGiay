<?php
	include 'inc/header.php';
	// 


?>
<?php
	


	if(!isset($_GET['proid']) || $_GET['proid']==NULL){
	       echo "<script>window.location ='404.php'</script>";
	    }else{
	        $id = $_GET['proid']; 
	    }
	    if ($_SERVER['REQUEST_METHOD'] == 'POST' && isset($_POST['submit'])) {

        $soluong = $_POST['soluong'];
        $size = $_POST['size'];
        $insertCart = $ct->add_to_cart($soluong,$size, $id);
        
    }
 ?>
 <div class="main">
    <div class="content">
    	<div class="section group">
    		<?php
    		$get_chitiet=$product->chitiet($id);
    		if($get_chitiet){
    			while($result=$get_chitiet->fetch_assoc()){


    		 ?>
				<div class="cont-desc span_1_of_2">				
					<div class="grid images_3_of_2">
						<img src="admin/uploads/<?php echo $result['PImage'] ?>" alt="" />
					</div>
				<div class="desc span_3_of_2">
					<h2><?php echo $result['PName'] ?> </h2>
					<p><?php echo $fm->textShorten($result['PDesciption'], 200) ?></p>					
					<div class="price">
						<p>Giá: <span><?php echo $fm->format_currency($result['PPrice'])." "."VNĐ" ?></span></p>
						<p>Danh mục: <span><?php echo $result['catName'] ?></span></p>
						<p>Thương hiệu:<span><?php echo $result['brandName']?></span></p>
					</div>
					
				<div class="add-cart">
					
                       
					<form  action="" method="post">
						<label  >Kích thước</label>
					<select style="height:  30px  ;" id="select" name="size">
                            <option>---Chọn kích thước---</option>
                             <?php
                            
                            $get_size = $product->get_size($id);

                            if($get_size){
                                while($result_size = $get_size->fetch_assoc()){
                             ?>

                            <option value="<?php echo $result_size['size'] ?>"><?php echo $result_size['size'] ?></option>

                               <?php
                                  }
                              }
                           ?>
  
                        </select> 
                        <br><br>
						<span style="margin-top: 14px" ">Số lượng   :</span><input type="number" class="buyfield" name="soluong" value="1" min="1" /><br><br>
						<input type="submit" class="buysubmit" name="submit" value="Đặt hàng"/>
					</form>	
					<br>
					<?php
						if(isset($insertCart)){
							echo $insertCart;

						}
					?>			
				</div>
			</div>
			<div class="product-desc">
			<h2>Mô tả chi tiết</h2>
			<p><?php echo $result['PDesciption'] ?></p>
	       
	    </div><?php 
    			}
    		}
    		?>
				
			</div>

			<div class="rightsidebar span_3_of_1">
							<h2>THƯƠNG HIỆU</h2>
							<ul>
						      
						     <?php
			        	$brand = $br->show_brand();
			        	if($brand){
			      			while($result_new = $brand->fetch_assoc()){

			      		?>
			        	
			          <li>
			          		<a href="topbrands.php?brid=<?php echo $result_new['brandId'] ?>"><?php echo $result_new['brandName'] ?></a>
			          </li>
			          <?php
			          	}
			          } 
			          ?>
		    				</ul>
		    	
		 				</div>
				<div class="rightsidebar span_3_of_1">
					<h2>DANH MỤC</h2>
					<ul>
				      
				      <?php 
					$getall_category = $cat->show_category_FE();
						if($getall_category){
							while($result_allcat = $getall_category->fetch_assoc()){
					?>
				     	 <li><a href="productbycat.php?catid=<?php echo $result_allcat['catId'] ?>"><?php echo $result_allcat['catName'] ?></a></li>
				    <?php
				    	}
					}
				    ?>
    				</ul>
    	
 				</div>

 				
 		</div>
 	</div>
	</div>
   <?php
 	include 'inc/footer.php';

 ?>