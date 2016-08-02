alter database mydb default character set utf8;
drop table if exists user cascade;
create table user(
	user_id VARCHAR(16) not null
    , user_name VARCHAR(128) not null
    ,primary key (user_id)
);
insert into user(user_id,user_name) value ('20511091yk','かじわらゆたか');