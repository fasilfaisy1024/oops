import java.util.Scanner;
class product{
	int p_code;
	String p_name;
	double price;
	static int count=0;
	product(int c,String s,double p){
		count++;
		p_code=c;
		p_name=s;
		price=p;
	}
	void display(){
		System.out.println("Product Code:"+p_code+"Product Name:"+p_name+"Price:"+price);
	}
}
class products{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i;
		double v,m=0;
		System.out.print("Enter the number of products:");
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
		System.out.print("Enter the product code:");
		int c=sc.nextInt();
		System.out.print("Enter the product name:");
		String s=sc.next();
		System.out.print("Enter the price:");
		v=sc.nextDouble();
		product p=new product(c,s,v);
		p.display();
		System.out.print("no. of objects:"+p.count+"\n");
		if(i==0)
			m=v;
		if(v>m)
			System.out.print("high:"+v);
		}
	}
}