package bancoExercicioTres;

public class Conta {
	int conta;
	String titular;
	float saldo;
	float limite;
	
	void info() {
		System.out.println("O titular da conta é: " +titular);
		System.out.println("Numero: " + conta);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
	};
	
	boolean sacar(double valor) {
		if(valor > limite || valor > saldo || valor <=0) {
			return false;	
		}
		
		saldo -= valor;
		return true;
	};
	
	boolean depositar(double valor) {
		if(valor<=0) {
			return false;
		}
		
		saldo += valor;
		return true;
	}

	public Conta(int conta, String titular, float saldo, float limite) {
		super();
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	};
	
	
	

}
