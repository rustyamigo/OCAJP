import java.io.*;
class TryCatchFinallyReturn {
	
	public static int test() {


		try {
			throw new Exception("New exception");
			//return 1; // unreachable statement
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			return 2;
		}
		finally{
			return 3;
		}
	}


	public static void main(String[] args) {
		System.out.println(test());
	}
}