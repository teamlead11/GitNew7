package org.sample;

public class Employee {
public void empId(String Name){
System.out.println("string method "+Name);
}
public void empId(int Regno){
System.out.println("int method "+Regno);
}
public void empId(String manager,String project){
System.out.println("string string type "+manager);
System.out.println("string string type "+project);
}
public void empId(float Sal, String bank){
System.out.println("float string method "+Sal);
System.out.println("float string method "+bank);
}
private void empId(char spl,long ph) {
System.out.println("char long method "+spl);
System.out.println("char long method "+ph);
}
private void empId() {
	System.out.println("no arguments passed");
}
public static void main(String[] args) {
Employee e=new Employee();
e.empId("mady");
e.empId(12346);
e.empId(65000f, "Hdfc");
e.empId("latha.madhavi@gmail.com","s");
e.empId('a',7);
e.empId("madhavi","Latha");
e.empId('@', 898595840);
e.empId();
}
}
