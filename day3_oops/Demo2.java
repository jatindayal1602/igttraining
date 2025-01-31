package day3_oops;

import java.util.Scanner;

interface EmpCab{
	void cab();

    default void optional_func(){
        
    }
    static void optional_func2(){
       
    }
     // we cant use this fuction with the object we have to direct access with class instance;
}
abstract class Emp{
	Short id;
	String name;
	byte age;
	abstract void raiseSalary();
	Emp(){
 
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================");
 
		System.out.print("Enter Id: ");
	 	id= sc.nextShort();
 
		System.out.print("Name: ");
	 	name=sc.next();
 
		System.out.print("Enter age: ");
	 	age= sc.nextByte();
	    }
}
//child-- sub-- derived
class Manager  extends Emp implements EmpCab
{
	float salary= 30000f;   String des="Manager";
	Manager(){
	}
	void display(){	
		System.out.println("==========================");
		System.out.println("Id:"+id );
		System.out.println("Name:"+name );
		System.out.println("Age:"+age );
		System.out.println("Salary:"+salary );
		System.out.println("Designation:"+des );
 
		}
	void raiseSalary(){
		salary= salary+4000;
		System.out.println("Salary: "+ salary+"\n");
		}
	@Override
	public void cab() {
		// TODO Auto-generated method stub
		System.out.println("Cab For Manager");
 
	}
}
class Developer extends Emp implements EmpCab
{
		float salary= 50000f; String des="Developer";
 
	Developer(){
	}
 
	void display(){	
		System.out.println("==========================");
		System.out.println("Id:"+id );
		System.out.println("Name:"+name );
		System.out.println("Age:"+age );
		System.out.println("Salary:"+salary );
		System.out.println("Designation:"+des );
		}
	void raiseSalary(){
		salary= salary+3000;
		System.out.println("Salary: "+ salary+"\n");
			}
 
	@Override
	public void cab() {
		// TODO Auto-generated method stub
		System.out.println("Cab For Developer");
	}
 
}
class Clerk extends Emp implements EmpCab
{
		float salary= 20000f;String des="Clerk";
 
Clerk(){}
 
	void display(){	
		System.out.println("==========================");
		System.out.println("Id:"+id );
		System.out.println("Name:"+name );
		System.out.println("Age:"+age );
		System.out.println("Salary:"+salary );
		System.out.println("Designation:"+des );
	}
	void raiseSalary(){
		salary= salary+10000;
		System.out.println("Salary: "+ salary+"\n");
	}
 
	@Override
	public void cab() {
		// TODO Auto-generated method stub
		System.out.println("Cab For Clerk");
	}
}
 
class Demo4{
public static void main(String args[]){
	Manager m=null;
	Developer d= null;
	Clerk c =null;

 
	Scanner sc= new Scanner(System.in);
	int ch1,ch2=0;
	do{
		System.out.println("==========================");
		System.out.println("1. Create");
		System.out.println("2. Display");
		System.out.println("3. Raise salary");
		System.out.println("5. Exit");
		ch1 =sc.nextInt();
		if(ch1 == 1){
				do{
					System.out.println("==========================");
					System.out.println("	1. Manager");
					System.out.println("	2. Developer");
					System.out.println("	3. Clerk");
					System.out.println("	4. Exit");
 
					ch2=sc.nextInt();
					if(ch2 == 1){ m = new Manager();}
					if(ch2 == 2){ d= new Developer();}
					if(ch2 == 3){ c=new Clerk();}
				  }while(ch2 != 4);
				}
		if(ch1 == 2){
				do{
					System.out.println("==========================");
					System.out.println("	1. Manager");
					System.out.println("	2. Developer");
					System.out.println("	3. Clerk");
					System.out.println("	4. Exit");
					ch2=sc.nextInt();
					if(ch2 == 1){ m.display();m.cab();}
					if(ch2 == 2){ d.display(); d.cab();}
					if(ch2 == 3){c.display();c.cab();}
				  }while(ch2 != 4);
			}
		if(ch1 == 3){
				do{
					System.out.println("==========================");
					System.out.println("	1. Manager");
					System.out.println("	2. Developer");
					System.out.println("	3. Clerk");
					System.out.println("	4. Exit");
					ch2=sc.nextInt();
					if(ch2 == 1){  m.raiseSalary();}
					if(ch2 == 2){  d.raiseSalary();}
					if(ch2 == 3){c.raiseSalary();}
					}while(ch2 != 4);
 
				}
		if(ch1 == 5){
			 	System.out.println("Thank you...!");
				System.exit(0);
			}
	   }while(ch1 != 6);
}
}	