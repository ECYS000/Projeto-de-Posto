package pagamento;


public class Dinheiro {
	
	public static void pagamentoDinheiro (double quantiaEmDinheiro, double valorAbastecido ) {
		if (quantiaEmDinheiro == valorAbastecido) {
			System.out.println("Obrigado, tenha um bom dia!");
		} else if (quantiaEmDinheiro > valorAbastecido) {
			double troco = quantiaEmDinheiro-valorAbastecido;
			System.out.printf("O seu troco é de %.2f, obrigado, tenha um bom dia!.",troco);
		} else if (quantiaEmDinheiro < valorAbastecido) {
			System.out.println("ESTA TENTANDO O QUE?");
		}
	}

}
