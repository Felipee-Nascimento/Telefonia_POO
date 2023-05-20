import java.util.GregorianCalendar;

public class PosPago extends Assinante{
	
	private float assinatura;

	public PosPago(long cpf, String nome, int numero) {
		super(cpf, nome, numero);
	}
	
	public void fazerChamada(GregorianCalendar date, int duracao) {
		
		float valorMinuto = 1.04f; 
		float valorChamada = valorMinuto*duracao; 
		
		if (chamadas.length>numChamadas) {
			
			Chamada chamada = new Chamada(date, duracao);
			chamadas[numChamadas] = chamada;
			numChamadas++;
			this.assinatura += valorChamada;
		}
		else {	
			
			System.out.println("Não foi possível realizar a chamada!");
			
		}
	}
	
	public void imprimirFatura(int mes) {
		
		System.out.println("CPF: " + getCpf());
		System.out.println("Nome: " + getNome());
		System.out.println("Numero: " + getNumero());
		
	}

}
