<?php include 'inc/header.php';?>
<?php include 'inc/sidebar.php';?>
<?php include '../classes/chitietsp.php'; ?>
<?php include '../classes/category.php'; ?>
<?php include '../classes/product.php'; ?>


<?php
    $ctsp = new chitietsp();
    if($_SERVER['REQUEST_METHOD']=='POST'){
        $id=$_POST['sanpham'];
        $size=$_POST['size'];
        $slp=$_POST['soluong'];
        $insert_ctsp=$ctsp->insert_chitietsp($id,$size,$slp);
    

     //    $ctlist = $ctsp->show_ctsp();
     //    if($ctlist){ 
     //        while($rs = $ctlist->fetch_assoc()){
     //            if($rs['PID']==$id && $rs['size']==$size && $rs['SoLuong']!=$slp ){
     //                $sl = $rs['SoLuong']+$slp;
     //               $up_sl=$ctsp-> update_sl($id,$size,$sl);
     //               if(isset($up_sl)){
     //                echo $up_sl;
     //            } 
     //            }
     //            if($rs['PID']==$id && $rs['size']==$size && $rs['SoLuong']==$slp ){
     //                echo 'Đã được thêm';

     //            }
                
     //        }
     //    }
                        
     }                   
?>





<div class="grid_10">
    <div class="box round first grid">
        <h2>Thêm chi tiết sản phẩm</h2>
        <div class="block">   
         <?php

                if(isset( $insert_ctsp)){
                    echo  $insert_ctsp;
                }

            ?>             
         <form action="themctsp.php" method="post" ">
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
                            $prid = $pr->show_product();

                            if($prid){
                                while($result = $prid->fetch_assoc()){
                             ?>

                            <option value="<?php echo $result['PID'] ?>"><?php echo $result['PName']?><?php echo '  --Mã SP--   ' ?><?php echo $result['PID'] ?> </option>

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
                        <input style="width: 90px" type="number" name="soluong" min="10" max="1000"  value="<?php echo $result['soluong'] ?>"/>
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


