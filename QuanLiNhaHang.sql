
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
CREATE DATABASE QuanLiNhaHang
go
use QuanLiNhaHang
=======
CREATE DATABASE QuanLiNhaHang5
go
use QuanLiNhaHang5
>>>>>>> DatBan
=======
CREATE DATABASE QuanLiNhaHang5
go
use QuanLiNhaHang5
>>>>>>> DangNhap
=======
CREATE DATABASE QuanLiNhaHang5
go
use QuanLiNhaHang5
>>>>>>> ThongKe


--Tao table
go
create table NhanVien
(
	idNV varchar(10) not null  primary key,
	tenNV nvarchar(50),
	ngaySinh date,
	gioiTinh nvarchar(5),
	SDT varchar(10),
	diaChi nvarchar(50),
	tenCV nvarchar(20),
	luong money,
	status nvarchar(20)
)

--Tạo database cho account
go
create table account
(
	idName_352 varchar(50) primary key not null,
	passWords_352 varchar(50) not null,
	idNV varchar(10) not null foreign key references NhanVien(idNV)
		on delete 
			cascade
		on update
			cascade
)
create table MonAn
(
	idMonAn varchar(10) not null primary key,
	tenMonAn nvarchar(50) null,
	donGia money null
)


create table NguyenLieu
(
	idNL varchar(10) not null primary key,
	tenNguyenLieu nvarchar(50),
	soLuong int ,
	donVi nvarchar(50),
	nvCapNhap varchar(10) foreign key references NhanVien(idNV)
		on delete 
			cascade
		on update
			cascade
)

create table BanAn
(
	idBA varchar(10) not null primary key,
	trangThaiBan nvarchar(50)
)
create table HoaDon
(
	idHoaDon int IDENTITY(1,1) primary key,
	ngayThanhToan date,
	idNV varchar(10) foreign key references NhanVien(idNV)
		on delete 
			cascade
		on update
			cascade,
	idBA varchar(10)foreign key references BanAn(idBA)
		on delete 
			cascade
		on update
			cascade,
	status nvarchar(20)
)



create table DatBan
(
	SDT nvarchar(15) not null primary key,
	tenKH varchar(50),	
	tenNVPT varchar(10) foreign key references NhanVien(idNV),
	diaChi nvarchar(50),
	ngayDat date,
	yeuCau nvarchar(50),
	gioiTinh nvarchar(5),
	idBA varchar(10) foreign key references BanAn(idBA)

)
create table ChiTietHoaDon
(
	idHoaDon int foreign key references HoaDon(idHoaDon),
	idMonAn varchar(10) foreign key references MonAn(idMonAn)
		on delete 
			cascade
		on update
			cascade,
	soLuong int,
	primary key(idHoaDon,idMonAn)
)

go
create table KhachHang
(
	idKH int identity(1,1) not null primary key,
	SDT nvarchar(15) foreign key references DatBan(SDT),
	tenKH nvarchar(50) ,
	ngaySinh date,
	gioiTinh nvarchar(5),
	diaChi nvarchar(50)
)

--Them du lieu
set dateformat dmy
insert into NhanVien
values
	('NV001',N'Bùi Viết Trường','2-8-2002','Nam','0935486213',N'21 Hàm Trung 8', N'Quản lí', '2000000', N'Đang làm việc'),
	('NV002',N'Hà Thị Loan','5-9-2000',N'Nữ','0356984132',N'12 Nguyễn Tất Thành', N'Thu ngân', '5000000', N'Đang làm việc'),
	('NV003',N'Phạm Mỹ Nhung','1-4-2002',N'Nữ','0356824170',N'20 Cao Thắng', N'Phục vụ', '2000000', N'Đang làm việc'),
	('NV004',N'Nguyễn Xuân Trường','10-8-1999','Nam','0926486213',N'13 Ông Ích Khiêm', N'Bảo vệ', '4000000', N'Đang làm việc'),
	('NV005',N'Trần Dương Mỹ Phụng','10-10-1999', N'Nữ','0306486213',N'5 Nguyễn Văn Trỗi', N'Phục vụ', '3000000', N'Đang làm việc')
go

insert into NguyenLieu
values
	('T1001',N'Thịt bò Cobe A1',150,'Kilogram','NV001'),
	('R1002',N'Xà lách hồng',50,'Kilogram','NV001'),
	('NC1001',N'Rượu vang Alita Selection Muscat Sparkling nho',120,'Chai','NV001'),
	('NC2001',N'Rượu vang Screaming Eagle Cabernet Sauvignon 1992',20,'Thùng','NV001')
go

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
select * from NguyenLieu
>>>>>>> DatBan
=======
select * from NguyenLieu
>>>>>>> DangNhap
=======
select * from NguyenLieu
>>>>>>> ThongKe
insert into BanAn
values
	('BA001',N'Trống'),
	('BA002',N'Trống'),
	('BA003',N'Trống'),
	('BA004',N'Trống'),
	('BA005',N'Trống'),
	('BA006',N'Trống'),
	('BA007',N'Trống'),
	('BA008',N'Trống'),
	('BA009',N'Trống'),
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	('BA010',N'Trống')
=======
	('BA0010',N'Trống')
>>>>>>> DatBan
=======
	('BA0010',N'Trống')
>>>>>>> DangNhap
=======
	('BA0010',N'Trống')
>>>>>>> ThongKe

go

set dateformat dmy
go


insert into MonAn
values 
	('MA001',N'Beef Steak',200000),
	('MA002',N'Gà quay',220000),
	('MA003',N'Gà rán nóng Nashville',100000),
	('MA004',N'Cá sấu Châu Phi nướng',700000),
	('MA005',N'Cừu New Zeland hấp',500000),
	('MA006',N'Sushi Nhật Bản',100000),
	('MA007',N'Lẩu đặc biệt',250000),
	('MA008',N'Cơm rang bò',120000),
	('MA009',N'Nước suối',50000),
	('MA0010',N'Rượu vang',200000)
<<<<<<< HEAD
<<<<<<< HEAD


go
insert into account
values ('trung','123', 'NV001'),
<<<<<<< HEAD
	   ('truong','123', 'NV002'),
	   ('vu','123', 'NV005')
=======
	   ('truong','123', 'NV002')

>>>>>>> DatBan
=======
=======
>>>>>>> ThongKe


go
insert into account
values ('trung','123', 'NV001'),
	   ('truong','123', 'NV002')

<<<<<<< HEAD
>>>>>>> DangNhap
=======
>>>>>>> ThongKe
--Thống kê theo hóa đơn
select idHoaDon , format(sum(ma.donGia*cthd.soLuong),'##,#\ VNĐ','es-ES') as N'Tổng tiền'
from ChiTietHoaDon as cthd, MonAn as ma
where cthd.idMonAn = ma.idMonAn 
group by cthd.idHoaDon

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> ThongKe
--Thống kê theo tháng

select month(hd.ngayThanhToan) , format(sum(ma.donGia*cthd.soLuong),'##,#\ VNĐ','es-ES') as N'Tổng tiền'
from HoaDon as hd,ChiTietHoaDon as cthd, MonAn as ma
where hd.idHoaDon = cthd.idHoaDon and cthd.idMonAn = ma.idMonAn 
group by month(hd.ngayThanhToan)

--Thống kê theo năm
select year(hd.ngayThanhToan) as N'Năm' , format(sum(ma.donGia*cthd.soLuong),'##,#\ VNĐ','es-ES') as N'Tổng tiền'
from HoaDon as hd,ChiTietHoaDon as cthd, MonAn as ma
where hd.idHoaDon = cthd.idHoaDon and cthd.idMonAn = ma.idMonAn 
group by year(hd.ngayThanhToan)

--Thống kê theo ngày hiện tại
select day(hd.ngayThanhToan) , format(sum(ma.donGia*cthd.soLuong),'##,#\ VNĐ','es-ES') as N'Tổng tiền'
from HoaDon as hd,ChiTietHoaDon as cthd, MonAn as ma
where hd.idHoaDon = cthd.idHoaDon and cthd.idMonAn = ma.idMonAn and day(hd.ngayThanhToan) = day(GETDATE())
group by day(hd.ngayThanhToan)



<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> DatBan
=======
>>>>>>> DangNhap
=======
>>>>>>> ThongKe

