import java.util.GregorianCalendar;

public class PrePago extends Assinante{

	 private Recarga[] recargas;
	 private int numRecargas;
	 private float creditos;

	public PrePago(long cpf, String nome, int numero) {
		super(cpf, nome, numero);
		this.recargas = new Recarga[100];
		this.numRecargas = 0;
		this.creditos = 0f;
	}
	
	public void fazerChamada(GregorianCalendar data, int duracao){
		
		float valorMinuto = 1.45f; 
		float valorChamada = valorMinuto*duracao; 
		
		if (chamadas.length>numChamadas && creditos>=valorChamada) {
			
			Chamada chamada = new Chamada(data, duracao);
			chamadas[numChamadas] = chamada;
			numChamadas++;
			creditos = creditos-valorChamada;
		}
		else {
			
			System.out.println("Não foi possível realizar a chamada!");
			
		}
	}
	
	public void recarregar(GregorianCalendar data, float valor) {
		
		if(recargas.length<=100) {
			
			Recarga recarga = new Recarga(data, valor);
					recargas[numRecargas] = recarga;
					numRecargas++;
					creditos=creditos+valor;
		}
		else {
			System.out.println("Não foi possível realizar a recarga!");
		}
		
	}
	
	public void imprimirFatura(int mes) {
		//super(cpf, nome, numero);
		System.out.println();
		
	}
}
