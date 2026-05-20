CREATE TABLE students (
    student_id NUMBER(4),
    first_name VARCHAR(10) constraint students_first_name_NN not null,
    last_name VARCHAR(10) constraint students_last_name_NN not null,
    email VARCHAR(30) constraint students_email_UQ UNIQUE,
    gpa DECIMAL(3,2) constraint students_gpa_CC CHECK (gpa >= 0 AND gpa <= 4.0),
    constraint students_student_id_PK PRIMARY KEY (student_id)
);

INSERT INTO students (student_id, first_name, last_name, email, gpa) 
VALUES (1002, 'John', 'Doe', 'john.doe@zuj.ed.jo', 3.5);

INSERT INTO students 
VALUES (1003, 'Jane', 'Smith', 'jane.smith@zuj.ed.jo', 3.8);

INSERT INTO students (student_id, first_name, last_name, email, gpa)
VALUES (1004, 'Michael', 'Brown', 'michael.brown@zuj.ed.jo', 2.9);

##############  Table2     ##################
CREATE TABLE courses (
    course_id NUMBER(2) constraint courses_course_id_PK PRIMARY KEY,
    course_name VARCHAR(50) constraint courses_course_name_NN not null,
    course_code VARCHAR(10) constraint courses_course_code_UQ UNIQUE,
    credits NUMBER(1) constraint courses_credits_NN not null  
);

INSERT INTO courses (course_id, course_name, course_code, credits) VALUES (11,'Introduction to Computer Science', 'CS101', 3);
INSERT INTO courses (course_id, course_name, course_code, credits) VALUES (20,'Data Structures', 'CS201', 4);
INSERT INTO courses (course_id, course_name, course_code, credits) VALUES (31,'Database Management', 'CS301', 3);
INSERT INTO courses (course_id, course_name, course_code, credits) VALUES (42,'Web Development', 'CS401', 2);
INSERT INTO courses (course_id, course_name, course_code, credits) VALUES (50,'Machine Learning', 'CS501', 5);

##############  Table3     ##################
CREATE TABLE enrollments (
    enrollment_id NUMBER(2),
    student_id NUMBER,
    course_id NUMBER,
    grade CHAR(5) CHECK (grade IN ('A', 'B', 'C', 'D', 'F')),
    constraint enrollments_student_id_FK FOREIGN KEY (student_id) REFERENCES students(student_id),
    constraint enrollments_course_id_FK FOREIGN KEY (course_id) REFERENCES courses(course_id),
    constraint enrollments_enrollment_id_PK PRIMARY KEY (enrollment_id)
);


INSERT INTO enrollments (enrollment_id, student_id, course_id,  grade) VALUES (10, 1002, 20, 'A');
INSERT INTO enrollments (enrollment_id, student_id, course_id,  grade) VALUES (11, 1002, 11, 'B');
INSERT INTO enrollments (enrollment_id, student_id, course_id,  grade) VALUES (12, 1002, 42, 'C');
INSERT INTO enrollments (enrollment_id, student_id, course_id,  grade) VALUES (13, 1004, 11, 'B');
INSERT INTO enrollments (enrollment_id, student_id, course_id,  grade) VALUES (14, 1004, 20, 'A');


-- ملاحظة: جدول employee غير منشأ في الأعلى، يرجى إنشاء الجدول أولاً لتجنب الخطأ
-- INSERT INTO employee (emp_id, full_name, salary, dept_id) VALUES (1, 'Ali Hasan', 2500, 10);
-- INSERT INTO employee VALUES (2, 'Sara Khaled', 3200, 20);

UPDATE students
SET gpa = 3.9
WHERE student_id = 1003;

UPDATE students
SET email = 'john.doe2025@zuj.ed.jo'
WHERE student_id = 1002;

UPDATE students
SET first_name = 'Mike',
    gpa = 3.0
WHERE student_id = 1004;


-- تم تحويل جمل الحذف أدناه إلى ملاحظات لحماية البيانات من التطاير أثناء التشغيل الكامل:
-- DELETE FROM students WHERE student_id = 1004;
-- DELETE FROM students WHERE gpa < 3.0;
-- DELETE FROM students;

COMMIT;