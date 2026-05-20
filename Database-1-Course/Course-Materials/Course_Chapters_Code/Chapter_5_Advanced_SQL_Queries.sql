-- Topic: Chapter 5 - Complex SQL Queries, Joins, and Nested Queries
-- Language: SQL

-- ========================================================
-- 1. Basic Retrieval Queries (Chapter 5 Examples)
-- ========================================================

-- Retrieve the birthdate and address of the employee(s) whose name is 'John B. Smith'.
SELECT Bdate, Address 
FROM EMPLOYEE 
WHERE Fname='John' AND Minit='B' AND Lname='Smith';

-- Retrieve the name and address of all employees who work for the 'Research' department.
SELECT Fname, Lname, Address 
FROM EMPLOYEE, DEPARTMENT 
WHERE Dname='Research' AND Dnumber=Dno;

-- For every project located in 'Stafford', list the project number, the controlling department number, and the department manager's last name, address, and birthdate.
SELECT Pnumber, Dnum, Lname, Address, Bdate 
FROM PROJECT, DEPARTMENT, EMPLOYEE 
WHERE Plocation='Stafford' AND Dnum=Dnumber AND Mgr_ssn=Ssn;

-- ========================================================
-- 2. Ambiguous Attribute Names and Aliasing (AS)
-- ========================================================

-- For each employee, retrieve the employee's first and last name and the first and last name of his or her immediate supervisor.
SELECT E.Fname AS Emp_First_Name, E.Lname AS Emp_Last_Name, 
       S.Fname AS Super_First_Name, S.Lname AS Super_Last_Name 
FROM EMPLOYEE AS E, EMPLOYEE AS S 
WHERE E.Super_ssn = S.Ssn;

-- Retrieve the SSN of all employees working in department 5
SELECT Ssn FROM EMPLOYEE WHERE Dno=5;

-- ========================================================
-- 3. Set Operations (UNION, EXCEPT, INTERSECT)
-- ========================================================

-- Make a list of all project numbers for projects that involve an employee whose last name is 'Smith', either as a worker or as a manager of the department that controls the project.
(SELECT Pnumber 
 FROM PROJECT, DEPARTMENT, EMPLOYEE 
 WHERE Dnum=Dnumber AND Mgr_ssn=Ssn AND Lname='Smith') 
UNION 
(SELECT Pnumber 
 FROM PROJECT, WORKS_ON, EMPLOYEE 
 WHERE Pnumber=Pno AND Essn=Ssn AND Lname='Smith');

-- ========================================================
-- 4. Nested Subqueries and Set Comparisons
-- ========================================================

-- Retrieve the name of each employee who has a dependent with the same first name and same sex as the employee.
SELECT E.Fname, E.Lname 
FROM EMPLOYEE AS E 
WHERE E.Ssn IN (SELECT Essn 
                FROM DEPENDENT 
                WHERE E.Fname=Dependent_name AND E.Sex=Sex);

-- Retrieve the names of employees who have no dependents (Using NOT EXISTS)
SELECT Fname, Lname 
FROM EMPLOYEE 
WHERE NOT EXISTS (SELECT * 
                  FROM DEPENDENT 
                  WHERE Ssn=Essn);

-- ========================================================
-- 5. Explicit Joins (INNER, LEFT OUTER, RIGHT OUTER)
-- ========================================================

-- Inner Join Example
SELECT Fname, Lname, Address 
FROM EMPLOYEE INNER JOIN DEPARTMENT ON Dnumber=Dno 
WHERE Dname='Research';

-- Left Outer Join Example (Retrieves all employees, even without supervisors)
SELECT E.Lname AS Employee, S.Lname AS Supervisor 
FROM EMPLOYEE E LEFT OUTER JOIN EMPLOYEE S ON E.Super_ssn = S.Ssn;