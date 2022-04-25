import java.util.Scanner;
class grantparent{
int x;
void display(int a){
x=a;
}
}
class parent extends grantparent{
int y;
void display(int b,int c){
super.display(c);
y=b;
}
}
class child extends parent{

void show(){
int z=x+y;
System.out.print("Sum="+z);
}
}
class sum{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
child c=new child();
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
c.display(a,b);
c.show();
}
}