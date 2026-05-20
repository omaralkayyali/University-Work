-- Topic: File 4 - Advanced SQL Selection, Pattern Matching, and Null Functions
-- Source: File 4-SQL-DQL Commands

-- ========================================================
-- 1. Precision Pattern Matching (LIKE Operator Examples) [cite: 51]
-- ========================================================

-- Find employees whose name is exactly 5 characters long and starts with 'A' [cite: 54, 55]
SELECT * FROM Emp WHERE Ename LIKE 'A____'; [cite: 42, 51, 55]

-- Find employees whose name has 'a' as the third letter [cite: 53, 55]
SELECT * FROM Emp WHERE Ename LIKE '__a%'; [cite: 42, 51, 55]

-- Find employees whose name ends with the letter 's' [cite: 51, 55]
SELECT * FROM Emp WHERE Ename LIKE '%s'; [cite: 42, 51, 55]

-- ========================================================
-- 2. Working with NULL Values & Logical Adjustments [cite: 47]
-- ========================================================

-- Selecting employees who have either no telephone or no supervisor assigned [cite: 47]
SELECT Eno, Ename, Job 
FROM Emp 
WHERE Tel IS NULL OR Dept IS NULL; [cite: 43, 47]

-- Using Oracle NVL function (Fallback value if NULL)
-- If commission is null, it treats it as 0
SELECT Ename, Sal + NVL(Tel, 0) AS Total_Compensation FROM Emp; [cite: 43]

-- ========================================================
-- 3. Complex Multi-Table Joins & Ordering [cite: 55, 71]
-- ========================================================

-- Join across 3 tables: Employee, Department, and Projects [cite: 71]
SELECT E.Ename, D.Loc, P.Proj_Name, P.Budget
FROM Emp E, Department D, PROJECT_DETAILS P [cite: 30, 71]
WHERE E.Dept = D.Dno AND D.Dno = P.Dept_ID [cite: 32, 71]
ORDER BY D.Loc ASC, P.Budget DESC; [cite: 55, 59]