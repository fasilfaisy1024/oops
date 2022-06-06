import java.util.*;  
class employee {
    int eNo;
    String eName;
    int eSalary;

    public void read(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter ID : "); 
        eNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name : "); 
        eName = sc.nextLine();
        System.out.print("Enter monthly salary : "); 
        eSalary = Integer.parseInt(sc.nextLine());
    }

    public void display(){
        System.out.println("Name : "+ eName );
    }
    public static void main(String []args){
		Scanner s= new Scanner(System.in);
        int i,n=3;
        int No,m;
        employee emp[] = new employee[n];
		System.out.println("Enter the no of employees:");
		m = s.nextInt();
        for(i=0;i<m;i++){
            emp[i] = new employee();
            emp[i].read();
        }
        System.out.println("Search"); 

            Scanner sc= new Scanner(System.in);
            System.out.print("Enter ID : "); 
            No = Integer.parseInt(sc.nextLine());
            for(i=0;i<n;i++){
                if(emp[i].eNo == No){
                    emp[i].display();
                    break;
                }
            }
        

    }
}