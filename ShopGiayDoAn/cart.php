
<?php
	include 'inc/header.php';
	// include 'inc/slider.php';

?>

<?php
	if(isset($_GET['cartid'])){
        $cartid = $_GET['cartid']; 
        $delcart = $ct->del_product_cart($cartid);
    }
    if ($_SERVER['REQUEST_METHOD'] == 'POST' && isset($_POST['submit'])) {
 		$cartId = $_POST['cartId'];
        $quantity = $_POST['quantity'];
       
        $update_quantity_cart = $ct->update_quantity_cart($quantity, $cartId );
        if($quantity<=0){
        	$delcart = $ct->del_product_cart($cartId);
        }
    }

    ?>

    <?php
	if(!isset($_GET['id'])){
		echo "<meta http-equiv='refresh' content='0;URL=?id=live'>";
	}
?>
 <div class="main">
    <div class="content">
    	<div class="cartoption">		
			<div class="cartpage">
			    	<h2>Giỏ hàng</h2>
						<table class="tblone">
							<tr>
								<th width="20%">TÊN SẢN PHẨM</th>
								<th width="10%">ẢNH</th>
								<th width="15%">GIÁ</th>
								<th width="15%">Size</th>
								
								<th width="15%">SỐ LƯỢNG</th>
								<th width="15%">TỔNG TIỀN</th>
								<th width="10%">Xử Lý</th>
							</tr>
							<?php
							$get_product_cart = $ct->get_product_cart();
							if($get_product_cart){
								$subtotal = 0;
								$qty = 0;
								while($result = $get_product_cart->fetch_assoc()){
							?>
							<tr>
								<td><?php echo $result['PName'] ?></td>
								<td><img src="admin/uploads/<?php echo $result['image'] ?>" alt="" width="50px" , heigth="50px"/></td>
								<td><?php echo $fm->format_currency($result['PPrice'])." "."VNĐ" ?></td>
								<td>
									
										
										<input type="number" name="size" min="0"  value="<?php echo $result['size'] ?>"/>
										
									
								</td>
								<td>
									<form action="" method="post">
										<input type="hidden" name="cartId" value="<?php echo $result['cartId'] ?>"/>
										<input type="number" name="quantity"   value="<?php echo $result['soluong'] ?>"/>
										<input type="submit" name="submit" value="Update"/>
									</form>
								</td>

								
								<td><?php
								$total = $result['PPrice'] * $result['soluong'];
								echo $fm->format_currency($total)." "."VNĐ";
								 ?></td>
								<td><a onclick="return confirm('Bạn có muốn xóa không?');" href="?cartid=<?php echo $result['cartId'] ?>">Xóa</a></td>
							</tr>
						<?php
							$subtotal += $total;
							$qty = $qty + $result['soluong'];
							}
						}
						?>
							
						</table>
						<?php
							$check_cart = $ct->check_cart();
								if($check_cart){
								?>
						<table style="float:right;text-align:left;" width="40%">
							<tr>
								<th>Tổng :</th>
								<td><?php 
								echo $fm->format_currency($subtotal)." "."VNĐ";
								Session::set('sum',$subtotal);
									Session::set('qty',$qty);
								?></td>
							</tr>
							<tr>

								<th>VAT : </th>
								<td>10%</td>
							</tr>
							<tr>
								<th>Thành tiền :</th>
								<td><?php 

								$vat = $subtotal * 0.1;
								$gtotal = $subtotal + $vat;
								echo $fm->format_currency($gtotal)." "."VNĐ";
								?></td>
							</tr>
							
					   </table>
					   <?php
					}else{
						echo 'Giỏ hàng trống';
					}
					  ?>
					</div>
					<div class="shopping">
						<div class="shopleft">
							<a href="index.php"> <img src="images/shop.png" alt="" /></a>
						</div>
						<div class="shopright">
							<a href="payment.php"> <img src="images/check.png" alt="" /></a>
						</div>
					</div>
    	</div>  	
       <div class="clear"></div>
    </div>
 </div>
 

<?php
 	include 'inc/footer.php';

 ?>
