package sintaxe_variaveis_e_fluxo;

public class TestaValores {
	public static void main(String[] args) { //Ao escrever apenas main e usar o atalho "ctrl + espaço" ele sugere o auto complete do método "public static void main" /O "ctrl + espaço" é usado para fazer o auto complete dos comandos no Java
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//Quanto vale o segundo?
		//Nesse exemplo o segundo continua valendo 5 pois o segundo acaba armazenando o valor que era carregado pelo primeiro, então o primeiro mudar seu valor não interfere em nada o segundo por ele já ter seu valor definido antes. "Variaveis guardam valores e não referências"
		
		System.out.println(segundo);
	}
}
