public class L3Ex011 {
	
	public static void main (String[] args) {
		
		//true, true, false, false, true
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		System.out.println(a > b | c < d);
		System.out.println(a > b || c < d);
		System.out.println(a > b & c < d);
		System.out.println(a > b && c < d);
		System.out.println(a > b != c < d);
	}
}

