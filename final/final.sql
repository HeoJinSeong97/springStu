select * from all_tables;
drop table board;

CREATE TABLE BOARD(
	id int primary key,
	title varchar(20) not null,
	writer varchar(10) not null,
	content varchar(100)
);

insert into board values(1,'제목','작성자','내용');
insert into board values(2,'제목2','작성자2','내용2');
insert into board values(3,'제목3','작성자3','내용3');
insert into board values(4,'제목4','작성자4','내용4');
insert into board values(5,'제목5','작성자5','내용5');

select * from board;
