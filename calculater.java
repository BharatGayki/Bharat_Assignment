
 import java.awt.*;
 import javax.swing.*;


 class form1{

 JFrame j1;
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
 JTextField tf1;
 JPanel p1,p2;


 form1()
 {

 JFrame.setDefaultLookAndFeelDecorated(true);
 // initilize
 j1=new JFrame();

 Container c =j1.getContentPane();

 j1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
tf1= new JTextField(50);

 //////////////////////////////

 //INITIALISE OF OBJECT

 b1=new JButton("1");
 b2= new JButton("2");
 b3=new JButton("3");
 b4=new JButton("3");
b5=new JButton("4");
b6=new JButton("5");
b7=new JButton("6");
b8=new JButton("7");
b9=new JButton("8");
b10=new JButton("9");
b11=new JButton("10");
b12=new JButton("11");
b13=new JButton("12");
b14=new JButton("13");
b15=new JButton("14");
b16=new JButton("14");
 //////////////////////////
 p1=new JPanel();
p1.setBackground(Color.ORANGE);


 p2=new JPanel();
 p2.setBackground(Color.BLUE);
 p2.setLayout(new GridLayout(4,4,5,5));
 p2.add(b1);
 p2.add(b2);
 p2.add(b3);
 p2.add(b4);
  p2.add(b5);
  p2.add(b6);
  p2.add(b7);
  p2.add(b8);
  p2.add(b9);
  p2.add(b10);
  p2.add(b11);
   p2.add(b12);
   p2.add(b13);
    p2.add(b14);
    p2.add(b15);
p2.add(b16);
 ///////////////

 j1.setVisible(true);
 j1.setSize(500,500);

p1.add(tf1);
c.add(p1,BorderLayout.NORTH);
c.add(p2,BorderLayout.CENTER);

 }

}

 class calculater{
 public static void main(String[] args){

     new form1();

 }

 }