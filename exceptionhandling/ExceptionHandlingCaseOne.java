class ExceptionHandlingCaseOne {
	public static void main(String[] args) {
		// we cannot use only try
		// compiler error: try without catch or finally
		try {
			System.out.println(10.0/0); // GIVES Infinity
			System.out.println(10/0); // THROWS ArithmeticException
		}
		// catch without try is not allowed
		// compiler error : catch without try
		catch(ArithmeticException ex) {
			System.out.println("Exception Occurred: " + ex.getMessage());
		}
		// We can't create another catch block for same exception
		// compiler error would be Exception has already been caught 

/*		catch(ArithmeticException ex) {
			System.out.println("Exception Occurred: " + ex.getMessage());
		}
*/
		// the order of catch block matters in term of super class been always refer at last
		// we cannot use the below catch block before the ArithmeticException as it is
		// the super class of all the other Exceptions.
		// compiler error Exception has already been caught 
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

		// finally must have a try
		// compiler error : finally must have a try
		finally {
			System.out.println("Finally called!");
		}

	}
}