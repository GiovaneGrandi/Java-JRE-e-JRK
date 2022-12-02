package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais"); //Ao escrever sysout e usar o atalho "ctrl + espaço" ele faz o auto complete e escreve o system.out.println
		
		int idade = 18;
		int quantidadePessoas = 2;
		
		if (idade >= 18) { //É uma convenção que se deve deixar o if espaçado em relação aos parenteses ()
			System.out.println("Você é maior de idade!");
			System.out.println("Seja bem vindo!!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não é maior de idade, "
						+ "porém pode entrar pois está acompanhado!"); //Ao dar entre no meio de um comando o Eclipse automaticamente formata aquele comando para ele ficar legível sem ultrapassar a janela da view
			} else {
				System.out.println("Você é menor de idade, portanto não pode entrar!!!");
			}
		}
	}
}

//O comando format no source ou então o atalho "ctrl + shift + F" serve para identar o código automaticamente de maneira correta
//Ao dar um clique duplo em uma view do Eclipse ele maximiza a janela desejada