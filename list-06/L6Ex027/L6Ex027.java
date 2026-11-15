public class L6Ex027 {
	
	public static void main (String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print(i + ", ");
			
			int aux = 11 - i;
			
			for (int j = 1; j <= aux; j++) {
				System.out.print(j + " ");
				
			}
			
			System.out.println();
		}
	
	}
}

