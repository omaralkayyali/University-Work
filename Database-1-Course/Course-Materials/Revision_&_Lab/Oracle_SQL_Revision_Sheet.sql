-- Topic: Oracle SQL Comprehensive Revision
-- Language: Oracle SQL / PL-SQL

-- ========================================================
-- 1. DDL Operations (Data Definition Language)
-- ========================================================

-- Create Instructor Table
CREATE TABLE Instructor (
    I_no NUMBER(10) PRIMARY KEY,
    I_name VARCHAR2(30),
    Address VARCHAR2(50)
);

-- Create Department Table (Needed for foreign key constraint reference)
CREATE TABLE Department (
    Dno NUMBER(3) PRIMARY KEY,
    Loc VARCHAR2(50)
);

-- Create Emp Table with Constraints (UNIQUE, NOT NULL, CHECK, FOREIGN KEY)
CREATE TABLE Emp (
    Eno NUMBER(5) PRIMARY KEY,
    Ename VARCHAR2(30) UNIQUE,
    Sal NUMBER(6,2) NOT NULL,
    Job VARCHAR2(20),
    Gender CHAR,
    Tel NUMBER(7),
    Hire_Date DATE,
    Dept NUMBER(3) REFERENCES Department(Dno),
    CONSTRAINT chk_gender CHECK ((Gender = 'M') OR (Gender = 'F'))
);

-- Altering Table Structures
ALTER TABLE Emp ADD (Education VARCHAR2(30));
ALTER TABLE Emp MODIFY (Education VARCHAR2(40));
ALTER TABLE Emp DROP COLUMN Education;

-- Dropping Tables
DROP TABLE Emp;
DROP TABLE Emp CASCADE CONSTRAINTS;

-- ========================================================
-- 2. DML Operations (Data Manipulation Language)
-- ========================================================

-- Insert Data (Note: To_Date is used for Oracle date formatting)
INSERT INTO Emp (Eno, Ename, Sal, Job, Gender, Hire_Date, Dept)
VALUES (1, 'Ali', 455.15, 'Programmer', 'M', TO_DATE('12/03/2013','DD/MM/YYYY'), 5);

-- Update Data
UPDATE Emp SET Sal = 600 WHERE Eno = 1;
UPDATE Emp SET Sal = 600; -- Updates all rows

-- Delete Data
DELETE FROM Emp; -- Deletes all records
DELETE FROM Emp WHERE Eno = 3;
DELETE FROM Emp WHERE Dept = 2;

-- ========================================================
-- 3. DQL Operations (Data Query Language & Filtering)
-- ========================================================

-- Basic Selection
SELECT * FROM Emp;
SELECT Eno FROM Emp;
SELECT Eno FROM Emp WHERE Eno > 10;
SELECT DISTINCT Dept FROM Emp;

-- Logical Operators
SELECT * FROM Emp WHERE Eno > 10 AND Sal > 400;
SELECT * FROM Emp WHERE Eno > 10 OR Sal > 400;

-- NULL Handling
SELECT * FROM Emp WHERE Tel IS NULL;
SELECT * FROM Emp WHERE Tel IS NOT NULL;

-- IN and BETWEEN Operators
SELECT * FROM Emp WHERE Job IN ('Programmer', 'DBA', 'Clerk');
SELECT * FROM Emp WHERE Sal BETWEEN 100 AND 500;

-- Pattern Matching (LIKE Operator)
SELECT * FROM Emp WHERE Ename LIKE 'a%';    -- Starts with 'a'
SELECT * FROM Emp WHERE Ename LIKE '_a%';   -- Second letter is 'a'
SELECT * FROM Emp WHERE Ename LIKE '___';   -- Exactly 3 characters long

-- Sorting (ORDER BY)
SELECT * FROM Emp ORDER BY Eno;
SELECT * FROM Emp ORDER BY Hire_Date;
SELECT * FROM Emp ORDER BY Ename;
SELECT * FROM Emp ORDER BY Eno DESC;
SELECT * FROM Emp ORDER BY Hire_Date DESC;
SELECT * FROM Emp ORDER BY Ename DESC;

-- String and Date Functions
SELECT Ename, Sal * 0.1 FROM Emp;
SELECT UPPER(Ename) FROM Emp;
SELECT Ename, (SYSDATE - Hire_Date)/360 AS ExperienceYears FROM Emp;

-- Grouping & Aggregation
SELECT AVG(Sal) FROM Emp;
SELECT Dept, AVG(Sal) FROM Emp GROUP BY Dept;
SELECT Dept, AVG(Sal) FROM Emp GROUP BY Dept HAVING AVG(Sal) > 300;

-- Joins
SELECT Emp.Ename, Department.Loc 
FROM Emp, Department 
WHERE Department.Deptno = Emp.Dept;

-- Subqueries / Nested Queries
SELECT * FROM Emp 
WHERE Job = (SELECT Job FROM Emp WHERE Ename = 'Ahmad');

SELECT * FROM Emp 
WHERE Sal = (SELECT Sal FROM Emp WHERE Ename = 'Ali');

-- Correct usage of IN with subqueries returning multiple values
SELECT * FROM Emp 
WHERE Sal IN (SELECT Sal FROM Emp WHERE Dept = 1);

-- ========================================================
-- 4. Views and Privileges (DCL & Database Objects)
-- ========================================================

-- Views
CREATE VIEW x AS SELECT Eno, Ename FROM Emp;
SELECT * FROM x;

-- Privileges (Grant & Revoke)
GRANT INSERT ON Emp TO user1;
GRANT ALL ON Emp TO user1;
GRANT INSERT ON Emp TO PUBLIC;
REVOKE INSERT ON Emp FROM user1;