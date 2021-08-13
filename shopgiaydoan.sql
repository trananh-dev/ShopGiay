-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th8 13, 2021 lúc 06:42 PM
-- Phiên bản máy phục vụ: 10.4.17-MariaDB
-- Phiên bản PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `shopgiaydoan`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietsp`
--

CREATE TABLE `chitietsp` (
  `ID` int(11) NOT NULL,
  `PID` int(11) NOT NULL,
  `size` int(11) NOT NULL,
  `color` varchar(255) NOT NULL,
  `slnhap` int(11) NOT NULL,
  `slorder` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `chitietsp`
--

INSERT INTO `chitietsp` (`ID`, `PID`, `size`, `color`, `slnhap`, `slorder`) VALUES
(2, 7, 37, 'white', 100, 0),
(3, 9, 40, 'white', 100, 0),
(6, 14, 37, 'Pink', 10, 0),
(8, 14, 38, 'black', 100, 0),
(9, 14, 39, 'black', 100, 0),
(22, 7, 36, 'black', 20, 0),
(23, 7, 38, 'red', 100, 0),
(24, 7, 40, 'black', 100, 0),
(25, 7, 41, '', 100, 0),
(29, 14, 40, '', 10, 0),
(33, 10, 40, '', 11, 0),
(34, 7, 39, '', 10, 0),
(35, 8, 36, '', 10, 0),
(36, 8, 37, '', 10, 0),
(37, 8, 39, '', 10, 0),
(38, 8, 40, '', 10, 0),
(39, 8, 38, '', 10, 0),
(40, 6, 36, '', 10, 0),
(41, 6, 37, '', 10, 0),
(42, 6, 38, '', 10, 0),
(43, 6, 40, '', 10, 0),
(44, 6, 39, '', 10, 0),
(45, 9, 36, '', 10, 0),
(46, 9, 37, '', 10, 0),
(47, 9, 39, '', 10, 0),
(48, 9, 38, '', 10, 0),
(49, 10, 36, '', 10, 0),
(50, 10, 37, '', 10, 0),
(51, 10, 38, '', 10, 0),
(52, 10, 39, '', 10, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_admin`
--

CREATE TABLE `tbl_admin` (
  `adminId` int(11) NOT NULL,
  `adminName` varchar(255) NOT NULL,
  `adminEmail` varchar(255) NOT NULL,
  `adminUser` varchar(255) NOT NULL,
  `adminPass` varchar(255) NOT NULL,
  `level` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_admin`
--

INSERT INTO `tbl_admin` (`adminId`, `adminName`, `adminEmail`, `adminUser`, `adminPass`, `level`) VALUES
(1, 'truc', 'truc@gmail.com', 'trucadmin', '$2a$12$QAyHjdtbiaWvGFQn7VEDi.CT.yOxHjoAQskMTJuSE6Z8zLLKyi2fq', 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_brand`
--

CREATE TABLE `tbl_brand` (
  `brandId` int(11) NOT NULL,
  `brandName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_brand`
--

INSERT INTO `tbl_brand` (`brandId`, `brandName`) VALUES
(5, 'Nike'),
(6, 'adidas'),
(7, 'Puma'),
(8, 'Reebok'),
(11, 'Burlaty');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_cart`
--

CREATE TABLE `tbl_cart` (
  `cartId` int(11) NOT NULL,
  `PID` int(11) NOT NULL,
  `PName` varchar(255) NOT NULL,
  `SeId` varchar(255) NOT NULL,
  `PPrice` int(11) NOT NULL,
  `soluong` int(11) NOT NULL,
  `size` int(11) NOT NULL,
  `image` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_cart`
--

INSERT INTO `tbl_cart` (`cartId`, `PID`, `PName`, `SeId`, `PPrice`, `soluong`, `size`, `image`) VALUES
(10, 14, 'giày lậu', 'o5fth2dmf690e0rg7fobkjnakq', 39000000, 4, 38, 'ea690c73ed.jpg'),
(11, 7, 'Nike Air max', 'o5fth2dmf690e0rg7fobkjnakq', 1500000, 3, 0, '9c0cfe572b.jpg'),
(12, 13, 'Nike Air Force 1', 'sb7gcge1cfpkshpo8ls8oimoc0', 39000000, 3, 37, 'bdcf77c6ba.jpg'),
(28, 6, 'Nike Air Force 1', 'rulnjsach73g1rps8mjupog0s2', 1500000, 3, 36, 'ae6a061d84.jpg'),
(41, 6, 'Nike Air Force 1', 'bj46qvmj2luankou9nro6f57tc', 1500000, 1, 36, 'ae6a061d84.jpg'),
(53, 8, 'Yeezy Boost 350 Low', '781tcm462tpkh6a1f5fgko2nnh', 39000000, 1, 37, 'fc0512a1e6.jpg'),
(55, 6, 'Nike Air Force 1', '623ofrl2pvf6spb3nj482ve5mk', 1500000, 1, 37, 'ae6a061d84.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_category`
--

CREATE TABLE `tbl_category` (
  `catId` int(11) NOT NULL,
  `catName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_category`
--

INSERT INTO `tbl_category` (`catId`, `catName`) VALUES
(18, 'Giày nam '),
(20, 'Giày thể thao'),
(21, 'Giày sneaker'),
(28, 'Hal');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_customer`
--

CREATE TABLE `tbl_customer` (
  `ID` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `city` varchar(30) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) CHARACTER SET macce COLLATE macce_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_customer`
--

INSERT INTO `tbl_customer` (`ID`, `name`, `address`, `city`, `phone`, `email`, `password`) VALUES
(14, 'Trần Văn Trực', 'Đức Thọ', 'Hà Tĩnh', '0982193347', 'tructv07121999@gmail.com', '$2a$12$AB5dGRYNWvEVRhbrRC3MlOuQNgbyladpyE4Bl.EVgfRQgExylWH1G'),
(15, 'khanhddd', 'fff', 'ht', '135', 'tructv@gmail.com', '$2a$12$M5IePRa37QYD2RINKti1WenRDbRCjdiVo0zQ8myUX9aIynvB38mCe'),
(16, 'trung', 'đức thanh - đức thọ', 'ha tĩnh', '0982882828', 'tructv07@gmail.com', '202cb962ac59075b964b07152d234b70'),
(17, 'lan', 'Đức Thọ', 'Hà Tĩnh', '0982193347', 'lan@gmail.com', '$2a$12$QAyHjdtbiaWvGFQn7VEDi.CT.yOxHjoAQskMTJuSE6Z8zLLKyi2fq'),
(18, 'KhanhNam', 'Đức Thọ', 'Hà Tĩnh', '1351', 'khanh@gmail.com', '$2a$12$NZP3XV4A8NnYmEmxz/aoFONL8LEWpixOmP9OyBcEr15MraiISd18W'),
(19, 'long', 'Đức Thọ', 'Hà Tĩnh', '13511', 'long@gmail.com', '$2a$12$UBIFSoyQCtoPlhGbAGow1e/JRoVbNvrBlsnL42q9hH5g9g79tq4he'),
(20, 'nam', 'Đức Thọ', 'Hà Tĩnh', '1351', 'nam@gmail.com', '$2a$12$HZXsdkrJ374p58KIGGYRE.WWPbtW35LyuVj9sepaYTjKoEjB2BxzS'),
(25, 'truc', 'fff', '', '', 'tructv07121999@gmail.com', '$2a$12$pJ2TExy0zrGEB9VNAlEnd..DMwMFrgeYNwo84EVeL1ZW0qvdcdY7K'),
(26, 'truc', 'fff', '', '', 'tructv07121999@gmail.com', '$2a$12$N0Y0/GWxKqi/AqZg9Gdh3e17Op82ZIbfMme5MTHeElsUbMrGqNhcW');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_order`
--

CREATE TABLE `tbl_order` (
  `ID` int(11) NOT NULL,
  `PID` int(11) NOT NULL,
  `PName` varchar(255) NOT NULL,
  `soluong` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `image` varchar(255) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `date_order` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_order`
--

INSERT INTO `tbl_order` (`ID`, `PID`, `PName`, `soluong`, `price`, `image`, `customer_id`, `status`, `date_order`) VALUES
(29, 16, 'Yeezy Boost 450 ', 1, 700000, 'b7f0e061df.jpg', 18, 0, '2021-08-10 17:10:15'),
(32, 14, 'giày lậu', 1, 39000000, 'ea690c73ed.jpg', 14, 2, '2021-08-10 17:12:15'),
(33, 16, 'Yeezy Boost 450 ', 2, 1400000, 'b7f0e061df.jpg', 18, 0, '2021-08-11 07:10:38'),
(34, 6, 'Nike Air Force 1', 6, 9000000, 'ae6a061d84.jpg', 18, 0, '2021-08-11 07:11:22'),
(36, 16, 'Yeezy Boost 450 ', 2, 1400000, 'b7f0e061df.jpg', 14, 0, '2021-08-11 14:45:58'),
(37, 10, 'Yeezy Boost 700', 2, 3000000, 'c306c1b2b5.jpg', 14, 0, '2021-08-11 15:28:58'),
(38, 14, 'giày lậu', 2, 78000000, 'ea690c73ed.jpg', 14, 0, '2021-08-11 15:28:58'),
(39, 14, 'giày lậu', 2, 78000000, 'ea690c73ed.jpg', 19, 0, '2021-08-11 17:26:57'),
(40, 6, 'Nike Air Force 1', 5, 7500000, 'ae6a061d84.jpg', 14, 0, '2021-08-12 02:25:57'),
(41, 7, 'Nike Air max', 1, 1500000, '9c0cfe572b.jpg', 15, 0, '2021-08-13 03:27:33');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_product`
--

CREATE TABLE `tbl_product` (
  `PID` int(11) NOT NULL,
  `PName` varchar(255) NOT NULL,
  `catId` int(11) NOT NULL,
  `brandId` int(11) NOT NULL,
  `PDesciption` text NOT NULL,
  `PPrice` int(255) NOT NULL,
  `discount` int(11) NOT NULL,
  `PImage` varchar(255) NOT NULL,
  `PType` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbl_product`
--

INSERT INTO `tbl_product` (`PID`, `PName`, `catId`, `brandId`, `PDesciption`, `PPrice`, `discount`, `PImage`, `PType`) VALUES
(6, 'Nike Air Force 1', 20, 6, '<p><span>Nike Air Force 1</span><span>&nbsp;l&agrave; một đ&ocirc;i gi&agrave;y biểu tượng đến từ &ldquo;&ocirc;ng tr&ugrave;m&rdquo; thời trang thể thao Nike. N&oacute; l&agrave; một bước ngoặt lớn về gi&agrave;y b&oacute;ng rổ tr&ecirc;n to&agrave;n cầu nhờ được trang bị c&ocirc;ng nghệ đế gi&agrave;y Air Unit. N&oacute; kh&ocirc;ng chỉ l&agrave; một đ&ocirc;i gi&agrave;y được sử dụng trong c&aacute;c m&ocirc;n thể thao, m&agrave; c&ograve;n được c&aacute;c t&iacute;n đồ của h&atilde;ng sử dụng như một item thời trang v&ocirc; c&ugrave;ng phong c&aacute;ch, kh&ocirc;ng cần qu&aacute; ph&ocirc; trương.</span></p>', 1500000, 0, 'adidas-1.jpg', 2),
(7, 'Nike Air max', 20, 5, '<p><span>Gi&agrave;y Nike Air Max được đặt t&ecirc;n theo c&ocirc;ng nghệ m&agrave; n&oacute; sở hữu &ndash; c&ocirc;ng nghệ Air Max sử dụng phần lớn (max) đệm kh&iacute; air cho phần đế giữa. Đ&ocirc;i gi&agrave;y n&agrave;y kh&ocirc;ng chỉ sở hữu c&ocirc;ng nghệ đệm tuyệt vời m&agrave; c&ograve;n chiếm lĩnh một vẻ ngo&agrave;i sang trọng v&agrave; đẳng cấp đến bất ngờ.</span></p>', 1500000, 0, '9c0cfe572b.jpg', 1),
(8, 'Yeezy Boost 350 Low', 21, 6, '<p><span>Yeezy Boost 350 được b&aacute;n với một mức gi&aacute; kh&aacute; mềm chỉ với 200 USD (khoảng 4,5 triệu VNĐ) trong đ&oacute;&nbsp; kh&ocirc;ng c&ograve;n đ&ocirc;i n&agrave;o cho anh chị em cần mua nửa.</span></p>', 39000000, 0, 'fc0512a1e6.jpg', 1),
(9, 'Yeezy Boost 350 ', 21, 6, '<p><span>Yeezy Boost 350 được b&aacute;n với một mức gi&aacute; kh&aacute; mềm chỉ với 200 USD (khoảng 4,5 triệu VNĐ)</span></p>', 1500000, 0, 'bc64b625e9.jpg', 1),
(10, 'Yeezy Boost 700', 21, 6, '<p><span>Yeezy Boost 350 được b&aacute;n với một mức gi&aacute; kh&aacute; mềm chỉ với 200 USD (khoảng 4,5 triệu VNĐ)</span></p>', 1500000, 0, 'c306c1b2b5.jpg', 2),
(14, 'giày lậu', 21, 6, '<p>đ&acirc;y l&agrave; gi&agrave;y lậu</p>', 39000000, 0, 'ea690c73ed.jpg', 2),
(16, 'Yeezy Boost 450 ', 21, 6, '<p>Thương hiệu n&ocirc;it tiếng</p>', 700000, 0, 'b7f0e061df.jpg', 1),
(18, 'Giày đá bóng', 20, 6, 'Sản phẩm nổi tiếng', 10000000, 0, '700.jpg', 2),
(19, 'Yeezy Boost ', 21, 5, 'Thương hiệu nổi tiếng', 10000000, 0, '3.jpg', 2),
(24, 'Yeezy Boost ', 21, 6, 'Thương hiệu nổi tiếng', 10000000, 0, 'max.jpg', 1),
(25, 'Nike Air Force 1', 20, 7, '<p><span>Nike Air Force 1</span><span>&nbsp;l&agrave; một đ&ocirc;i gi&agrave;y biểu tượng đến từ &ldquo;&ocirc;ng tr&ugrave;m&rdquo; thời trang thể thao Nike. N&oacute; l&agrave; một bước ngoặt lớn về gi&agrave;y b&oacute;ng rổ tr&ecirc;n to&agrave;n cầu nhờ được trang bị c&ocirc;ng nghệ đế gi&agrave;y Air Unit. N&oacute; kh&ocirc;ng chỉ l&agrave; một đ&ocirc;i gi&agrave;y được sử dụng trong c&aacute;c m&ocirc;n thể thao, m&agrave; c&ograve;n được c&aacute;c t&iacute;n đồ của h&atilde;ng sử dụng như một item thời trang v&ocirc; c&ugrave;ng phong c&aacute;ch, kh&ocirc;ng cần qu&aacute; ph&ocirc; trương.</span></p>', 1500000, 0, 'adidas-1.jpg', 2),
(31, 'Yeezy 350', 20, 6, '<p><span>Nike Air Force 1</span><span>&nbsp;l&agrave; một đ&ocirc;i gi&agrave;y biểu tượng đến từ &ldquo;&ocirc;ng tr&ugrave;m&rdquo; thời trang thể thao Nike. N&oacute; l&agrave; một bước ngoặt lớn về gi&agrave;y b&oacute;ng rổ tr&ecirc;n to&agrave;n cầu nhờ được trang bị c&ocirc;ng nghệ đế gi&agrave;y Air Unit. N&oacute; kh&ocirc;ng chỉ l&agrave; một đ&ocirc;i gi&agrave;y được sử dụng trong c&aacute;c m&ocirc;n thể thao, m&agrave; c&ograve;n được c&aacute;c t&iacute;n đồ của h&atilde;ng sử dụng như một item thời trang v&ocirc; c&ugrave;ng phong c&aacute;ch, kh&ocirc;ng cần qu&aacute; ph&ocirc; trương.</span></p>', 1500000, 0, '1.jpg', 1),
(32, 'Hal', 18, 5, 'kdkd', 1, 1, 'Yeezy-Boost-350-Low.jpg', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_slider`
--

CREATE TABLE `tbl_slider` (
  `sliderId` int(11) NOT NULL,
  `sliderName` varchar(255) NOT NULL,
  `slider_image` varchar(255) NOT NULL,
  `type` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitietsp`
--
ALTER TABLE `chitietsp`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `PID` (`PID`);

--
-- Chỉ mục cho bảng `tbl_admin`
--
ALTER TABLE `tbl_admin`
  ADD PRIMARY KEY (`adminId`);

--
-- Chỉ mục cho bảng `tbl_brand`
--
ALTER TABLE `tbl_brand`
  ADD PRIMARY KEY (`brandId`);

--
-- Chỉ mục cho bảng `tbl_cart`
--
ALTER TABLE `tbl_cart`
  ADD PRIMARY KEY (`cartId`);

--
-- Chỉ mục cho bảng `tbl_category`
--
ALTER TABLE `tbl_category`
  ADD PRIMARY KEY (`catId`);

--
-- Chỉ mục cho bảng `tbl_customer`
--
ALTER TABLE `tbl_customer`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `tbl_order`
--
ALTER TABLE `tbl_order`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `PID` (`PID`),
  ADD KEY `customer_id` (`customer_id`);

--
-- Chỉ mục cho bảng `tbl_product`
--
ALTER TABLE `tbl_product`
  ADD PRIMARY KEY (`PID`),
  ADD KEY `catId` (`catId`),
  ADD KEY `brandId` (`brandId`);

--
-- Chỉ mục cho bảng `tbl_slider`
--
ALTER TABLE `tbl_slider`
  ADD PRIMARY KEY (`sliderId`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `chitietsp`
--
ALTER TABLE `chitietsp`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT cho bảng `tbl_brand`
--
ALTER TABLE `tbl_brand`
  MODIFY `brandId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT cho bảng `tbl_cart`
--
ALTER TABLE `tbl_cart`
  MODIFY `cartId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;

--
-- AUTO_INCREMENT cho bảng `tbl_category`
--
ALTER TABLE `tbl_category`
  MODIFY `catId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT cho bảng `tbl_customer`
--
ALTER TABLE `tbl_customer`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT cho bảng `tbl_order`
--
ALTER TABLE `tbl_order`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT cho bảng `tbl_product`
--
ALTER TABLE `tbl_product`
  MODIFY `PID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT cho bảng `tbl_slider`
--
ALTER TABLE `tbl_slider`
  MODIFY `sliderId` int(11) NOT NULL AUTO_INCREMENT;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitietsp`
--
ALTER TABLE `chitietsp`
  ADD CONSTRAINT `chitietsp_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `tbl_product` (`PID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `tbl_order`
--
ALTER TABLE `tbl_order`
  ADD CONSTRAINT `tbl_order_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `tbl_product` (`PID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_order_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `tbl_customer` (`ID`);

--
-- Các ràng buộc cho bảng `tbl_product`
--
ALTER TABLE `tbl_product`
  ADD CONSTRAINT `tbl_product_ibfk_1` FOREIGN KEY (`catId`) REFERENCES `tbl_category` (`catId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_product_ibfk_2` FOREIGN KEY (`brandId`) REFERENCES `tbl_brand` (`brandId`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
