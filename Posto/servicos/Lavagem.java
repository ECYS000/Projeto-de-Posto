package servicos;

//import java.util.Scanner;

public class Lavagem {
	//criado pelo Lucas Tartari
	//editado e correção pelo Everson Carlos, corrigi e deixei // que era feito por Lucas
	
	
	//public static void Lavar(int OpcaoLavagem, double Qtdelavagem) {
	public static void Lavar(int OpcaoLavagem) {
		
		double CarroSimples = 10.00;
		double CarroSUV = 20.00;
		double Caminhao = 50.00;
		
		
//		String answer = "";
		
//		Scanner entrada = new Scanner(System.in);
		
//		System.out.println("Deseja Lavar o Carro?");
//		answer = entrada.next();
//		System.out.println();
		
		switch(OpcaoLavagem) {
		
		case 1:
			
			
			System.out.printf("O Valor de lavagem será: %.2f reais",CarroSimples); //Qtdelavagem);
			//CarroSimples = entrada.nextDouble();
			
			break;
			
		case 2:
			
			System.out.printf("O Valor de lavagem será: %.2f reais",CarroSUV);//Qtdelavagem);
			//CarroSUV = entrada.nextDouble();
			break;
			
		case 3:
			
			System.out.printf ("O Valor de lavagem será: %.2f reais",Caminhao);//Qtdelavagem);
			//Caminhao = entrada.nextDouble();
			break;
		
		}
		
		//Return Qtdelavagem;

	}



}
