DROP TABLE IF EXISTS City;
DROP TABLE IF EXISTS City1;
DROP
TABLE
 IF
 EXISTS City2;
CREATE
TABLE City(ID int, NAME varchar, PRIMARY KEY (ID));
CREATE TABLE City2
      (ID int,
 NAME
 varchar,

 PRIMARY KEY (ID)

     )
     ;
CREATE TABLE City3
(ID int, NAME varchar,
PRIMARY KEY (ID));

CREATE TABLE suppliers
( supplier_id number(10) NOT NULL,
  supplier_name varchar2(50) NOT NULL,
  address varchar2(50),
  city varchar2(50),
  state varchar2(25),
  zip_code varchar2(10)
);