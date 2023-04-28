public class MyATM {
    public static void main(String[]args) {
        int withdrawal, amount;
        withdrawal = 25;
        amount = 225;

        while (amount !=0) {
            amount -= withdrawal;
//            amount = amount - withdrawal; <--- A DIFFERENT WAY WORKS ALSO
//            System.out.println("Your present amount after the withdrawal is " +amount+ " dollars ");
//            System.out.println(amount); <--this outputs withdrawals by 25 to zero,then while is no longer true
//unless you change the withdrawal amount, enter an if/else statement then change your output
            if(amount == 0) {
                System.out.println("You have no money honey!!!");
            } else {
                System.out.println("Your present amount after the withdrawal is " +amount+ " dollars ");
            }
        } //end while loop
//make sure the numbers are even to even , odd to odd for amount vs withdrawal
        //is this why you can only take out increments of 20, 25,30,35,40 so the while loops stays true until you hit zero
    }

}
