public class L6Ex029 {
	
	public static void main (String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print(i + ", ");
			
			if (i % 2 == 0) {
				
				for (int j = 2; j <= 10; j++) {
					
					if (j % 2 == 0) {
						System.out.print(j + " ");
						
					}
				}
			} else {
				
				for (int y = 1; y <= 9; y++) {
					
					if (y % 2 != 0) {
						System.out.print(y + " ");
						
					}
				}
			}
			
			System.out.println();
			
		}
	}
}

