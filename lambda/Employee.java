public class Employee {
	
	private int id;	
	private String name;
	private double salary;
	private boolean manager;
	private boolean leader;

	public Employee() {}
	public Employee(int id, String name, double salary, boolean leader, boolean manager) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.leader = leader;
		this.manager = manager;
	}


	public boolean isLeader() {
		return leader;
	}

	public boolean isManager() {
		return manager;
	}


	public String toString() {
		return name;
	}


}