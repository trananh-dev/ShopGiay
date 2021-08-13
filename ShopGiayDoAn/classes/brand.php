<?php
	$filepath = realpath(dirname(__FILE__));
	include_once ($filepath.'/../lib/database.php');
	include_once ($filepath."/../helpers/format.php");

?>
<?php

	class brand
	{
		private $db;
		private $fm;

		public function __construct(){
			$this->db=new Database();
			$this->fm=new Format();
		}
		public function thongketh(){
			
			$query = "SELECT count(*) as ThuongHieu FROM tbl_brand ";
			$result = $this->db->select($query);
			return $result;

		}

		public function insert_brand($brandName){
			$brandName = $this->fm->validation($brandName);
			$brandName = mysqli_real_escape_string($this->db->link, $brandName);	
			if(empty($brandName) ){
				$alert = " <span class='error'> Bạn chưa nhập thương hiệu </span>";
				return $alert;
			}else{
				$query = "INSERT INTO tbl_brand(brandName) VALUES ('$brandName')";
				$result = $this->db->insert($query);
				if($result){
					$alert ="<span class='success'>Thêm thương hiệu sản phẩm thành công</span>";
					return $alert;
				}else{
					$alert ="<span class='error'>Thêm thương hiệu sản phẩm không  thành công</span>";
					return $alert;
				}	
			}
		}
		public function show_brand(){
			$query = "SELECT * FROM tbl_brand ORDER BY brandId desc";
				$result = $this->db->select($query);
				return $result;
		}

		public function edit_brand($id){
			$query = "SELECT * FROM tbl_brand WHERE brandId='$id'";
				$result = $this->db->select($query);
				return $result;

		}
		public function update_brand($brandName,$id){
			$brandName = $this->fm->validation($brandName);
			$brandName = mysqli_real_escape_string($this->db->link, $brandName);
			$id = mysqli_real_escape_string($this->db->link, $id);
			if(empty($brandName)){
				$alert = "<span class='error'>Không để trống thương hiệu</span>";
			}
			else{
				$query = "UPDATE tbl_brand SET brandName='$brandName' WHERE  brandId='$id'";
				$result = $this->db->update($query);
				if($result){
					$alert ="<span class='success'>Sửa thương hiệu  thành công</span>";
					return $alert;
				}else{
					$alert ="<span class='error'>Sửa thương hiệu không  thành công</span>";
					return $alert;
				}	
			}
	
		}
		public function del_brand($id){
			$query = "DELETE FROM tbl_brand WHERE brandId='$id'";
				$result = $this->db->delete($query);
				if($result){
					$alert ="<span class='success'>Xoá thương hiệu thành công</span>";
					return $alert;
				}else{
					$alert ="<span class='error'>Xoá thương hiệu  thành công</span>";
					return $alert;
				
				}

		}
		public function get_name_by_brand($id){
			$query = "SELECT tbl_product.*,tbl_brand.brandName,tbl_brand.brandId FROM tbl_product,tbl_brand WHERE tbl_product.brandId=tbl_brand.brandId AND tbl_product.brandId ='$id' LIMIT 1";
			$result = $this->db->select($query);
			return $result;
		}



		


	}
	


?>