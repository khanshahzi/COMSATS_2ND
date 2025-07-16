# Student Management System
This Java application is a simple role-based student and teacher management system that allows Admins, Teachers, and Students to interact with a shared database using the console.
It simulates basic functionalities typically found in educational institutions.
## Roles & Features:
### Admin:
   - Login via secure password (leader804)
   - Add new teachers
   - Update teacher consultation hours
   - View all teachers and their availability

### Teacher:
   - Login via secure password (khan804)
   - Add new students with roll number, name, and marks
   - View, update, or delete student records
   - Update their own consultation hours
   - View student statistics (highest, lowest, average marks) 
### Student:
   - View list of teachers and their consultation hours
   - View their individual result or all results
   - See overall class performance statistics

## Key Functionalities:
   - Validation for inputs (e.g., roll numbers, marks, consultation hours)
   - Role-based access control via simple password authentication
   - Grade Calculation based on marks (A+, A, B+, etc.)
   - Statistics Display (highest, lowest, and average student marks)
   - Data Management using arrays (for students and teachers)
