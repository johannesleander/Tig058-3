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
		   FOREIGN KEY (pid) REFERENCES person(id) on delete cascade,
		   FOREIGN KEY (cid) REFERENCES person(id) on delete cascade);



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

insert into person values ('030301-4125', 'Karin', 'Ungdotter', 'mail@club.se', 1, 0, 0, 1);
insert into person values ('031201-4165', 'Kalle', 'Kalleson', 'mail@club.se', 0, 0, 0, 1);
insert into person values ('880301-4145', 'Kalle', 'Carlsson', 'mail@club.se', 0, 0, 0, 1);
insert into person values ('870301-4125', 'Ung', 'Carlsson', 'mail@club.se', 1, 0, 0, 1);
insert into person values ('930201-2575', 'Karin', 'Sportsson', 'mail@club.se', 1, 0, 0, 1);

insert into team_roles values ('030301-4125', 'F03', 0);
insert into team_roles values ('031201-4165', 'P03', 0);
insert into team_roles values ('880301-4145', NULL, 1);
insert into team_roles values ('870301-4125', NULL, 1);
insert into team_roles values ('930201-2575', 'D', 0);

insert into parent_child values ('880301-4145', '030301-4125');
insert into parent_child values ('880301-4145', '031201-4165');
insert into parent_child values ('870301-4125', '030301-4125');
insert into parent_child values ('870301-4125', '031201-4165');
