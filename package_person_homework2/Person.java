package package_person_homework2;

public class Person {

    String name;

    char gender;
    int age;
    int car;

    boolean violations;
    double creditScore;


    public void display() {
        System.out.println("Customer name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("Violations: " +violations);
        System.out.println("Credit Score: " +creditScore);
        System.out.println("Car: " +car);
    }
    //out logic is regarding our credit score and violations

    public double getRate(double monthlyRate) {
        if (violations == true && creditScore <= 700) {
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;

        }
        return monthlyRate;

    }

    public double assumeGender(double adjustedRate) {
        if (gender == 'M' && age <= 25) {
            adjustedRate = 100;

        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }
   public double getCar(double adjustedRate1) {
        if(car <= 2015 && violations == true && age <= 25) {
             adjustedRate1 = 200;
        } else {
             adjustedRate1= 500;
        }
        return adjustedRate1;

        }}


