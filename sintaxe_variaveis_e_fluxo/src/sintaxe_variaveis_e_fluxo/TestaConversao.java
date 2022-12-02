package sintaxe_variaveis_e_fluxo;

public class TestaConversao {
	
	public static void main(String[] args) {
		
		double salario = 1270.50;
		
		int valor = (int) salario; //Ao colocar o (int) antes do valor da variavel ele indica ao Java para tentar forçar esse valor de qualquer jeito dentro da int, fazendo com que ele remova as casas decimais
		System.out.println(valor); //O casting é quando você faz uma conversão que não aconteceria de forma autômatica
		
		long numeroGrande = 20000000000L; //O long é usado para declarar uma variavel que passe de 2 bilhões, pelo número ser muito pesado ele não cabe dentro do int
		short valorPequeno = 5000; //O short é usado para guardar valores pequenos
		byte ValorMuitoPequeno = 100; //O byte é usado para valores ainda menores, o seu limite é de 127 e de -128
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2; //O double não é usado quando o valor armazenado é uma quantia de dinheiro porque a sua soma pode se mostrar problemática
		System.out.println(total); //O resultado 0.30000000000000004 quando se faz essa soma aparece em diversas linguagens por conta de um comportamento em comum
		
	}

}
