package stackadt;

import java.lang.*;

import java.io.*;

import java.util.*;

interface Mystack

{

int n=10;

public void pop();

public void push();

public void peek();

public void display();

}

class Stackimp implements Mystack

{

int stack[]=new int[n];

int top=-1;

public void push()

{

try{

DataInputStream dis=new DataInputStream(System.in);

if(top==(n-1))

{

System.out.println("Overflow");

return;

}

else

{

System.out.print("Enter element: ");

int ele=Integer.parseInt(dis.readLine());

stack[++top]=ele;

}

}

catch(Exception e)

{

System.out.println("e");

}

}

public void pop()

{

if(top<0)

{

System.out.println("Underflow");

return;

}

else

{

int popper=stack[top];

top--;

System.out.println("Popped element: " +popper);

}

}

public void peek()

{

if(top<0)

{

System.out.println("Underflow");

return ;

}

else

{

int popper=stack[top];

System.out.println("Top element: " +popper);

}

}

public void display()

{

if(top<0)

{

System.out.println("Empty!");

return;

}

else

{

String str=" ";

for(int i=0;i<=top;i++)

str=str+" "+stack[i];

System.out.println("Elements are: "+str);

}

}

}

class St

{

public static void main(String arg[])throws IOException

{

DataInputStream dis=new DataInputStream(System.in);

Stackimp stk=new Stackimp();

int ch=0;

do{

System.out.print("\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit\nEnter ur choice:");

ch=Integer.parseInt(dis.readLine());

switch(ch){

case 1:stk.push();

break;

case 2:stk.pop();

break;

case 3:stk.peek();

break;

case 4:stk.display();

break;

case 5:System.exit(0);

}

}while(ch<=5);

}

}