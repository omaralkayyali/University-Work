-- Topic: Exercises from Lab Manual (Stubs & Questions requiring output verification)

-- ========================================================
-- Lab 1: Creation of Tables (Exercise 1)
-- ========================================================
CREATE TABLE Employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR2(20) NOT NULL,
    gender CHAR(1) NOT NULL CHECK (gender IN ('m', 'f')),
    address VARCHAR2(30) UNIQUE, -- Note: "should not have repeated data" implies UNIQUE
    city VARCHAR2(15) UNIQUE,    -- Note: "should not have repeated data" implies UNIQUE
    salary NUMBER(5,2) DEFAULT 450.00 NOT NULL
);

-- ========================================================
-- Lab 2 - Part 1: Basic Queries
-- ========================================================
-- Select all customers from table customers.
SELECT * FROM customers;

-- Select cust_id, cust_name and gender from table customers such that the age is greater than 45.
SELECT cust_id, cust_name, gender FROM customers WHERE age > 45;

-- Select address from table customers only for customers who live in ‘Amman’.
SELECT address FROM customers WHERE city = 'Amman';

-- Drop the default constraint of the salary from table customers.
ALTER TABLE customers MODIFY salary DEFAULT NULL; 

-- ========================================================
-- Lab 2 - Part 2: Arithmetic SQL Queries (Expected Outputs)
-- ========================================================
SELECT 10 + 30;  -- Output: 40
SELECT 30 - 10;  -- Output: 20
SELECT 20 + 100; -- Output: 120
SELECT 20 - 30;  -- Output: -10
SELECT 10 * 30;  -- Output: 300
SELECT 30 / 10;  -- Output: 3
SELECT 20 / 100; -- Output: 0.2
SELECT 20 * 30;  -- Output: 600

-- ========================================================
-- Lab 2 - Part 6: GROUP BY Warning / Error Fix
-- ========================================================
-- IMPORTANT NOTE ON THE FOLLOWING LAB MANUAL CODE:
-- The query provided below from the lab manual will cause an ORA-00979 error in Oracle 
-- or a standard SQL syntax error because columns ID, NAME, and ADDRESS are selected 
-- but not included in the GROUP BY clause, nor are they wrapped in aggregate functions.

SELECT ID, NAME, ADDRESS, SUM(SALARY) 
FROM CUSTOMERS 
GROUP BY NAME; 

-- To correct it according to SQL standards, it should be:
-- SELECT NAME, SUM(SALARY) FROM CUSTOMERS GROUP BY NAME;