.m column
.h on
pragma foreign_keys = on;

drop table if exists team;
drop table if exists person;
drop table if exists team_roles;
drop table if exists parent_child;

create table team (name text primary key);

create table person (id text primary key,
       	     	     name text,
		     surname text,
		     email text,
		     gender integer,
		     birthdate integer,
		     joindate integer,
		     active integer);

create table team_roles (pid text,
       	     		team varchar(3),
			role integer,
			FOREIGN KEY (pid) REFERENCES person(id) on delete cascade);
			
create table parent_child (
       	     	   pid text,
		   cid text,
		   FOREIGN KEY (cid) REFERENCES person(id) on delete cascade,
		   FOREIGN KEY (pid) REFERENCES person(id) on delete cascade,
		   primary key (pid, cid));



insert into team values('D');
insert into team values('H');
insert into team values('F05');
insert into team values('P05');
insert into team values('F04');
insert into team values('P04');
insert into team values('F03');
insert into team values('P03');
insert into team values('F02');
insert into team values('P02');
insert into team values('F01');
insert into team values('P01');
insert into team values('F00');
insert into team values('P00');
insert into team values('F99');
insert into team values('P99');
insert into team values('F98');
insert into team values('P98');


.mode csv
.import utils/formatted.csv person
.mode column


insert into team_roles values ('600221-5270', NULL, 1);
insert into team_roles values ('861001-7705', 'H', 0);
insert into team_roles values ('041104-4271', 'F04', 0);
insert into team_roles values ('980412-6543', 'P98', 0);
insert into team_roles values ('800709-4416', 'D', 0);
insert into team_roles values ('750919-2993', NULL, 1);
insert into team_roles values ('810427-7337', 'D', 2);
insert into team_roles values ('630815-2128', 'H', 2);
insert into team_roles values ('660218-7299', NULL, 1);
insert into team_roles values ('601122-4439', NULL, 1);
insert into team_roles values ('900421-7002', 'H', 0);
insert into team_roles values ('010617-8850', 'P01', 0);
insert into team_roles values ('740725-2224', 'D', 0);


insert into parent_child values ('600221-5270', '041104-4271');
insert into parent_child values ('600221-5270', '010617-8850');
insert into parent_child values ('750919-2993', '041104-4271');
insert into parent_child values ('750919-2993', '010617-8850');
insert into parent_child values ('660218-7299', '980412-6543');
insert into parent_child values ('601122-4439', '980412-6543');

