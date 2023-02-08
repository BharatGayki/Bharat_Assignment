// Jai Shree Ram
import java.awt.*;
import javax.swing.*;
// files for performing events
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class body implements ActionListener{
/// Step1 making of object
	JFrame f1;
	JLabel l1;
JTextField tf1,tf2,tf3;
JButton b1,b2,b3;
	body(){
// Step 2 Initalizing object in constructor
f1 = new JFrame();
tf1 = new JTextField();
tf2 = new JTextField();
tf3 = new JTextField();
b1  = new JButton("Add");
b2  = new JButton("Sub");
b3  = new JButton("mul");
// Step 3 Making set layout null so that we can give it adjustments
f1.setLayout(null);

tf1.setBounds(100,50,150,30);
tf2.setBounds(300,50,150,30);
tf3.setBounds(500,50,150,30);
b1.setBounds(100,150,100,30);
b2.setBounds(300,150,100,30);
b3.setBounds(500,150,100,30);

// Step 4 adding object in frame
f1.add(tf1);
f1.add(tf2);
f1.add(tf3);
f1.add(b1);
f1.add(b2);
f1.add(b3);

// register of button
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

f1.setVisible(true);
f1.setSize(500,500);

}// end of constructor

public void actionPerformed(ActionEvent e){
	if(e.getSource() == b1){

    String n1 = tf1.getText();// to get num and store into string form
    int s1 = Integer.parseInt(n1);// convert it into integer

    String n2 = tf2.getText();
 int s2 = Integer.parseInt(n2);

   int s3 = s1+s2;
                                           //String n3 = n1+n2;(Without converting into integer)
    String n3 = Integer.toString(s3);//COnvert integer into string
    //(get = taking)(set = giving)
      tf3.setText(n3);

  }// end of 1st if
////-------------------------------------------------------////


if(e.getSource() == b2){

    String n1 = tf1.getText();// to get num and store into string form
   int s1 = Integer.parseInt(n1);// convert it into integer

    String n2 = tf2.getText();
 int s2 = Integer.parseInt(n2);

   int s3 = s1-s2;
                                         //String n3 = n1+n2;(Without converting into integer)
    String n3 = Integer.toString(s3);//COnvert integer into string
   // (get = taking)(set = giving)
      tf3.setText(n3);

  }

////----------------------------------------------------///

if(e.getSource() == b3){

    String n1 = tf1.getText();// to get num and store into string form
  int s1 = Integer.parseInt(n1);// convert it into integer

    String n2 = tf2.getText();
 int s2 = Integer.parseInt(n2);

   int s3 = s1*s2;
                                      //String n3 = n1+n2;(Without converting into integer)
    String n3 = Integer.toString(s3);//COnvert integer into string
    //(get = taking)(set = giving)
      tf3.setText(n3);

  }

}// end of method







}// end of classs



class calci_version2 {


public static void main(String [] args){


System.out.println("Jai Bajrangbali");

new body();

}


}