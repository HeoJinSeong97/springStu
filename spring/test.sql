create table board(
	id int primary key,
	title varchar(50),
	writer varchar(30),
	content varchar(100),
	wdate date default sysdate,
	cnt int default 0
);
create table users(
	id varchar(20) primary key,
	password varchar(20),
	name varchar(30),
	role varchar(30)
);
insert into users values('a','a','a','ADMIN');
insert into users values('kim','1234','ȫ�浿','USER');
insert into board (id,title,writer,content) values(1,'����','ȫ�浿','���� Ȯ�� �׽�Ʈ');
select * from board;
select * from users;

create table product(
	id int primary key,
	name varchar(30),
	price int
);
insert into product values(1,'�Ź�',60000);
insert into product values(2,'������',40000);
insert into product values(3,'����',55000);

select * from users;

