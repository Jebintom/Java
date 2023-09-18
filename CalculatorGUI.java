package threading;
import javax.swing.*;



import java.awt.event.*;

public class CalculatorGUI implements ActionListener{
JTextField tf;
JLabel l;
JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
static double a111=0,b111=0,result=0;
static int operator=0;

CalculatorGUI(){

JFrame f=new JFrame();
JPanel p=new JPanel();

p.setLayout(null);

tf=new JTextField();
tf.setBounds(100,100,200,30);

b=new JButton("1");
b.setBounds(100,140,50,30);
b1=new JButton("2");
b1.setBounds(150,140, 50, 30);
b2=new JButton("3");
b2.setBounds(200,140,50,30);
b3=new JButton("4");
b3.setBounds(100,170,50,30);
b4=new JButton("5");
b4.setBounds(150,170,50,30);
b5=new JButton("6");
b5.setBounds(200,170,50,30);
b6=new JButton("7");
b6.setBounds(100,200,50,30);
b7=new JButton("8");
b7.setBounds(150,200,50,30);
b8=new JButton("9");
b8.setBounds(200,200,50,30);
b9=new JButton("0");
b9.setBounds(150,230,50,30);
b10=new JButton("+");
b10.setBounds(250,140,50,30);
b11=new JButton("-");
b11.setBounds(250,170,50,30);
b12=new JButton("*");
b12.setBounds(250,200,50,30);
b13=new JButton("/");
b13.setBounds(100,230,50,30);
b14=new JButton("=");
b14.setBounds(200,230,50,30);
b15=new JButton("c");
b15.setBounds(250,230,50,30);

p.add(tf);
p.add(b);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(b10);
p.add(b11);
p.add(b12);
p.add(b13);
p.add(b14);
p.add(b15);

b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);

f.setContentPane(p);
f.setSize(600,480);
f.setVisible(true);

}

public void actionPerformed(ActionEvent e) {

if(e.getSource()==b)
tf.setText(tf.getText()+"1");

else if(e.getSource()==b1)
tf.setText(tf.getText()+"2");

else if(e.getSource()==b2)
tf.setText(tf.getText()+"3");

else if(e.getSource()==b3)
tf.setText(tf.getText()+"4");

else if(e.getSource()==b4)
tf.setText(tf.getText()+"5");

else if(e.getSource()==b5)
tf.setText(tf.getText()+"6");

else if(e.getSource()==b6)
tf.setText(tf.getText()+"7");

else if(e.getSource()==b7)
tf.setText(tf.getText()+"8");

else if(e.getSource()==b8)
tf.setText(tf.getText()+"9");

else if(e.getSource()==b9)
tf.setText(tf.getText()+"0");

if(e.getSource()==b10)
{
a111=Double.parseDouble(tf.getText());
 operator=1;
tf.setText("");
}
if(e.getSource()==b11)
{
a111=Double.parseDouble(tf.getText());
 operator=2;
tf.setText("");
}
if(e.getSource()==b12)
{
a111=Double.parseDouble(tf.getText());
 operator=3;
tf.setText("");
}
if(e.getSource()==b13)
{
a111=Double.parseDouble(tf.getText());
 operator=4;
tf.setText("");
}

if(e.getSource()==b15)
{

 operator=5;
tf.setText("");
}

if(e.getSource()==b14)
{
b111=Double.parseDouble(tf.getText());
switch(operator)

{

case 1: result=a111+b111;
break;

case 2:result=a111-b111;
break;

case 3:result=a111*b111;
break;

case 4:result=a111/b111;
break;

}

tf.setText(""+result);
}

}

public static void main(String[] args) {
new CalculatorGUI();
}

}


