class Emp{
	String name;
	int age;
	int salary;
	String designation;
	public void display(){
		System.out.println("Employee's name:"+name);
		System.out.println("Employee's age:"+age);
		System.out.println("Employee's salary:"+salary);
		System.out.println("Employee's designation:"+designation);
		System.out.println("--------------------------------------");
	}
	public void raiseSalary(){
		salary+=0;
	}
}
class Tester extends Emp{
	Tester(String name,int age){
	this.name=name;
	if(age>=21 && age<=60){
		this.age=age;
		}
	this.salary=15000;
	this.designation="TESTER";
	}
	public void raiseSalary(){
		salary+=2000;
	}
}
class Programmer extends Emp{
	Programmer(String name,int age){
	this.name=name;
	if(age>=21 && age<=60){
		this.age=age;
		}
	this.salary=30000;
	this.designation="PROGRAMMER";
	}
	public void raiseSalary(){
		salary+=5000;
	}
}
class Manager extends Emp{
	Manager(String name,int age){
	this.name=name;
	if(age>=21 && age<=60){
		this.age=age;
		}
	this.salary=90000;
	this.designation="MANAGER";
	}
	public void raiseSalary(){
		salary+=10000;
	}
}
class EmpMain{
	public static void main(String args[]){
	Emp e1=new Tester("Ravi",25);
	Emp e2=new Programmer("Prashant",33);
	Emp e3=new Manager("Mamta",45);

	e1.display();
	e2.display();
	e3.display();

	e1.raiseSalary();
	e2.raiseSalary();
	e3.raiseSalary();


	e1.display();
	e2.display();
	e3.display();
}
	}
