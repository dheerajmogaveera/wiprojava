CREATE TABLE emp
  (id NUMBER(7) PRIMARY KEY,
  last_name VARCHAR2(25) NOT NULL,
  first_name VARCHAR2(25),
  dept_id NUMBER(7) CONSTRAINT fk_emp_dept_id REFERENCES dept(dept_id));
INSERT INTO emp VALUES (101,'Sam','Sundar',10);
INSERT INTO emp VALUES (101,'Ram','Krishan',20);
INSERT INTO emp VALUES (102,'Gopi',NULL,40);
INSERT INTO emp VALUES (103,NULL,'ram',20);