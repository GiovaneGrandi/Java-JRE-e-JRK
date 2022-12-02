package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais 2");
		
		int idade = 18;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2; //Usando uma expressão booleana, fazendo que a varíavel int seja analisada, dependendo do que ela guarda ela retornará true ou false 
		//A varíavel primitiva do tipo boolean só armazena as informações "true" e "false"
		
		System.out.println("O valor de acompanhado é = " + acompanhado);
		
		if (idade >= 18 && acompanhado) { //O operador " || " funciona como um "Ou" "Se isso for true OU isso execute essa função"
			System.out.println("Seja bem vindo!!"); //Existe também o operador "&&" onde significa que as duas condições precisam ser true para a função ser inicializada
		} else {
				System.out.println("Infelizmente você não pode entrar!!!");
			}
	}
}

//Assim como em outras linguagens em Java se pode apenas botar a varíavel booleana dentro do if sem ser necessário um "== true" afinal essa varíavel em sia já é um booleano