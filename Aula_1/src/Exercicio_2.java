import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos soldados Leônidas e seus 300 soldados enfrentaram ?");
		int qnt = teclado.nextInt();
		if (qnt <10000) {
			System.out.println("Seu palpite foi abaixo, Leonidas e seu exército enfrentaram 10.000 soldados inimigos");}
		else if(qnt>10000) {
				System.out.println("Nem tanto! Leônidas e seu exército enfentaram 10.000 soldados inimigos");}
		else{
				System.out.println("Parabéns, você acertoi");
				}
			
		}
		
	}
