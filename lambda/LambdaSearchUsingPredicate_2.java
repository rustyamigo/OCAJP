import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
public class LambdaSearchUsingPredicate_2 {
	
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Khozema Nullwala", 25000, true, false));
		employees.add(new Employee(2, "Pooja Gadekar", 55000, false, true));
		employees.add(new Employee(3, "Aakash Gupta", 15000, false, false));
		employees.add(new Employee(4, "Sudha Singh", 75000, false, true));

		System.out.println("Before using removeIf");
		printEmployees(employees);

		employees.removeIf( e -> e.isManager());

		System.out.println("--------------After using removeIf--------------");
		printEmployees(employees);
		
	}

	public static void printEmployees(List<Employee> employees) {	
		for(Employee employee: employees) {
				System.out.println(employee);
		}
	}
}