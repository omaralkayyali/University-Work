-- =========================================================================
-- Course: Databases 1
-- Homework 2 – SQL Aggregate Functions and Grouping
-- =========================================================================

-- Q1: Display the total number of enrollments.
SELECT COUNT(*) AS TotalEnrollments 
FROM Enrollments;


-- Q2: Display the highest grade.
SELECT MAX(Grade) AS HighestGrade 
FROM Enrollments;


-- Q3: Display the average grade.
SELECT AVG(Grade) AS AverageGrade 
FROM Enrollments;


-- Q4: Display the number of students enrolled in each course.
SELECT CourseID, COUNT(StudentID) AS NumberOfStudents 
FROM Enrollments 
GROUP BY CourseID;


-- Q5: Display only the courses that have more than one enrolled student.
-- Note: We use HAVING here because we are filtering based on an aggregate function (COUNT).
SELECT CourseID, COUNT(StudentID) AS NumberOfStudents 
FROM Enrollments 
GROUP BY CourseID 
HAVING COUNT(StudentID) > 1;