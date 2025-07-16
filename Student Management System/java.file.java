package pf.pkgfinal.project;
import java.util.Scanner;
public class PfFinalProject {
 // Constants for maximum limits
    static final int MAX_STUDENTS = 100;
    static final int MAX_TEACHERS = 10;
 // Student data arrays
    static int[] rollNumbers = new int[MAX_STUDENTS];
    static String[] names = new String[MAX_STUDENTS];
    static float[] marks = new float[MAX_STUDENTS];
    static int count = 0; // Current student count
    // Teacher data arrays
    static String[] teacherNames = new String[MAX_TEACHERS];
    static int[] consultHours = new int[MAX_TEACHERS];
    static int teacherCount = 0; // Current teacher count
    // Role-based passwords
    static final String ADMIN_PASSWORD = "leader804";
    static final String TEACHER_PASSWORD = "khan804";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int roleChoice;
          // Main program loop
        while (true) {
            System.out.println("\n--- SELECT ROLE ---");
            System.out.println("1. Admin");
            System.out.println("2. Teacher");
            System.out.println("3. Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
// Validate input
            while (!input.hasNextInt()) {
                System.out.print("=> Invalid input. Enter a number between 1-4: ");
                input.next();
            }
            roleChoice = input.nextInt();
// Role handling
            switch (roleChoice) {
                case 1: loginAdmin(input); break;
                case 2: loginTeacher(input); break;
                case 3: studentView(input); break;
                case 4: System.out.println("Goodbye!"); return;
                default: System.out.println("Invalid choice. Try again.");
            }      }    }
// Admin login and menu // admin module
    static void loginAdmin(Scanner input) {
        input.nextLine();
        System.out.print("Enter Admin Password: ");
        String pass = input.nextLine();
        if (pass.equals(ADMIN_PASSWORD)) {
            int choice;
            do {
                // Admin options
                System.out.println("\n--- ADMIN PANEL ---");
                System.out.println("1. Add Teacher");
                System.out.println("2. Update Consultation Hours");
                System.out.println("3. View All Teachers");
                System.out.println("4. Back");
                System.out.print("Enter your choice: ");
while (!input.hasNextInt()) {
                    System.out.print("=> Invalid input. Enter a number: ");
                    input.next();
                }
                choice = input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1: addTeacher(input); break;
                    case 2: updateConsultHours(input); break;
                    case 3: viewTeachers(); break;
                    case 4: return;
                    default: System.out.println("Invalid choice.");
                }
            } while (choice != 4);
        } else {
            System.out.println("❌ Incorrect password.");
        }    }
    // Add teacher to system
    static void addTeacher(Scanner input) {
        if (teacherCount >= MAX_TEACHERS) {
            System.out.println("Cannot add more teachers.");
            return;
        }
System.out.print("Enter Teacher Name: ");
        teacherNames[teacherCount] = input.nextLine();
        // Validate consultation hours
        int hours;
        while (true) {
            System.out.print("Enter Consultation Hours (0-24): ");
            while (!input.hasNextInt()) {
                System.out.print("=> Invalid input. Enter hours (0-24): ");
                input.next();
            }
            hours = input.nextInt();
            if (hours < 0 || hours > 24) {
                System.out.println("=> Consultation hours must be between 0 and 24.");
            } else break;
        }
   consultHours[teacherCount] = hours;
        teacherCount++;
        System.out.println("✅ Teacher added.");
    }    // Update consultation hours for a teacher
    static void updateConsultHours(Scanner input) {
        System.out.print("Enter Teacher Name to update hours: ");
        String name = input.nextLine();
for (int i = 0; i < teacherCount; i++) {
            if (teacherNames[i].equalsIgnoreCase(name)) {
                int hours;
                while (true) {
                    System.out.print("Enter New Consultation Hours (0-24): ");
                    while (!input.hasNextInt()) {
                        System.out.print("=> Invalid input. Enter hours (0-24): ");
                        input.next();
                    }
                    hours = input.nextInt();
                    if (hours < 0 || hours > 24) {
                        System.out.println("=> Consultation hours must be between 0 and 24.");
                    } else break;
                }
                consultHours[i] = hours;
                System.out.println("✅ Updated successfully.");
                return;
            } }
System.out.println("Teacher not found.");
    }
    // Display all teachers and their consultation hours
    static void viewTeachers() {
        if (teacherCount == 0) {
            System.out.println("No teachers available.");
            return;
        }
        System.out.println("\nList of Teachers:");
        for (int i = 0; i < teacherCount; i++) {
            System.out.println("Name: " + teacherNames[i] + ", Consultation Hours: " + consultHours[i]);
        }    }
 // Teacher login and functionalities // teacher module
    static void loginTeacher(Scanner input) {
        input.nextLine();
        System.out.print("Enter Teacher Password: ");
        String pass = input.nextLine();
        if (pass.equals(TEACHER_PASSWORD)) {
            int choice;
            do {
                // Teacher menu
                System.out.println("\n--- TEACHER MENU ---");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Update Own Consultation Hours");
                System.out.println("6. Show Student Statistics");
                System.out.println("7. Back");
                System.out.print("Enter your choice: ");

                while (!input.hasNextInt()) {
                    System.out.print("=> Invalid input. Enter a number: ");
                    input.next();
                }
                choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1: addStudent(input); break;
                    case 2: viewStudents(); break;
                    case 3: updateStudent(input); break;
                    case 4: deleteStudent(input); break;
                    case 5: updateConsultHours(input); break;
                    case 6: showStudentStatistics(); break;
                    case 7: return;
                    default: System.out.println("Invalid choice.");
                }
            } while (choice != 7);
        } else {
            System.out.println("❌ Incorrect password.");
        }    }
// Student access to view information // student module
    static void studentView(Scanner input) {
        System.out.println("\n--- STUDENT VIEW ---");
        System.out.println("1. View Teachers & Consultation Hours");
        System.out.println("2. View Result");
        System.out.println("3. View Class Statistics");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();
switch (choice) {
            case 1: viewTeachers(); break;
            case 2:
                System.out.print("Do you want to view all results? (yes/no): ");
                String ans = input.nextLine();
                if (ans.equalsIgnoreCase("yes")) {
                    viewStudents();
                } else {
                    System.out.print("Enter your Roll No: ");
                    int roll = input.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (rollNumbers[i] == roll) {
                            System.out.println("Roll No: " + rollNumbers[i] + ", Name: " + names[i] + ", Marks: " + marks[i] + ", Grade: " + calculateGrade(marks[i]));
                            found = true;
                            break;
                        } }
                    if (!found) System.out.println("Student not found.");
                }
                break;
            case 3: showStudentStatistics(); break;
            default: System.out.println("Invalid choice.");
        }    }
 // Add a student with validations // student functions
    static void addStudent(Scanner input) {
        if (count >= MAX_STUDENTS) {
            System.out.println("Cannot add more students.");
            return;
        }
int roll;
        while (true) {
            System.out.print("Enter Roll No: ");
            while (!input.hasNextInt()) {
                System.out.print("=> Invalid input. Enter a valid roll number: ");
                input.next();
            }
            roll = input.nextInt();
            if (roll <= 0 || isDuplicateRoll(roll)) {
                System.out.println("=> Invalid or duplicate roll number.");
            } else break;
        }
        input.nextLine();
        System.out.print("Enter Name: ");
        String name = input.nextLine();

        float mark;
        while (true) {
            System.out.print("Enter Marks: ");
            while (!input.hasNextFloat()) {
                System.out.print("=> Invalid input. Enter valid marks: ");
                input.next();
            }
            mark = input.nextFloat();
            if (mark < 0 || mark > 100) {
                System.out.println("=> Marks must be between 0 and 100.");
            } else break;
        }

        // Store student data
        rollNumbers[count] = roll;
        names[count] = name;
        marks[count] = mark;
        count++;
        System.out.println("✅ Student added successfully!");
    }

    // Display all students
    static void viewStudents() {
        if (count == 0) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("\nList of Students:");
        for (int i = 0; i < count; i++) {
            System.out.println("Roll No: " + rollNumbers[i] + ", Name: " + names[i] + ", Marks: " + marks[i] + ", Grade: " + calculateGrade(marks[i]));
        }
    }
 // Update student record by roll number
    static void updateStudent(Scanner input) {
        System.out.print("Enter Roll No to update: ");
        while (!input.hasNextInt()) {
            System.out.print("=> Invalid input. Enter a valid roll number: ");
            input.next();
        }
        int roll = input.nextInt();
        input.nextLine();
        for (int i = 0; i < count; i++) {
            if (rollNumbers[i] == roll) {
                System.out.print("Enter New Name: ");
                names[i] = input.nextLine();
                float mark;
                while (true) {
                    System.out.print("Enter New Marks: ");
                    while (!input.hasNextFloat()) {
                        System.out.print("=> Invalid input. Enter valid marks: ");
                        input.next();
                    }
                    mark = input.nextFloat();
                    if (mark < 0 || mark > 100) {
                        System.out.println("=> Marks must be between 0 and 100.");
                    } else break;
                }
 marks[i] = mark;
                System.out.println("✅ Student updated successfully.");
                return;
            }        }
        System.out.println("Student not found.");
    }
// Delete student by roll number
    static void deleteStudent(Scanner input) {
        System.out.print("Enter Roll No to delete: ");
        while (!input.hasNextInt()) {
            System.out.print("=> Invalid input. Enter a valid roll number: ");
            input.next();
        }
        int roll = input.nextInt();
        for (int i = 0; i < count; i++) {
            if (rollNumbers[i] == roll) {
                // Shift data to remove student
                for (int j = i; j < count - 1; j++) {
                    rollNumbers[j] = rollNumbers[j + 1];
                    names[j] = names[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;
                System.out.println("✅ Student deleted successfully.");
                return;
            } }
System.out.println("Student not found.");
    }
    // Check if roll number already exists
    static boolean isDuplicateRoll(int roll) {
        for (int i = 0; i < count; i++) {
            if (rollNumbers[i] == roll) return true;
        }
        return false;
    }
    // Calculate grade based on marks
    static String calculateGrade(float mark) {
        if (mark >= 90) return "A+";
        else if (mark >= 85) return "A";
        else if (mark >= 80) return "B+";
        else if (mark >= 70) return "B";
        else if (mark >= 60) return "C";
        else if (mark >= 50) return "D";
        else return "F";
    }
// Display highest, lowest, and average marks
    static void showStudentStatistics() {
        if (count == 0) {
            System.out.println("No student data available.");
            return;
        }

        float max = marks[0];
        float min = marks[0];
        float sum = marks[0];
        String maxName = names[0];
        String minName = names[0];

        for (int i = 1; i < count; i++) {
            if (marks[i] > max) {
                max = marks[i];
                maxName = names[i];
            }
            if (marks[i] < min) {
                min = marks[i];
                minName = names[i];
            }
            sum += marks[i];
        }

        float avg = sum / count;

        System.out.println("\n--- Student Statistics ---");
        System.out.println("Highest Marks: " + max + " (by " + maxName + ")");
        System.out.println("Lowest Marks: " + min + " (by " + minName + ")");
        System.out.println("Average Marks: " + avg);
    }
}
    
    

