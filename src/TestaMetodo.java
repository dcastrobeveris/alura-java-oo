
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoDiego = new Conta();
		contaDoDiego.saldo = 100;
		contaDoDiego.deposita(50);
		System.out.println(contaDoDiego.saldo);
	}

}
