public class L4Ex003 {
	
	public static void main (String[] args) {
		 
		 double precoProduto1 = (Math.random() * 1001);
		 double precoProduto2 = (Math.random() * 1001);
		 
		 if (precoProduto1 == precoProduto2) {
			System.out.print("os preços dos produtos são iguais");
		} else if (precoProduto1 < precoProduto2){
			System.out.print("o produto 1 eh o mais barato");
		} else {
			System.out.print("o produto 2 eh o mais barato");
		}
	}
}

