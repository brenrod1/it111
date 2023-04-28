import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeAveraging {

    public static void main(String[] args) {

        //ask the end user to input their numerical grades
        int counter = 1;
        int grade;
        double total = 0;
        double average;


        Scanner input = new Scanner(System.in);

        // our while loop will count how many times we are asking the end user to input a grade

        while (counter <= 5) {
            System.out.println("Please enter your " +counter+ " numerical grade ");
            //1,2,3,4,5,//
            grade = input.nextInt();
            total += grade;
            counter += 1;
        }   //close while loop//

        String message;
        char letterGrade;

        counter -= 1;

        average = total / counter;

        System.out.println("You have earned an average grade of " +average);

        if (average >= 90 && average >= 100) {
            letterGrade = 'A';
            message = "Excellent work!";

            } else if (average >= 80 && average < 90) {
            letterGrade = 'B';
            message = " Solid work!";

            } else if (average >= 70 && average < 80) {
            letterGrade = 'C';
            message = "More studying necessary";

            } else if (average >= 60 && average < 70) {
            letterGrade = 'D';
            message = "Squeaking by!";

            } else {
                letterGrade = 'F';
                message = "Not a passing grade";
        }
                System.out.println("You have earned the following letter grade of " +letterGrade+ ", and here is the message: " +message);

//        System.out.println("You have earned the following letter grade of " +average+ ", after providing us with: " +counter+ " grades ");
    }
}