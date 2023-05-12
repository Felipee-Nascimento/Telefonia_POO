import java.util.Scanner;

public class Telefonia {

	private int numPrePagos;
	private int numPosPagos;
	private PrePago[] prePagos;
	private PosPago[] posPagos;
	
	
	public  Telefonia() {
		this.prePagos = new PrePago[10];
		this.posPagos = new PosPago[10];
		
	}
	
	public void cadastrarAssinante() {
		
		
		
	}
	
	public void listarAssinantes() {
		System.out.println("Pré-pagos");		
		for(int i =0; i > this.prePagos.length; i ++) {
			if(this.prePagos[i] != null) {
				System.out.println(prePagos[i]);
			}
		}
		
		
		System.out.println("Pos pagos");
		for(int i =0; i > this.prePagos.length; i ++) {
			if(this.prePagos[i] != null) {
				System.out.println(prePagos[i]);
			}
		}

	}
	
	public void fazerChamada() {
		
		
	}
	
	public void fazerRecarga() {
		
		
	}
	
	public PrePago localizarPrePago(long cpf) {
		
		
	}
	
	public PosPago localizarPosPago(long cpf) {
		
		
	}
	
	
	public void imprimirFaturas() {
		
		
		
		
	}
	
	
	public static void main(String [] args) {
		
		Telefonia telefonia = new Telefonia();
		Scanner scanner = new Scanner(System.in);
	}
}
