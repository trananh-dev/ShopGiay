<?php include 'inc/header.php';?>
<?php include 'inc/sidebar.php';?>
<?php include '../classes/chitietsp.php'; ?>
<?php include '../classes/category.php'; ?>
<?php include '../classes/product.php'; ?>


<?php
    $ctsp = new chitietsp();

    if(!isset($_GET['id'])||$_GET['id']==NULL){
        echo "<script>window.location ='listctsp.php'</script>";
       
    }
    else{
         $id=$_GET['id'];
    }

    if($_SERVER['REQUEST_METHOD']=='POST'){
        $PID=$_POST['sanpham'];
        $size=$_POST['size'];
        $soluong=$_POST['soluong'];
        $update_ctsp = $ctsp->update_chitietsp($PID,$size,$soluong,$id);
    }
?>





<div class="grid_10">
    <div class="box round first grid">
        <h2>Thêm chi tiết sản phẩm</h2>
        <div class="block">   
         <?php
                if(isset($update_ctsp)){
                    echo $update_ctsp;
                } 
                 ?>

                 <?php
                 $get_ctsp=$ctsp->edit_ctsp($id);
                 if($get_ctsp){
                    while($result = $get_ctsp->fetch_assoc()){
                 

                 ?>             
         <form action="" method="post" ">
            <table class="form">
               
                
				<tr>
                    <td>
                        <label>Mã sản phẩm</label>
                    </td>
                    <td>
                        <select id="select" name="sanpham">
                            <option>---Chọn sản phẩm---</option>
                            <?php
                            $pr  = new product();
                            $prid = $pr->get_all_product();

                            if($prid){
                                while($result_pr = $prid->fetch_assoc()){
                             ?>
                            
                            <option
                            <?php 
                            if($result['PID']== $result_pr['PID']){ echo 'selected';}
                            ?>

                            value="<?php echo $result_pr['PID'] ?>"><?php echo $result_pr['PName'] ?><?php echo '  --Mã SP--   ' ?><?php echo $result_pr['PID'] ?></option>

                               <?php
                                  }
                              }
                           ?>
                             

                               
  
                        </select>
                    </td>
                </tr>

				<tr>
                    <td>
                        <label>Kích thước</label>
                    </td>
                    <td>
                         <input style="width: 90px" type="number" name="size" min="36" max="45" value="<?php echo $result['size'] ?>"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label >Số lượng</label>
                    </td>
                    <td>
                        <input style="width: 90px" type="number" name="soluong" min="10" max="1000"  value="<?php echo $result['SoLuong'] ?>"/>
                    </td>
                </tr>

				<tr>
                    <td></td>
                    <td>
                        <input type="submit" name="submit" Value="Lưu" />
                    </td>
                </tr>
            </table>
            </form>
            <?php

                }
            }
                    ?>

                    <?php
                    if(isset($_POST['submit'])){
                        echo "<script>window.location ='listctsp.php'</script>";
                    }


                    ?> 
        </div>
    </div>
</div>
<!-- Load TinyMCE -->
<script src="js/tiny-mce/jquery.tinymce.js" type="text/javascript"></script>
<script type="text/javascript">
    $(document).ready(function () {
        setupTinyMCE();
        setDatePicker('date-picker');
        $('input[type="checkbox"]').fancybutton();
        $('input[type="radio"]').fancybutton();
    });
</script>
<!-- Load TinyMCE -->
<?php include 'inc/footer.php';?>


