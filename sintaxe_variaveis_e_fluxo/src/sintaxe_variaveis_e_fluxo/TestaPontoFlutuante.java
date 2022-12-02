package sintaxe_variaveis_e_fluxo;

public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario; //O double é usado para armazenar números quebrados, com casas decimais, além também de conseguir armazernar números inteiros
		salario = 1250.70; 
		System.out.println("Meu salário é de " + salario);
		
		double divisao = 3.14 / 2; //Declarando a variavel e armazenando o valor no mesmo comando
		System.out.println("O resultado da divisão é: " + divisao);
		
		int outraDivisao = 5 / 2; //Quando um int tenta fazer um cálculo onde o resultado é um número quebrado ele travará esse número de forma que ele fique um resultado inteiro
		System.out.println(outraDivisao); //O resultado que era pra ser 2.5 virou 2 por conta do int não comportar números quebrados, para o Java inteiro + inteiro = inteiro
		
		double novaTentativa = 5 / 2; //O Java começa a leitura de código pela direita, portanto ele fará o cálculo antes de saber se é double ou não, por isso o resultado foi empurrado para 2 ainda assim
		System.out.println(novaTentativa);
		
		double agoraVai = 5 / 2.0; //Ao colocar um dos números como quebrado o Java já percebe que se trata de um double então tratará o resultado como sendo um double
		System.out.println(agoraVai);
	}

}
