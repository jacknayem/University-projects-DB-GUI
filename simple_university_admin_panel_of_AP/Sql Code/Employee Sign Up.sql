create table SignUpEmployee
(
	EmpID int primary key not null,
	BirthDate varchar(20) not null,
	DptName varchar(40) not null,
	EmailAddress varchar(50) not null,
	MobileNumber int not null,
	Answer varchar(50) not null,
	Pass varchar (30) not null,
	passReturn varchar(30) not null,
	Agree varchar(20) default 'Done' not null,
);
insert into SignUpEmployee values ();

select * from SignUpEmployee;