<?php
	$filepath = realpath(dirname(__FILE__));
	include_once ($filepath.'/../lib/database.php');
	include_once ($filepath."/../helpers/format.php");

?>
<?php

	class chitietsp
	{
		private $db;
		private $fm;

		public function __construct(){
			$this->db=new Database();
			$this->fm=new Format();
		}

		public function insert_chitietsp($PID,$size,$soluong){
			$PID = $this->fm->validation($PID);
			$PID = mysqli_real_escape_string($this->db->link, $PID);
			$size = $this->fm->validation($size);
			$size = mysqli_real_escape_string($this->db->link, $size);
			$soluong = $this->fm->validation($soluong);
			$soluong = mysqli_real_escape_string($this->db->link,$soluong);	
			if(empty($PID)||empty($size)||empty($soluong) ){
				$alert = " <span class='error'> Bạn chưa nhập thông tin </span>";
				return $alert;
			}else{
				$query = "INSERT INTO chitietsp(PID,size,soluong) VALUES ('$PID','$size','$soluong')";
				$result = $this->db->insert($query);
				if($result){
					$alert ="<span class='success'>Thêm  thành công</span>";
					return $alert;
				}else{
					$alert ="<span class='error'>Thêm  không  thành công</span>";
					return $alert;
				}	
			}
		}
		
		public function show_ctsp(){
			$query = "SELECT * FROM chitietsp ORDER BY PID asc";
				$result = $this->db->select($query);
				return $result;
		}

		public function edit_ctsp($id){
			$query = "SELECT * FROM chitietsp WHERE ID = '$id'";
				$result = $this->db->select($query);
				return $result;

		}
		public function update_chitietsp($PID,$size,$soluong,$id){
			$PID = $this->fm->validation($PID);
			$PID = mysqli_real_escape_string($this->db->link, $PID);
			$size = $this->fm->validation($size);
			$size = mysqli_real_escape_string($this->db->link, $size);
			$soluong = $this->fm->validation($soluong);
			$soluong = mysqli_real_escape_string($this->db->link,$soluong);
			$id = mysqli_real_escape_string($this->db->link, $id);
			if(empty($PID)||empty($size)||empty($soluong)){
				$alert = "<span class='error'>Không để trống </span>";
			}
			else{
				$query = "UPDATE chitietsp SET PID ='$PID',size = '$size', SoLuong = '$soluong' WHERE  ID ='$id'";
				$result = $this->db->update($query);
				if($result){
					$alert ="<span class='success'>Sửa   thành công</span>";
					return $alert;
				}else{
					$alert ="<span class='error'>Sửa  không  thành công</span>";
					return $alert;
				}	
			}
	
		}
		public function update_sl($PID,$size,$soluong){
			$PID = $this->fm->validation($PID);
			$PID = mysqli_real_escape_string($this->db->link, $PID);
			$size = $this->fm->validation($size);
			$size = mysqli_real_escape_string($this->db->link, $size);
			$soluong = $this->fm->validation($soluong);
			$soluong = mysqli_real_escape_string($this->db->link,$soluong);
			
			if(empty($PID)||empty($size)||empty($soluong)){
				$alert = "<span class='error'>Không để trống </span>";
			}
			else{
				$query = "UPDATE chitietsp SET  SoLuong = '$soluong' WHERE  PID ='$PID' and size = '$size' ";
				$result = $this->db->update($query);
				if($result){
					$alert ="<span class='success'>Sửa   thành công</span>";
					return $alert;
				}else{
					$alert ="<span class='error'>Sửa  không  thành công</span>";
					return $alert;
				}	
			}
	
		}
		public function del_ctsp($id){
			$query = "DELETE FROM chitietsp WHERE ID = '$id'";
				$result = $this->db->delete($query);
				if($result){
					$alert ="<span class='success'>Xoá  thành công</span>";
					return $alert;
				}else{
					$alert ="<span class='error'>Xoá   thành công</span>";
					return $alert;
				
				}

		}
		



		


	}
	


?>