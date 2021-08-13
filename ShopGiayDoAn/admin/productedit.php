<?php include 'inc/header.php';?>
<?php include 'inc/sidebar.php';?>
<?php include '../classes/brand.php'; ?>
<?php include '../classes/category.php'; ?>
<?php include '../classes/product.php'; ?>
<?php
    $pd = new product();

    if(!isset($_GET['productid']) || $_GET['productid']==NULL){
       echo "<script>window.location ='productlist.php'</script>";
    }else{
         $id = $_GET['productid']; 
    }

    if ($_SERVER['REQUEST_METHOD'] == 'POST' && isset($_POST['submit'])) {
        
        $updateProduct = $pd->update_product($_POST,$_FILES,$id);
        
    }
?>





<div class="grid_10">
    <div class="box round first grid">
        <h2>Sửa sản phẩm</h2>
        <div class="block">   
         <?php

                if(isset($updateProduct)){
                    echo $updateProduct;
                }

            ?>
            <?php
            $xemsp=$pd->getproductbyId($id);
            if($xemsp){
                while($rs_product=$xemsp->fetch_assoc()){
            ?>             
         <form action="" method="post" enctype="multipart/form-data">
            <table class="form">
               
                <tr>
                    <td>
                        <label>Tên sản phẩm</label>
                    </td>
                    <td>
                        <input type="text" name="PName" value="<?php echo $rs_product['PName'] ?>" class="medium" />
                    </td>
                </tr>
				<tr>
                    <td>
                        <label>Danh mục</label>
                    </td>
                    <td>
                        <select id="select" name="danhmuc">
                            <option>---Chọn danh mục---</option>
                             <?php
                            $cat = new category();
                            $catlist = $cat->show_category();

                            if($catlist){
                                while($result = $catlist->fetch_assoc()){
                             ?>

                            <option 

                            <?php 
                            if($result['catId']==$rs_product['catId']){ echo 'selected';}
                            ?>

                            value="<?php echo $result['catId'] ?>"><?php echo $result['catName'] ?></option>

                               <?php
                                  }
                              }
                           ?>
  
                        </select>
                    </td>
                </tr>

				<tr>
                    <td>
                        <label>Thương hiệu</label>
                    </td>
                    <td>
                        <select id="select" name="thuonghieu">
                            <option>---Chọn thương hiệu---</option>
                            <?php
                             $brand = new brand();
                            $brlist = $brand->show_brand();

                            if($catlist){
                                while($result = $brlist->fetch_assoc()){
                             ?>

                            <option 
                            <?php
                             if($result['brandId']==$rs_product['brandId']){ echo 'selected';}
                            ?>

                           
                            value="<?php echo $result['brandId'] ?>"><?php echo $result['brandName'] ?></option>

                               <?php
                                  }
                              }
                           ?>
                        </select>
                    </td>
                </tr>
				
				 <tr>
                    <td style="vertical-align: top; padding-top: 9px;">
                        <label>Mô tả</label>
                    </td>
                    <td>
                        <textarea class="tinymce"  name="mota"><?php echo $rs_product['PDesciption'] ?></textarea>
                    </td>
                </tr>
				<tr>
                    <td>
                        <label>Giá</label>
                    </td>
                    <td>
                        <input type="text" name="gia" value="<?php echo $rs_product['PPrice'] ?>" />
                    </td>
                </tr>
            
                <tr>
                    <td>
                        <label>Hình ảnh</label>
                    </td>
                    <td>
                        <img src="uploads/<?php echo $rs_product['PImage'] ?>" width="90"><br>
                        <input type="file" name="image" />
                      
                    </td>
                </tr>
				
				<tr>
                    <td>
                        <label>Loại sản phẩm</label>
                    </td>
                    <td>
                        <select id="select"  name="PType">
                            <option>---Chọn loại sản phẩm---</option>

                            <?php
                            if($rs_product['PType']==0){
                            ?>
                            <option selected value="0">Nổi bật</option>
                            <option value="1">Không nổi bật</option>
                            <?php
                        }else{
                            ?>
                            <option value="0">Nổi bật</option>
                            <option selected value="1">Không nổi bật</option>
                            <?php
                            }
                            ?>

                            
                        </select>
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
        <?php } } ?>
        </div>
    </div>
</div>
<?php
                    if(isset($_POST['submit'])){
                        echo "<script>window.location ='productedit.php'</script>";
                    }


                    ?>
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


