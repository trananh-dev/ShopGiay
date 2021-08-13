<?php include 'inc/header.php';?>
<?php include 'inc/sidebar.php';?>
<?php include '../classes/product.php'; ?>
<?php include '../classes/category.php'; ?>
<?php include '../classes/brand.php'; ?>


        <div class="grid_10">
            <div class="box round first grid">
               <!--  <h2> Thống kê </h2>
                <div class="block">               
                
                

                
                <div>
                	<p>Sản phẩm</p>
                		 <?php 

                 $pd = new product();
                 $gettk= $pd->thongkesp();
                
                 	 	if($gettk){
                 	 		while($rs=$gettk->fetch_assoc()){
                 	 			echo($rs['SanPham']);
                 	 		}
                 	 	}
                 ?>
                </div>
                 <div>
                	<p>Danh mục</p>
                		 <?php 

                 $ct = new category();
                 $getdm= $ct->thongkedm();
                
                 	 	if($getdm){
                 	 		while($rsdm=$getdm->fetch_assoc()){
                 	 			echo($rsdm['DanhMuc']);
                 	 		}
                 	 	}
                 ?>
                </div>
                <div>
                	<p>Thương hiệu</p>
                		 <?php 

                 $br = new brand();
                 $getbr= $br->thongketh();
                
                 	 	if($getbr){
                 	 		while($rsbr=$getbr->fetch_assoc()){
                 	 			echo($rsbr['ThuongHieu']);
                 	 		}
                 	 	}
                 ?>
                </div>
                <div>
                	<p>Đơn hàng hôm nay</p>
                		 <?php 

                 $pd = new product();
                 $gethn= $pd->thongkesphomnay();
                
                 	 	if($gethn){
                 	 		while($rshn=$gethn->fetch_assoc()){
                 	 			echo($rshn['homnay']);
                 	 		}
                 	 	}
                 ?>
                </div> -->
            </div>
            </div>
        </div>
<?php include 'inc/footer.php';?>