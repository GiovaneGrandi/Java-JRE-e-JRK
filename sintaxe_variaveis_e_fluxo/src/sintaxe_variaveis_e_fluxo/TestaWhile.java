package sintaxe_variaveis_e_fluxo;

public class TestaWhile {
	public static void main(String[] args) {
		
		int contador = 0; //Para o while ou qualquer outra função funcionar a varíavel deve ser inicializada com o seu valor, pois no Java as varíaveis não tem um valor default
		
		while(contador <= 10) {
			System.out.println(contador);
			contador++; //O operador "+=" serve para fazer uma adição sobre a varíavel em si mesma, por extenso seria: contador = contador + 1 / Também funciona usar o "++" para adicionar apenas mais uma unidade
		}
		System.out.println(contador); //Ao chamar o contador fora do while ele acaba reutilizando o último número que foi descartado por ele, por ser maior que 10
	}
}
