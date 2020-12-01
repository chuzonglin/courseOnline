drop table if exists `test`;
create table `test` (
                        `id` char(8) not null default '' comment 'id',
                        `name` varchar(50) comment '名称',
                        primary key (`id`)
)engine=innodb default charset=utf8mb4 comment='测试';

insert into `chapter` (id,course_id,name) values ('00000001','00000000','测试大章01');
insert into `chapter` (id,course_id,name) values ('00000002','00000000','测试大章02');
insert into `chapter` (id,course_id,name) values ('00000003','00000000','测试大章03');
insert into `chapter` (id,course_id,name) values ('00000004','00000000','测试大章04');
insert into `chapter` (id,course_id,name) values ('00000005','00000000','测试大章05');
insert into `chapter` (id,course_id,name) values ('00000006','00000000','测试大章06');
insert into `chapter` (id,course_id,name) values ('00000007','00000000','测试大章07');
insert into `chapter` (id,course_id,name) values ('00000008','00000000','测试大章08');
insert into `chapter` (id,course_id,name) values ('00000009','00000000','测试大章09');
insert into `chapter` (id,course_id,name) values ('00000010','00000000','测试大章10');
insert into `chapter` (id,course_id,name) values ('00000011','00000000','测试大章11');
insert into `chapter` (id,course_id,name) values ('00000012','00000000','测试大章12');