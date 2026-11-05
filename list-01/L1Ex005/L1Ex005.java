public class L1Ex005 {
	
	public static void main (String[] args) {
		char asterisco = '*';
		char escape = '\n';
		
		for (int index = 1; index <= 5; index++) {
			
			for (int coluna = 1; coluna <= index; coluna++) {
				
				System.out.print(asterisco);
				
				}
				
			System.out.print(escape);	
			
		}
	}
}

