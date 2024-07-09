package CollectionPrograms;

public class Employee implements Cloneable{
private int empno;
private String name;
private String location;
private int salary;

public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Object clone() throws CloneNotSupportedException {
    return super.clone();
}
}
