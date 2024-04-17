import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu peso:");
		int peso = teclado.nextInt();
		System.out.println("Digite sua altura:");
		double altura = teclado.nextDouble();
		double imc = peso / (altura * altura);
		System.out.println("Seu IMC é " + imc);
		
		
	}
	
	
	
	}

