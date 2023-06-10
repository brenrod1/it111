import java.io.PrintStream;
import java.util.Scanner;

public class DailySpecialsAssignment {



    public static void main(String[] args) {


        String specials = null;
        int order;
        Scanner input = new Scanner(System.in);

        String coffee = null;
        double price = 0;

        boolean errorDay = true;

        while (errorDay) {
            System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only");
            specials = input.next();

            // this input statement must be inside the if statement

            switch (specials) {

                //my cases will be the day of the week
                case "Monday" -> {
                    errorDay = false;
                    coffee = "Latte";
                    price = 4.95;
                }
                case "Tuesday" -> {
                    errorDay = false;
                    coffee = "Frappuccino";
                    price = 4.95;
                }
                case "Wednesday" -> {
                    errorDay = false;
                    coffee = "Cappuccino";
                    price = 4.35;
                }
                case "Thursday" -> {
                    errorDay = false;
                    coffee = "Regular Joe";
                    price = 2.95;
                }
                case "Friday" -> {
                    errorDay = false;
                    coffee = "Green Tea Latte";
                    price = 6.95;
                }
            }
        }

        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
        System.out.println("How many " + coffee + "s would you like to order?");
        order = input.nextInt();


        if (order == 0) {
            System.out.println("Looks like you don't like " + coffee + "s!" + " So sad!!");
        } else if (order == 1) {
            System.out.println("Looks like you will be ordering only " + order + " " + coffee + " today!");
        } else if (order >= 2 && order <= 4) {
            System.out.print(order + " " + coffee + "s have been ordered totalling $");
            System.out.printf("%.2f", (order * price));
        } else if (order >= 5 && order <= 9) {
            System.out.println("You get a 10% discount when you purchase " + order + " " + coffee + "s or more! ");
            System.out.printf(order + " " + coffee + "s have been ordered totalling $");
            System.out.printf("%.2f", (order * price) * .9);
        } else if (order >= 10) {
            System.out.println("You get a 20% discount when you purchase " + order + " " + coffee + "s or more! ");
            System.out.printf(order + " " + coffee + "s have been ordered totalling $");
            System.out.printf("%.2f", (order * price) * .8);


        }
    }}


