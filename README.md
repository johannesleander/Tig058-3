# Club manager

This program is intended to be used in a club in need of adding, updating and deleting members.

The database is used with [sqlite3 jdbc driver](https://bitbucket.org/xerial/sqlite-jdbc/downloads/sqlite-jdbc-3.8.7.jar)

The database consists of 4 tables. team, person, team_roles and parent_child.

* team:
  Team is a table containing Team names. The team name is the primary key.
* person:
  Person consists of all the people in the club. This table is only about people, not what team they belong to. The Social Security number is used for primary key.
* team_roles:
  team_roles is a relation table between teams and persons and the roles they have in different teams. The person id is foreign keyd to person table and therefore gets deleted if the person is deleted.
  to allow for a sane database.
* parent_child:
  This is a relation table containing a parent id (pid) and a child id (cid). The id:s are foreign keys and are both used as a primary key to avoid duplication of the same relation.

for further information about the database creation, see [createdb.sql](https://github.com/johannesleander/Tig058-3/blob/master/createdb.sql) file.

Creating a test database
------------------------
1. sqlite3 club.db in the project directory at the highest level. Not in some subdirectory ex src/ or utils/
2. sqlite3>.read createdb.sql

You should now have fresh database.


The code
----------------------
The patterns used in the code are DAO pattern and the MVC pattern for the gui.


Running
----------------------
Either run **ant jar** and proced to run the ClubManager.jar in the dist/ folder
OR
Use the run profile in ant **ant run**

