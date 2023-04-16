class Emp{
	String name;
	int age;
	int salary;
	String designation;

	Emp(String name,int age,int salary,String designation){
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.designation=designation;
	}
	public void display(){
		System.out.println("Employee's name:"+name);
		System.out.println("Employee's age:"+age);
		System.out.println("Employee's salary:"+salary);
		System.out.println("Employee's designation:"+designation);
		System.out.println("--------------------------------------");
	}
	public void raiseSalary(int amt){
		salary+=amt;
	}
}
class EmpMain{
	public static void main(String args[]){
	Emp e1=new Emp("Ravi",25,30000,"Tester");
	Emp e2=new Emp("Sujatha",35,50000,"Programmer");
	Emp e3=new Emp("Prabhakar",45,90000,"Manager");

	e1.display();
	e2.display();
	e3.display();

	e1.raiseSalary(-5000);
	e2.raiseSalary(7000);
	e3.raiseSalary(10000);


	e1.display();
	e2.display();
	e3.display();
}
	}
