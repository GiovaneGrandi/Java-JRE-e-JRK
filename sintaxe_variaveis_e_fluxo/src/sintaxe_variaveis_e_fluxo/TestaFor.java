package sintaxe_variaveis_e_fluxo;

public class TestaFor {
	public static void main(String[] args) {
		for(int contador = 0; contador <= 10; contador++) { //O for assim como no JS no Java ele tem uma aparência mais enxuta, mostrando todas informações básicas nos "()" separando cada atribuição por um ";"
			System.out.println(contador); //Caso eu queira chamar uma varíavel inicializada no for fora dele não será possível, o for oferece uma varíavel que se mantém a cada iteração mas que só funciona dentro do for, em casos onde se usa uma varíavel apenas para o loop é mais recomendável usar o for
		}
	}
}
