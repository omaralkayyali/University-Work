-- Topic: SQL – Creating and Modifying Tables

-- Question 1: Write an SQL statement to create a table named Students
CREATE TABLE Students (
    StudentID NUMBER(5) PRIMARY KEY,
    StudentName VARCHAR2(60) NOT NULL,
    Major VARCHAR2(50) NOT NULL,
    YearLevel NUMBER CHECK (YearLevel BETWEEN 1 AND 12)
);

-- Question 2: Write an SQL statement to add a new attribute named Email to the Students table.
ALTER TABLE Students ADD Email VARCHAR2(80);