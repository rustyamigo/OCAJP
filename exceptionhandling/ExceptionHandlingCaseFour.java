class ExceptionHandlingCaseFour {
	public static void main(String[] args) {
		// curly braces are mandatory for try, catch & finally
		// in try catch finally order is important
		try {
			System.out.println("john" == "john");
		}
		catch(Exception ex) {
		}
		finally {
			// perfectly valid
			try {

			}
			finally {

			}			
		}

	}
}