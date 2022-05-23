CREATE DATABASE QuanLiNhaHang
go
use QuanLiNhaHang

--Tao table
create table NhanVien
(
	idNV varchar(10) not null primary key,
	tenNV nvarchar(50) null,
	ngaySinh date null,
	gioiTinh nvarchar(5) null,
	SDT varchar(10) null,
	diaChi nvarchar(50) null,
	tenCV nvarchar(30) null,
	luong money null,
	status nvarchar(20) null
)
create table MonAn
(
	idMonAn varchar(10) not null primary key,
	tenMonAn nvarchar(50) null,
	donGia money null
)


create table DatBan
(
	idDB varchar(10) not null primary key,
	ngayDatBan date,
	nvPhuTrach varchar(10) foreign key references NhanVien(idNV)
		on delete 
			cascade
		on update
			cascade
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
	idHoaDon varchar(10) primary key,
	ngayThanhToan date,
	idNV varchar(10) foreign key references NhanVien(idNV)
		on delete 
			cascade
		on update
			cascade
)

create table ChiTietHoaDon
(
	idHoaDon varchar(10),
	idBA varchar(10) foreign key references BanAn(idBA)
		on delete 
			cascade
		on update
			cascade,
	idMonAn varchar(10) foreign key references MonAn(idMonAn)
		on delete 
			cascade
		on update
			cascade,
	soLuong int,
	primary key(idHoaDon,idMonAn)
)
create table KhachHang
(
	SDT varchar(10) not null primary key,
	tenKH nvarchar(50) ,
	ngaySinh date,
	gioiTinh nvarchar(5),
	diaChi nvarchar(50)
)

create table ChiTietBan
(
	idBA varchar(10) not null,
	idDB varchar(10) not null,
	SDT varchar(10) not null foreign key references KhachHang(SDT)
		on delete 
			cascade
		on update
			cascade,
	ngayAn date,
	primary key (idBA, idDB)
)


--Them du lieu
set dateformat dmy
insert into NhanVien
values
	('NV001',N'Bùi Viết Trường','2-8-2002','Nam','0935486213',N'21 Hàm Trung 8',N'Quản lí', '2000000', N'Đang làm việc'),
	('NV002',N'Hà Thị Loan','5-9-2000',N'Nữ','0356984132',N'12 Nguyễn Tất Thành', N'Đầu bếp', '5000000', N'Đang làm việc'),
	('NV003',N'Phạm Mỹ Nhung','1-4-2002',N'Nữ','0356824170',N'20 Cao Thắng', N'Đầu bếp', '2000000', N'Đang làm việc'),
	('NV004',N'Nguyễn Xuân Trường','10-8-1999','Nam','0926486213',N'13 Ông Ích Khiêm', N'Bảo vệ', '4000000', N'Nghỉ làm'),
	('NV005',N'Trần Dương Mỹ Phụng','10-10-1999',N'Nữ','0306486213',N'5 Nguyễn Văn Trỗi', N'Phục vụ', '3000000', N'Đang làm việc')
go

insert into DatBan
values
	('DB001','9-5-2022','NV005'),
	('DB002','10-5-2022','NV005'),
	('DB003','3-6-2022','NV005')
go

insert into NguyenLieu
values
	('T1001',N'Thịt bò Cobe A1',150,'Kilogram','NV001'),
	('R1002',N'Xà lách hồng',50,'Kilogram','NV001'),
	('NC1001',N'Rượu vang Alita Selection Muscat Sparkling nho',120,'Chai','NV001'),
	('NC2001',N'Rượu vang Screaming Eagle Cabernet Sauvignon 1992',20,N'Thùng','NV001')
go

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
	('BA0010',N'Trống')
go

insert into KhachHang
values
	('0900000001',N'Nguyễn Ngọc Thiên Thùy','8-2-2002',N'Nữ',N'5 Nguyễn Tri Phương'),
	('0900000002',N'Nguyễn Đình Huy','12-5-2000','Nam',N'20 Nguyễn Văn Linh')
go

insert into ChiTietBan
values
	('BA001','DB001','0900000001','9-5-2022'),
	('BA001','DB002','0900000001','10-5-2022')
go

insert into MonAn
values 
	('MA001',N'Beef Steak',200000),
	('MA002',N'Gà quay',400000),
	('MA003',N'Gà rán nóng Nashville',330000),
	('MA004',N'Cá sấu Châu Phi nướng',700000),
	('MA005',N'Cừu New Zeland hấp',520000),
	('MA006',N'Sushi Nhật Bản',100000),
	('MA007',N'Bò dát vàng',450000),
	('MA008',N'Bánh Fleur Burger',280000),
	('MA009',N'Kem socola Frrrozen Haute',300000),
	('MA0010',N'Pudding Chocolate',320000)
go

set dateformat dmy
insert into HoaDon
values 
	('HD001','7-5-2022','NV005'),
	('HD002','9-5-2022','NV005'),
	('HD003','9-5-2022','NV005')
go

insert into ChiTietHoaDon
values 
	('HD001','BA002','MA001',2),
	('HD001','BA002','MA005',4),
	('HD002','BA005','MA007',3),
	('HD002','BA005','MA0010',3),
	('HD002','BA005','MA006',1),
	('HD003','BA001','MA003',3)

--Thống kê theo hóa đơn
select idHoaDon , format(sum(ma.donGia*cthd.soLuong),'##,#\ VNĐ','es-ES') as N'Tổng tiền'
from ChiTietHoaDon as cthd, MonAn as ma
where cthd.idMonAn = ma.idMonAn 
group by cthd.idHoaDon

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

