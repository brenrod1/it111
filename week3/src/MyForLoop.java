public class MyForLoop {

    public static void main(String[]args) {

//        int count;
//
//        for (count = 0; count <= 30; count = count + 3) {
//            System.out.println(count);
//
//        }
//        System.out.println("All Done");

        int newCount;
        for (newCount = 30; newCount > 0; newCount = newCount-1 ) {

            if (newCount <= 10) {;
                System.out.println("We are almost at blast off!! Only " +newCount+ " seconds away");
            } else {
                System.out.println("We are almost at blast off!! Only " +newCount+ " 1 second away");
            }

        }//end of loop

        System.out.println();
        System.out.println("Blast off");

    }
    }

