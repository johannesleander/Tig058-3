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
			FOREIGN KEY (pid) REFERENCES person(id) on delete cascade on update cascade);
			
create table parent_child (
       	     	   pid text,
		   cid text,
		   FOREIGN KEY (pid) REFERENCES person(id) on delete cascade on update cascade,
		   FOREIGN KEY (cid) REFERENCES person(id) on delete cascade on update cascade);


