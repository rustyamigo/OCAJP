class ExceptionHandlingCaseThree {
	public static void main(String[] args) {
		try {
		}
		catch(Exception ex) {
			// perfectly valid
			try {

			}
			finally {

			}
		}
		
	}
}