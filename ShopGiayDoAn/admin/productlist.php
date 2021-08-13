<?php include 'inc/header.php';?>
<?php include 'inc/sidebar.php';?>
<?php include '../classes/brand.php';?>
<?php include '../classes/category.php';?>
<?php include '../classes/product.php';?>
<?php include_once '../helpers/format.php';?>

<?php
	$pd = new product();
	$fm = new Format();
	if(isset($_GET['productid'])){
        $id = $_GET['productid']; 
        $delpro = $pd->del_product($id);
    }
?>

<div class="grid_10">
    <div class="box round first grid">
        <h2>Danh sách sản phẩm</h2>
        <div class="block">  
        	<?php
        if(isset($delpro)){
        	echo $delpro;
        }
        ?>
            <table class="data display datatable" id="example">
			<thead>
				<tr>
					<th>ID</th>
					<th>Tên sản phẩm</th>
					<th>Ảnh</th>
					<th>Giá</th>
					<th>Mô tả</th>
					<th>Danh mục</th>
					<th>Thương hiệu</th>
					<th>Loại sản phẩm</th>
					<th>Xử lý</th>
				</tr>
			</thead>
			<tbody>
				<?php
				$pdlist=$pd->show_product();
				if($pdlist){
					$i=0;
					while($rs = $pdlist->fetch_assoc()){
						$i++;
					

				?>
				<tr class="odd gradeX">
					<td><?php echo $i ?></td>
					<td><?php echo $rs['PName'] ?></td>
					<td><img src="uploads/<?php echo $rs['PImage'] ?>" width="100" ></td>
					<td><?php echo $rs['PPrice'] ?></td>
					<td><?php 

					echo $fm->textShorten($rs['PDesciption'], 50);

					 ?></td>
					
					
					<td><?php echo $rs['catName'] ?></td>
					<td><?php echo $rs['brandName'] ?></td>
					<td><?php 
						if($rs['PType']==0){
							echo 'Nổi bật';
						}else{
							echo 'Không nổi bật';
						}

					?></td>
					
					<td><a href="productedit.php?productid=<?php echo $rs['PID'] ?>">Sửa</a> || <a href="?productid=<?php echo $rs['PID'] ?>">Xoá</a></td>
				</tr>
				<?php
					}
				}
				?>
				
				
			</tbody>
		</table>

       </div>
    </div>
</div>

<script type="text/javascript">
    $(document).ready(function () {
        setupLeftMenu();
        $('.datatable').dataTable();
		setSidebarHeight();
    });
</script>
<?php include 'inc/footer.php';?>
