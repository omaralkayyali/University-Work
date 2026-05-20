-- Topic: Deep Dive into DDL Constraints, Alteration & DML Edge Cases
-- Source: File 2-SQL-DDL Commands & File 3-SQL-DML Commands

-- ========================================================
-- 1. Advanced Table Constraints (Check, Unique, Referential)
-- ========================================================

-- Creating a project table with strict check constraints and cascade behavior [cite: 32, 36]
CREATE TABLE PROJECT_DETAILS (
    Proj_No NUMBER(4) PRIMARY KEY,
    Proj_Name VARCHAR2(40) UNIQUE NOT NULL,
    Budget NUMBER(10,2) NOT NULL CHECK (Budget > 0),
    Start_Date DATE DEFAULT SYSDATE,
    Dept_ID NUMBER(3),
    -- Cascading Deletes: If a department is deleted, its projects are automatically deleted [cite: 36]
    CONSTRAINT fk_proj_dept FOREIGN KEY (Dept_ID) 
        REFERENCES Department(Dno) ON DELETE CASCADE [cite: 32, 36]
);

-- ========================================================
-- 2. Complete ALTER TABLE Scenarios [cite: 83]
-- ========================================================

-- Assuming the 'students' table exists from previous labs[cite: 83]:
-- A) Adding a unique constraint on multiple columns combined [cite: 84, 92]
ALTER TABLE students ADD CONSTRAINT students_fullname_UQ UNIQUE (first_name, last_name); [cite: 84, 92]

-- B) Dropping a constraint by name directly [cite: 85, 93]
ALTER TABLE students DROP CONSTRAINT students_email_UQ; [cite: 85, 93]

-- C) Adding a column with a default value and forcing it to be NOT NULL [cite: 86, 94]
ALTER TABLE students ADD section_id NUMBER DEFAULT 1 NOT NULL; [cite: 86, 94]

-- D) Modifying column datatypes and expanding size [cite: 87, 95]
ALTER TABLE students MODIFY first_name VARCHAR2(20); [cite: 87, 95]

-- E) Forcing an existing column to become NOT NULL [cite: 88, 95]
ALTER TABLE students MODIFY email VARCHAR2(30) NOT NULL; [cite: 88, 95]

-- F) Renaming columns and tables [cite: 89, 90]
ALTER TABLE students RENAME COLUMN gpa TO grade_point; [cite: 89, 96]
ALTER TABLE students RENAME TO student_records; [cite: 90, 97]

-- ========================================================
-- 3. Advanced DML & Transactions
-- ========================================================

-- Bulk updates based on conditions (Increasing budget for specific departments)
UPDATE PROJECT_DETAILS 
SET Budget = Budget * 1.15 
WHERE Dept_ID = 5;

-- Safe Depletions using Subqueries
DELETE FROM PROJECT_DETAILS 
WHERE Dept_ID IN (SELECT Dno FROM Department WHERE Loc = 'Amman'); [cite: 71]