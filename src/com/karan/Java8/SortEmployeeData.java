package com.karan.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	
	private String name;
	private int eid;
	private int salary;
	
	public Employee(String name, int eid, int salary) {
		super();
		this.name = name;
		this.eid = eid;
		this.setSalary(salary);
	}

	@Override
	public String toString() {
		return name + ", eid=" + eid + ", salary=" + getSalary() + "\n";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
 
public class SortEmployeeData {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("a", 1, 12000));
		list.add(new Employee("b", 2, 364000));
		list.add(new Employee("c", 3, 34000));
		list.add(new Employee("d", 4, 35000));
		list.add(new Employee("e", 5, 6000));
		
		System.out.println(list);
		
//		Comparator<Employee> c = (e1,e2) -> {
//			return e1.
//		};
		Collections.sort(list, (e1, e2) -> (e1.getSalary() < e2.getSalary()) ? -1 : (e1.getSalary() > e2.getSalary()) ? 1 : 0);
		
		System.out.println("After sorting");
		System.out.println(list);
	}

}
