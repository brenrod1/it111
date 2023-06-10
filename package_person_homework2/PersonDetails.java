package package_person_homework2;


public class PersonDetails {
    public static void main(String[]args){

        package_person_homework2.Person firstPerson;
        package_person_homework2.Person secondPerson;
        package_person_homework2.Person thirdPerson;
        //in the process of creating an object from my Person class

        firstPerson = new package_person_homework2.Person();
        secondPerson = new package_person_homework2.Person();
        thirdPerson = new package_person_homework2.Person();

        //we will be entering the info, but we are assigning values to our fields

        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 1981;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = 2004;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Ariel";
        thirdPerson.gender = 'F';
        thirdPerson.age = 54;
        thirdPerson.car = 2021;
        thirdPerson.violations = true;
        thirdPerson.creditScore = 670;




        double monthlyRate = 0;
        double adjustedRate = 0;
        double adjustedRate1 = 0;



        firstPerson.display();
        System.out.println("Preliminary Rate for " +firstPerson.name+ ": " +firstPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " +firstPerson.assumeGender(adjustedRate) + " dollars");
        System.out.println("Adjustment for age of car: " +firstPerson.getCar(adjustedRate1));
        System.out.print("Here is " +firstPerson.name+ "'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate) + firstPerson.getCar(adjustedRate1));
        System.out.println();



        secondPerson.display();
        System.out.println("Preliminary Rate for " +secondPerson.name+ ": " +secondPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " +secondPerson.assumeGender(adjustedRate) + " dollars");
        System.out.println("Adjustment for age of car: " +firstPerson.getCar(adjustedRate1));
        System.out.print("Here is " +secondPerson.name+ "'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate) + secondPerson.getCar(adjustedRate1));
        System.out.println();


        thirdPerson.display();
        System.out.println("Preliminary Rate for " +thirdPerson.name+ ": " +thirdPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " +thirdPerson.assumeGender(adjustedRate) + " dollars");
        System.out.println("Adjustment for age of car: " +thirdPerson.getCar(adjustedRate1));
        System.out.print("Here is " +thirdPerson.name+ "'s total monthly premium: ");
        System.out.println(thirdPerson.assumeGender(adjustedRate) + thirdPerson.getRate(monthlyRate) + thirdPerson.getCar(adjustedRate1));
        System.out.println();
    }
}
