package emp.assignment;

import java.util.*;

abstract class Emp{
	String name;
	int age;
	int salary;
	static int count = 0 ;
	String designation;
	Emp(String name, int age){
		this.name=name;
		this.age=age;
		count+=1;
		System.out.println("Count = "+ count);
	}
	public final void display(){
		System.out.println("Employee's name:"+name);
		System.out.println("Employee's age:"+age);
		System.out.println("Employee's salary:"+salary);
		System.out.println("Employee's designation:"+designation);
		System.out.println("--------------------------------------");
	}
	public void raiseSalary(double amt){
		salary+=amt;
	}
}
final class Tester extends Emp{
	Tester(String name,int age){
	super(name,age);
	salary=15000;
	designation="TESTER";
	}
}
final class Programmer extends Emp{
	Programmer(String name,int age){
	super(name,age);
	salary=30000;
	designation="PROGRAMMER";
	}
}
final class Manager extends Emp{
	Manager(String name,int age){
	super(name,age);
	salary=90000;
	designation="MANAGER";
	}
}
class EmpMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name of Tester: ");
		String name1 = sc.nextLine();
		System.out.print("Enter age of Tester: ");
		int age1 = Integer.parseInt(sc.nextLine());
		Emp e1=new Tester(name1,age1);

		System.out.print("Enter name of Programmer: ");
		String name2 = sc.nextLine();
		System.out.print("Enter age of Programmer: ");
		int age2 = Integer.parseInt(sc.nextLine());
		Emp e2=new Programmer(name2,age2);

		System.out.print("Enter name of Manager: ");
		String name3 = sc.nextLine();
		System.out.print("Enter age of Manager: ");
		int age3 = Integer.parseInt(sc.nextLine());
		Emp e3=new Manager(name3,age3);

		e1.display();
		e2.display();
		e3.display();
		
		System.out.println("Enter the amount of appraisal for "+e1.name+" : ");
		double amt1 = sc.nextDouble();
		e1.raiseSalary(amt1);
		System.out.println("Enter the amount of appraisal for "+e2.name+" : ");
		double amt2 = sc.nextDouble();
		e2.raiseSalary(amt2);

		System.out.println("Enter the amount of appraisal for "+e3.name+" : ");
		double amt3 = sc.nextDouble();
		e3.raiseSalary(amt3);


		e1.display();
		e2.display();
		e3.display();
}
	}
