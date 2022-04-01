
/* Drop Tables */

DROP TABLE NEW_TABLE CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE NEW_TABLE
(
	id varchar2(20) NOT NULL,
	name varchar2(10) UNIQUE,
	PRIMARY KEY (id)
);



