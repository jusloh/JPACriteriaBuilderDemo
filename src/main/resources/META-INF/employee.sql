CREATE DATABASE jpaCriteriaBuilderDb;

USE jpaCriteriaBuilderDb;

CREATE TABLE employee (
                          emp_id INTEGER NOT NULL,
                          emp_name VARCHAR(120),
                          emp_salary DOUBLE NOT NULL,
                          emp_desig VARCHAR(200),
                          PRIMARY KEY(emp_id)
);

INSERT INTO employee (emp_id, emp_name, emp_salary, emp_desig) VALUES (101, 'Java Code Geek', 40000.0, 'Chairman');
INSERT INTO employee (emp_id, emp_name, emp_salary, emp_desig) VALUES (102, 'Harry Potter', 35000.0, 'Chief Technical Officer');
INSERT INTO employee (emp_id, emp_name, emp_salary, emp_desig) VALUES (103, 'Lucifer Morningstar', 30000.0, 'Web Developer');
INSERT INTO employee (emp_id, emp_name, emp_salary, emp_desig) VALUES (104, 'April O'' Neil', 35000.0, 'Senior Technical Lead');
INSERT INTO employee (emp_id, emp_name, emp_salary, emp_desig) VALUES (105, 'Daniel Atlas', 32000.0, 'Chief Financial Officer');
INSERT INTO employee (emp_id, emp_name, emp_salary, emp_desig) VALUES (106, 'John Snow', 15000.0, 'Java Developer');
INSERT INTO employee (emp_id, emp_name, emp_salary, emp_desig) VALUES (107, 'Daenerys Targaryen', 35000.0, 'Business Analyst');
INSERT INTO employee (emp_id, emp_name, emp_salary, emp_desig) VALUES (108, 'Tyrion Lannister', 40000.0, 'Business Strategist');

SELECT * FROM employee;

DESC employee;