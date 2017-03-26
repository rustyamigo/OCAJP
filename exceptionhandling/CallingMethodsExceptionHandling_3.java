import java.io.*;
class CallingMethodsExceptionHandling_3 {
	
	public static void main(String[] args) {
		try {}
		// CE - exception FileNotFoundException is never thrown in body of corresponding try statement
		// the program requires that exception must be thrown explicitly or a method that throws that exception		
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}

}