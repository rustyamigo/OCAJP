 class ByteDemo {
 	public static void main(String[] args) {
 		byte b1 = 1;
 		byte b2 = 1;
 		// byte b3 = b1 + b2; // LOSSY CONVERSION COMPILATION FAILS
 		// byte b3 = b1 + 7; // LOSSY CONVERSION COMPILATION FAILS
 		// byte b3 = 128; // LOSSY CONVERSION COMPILATION FAILS
 		byte b3 = (byte) 128; // WILL COMPILE AND THE MSB WILL BE 1 GIVING A NEGATIVE OUTPUT  
 		//b3 += 127; // WILL COMPILE AND THE MSB WILL BECOME 1 GIVING A NEGATIVE OUTPUT
 		System.out.println(b3);
 	}
 }