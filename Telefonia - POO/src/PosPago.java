import java.util.GregorianCalendar;

public class PosPago extends Assinante{
	
	private float assinatura;

	public PosPago(long cpf, String nome, int numero, float assinatura) {
		super(cpf, nome, numero);
		this.assinatura = assinatura;
	}
	
	public void fazerChamada(GregorianCalendar data, int duracao) {
		
		float valorMinuto = 1.04f; 
		float valorChamada = valorMinuto*duracao; 
		
		if (chamadas.length>numChamadas) {
			
			Chamada chamada = new Chamada(data, duracao);
			chamadas[numChamadas] = chamada;
			numChamadas++;
		}
		else {
			
			System.out.println("Não foi possível realizar a chamada!");
			
		}
	}
	
	public void imprimirFatura(int mes) {
		
		
	}

}
