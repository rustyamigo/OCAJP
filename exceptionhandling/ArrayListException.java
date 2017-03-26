import java.util.*;
class ArrayListException {
	public static void main(String[] args) {
		// IllegalArgumentException - Illegal Capacity -1 
		// List<String> names = new ArrayList<>(-1);
		 List<String> names = new ArrayList<>(0);
		// IndexOutOfBoundsException if we try to access values from 
		// wrong indexes
		names.add("Khozema"); 
		// ArrayIndexOutOfBoundsException
		// System.out.println(names.get(-1));
		// CE: Illegal start of expression
		// System.out.println(names.get(1-));
		// IndexOutOfBoundsException because it uses rangeCheck method internally
		System.out.println(names.get(2));
	}
}