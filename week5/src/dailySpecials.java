import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!");

    specials = input.next();

//    input.close(); //we are going to use a boolean instead
// in the world of coffee, I need a name of a coffee beverage and a price

        String coffee;
        double price;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if(saturday || sunday) {
            System.out.println("Please enter a weekday,  not a weekend");
            specials = input.next();
        }  // this input statement must be inside the if statement


        switch (specials) {

            //my cases will be the day of the week
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $ " + price);
                System.out.println("How many Lattes would you like to order?");
            }
            case "Tuesday" -> {
                coffee = "Frappuccino";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $ " + price);
                System.out.println("How many " +coffee+ "s would you like to order?");
//                Scanner input = new Scanner(System.in);
                System.out.println("Please enter the number of Frappacino!");
//                frap = input.nextInt() *Frappuccino;
//                System.out.print("Looks like you will be ordering only 1 Frappaccino today!");
            }
            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $ " + price);
            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $ " + price);
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $ " + price);
            }

//            default:
//                System.out.println("Please enter a valid day, or check your spelling!");
            //we will find something more user-friendly for this. creating a boolean instead,
            // under the data type/variables


        }
    }
}
