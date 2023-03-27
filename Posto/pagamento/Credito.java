package pagamento;
//modificado pelo Everson C.
public class Credito {
	
	public static void pagoNoCredito (int informarParcelas, double valorAbastecido) {
		
		if (informarParcelas == 1) {
			System.out.printf("Aguardando pelo processo de pagamento pelo credito à vista em %.2f reais \n Obrigado, tenha 1um bom dia!",valorAbastecido);		
			}else if (informarParcelas >=2 && informarParcelas <=3) {
				System.out.printf("Aguardando pelo processo de pagamento pelo credito x"+informarParcelas+" em %.2f reais \nObrigado, tenha um bom dia!",valorAbastecido+(valorAbastecido*5/100));
			}else if (informarParcelas >=4 && informarParcelas <=5) {
				System.out.printf("Aguardando pelo processo de pagamento pelo credito x"+informarParcelas+" em %.2f reais \nObrigado, tenha um bom dia!",valorAbastecido+(valorAbastecido*7/100));
			} else {
				System.out.println("Desculpe não aceitamos parcelar que você informou, aceitamos somente até x5");
			}
	        }
		
		
		
	}

	

