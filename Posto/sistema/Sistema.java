package sistema;
//modificado pelo Everson C.
import java.util.Scanner;

import pagamento.Pagamento;
import servicos.Abastecimento;
import servicos.Lavagem;

public class Sistema {

	public static void main(String[] args) {
		int escolhaCliente;
		int tipoCombustivel;
		double valorAbastecer;
		double qtdeCombustivel;
		int OpcaoLavagem;
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Olá seja bem-vendo(a) ao posto Transforme-se");
		
		System.out.println("Qual serviço deseja fazer? \n"+
				"1- Abastecer \n"+
				"2- Lavagem \n");
		escolhaCliente = entrada.nextInt();

		if (escolhaCliente == 1 ) {
			System.out.println("O preço dos combustíveis: \n"
					+ "1- Gasolina - R$ 4,50 \n"
					+ "2- Etanol   - R$ 3,85 \n"
					+ "3- Diesel   - R$ 4,25");
			System.out.println("Qual combustível gostaria de abastecer?");
			tipoCombustivel = entrada.nextInt();
			
			System.out.println("Quanto gostaria de abastecer?");
			valorAbastecer = entrada.nextDouble();
			
			Abastecimento.Abastecer(tipoCombustivel, valorAbastecer);
			
			System.out.println("Qual seria a forma de pagamento? \n"
					+ "1- Dinheiro \n"
					+ "2- Crédito \n"
					+ "3- Debito");
			int formaPagamento = entrada.nextInt();
			Pagamento.formaPagamento(formaPagamento, valorAbastecer);
			
		} else if (escolhaCliente == 2) {
			System.out.println("Qual é tipo \n"
					+ "1 - Carro Simples - 10,00 reais \n"
					+ "2 - Carro SUV  ---- 20,00 reais\n"
					+ "3 - Caminhão ------ 50,00 reais");
			OpcaoLavagem = entrada.nextInt();
			
			Lavagem.Lavar(OpcaoLavagem);
			
		}
	
		entrada.close();
	}
	
}
