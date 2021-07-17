
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoDiego = new Conta();
		contaDoDiego.saldo = 100;
		contaDoDiego.deposita(50);
		System.out.println(contaDoDiego.saldo);
		boolean conseguiuRetirar = contaDoDiego.saca(20);
		System.out.println(contaDoDiego.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaAna = new Conta();
		contaDaAna.deposita(1000);
		boolean sucessoTransferencia = contaDaAna.transfere(300, contaDoDiego);
		if(sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaAna.saldo);
		System.out.println(contaDoDiego.saldo);
	}

}
