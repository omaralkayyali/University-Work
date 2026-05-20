-- Course: Databases 1
-- Homework 1: SQL Selection and Filtering

-- Q1: Display all records from the Courses table.
SELECT * FROM Courses;

-- Q2: Display only the CourseName and CreditHours of all courses.
SELECT CourseName, CreditHours FROM Courses;

-- Q3: Display the courses where CreditHours is greater than or equal to 3.
SELECT * FROM Courses WHERE CreditHours >= 3;

-- Q4: Display the courses that belong to the CS department.
SELECT * FROM Courses WHERE Department = 'CS';

-- Q5: Display the courses ordered by CourseName in ascending order.
SELECT * FROM Courses ORDER BY CourseName ASC;