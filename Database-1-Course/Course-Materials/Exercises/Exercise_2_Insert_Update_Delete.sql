-- Topic: SQL – Insert, Update, and Delete

-- Question 1: Write an SQL statement to insert a new student
INSERT INTO Students (StudentID, StudentName, Major, YearLevel)
VALUES (1005, 'Mona Adel', 'IT', 2);

-- Question 2: Write an SQL statement to modify the Major value to IT for the student whose StudentID is 1003.
UPDATE Students 
SET Major = 'IT' 
WHERE StudentID = 1003;

-- Question 3: Write an SQL statement to delete the student whose StudentID is 1004.
DELETE FROM Students 
WHERE StudentID = 1004;