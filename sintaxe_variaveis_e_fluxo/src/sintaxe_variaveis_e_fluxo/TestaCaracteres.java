package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a'; //O char é usado para guardar apenas uma letra/caractere, a letra deve ser colocada usando aspas simples ' '
		System.out.println(letra); 
		
		char valor = 66;
		System.out.println(valor); //O char é uma varíavel de números inteiros parecida com o short, porém ela transforma os números recebidos em caracteres utilizando a tabela ASCII
		
		valor = (char) (valor + 1); //Caso eu faça uma operação com o char dará erro, pois um número que pertence a varíavel int não cabe em um char, porém um char cabe em um int, então para resolver esse problema eu preciso sinalizar para o Java que o resultado esperado é um char, assim ele faz a soma e me devolve o próximo caracter da tabela ASCII
		System.out.println(valor);
		
		String palavra = "Alura cursos online de tecnologia"; //Para armazenar algo em uma String é preciso utilizar aspas duplas " " / String não é uma palavra chave do tipo varíavel, mas sim do tipo referência
		System.out.println(palavra);
		
		palavra = palavra + 2022; //Ao fazer uma soma com uma string mais qualquer outra coisa o Java irá transformar esse segundo elemento em uma string para fazer a concatenação dos dois
		System.out.println(palavra);
	}
}
