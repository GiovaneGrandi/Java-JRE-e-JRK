package sintaxe_variaveis_e_fluxo;

public class TesteIR {
	    public static void main(String[] args) {

	        double salario = 1900.0;

	        if(salario >= 1900 && salario <= 2800) {
	            System.out.println("A sua aliquota é de 7,5%");
	            System.out.println("Você pode deduzir até R$ 142");
	        }
	        
	        if(salario >= 2800.01 && salario <= 3751.0) {
	            System.out.println("A sua aliquota é de 15%");
	            System.out.println("Você pode deduzir até R$ 350");
	        }
	        
	        if(salario >= 3751.01 && salario <= 4664.00) {
	            System.out.println("A sua aliquota é de 22.5%");
	            System.out.println("Você pode deduzir até R$ 636");
	        }
	        
	    }
	}