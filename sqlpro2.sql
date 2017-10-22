use master
go

create database pro2db
go

use pro2db
go

create table coso
(id nvarchar(10) primary key,
tencoso nvarchar(50) not null,
)
go

create table nguoidung
(ID nvarchar(20) primary key,
idcoso nvarchar(10) foreign key references coso(id),
ten nvarchar(50) not null,
ngaysinh nvarchar(20) not null,
gioitinh nvarchar(10) not null,
hocvan nvarchar(30) not null,
chucvu nvarchar(30) not null,
diachi nvarchar(50) not null,
sdt nvarchar(20) not null,
email nvarchar(50) not null,
tendangnhap nvarchar(30),
matkhau nvarchar(30) default 'password',
)
go

create table lop
(
idlop nvarchar(20) primary key,
idcoso nvarchar(10) foreign key references coso(id),
tenlop nvarchar(20) not null,
nienkhoa nvarchar(20) not null
)
go

create table monhoc
(
idmonhoc nvarchar(20) primary key,
tenmonhoc nvarchar(50) not null,
thuchanh nvarchar(10),
lythuyet nvarchar(10),
)
go

create table diem
(
id nvarchar(20) foreign key references nguoidung(id),
idmonhoc nvarchar(20) foreign key references monhoc(idmonhoc),
idlop nvarchar(20) foreign key references lop(idlop),
hocky nvarchar(20) not null,
dthuchanh1 nvarchar(5),
dthuchanh2 nvarchar(5),
dlythuyet1 nvarchar(5),
dlythuyet2 nvarchar(5),
trangthai nvarchar(20)
)
go
