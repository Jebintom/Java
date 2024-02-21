package threading;

import java.util.*;
class Randomnum extends Thread
{
public void run()
{
// int min=1;
//int max=33;
Random r=new Random();
for(int i=0;i<10;i++)
{
//int b= (int)Math.random()*(max-min)+min;
int b=r.nextInt(100);
System.out.println("the random no is:"+b);
if(b%2==0)
{
Square sq=new Square(b);
sq.start();
}
else {
cube cu =new cube(b);
cu.start();
}

}
}
}

class Square extends Thread
{
int n;
Square (int n)
{
this.n=n;
}
public void run()
{
//this n.n;
System.out.println("the square of "+ n+" is :"+(n*n));
}
}
class cube extends Thread
{
int n;
cube (int n)
{
this.n=n;
}
public void run() {
System.out.println("cube of"+ n +" is :"+(n*n*n));
}
}



	public class MultiThread {

public static void main(String[] args) {
// TODO Auto-generated method stub
Randomnum r=new Randomnum();
r.start();

}

}


