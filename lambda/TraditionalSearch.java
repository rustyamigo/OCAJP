import java.util.List;
import java.util.ArrayList;
public class TraditionalSearch {
	
	public static void main(String[] args) {
		

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Khozema Nullwala", 25000, true, false));
		employees.add(new Employee(2, "Pooja Gadekar", 55000, false, true));
		employees.add(new Employee(3, "Aakash Gupta", 15000, false, false));
		employees.add(new Employee(4, "Sudha Singh", 75000, false, true));

		print (employees, new CheckEmployeeIsManager());

	}


	public static void print(List<Employee> employees, CheckEmployeeIsManager checkIfManager) {
		System.out.println("Listing all the managers: ");
		for(Employee employee: employees) {
			if(checkIfManager.test(employee)) {
				System.out.println(employee);
			}
		}

	}

}