package sintaxe_variaveis_e_fluxo;

public class TestaLacos {
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for(int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" "); //Dando um espaçamento para os números
			}
			System.out.println(); //Deixando o sysout sozinho para que ele apenas quebre a linha após o término de uma iteração
		}
	}
}
