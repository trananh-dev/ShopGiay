<?php include 'inc/header.php';?>
<?php include 'inc/sidebar.php';?>
<?php include '../classes/chitietsp.php';?>
<?php include '../classes/category.php';?>
<?php include '../classes/product.php';?>
<?php include_once '../helpers/format.php';?>

<?php
	$ct = new chitietsp();
	$fm = new Format();
	if(isset($_GET['id'])){
        $id = $_GET['id']; 
        $delct = $ct->del_ctsp($id);
    }
?>

<div class="grid_10">
    <div class="box round first grid">
        <h2>Danh sách sản phẩm</h2>
        <div class="block">  
        	<?php
        if(isset($delct)){
        	echo $delct;
        }
        ?>
            <table class="data display datatable" id="example">
			<thead>
				<tr>
					<th>ID</th>
					<th>Mã sản phẩm</th>
					<th>Size</th>
					<th>Số lượng</th>
					<th>Xử Lý</th>
					
				</tr>
			</thead>
			<tbody>
				<?php
				$ctlist = $ct->show_ctsp();
				if($ctlist){
					$i=0;
					while($rs = $ctlist->fetch_assoc()){
						$i++;
					

				?>
				<tr class="odd gradeX">
					<td><?php echo $i ?></td>
					<td><?php echo $rs['PID'] ?></td>
					
					<td><?php echo $rs['size'] ?></td>
					<td><?php echo $rs['SoLuong'] ?></td>
					
					
					<td><a href="ctspedit.php?id=<?php echo $rs['ID'] ?>">Sửa</a> || <a href="?id=<?php echo $rs['ID'] ?>">Xoá</a></td>
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
