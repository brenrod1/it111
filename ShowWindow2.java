import javax.swing.*;
import java.awt.*;


public class ShowWindow2 extends JFrame {
//    private static ShowWindow2 ShowWindow2;

    public static void main(String[]args) {

// we are going to make them constants , so the values don't change


        JLabel myLabel1;
        JLabel myLabel2;
        JTextField windowTextField1;
        JTextField windowTextField2;

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 450;

//        public void ShowWindow2(){
        JFrame window = new JFrame();
        window.setTitle("My Simple Window");

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setLocationRelativeTo(null);
        window.getContentPane().setBackground(Color.red);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//        public void  {


        myLabel1 = new JLabel("My First Big Label!!!");
        myLabel1.setBounds(20, 50, 320, 70);
        myLabel1.setFont(new Font("Arial", Font.PLAIN, 20));

        windowTextField1 = new JTextField(20);
        windowTextField1.setBounds(20, 100, 150, 30);

        myLabel2 = new JLabel("My Second Big Label!");
        myLabel2.setBounds(20, 150, 320, 30);
        myLabel2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));

        windowTextField2 = new JTextField(15);
        windowTextField2.setBounds(20, 200, 200, 30);

        window.add(myLabel1);
        window.add(windowTextField1);
        window.add(myLabel2);
        window.add(windowTextField2);
        window.setLayout(null);
        window.setVisible(true);
    }}


//        public static void main (String[] args){
//            }
//            new ShowWindow2();


//    }}
//
//    private static void ShowWindow2() {
//    }}