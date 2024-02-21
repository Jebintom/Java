package threading;


import java.util.*;

class Table extends Thread

{

void printTable(int n)

{

synchronized(this)

{

for(int i=1;i<=5;i++)

{

System.out.println(n+"+"+i+"="+(n+i));

}

try

{

Thread.sleep(500);

}

catch(Exception e)

{

System.out.println(e);

}

}

}

}

class MyTable1 extends Thread

{ int n;

Table t;

MyTable1(Table t)

{

this.t=t;

}

public void run()

{

t.printTable(n);

}

}

class MyTable2 extends Thread

{

int n;

Table t;

MyTable2(Table t)

{

this.t=t;

}

public void run()

{

t.printTable(n);

}

}

class MyTable3 extends Thread

{ int n;

Table t;

MyTable3(Table t)

{

this.t=t;

}

public void run()

{

t.printTable(n);

}

}


	public class ThreadSynchroinization {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

Table obj=new Table();

MyTable1 t1=new MyTable1(obj);

MyTable2 t2=new MyTable2(obj);

MyTable3 t3=new MyTable3(obj);

System.out.println("Enter the Table you want to run by Thread1");

t1.n=sc.nextInt();

System.out.println("Enter the Table you want to run by Thread2");

t2.n=sc.nextInt();

System.out.println("Enter the Table you want to run by Thread3");

t3.n=sc.nextInt();

t1.start();

t2.start();

t3.start();

}

}

