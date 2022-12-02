package sintaxe_variaveis_e_fluxo;

public class TestaVariaveis {
	
	public static void main(String[] args) { 
		
		System.out.println("Ola novo teste"); //O ln é usado para pular uma linha
		
		int idade; //A variavel é declarada através da palavra chave int
		idade = 37; //Após a declaração da variavel é que nós agregamos algum valor a ela
		
		System.out.println(idade); //Passando a variavel sem "" para informar que ela não é uma string e sim um objeto
		
		System.out.println("A idade é " + idade + ", parabens!"); //Concatenando uma string com uma variavel númerica
	}
}
