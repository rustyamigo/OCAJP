class ExceptionInInitializerErrorDemo {
	static int a;
	 static {
		a = getA();
		//throw new RuntimeException("Test out of curiosity");
	 }

	 public static int getA() {
	 	throw new RuntimeException("Test out of curiosity");	 	 
	 }

	public static void main(String[] args) {
		
	}
}