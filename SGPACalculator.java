import java.util.HashMap;
import java.util.Scanner;

public class SGPACalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the subjects and their credits
        String[] theorySubjects = {"DM&GT", "UHV", "DLCO", "DBMS", "OOPJ"};
        String[] practicalSubjects = {"OOPJ LAB", "DBMS LAB"};
        String skillCourse = "Skill Course";

        int theoryCredits = 3;
        double practicalCredits = 1.5;
        int skillCourseCredits = 2;
        int totalCredits = 20;

        // Grade to Grade Point mapping
        HashMap<String, Integer> gradeToPoint = new HashMap<>();
        gradeToPoint.put("S", 10);
        gradeToPoint.put("A", 9);
        gradeToPoint.put("B", 8);
        gradeToPoint.put("C", 7);
        gradeToPoint.put("D", 6);
        gradeToPoint.put("E", 5);
        gradeToPoint.put("F", 0); // Assuming 0 for FAIL

        // Take input for theory subjects
        int[] theoryGrades = new int[theorySubjects.length];
        System.out.println("Enter the grades for theory subjects (DM&GT, UHV, DLCO, DBMS, OOPJ):");
        for (int i = 0; i < theorySubjects.length; i++) {
            System.out.print(theorySubjects[i] + ": ");
            String grade = scanner.next().toUpperCase();
            theoryGrades[i] = gradeToPoint.getOrDefault(grade, 0);
        }

        // Take input for practical subjects
        int[] practicalGrades = new int[practicalSubjects.length];
        System.out.println("Enter the grades for practical subjects (OOPJ LAB, DBMS LAB):");
        for (int i = 0; i < practicalSubjects.length; i++) {
            System.out.print(practicalSubjects[i] + ": ");
            String grade = scanner.next().toUpperCase();
            practicalGrades[i] = gradeToPoint.getOrDefault(grade, 0);
        }

        // Take input for skill course
        System.out.println("Enter the grade for the Skill Course:");
        System.out.print(skillCourse + ": ");
        String skillGrade = scanner.next().toUpperCase();
        int skillCourseGrade = gradeToPoint.getOrDefault(skillGrade, 0);

        // Calculate total grade points
        double totalGradePoints = 0;

        for (int i = 0; i < theorySubjects.length; i++) {
            totalGradePoints += theoryGrades[i] * theoryCredits;
        }

        for (int i = 0; i < practicalSubjects.length; i++) {
            totalGradePoints += practicalGrades[i] * practicalCredits;
        }

        totalGradePoints += skillCourseGrade * skillCourseCredits;

        // Calculate SGPA
        double sgpa = totalGradePoints / totalCredits;

        // Display SGPA
        System.out.printf("Your Semester Grade Point Average (SGPA) is: %.2f\n", sgpa);

        scanner.close();
    }
}
