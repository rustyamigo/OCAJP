class ExceptionHandlingCaseTwo {
	public static void main(String[] args) {
		try {
		}
		finally {
			System.out.println("Finally called!");
		}
		// compiler error catch without try
		catch(Exception ex) {

		}
	}
}