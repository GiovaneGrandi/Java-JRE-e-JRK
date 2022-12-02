package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais 2");
		
		int idade = 18;
		int quantidadePessoas = 2;
		//boolean acompanhado = quantidadePessoas >= 2; transformando esse código em um if:
		
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true; //Uma varíavel declarada dentro de um if só existe dentro das {} quando as chaves fecham ela deixa de existir
		} else {
			acompanhado = false; //O escopo de uma varíavel vai desde a abertura de chaves "{" até o fechamento da mesma "}"
		}
		
		System.out.println("O valor de acompanhado é = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!!");
		} else {
				System.out.println("Infelizmente você não pode entrar!!!");
			}
	}
}
