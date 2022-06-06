import java.util.Scanner;
public class sorting
{
	  public static void main(String args[]){
		  int c;
		  String temp;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the no of strings:");
		  c=sc.nextInt();
		  String str[]=new String[c+1];
		  System.out.println("Enter the string:");
		  for(int i=0;i<=c;i++){
			  str[i]=sc.nextLine();
		  }
		  for(int i=0;i<=c;i++){
			  for(int j=i+1;j<=c;j++){
				  if(str[i].compareTo(str[j])>0){
					  temp=str[i];
					  str[i]=str[j];
					  str[j]=temp;
				  }
			  }
		  }
		  System.out.print("Sorted String:");
		  for(int i=0;i<=c;i++){
			  System.out.println(str[i]);
		  }
	  }
}