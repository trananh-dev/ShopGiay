<?php

	$filepath = realpath(dirname(__FILE__));
	include_once ($filepath.'/../lib/database.php');
	include_once ($filepath.'/../helpers/format.php');
?>

<?php
	/**
	 * 
	 */
	class product
	{
		private $db;
		private $fm;
		
		public function __construct()
		{
			$this->db = new Database();
			$this->fm = new Format();
		}
		public function thongkesp(){
			
			$query = "SELECT count(*) as SanPham FROM tbl_product ";
			$result = $this->db->select($query);
			return $result;

		}
		public function thongkesphomnay(){
			
			$query = "SELECT COUNT(*)as homnay FROM `tbl_order`WHERE date(date_order)=date(now())";
			$result = $this->db->select($query);
			return $result;

		}
		public function search_product($tukhoa){
			$tukhoa = $this->fm->validation($tukhoa);
			$query = "SELECT * FROM tbl_product WHERE PName LIKE '%$tukhoa%'";
			$result = $this->db->select($query);
			return $result;

		}
		public function insert_product($data,$files){

			
			$PName = mysqli_real_escape_string($this->db->link, $data['PName']);
			$brand = mysqli_real_escape_string($this->db->link, $data['thuonghieu']);
			$category = mysqli_real_escape_string($this->db->link, $data['danhmuc']);
			$PDesciption = mysqli_real_escape_string($this->db->link, $data['mota']);
			$PPrice = mysqli_real_escape_string($this->db->link, $data['gia']);
			$PType = mysqli_real_escape_string($this->db->link, $data['PType']);
			//Kiem tra hình ảnh và lấy hình ảnh cho vào folder upload
			$permited  = array('jpg', 'jpeg', 'png', 'gif');
			$file_name = $_FILES['image']['name'];
			$file_size = $_FILES['image']['size'];
			$file_temp = $_FILES['image']['tmp_name'];

			$div = explode('.', $file_name);
			$file_ext = strtolower(end($div));
			$unique_image = substr(md5(time()), 0, 10).'.'.$file_ext;
			$uploaded_image = "uploads/".$unique_image;
			
			if($PName=="" || $brand=="" || $category=="" || $PDesciption=="" || $PPrice=="" || $PType=="" || $file_name ==""){
				$alert = "<span class='error'>Không thể để trống</span>";
				return $alert;
			}else{
				move_uploaded_file($file_temp,$uploaded_image);
				$query = "INSERT INTO tbl_product(PName,catId,brandId,PDesciption,PPrice,PImage,PType) VALUES('$PName','$category','$brand','$PDesciption','$PPrice','$unique_image','$PType')";
				$result = $this->db->insert($query);
				if($result){
					$alert = "<span class='success'>Thêm sản phẩm thành công</span>";
					return $alert;
				}else{
					$alert = "<span class='error'>Thêm không thành công</span>";
					return $alert;
				}
			}
		}
// 		
		public function show_product(){
			

			$query = "

			SELECT tbl_product.*, tbl_category.catName, tbl_brand.brandName 

			FROM tbl_product INNER JOIN tbl_category ON tbl_product.catId = tbl_category.catId 

			INNER JOIN tbl_brand ON tbl_product.brandId = tbl_brand.brandId 

			order by tbl_product.PID desc";

			

			$result = $this->db->select($query);
			return $result;
		}
// 		
		public function update_product($data,$files,$id){

		
			$PName = mysqli_real_escape_string($this->db->link, $data['PName']);
			$brand = mysqli_real_escape_string($this->db->link, $data['thuonghieu']);
			$category = mysqli_real_escape_string($this->db->link, $data['danhmuc']);
			$PDesciption = mysqli_real_escape_string($this->db->link, $data['mota']);
			$PPrice = mysqli_real_escape_string($this->db->link, $data['gia']);
			$PType = mysqli_real_escape_string($this->db->link, $data['PType']);
			//Kiem tra hình ảnh và lấy hình ảnh cho vào folder upload
			$permited  = array('jpg', 'jpeg', 'png', 'gif');

			$file_name = $_FILES['image']['name'];
			$file_size = $_FILES['image']['size'];
			$file_temp = $_FILES['image']['tmp_name'];

			$div = explode('.', $file_name);
			$file_ext = strtolower(end($div));
			// $file_current = strtolower(current($div));
			$unique_image = substr(md5(time()), 0, 10).'.'.$file_ext;
			$uploaded_image = "uploads/".$unique_image;


			if($PName=="" || $brand=="" || $category=="" || $PDesciption=="" || $PPrice=="" || $PType==""){
				$alert = "<span class='error'>Không được để trống</span>";
				return $alert;
			}else{
				if(!empty($file_name)){
					//Nếu người dùng chọn ảnh
					if ($file_size > 20480) {

		    		 $alert = "<span class='success'>Kích thước ảnh phải nhỏ hơn 2MB!</span>";
					return $alert;
				    } 
					elseif (in_array($file_ext, $permited) === false) 
					{
				     // echo "<span class='error'>You can upload only:-".implode(', ', $permited)."</span>";	
				    $alert = "<span class='success'>Bạn có tải ảnh:-".implode(', ', $permited)."</span>";
					return $alert;
					}
					move_uploaded_file($file_temp,$uploaded_image);
					$query = "UPDATE tbl_product SET
					PName = '$PName',
					brandId = '$brand',
					catId = '$category', 
					PType = '$PType', 
					PPrice = '$PPrice', 
					PImage = '$unique_image',
					PDesciption = '$PDesciption'
					WHERE PID = '$id'";
					
				}else{
					//Nếu người dùng không chọn ảnh
					$query = "UPDATE tbl_product SET

					PName = '$PName',
					brandId = '$brand',
					catId = '$category', 
					PType = '$PType', 
					PPrice = '$PPrice', 
					
					PDesciption = '$PDesciption'

					WHERE PID = '$id'";
					
				}
				$result = $this->db->update($query);
					if($result){
						$alert = "<span class='success'>Sửa thành công</span>";
						return $alert;
					}else{
						$alert = "<span class='error'>Sửa không thành công</span>";
						return $alert;
					}
				
			}

		}
		public function del_product($id){
			$query = "DELETE FROM tbl_product where PID = '$id'";
			$result = $this->db->delete($query);
			if($result){
				$alert = "<span class='success'>Xoá sản phẩm thành công</span>";
				return $alert;
			}else{
				$alert = "<span class='error'>Xoá sản phẩm không thành công</span>";
				return $alert;
			}
			
		}
		
		public function getproductbyId($id){
			$query = "SELECT * FROM tbl_product where PID = '$id'";
			$result = $this->db->select($query);
			return $result;
		}
		//END BACKEND 
		public function sanphamnoibat(){
			$sp_tungtrang = 8;
			if(!isset($_GET['trangnb'])){
				$trang = 1;
			}else{
				$trang = $_GET['trangnb'];
			}
			$tung_trang = ($trang-1)*$sp_tungtrang;
			$query = "SELECT * FROM tbl_product where PType = '0' order by PID LIMIT $tung_trang,$sp_tungtrang  ";
			$result = $this->db->select($query);
			return $result;
		} 
		public function get_all_product_nb(){
			$query = "SELECT * FROM tbl_product where PType = '0'  ";
			$result = $this->db->select($query);
			return $result;
		} 
		
		
		public function sanphammoi(){
			$sp_tungtrang = 8;
			if(!isset($_GET['trang'])){
				$trang = 1;
			}else{
				$trang = $_GET['trang'];
			}
			$tung_trang = ($trang-1)*$sp_tungtrang;
			$query = "SELECT * FROM tbl_product order by PID desc LIMIT  $tung_trang,$sp_tungtrang";
			$result = $this->db->select($query);
			return $result;
		} 
		public function get_all_product(){
			$query = "SELECT * FROM tbl_product";
			$result = $this->db->select($query);
			return $result;
		} 
		public function chitiet($id){
			$query = "

			SELECT tbl_product.*, tbl_category.catName, tbl_brand.brandName 

			FROM tbl_product INNER JOIN tbl_category ON tbl_product.catId = tbl_category.catId 

			INNER JOIN tbl_brand ON tbl_product.brandId = tbl_brand.brandId WHERE tbl_product.PID = '$id'

			";

			$result = $this->db->select($query);
			return $result;
		}
		public function sp_thuong_hieu($id){
			$query = "

			SELECT tbl_product.*, tbl_category.catName, tbl_brand.brandName 

			FROM tbl_product INNER JOIN tbl_category ON tbl_product.catId = tbl_category.catId 

			INNER JOIN tbl_brand ON tbl_product.brandId = tbl_brand.brandId WHERE tbl_product.brandId = '$id'

			";

			$result = $this->db->select($query);
			return $result;
		}
		public function get_size($id){
			$query = "

			SELECT tbl_product.*, chitietsp.size 

			FROM tbl_product INNER JOIN chitietsp ON tbl_product.PID = chitietsp.PID 

			 WHERE tbl_product.PID = '$id' order by size asc

			";
			$result = $this->db->select($query);
			return $result;
		}
		
		


 	}
 ?>