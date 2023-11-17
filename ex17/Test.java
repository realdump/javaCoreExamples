import java.util.*;
class Employee
{
	String eid;
	String ename;
	float esal;
	String eaddr;
	Employee(String eid, String ename,float esal,String eaddr)
	{
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
	}
	public String toString()
	{
		return "["+eid+","+ename+","+esal+","+eaddr+"]";
	}

}
class Test
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("E111","AAA",5000,"MAA");
		Employee e2 = new Employee("E222","BBB",5000,"MAA");
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		System.out.println(al);
		
	}
}

