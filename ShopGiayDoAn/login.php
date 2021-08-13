<?php
	include 'inc/header.php';
	// include 'inc/slider.php';

?>
<?php
   
    if ($_SERVER['REQUEST_METHOD'] == 'POST' && isset($_POST['submit'])) {
        
        $insertCustomers = $cs->insert_customers($_POST);
        
    }
?>

<?php
	if ($_SERVER['REQUEST_METHOD'] == 'POST' && isset($_POST['login'])) {
        
        $login_Customers = $cs->login_customers($_POST);
        
    }
?>

 <div class="main">
    <div class="content">
    	 <div class="login_panel">
        	<h3>Đăng nhập</h3>
        	<p>Nhập thông tin tài khoản.</p>
        	<?php
			if(isset($login_Customers)){
    			echo $login_Customers;
    		}
        	?>
        	<form action="" method="post" >
                	<input name="email" class="field" type="text" placeholder="Nhập Email...." >
                    <input name="password" class="field" type="password"  placeholder="Nhập password...." >
                
                 <p class="note">Quên mật khẩu <a href="#">Tại đây</a></p>
                 <div class="buttons"><div><input type="submit" name="login" class="grey" value="Đăng nhập"></div></div>
                    </form>
                    </div>
    	<div class="register_account">
    		<h3>Đăng kí tài khoản mới</h3>
    		<?php
    		if(isset($insertCustomers)){
    			echo $insertCustomers;
    		}
    		?>
    		<form action="" method="post">
		   			 <table>
		   				<tbody>
						<tr>
						<td>
							<div>
							<input type="text" name="name"   placeholder="Nhập tên...." >
							</div>
							
							<div>
							   <input type="text" name="address"  placeholder="Nhập địa chỉ...." >
							</div>
							
							<div>
								<input type="text" name="zipcode"  placeholder="Nhập mã code...." >
							</div>
							<div>
								<input type="text" name="email"  placeholder="Nhập Email...." >
							</div>
		    			 </td>
		    			<td>
						<div>
							<input type="text" name ="city"  placeholder="Nhập thành phố...." >
						</div>
		    		<div>
						<select id="country" name="country" >
							<option value="null">Chọn quốc gia</option>         
							<option value="VN">Việt Nam</option>
							<option value="TQ">Trung Quốc</option>
							<option value="My">Mỹ</option>
							
		         </select>
				 </div>		        
	
		           <div>
		          <input type="text" name ="phone"  placeholder="Nhập phone...." >
		          </div>
				  
				  <div>
					<input type="text" name="password"   placeholder="Nhập passwword....">
				</div>
		    	</td>
		    </tr> 
		    </tbody></table> 
		  

		    <div class="search"><div><input type="submit" name="submit" class="grey" value="Đăng kí"></div></div>
		    <p class="terms">Đăng kí tài khoản <a href="#">Tại đây</a>.</p>
		    <div class="clear"></div>
		    </form>
    	</div>  	
       <div class="clear"></div>
    </div>
 </div>
</div>
   <?php
 	include 'inc/footer.php';

 ?>