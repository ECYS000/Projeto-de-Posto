package pagamento;
//modificado pelo Everson C.
import java.util.Scanner;

public class Pagamento {
	
	public static double formaPagamento(int formaEscolhido, double valorAbastecido) {
		
		Scanner entrada = new Scanner(System.in);
		
		switch(formaEscolhido) {
		
		case 1:
			
			System.out.println("Será pago no dinheiro");
			
			System.out.println("Qual será a quantia paga?");
			double quantiaEmDinheiro = entrada.nextDouble();
			
			Dinheiro.pagamentoDinheiro(quantiaEmDinheiro, valorAbastecido);
			
			break;
		case 2:
			System.out.println("Será pago no credito");
			
			System.out.println("Informa quantas deseja as parcelas?");
			
			
			for (int parcelas = 1; parcelas <=1 ; parcelas++){
				System.out.printf("x"+parcelas+" - %.2f reais à vista \n",valorAbastecido);
				for ( parcelas = 2; parcelas <=3 ; parcelas++){
					double valorCredito = valorAbastecido+(valorAbastecido*5/100);
				System.out.printf("x"+parcelas+" - %.2f reais, por cada mês %.2f \n",valorCredito,valorCredito/parcelas);
				} for ( parcelas = 4; parcelas <=5 ; parcelas++){
					double valorCredito = valorAbastecido+(valorAbastecido*7/100);
				System.out.printf("x"+parcelas+" - %.2f reais, por cada mês %.2f \n",valorCredito,valorCredito/parcelas);
				}
				}
			
			int informarParcelas = entrada.nextInt();
			
			Credito.pagoNoCredito(informarParcelas, valorAbastecido);
			break;
		case 3: 
			System.out.printf("Será pago no debito em valor: %.2f",valorAbastecido);
			
			System.out.println("Obrigado, tenha um bom dia!");
			
		
		default:
			System.out.println("Valor inválido");
			break;
		}
		return valorAbastecido;
		
	}
	
	
	

}
