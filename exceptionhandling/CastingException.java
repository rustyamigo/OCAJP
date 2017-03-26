interface Printable{}
class BlackInk {}
// NO COMPILE ERROR if cast to an interface
// BUT will give runtime exception i.e. ClassCastException if there
// is no relation between the two.
class CastingException {
	public static void main(String[] args) {
		Printable printable = null;
		BlackInk blackInk = new BlackInk();
		printable = (Printable) blackInk;
	}
}