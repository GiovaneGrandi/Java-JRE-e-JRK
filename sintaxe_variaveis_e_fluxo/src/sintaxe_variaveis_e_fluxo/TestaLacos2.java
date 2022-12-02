package sintaxe_variaveis_e_fluxo;

public class TestaLacos2 {
	public static void main(String[] args) {
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) { //Substituindo o break apenas indicando que o laço só continuaria se a coluna for menor ou igual a linha, se não ele pula pra próxima etapa e repete até atingir o objetivo
				//if(coluna > linha) {
					//break; //Usando o break para ele interromper a iteração caso a coluna fique com mais asteriscos do que o número da linha e então ele vai pra próxima etapa que é o println e retoma a iteração novamente
				//}
				System.out.print("*");
			}
			System.out.println(); 
		}
	}
}
