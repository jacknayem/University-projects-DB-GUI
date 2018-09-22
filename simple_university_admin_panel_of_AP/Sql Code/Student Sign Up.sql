create table SignUpStudent
(
	StdID varchar(100) primary key not null,
	BirthDate varchar(100) not null,
	Trimester varchar(100) not null,
	EmailAddress varchar(100) not null,
	MobileNumber varchar(100) not null,
	Pass varchar(100) not null,
	passReturn varchar(100) not null,

);

create table SignInStudent
(
	StdID int primary key not null,
	Pass varchar (30) not null,
);
insert into SignInStudent (StdID,Pass) values (2,'ghjkl')

insert into SignUpStudent (StdID,BirthDate,Trimester,EmailAddress,MobileNumber,Pass,passReturn) 
values ('2','12-9-2017','Summer-2017','Noakhali','0184','yes','1234');

delete from SignUpStudent where Trimester = 'Summer-2017'

select * from SignUpStudent;