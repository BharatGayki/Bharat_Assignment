// Jai Shree Ram

import java.awt.*;
import javax.swing.*;


class calciframe{

	JLabel l1;

	JTextField t1;

	JFrame f1;

	JPanel jp1,jp2,jp3,jp4;// 3panel will be form


calciframe(){
// creation of frame
JFrame.setDefaultLookAndFeelDecorated(true);// it should be take at the top and it decorate the closingbar
f1 = new JFrame();// initalizing half object in constructor

Container c = f1.getContentPane();
f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//to close the window


//f1 = new JFrame();// initalizing half object in constructor

                                                  //jp1 = new JPanel();initalizaing of panel not required now


/// -------------------------------------Frame Part----------------------------------------//

l1 = new JLabel("Enter ur name");
t1 = new JTextField(20);

jp1 = new JPanel();
jp1.setLayout(new GridLayout(4,4));//coloum,row
jp1.setBackground(Color.red);
jp1.setSize(200,200);
jp1.add(new JButton("1"));/// east
jp1.add(new JButton("1"));
jp1.add(new JButton("1"));
jp1.add(new JButton("1"));

//////// Jp1 Complete (Arthamatic Operations)///////////


jp2 = new JPanel();
jp2.setBackground(Color.green);
jp2.add(t1);

//////////Jp2 Complete (Wrritten Line)//////////////

jp3 = new JPanel();
jp3.setBackground(Color.pink);
jp3.setLayout(new GridLayout(4,3,2,2));//row,coloum,horizontalgap,verticalgap
for(int i =1;i<=9;i++){

	jp3.add(new JButton(""+i));
	}

jp3.add(new JButton("*"));
jp3.add(new JButton("0"));
jp3.add(new JButton("."));

////////// Jp3 Complete ///////////////////////////////

jp4 = new JPanel();
jp4.add(new JButton("Bharat Ka Calculator"));


      //c.add(l1, BorderLayout.NORTH);

        c.add(jp1, BorderLayout.WEST);
        c.add(jp2, BorderLayout.NORTH);
        c.add(jp3, BorderLayout.CENTER);
        c.add(jp4, BorderLayout.SOUTH);


//f1.setLayout(null);
f1.setVisible(true);// first step to make a frame
f1.setSize(300,300);// give it a prior specation

	}// end of constructor calciframe()

	}//end of class calciFrame

public class javacalci{

public static void main(String [] argue){



System.out.println("Jai Shree Ram");

new calciframe();



}

}