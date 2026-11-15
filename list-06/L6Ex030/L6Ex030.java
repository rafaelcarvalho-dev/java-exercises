public class L6Ex030 {
	
	public static void main (String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print(i + ", ");
			
			if (i % 2 == 0) {
				
				for (int j = 2; j <= i * 2; j++) { //poderia usar ;j += 2)
					
					if (j % 2 == 0) {
						System.out.print(j + " ");
						
					}
				}
			} else {
				
				for (int y = 1; y <= i * 2; y++) { //poderia usar ; y += 2)
					
					if (y % 2 != 0) {
						System.out.print(y + " ");
						
					}
				}
			}
			
			System.out.println();
			
		}
	}
}

