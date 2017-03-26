import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
public class LambdaSearch {
	
	public static void main(String[] args) {
		

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Khozema Nullwala", 25000, true, false));
		employees.add(new Employee(2, "Pooja Gadekar", 55000, false, true));
		employees.add(new Employee(3, "Aakash Gupta", 15000, false, false));
		employees.add(new Employee(4, "Sudha Singh", 75000, false, true));

		print (employees, e -> e.isManager());

	}


	public static void print(List<Employee> employees, Predicate<Employee> check) {
		
		for(Employee employee: employees) {
			if(check.test(employee)) {
				System.out.println(employee);
			}
		}

	}

}