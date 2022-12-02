package sintaxe_variaveis_e_fluxo;

public class TestaMes {

	public static void main(String[] args) {

		int mes = 1; //Através da varíavel mes é possível informar qual o número do case será iniciado no switch

		switch (mes) { //O switch é usado para substituir o if quando é necessário fazer diversas verificações 
		case 1:
			System.out.println("O mês é Janeiro");
			break; //O break é usado para encerrar a verificação após a execução do system.out para que os cases seguintes não sejam executados juntos
		case 2:
			System.out.println("O mês é Fevereiro");
			break;
		case 3:
			System.out.println("O mês é Março");
			break;
		case 4:
			System.out.println("O mês é Abril");
			break;
		case 5:
			System.out.println("O mês é Maio");
			break;
		case 6:
			System.out.println("O mês é Junho");
			break;
		case 7:
			System.out.println("O mês é Julho");
			break;
		case 8:
			System.out.println("O mês é Agosto");
			break;
		case 9:
			System.out.println("O mês é Setembro");
			break;
		case 10:
			System.out.println("O mês é Outubro");
			break;
		case 11:
			System.out.println("O mês é Novembro");
			break;
		case 12:
			System.out.println("O mês é Dezembro");
			break;
		default: //O comportamento default seria o comportamento padrão, caso seja inserido algum número diferente dos esperados ele executará a opção default
			System.out.println("Mês inválido");
			break;
		}
	}
}
