import java.util.Scanner;

public class Telefonia {

	private int numPrePagos;
	private int numPosPagos;
	private PrePago[] prePagos;
	private PosPago[] posPagos;
	
	

	public Telefonia() {
		this.numPrePagos = numPrePagos;
		this.numPosPagos = numPosPagos;
		this.prePagos = new PrePago[20];
		this.posPagos = new PosPago[20];
	}

	public void cadastrarAssinante() {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Menu");
		System.out.println(" 1. PrePago");
		System.out.println(" 2. PrePago");
		int opcao = scanner.nextInt();
		
 		System.out.println("Digite o CPF");
		long cpf = scanner.nextLong();
		System.out.println("Digite o nome");
		String nome = scanner.nextLine();
		System.out.println("Digite o numero");
		int numero = scanner.nextInt();
		
		switch (opcao) {
	     case 1:
	    	 
	    	 if (numPrePagos < prePagos.length) {
	                prePagos[numPrePagos] = new PrePago(cpf, nome, numero);
	                numPrePagos++;
	                System.out.println("Assinante pré-pago cadastrado com sucesso!");
	            } else {
	                System.out.println("Não foi possível cadastrar o assinante. Limite máximo de assinantes pré-pagos atingido.");
	            }
			
	       break;
	       
	     case 2:

	            if (numPosPagos < posPagos.length) {
	                posPagos[numPosPagos] = new PosPago(cpf, nome, numero);
	                numPosPagos++;
	                System.out.println("Assinante pós-pago cadastrado com sucesso!");
	            } else {
	                System.out.println("Não foi possível cadastrar o assinante. Limite máximo de assinantes pós-pagos atingido.");
	            }
			
	       break;
	       
	     default:
	         System.out.println("O número escolhido é inválido! Digite o número 1 ou 2!");
		
		}
		
	}
	
	public void listarAssinantes() {
		
		System.out.println("Pré-pagos");		
		for(int i =0; i < this.prePagos.length; i ++) {
			if(this.prePagos[i] != null) {
				System.out.println(prePagos[i]);
			}
		}
		
		
		System.out.println("Pos pagos");
		for(int i =0; i< this.posPagos.length; i ++) {
			if(this.posPagos[i] != null) {
				System.out.println(posPagos[i]);
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
		
		while (true) {
	        System.out.println("Selecione uma opção:");
	        System.out.println("1 - Cadastrar assinante");
	        System.out.println("2 - Listar assinantes");
	        System.out.println("3 - Fazer chamada");
	        System.out.println("4 - Fazer recarga");
	        System.out.println("5 - Imprimir faturas");
	        System.out.println("0 - Sair");

	        int opcao = scanner.nextInt();

	        if (opcao == 0) {
	            break;
	        }

	        switch (opcao) {
	            case 1:
	                telefonia.cadastrarAssinante();
	                break;
	            case 2:
	                telefonia.listarAssinantes();
	                break;
	            case 3:
	                telefonia.fazerChamada();
	                break;
	            case 4:
	                telefonia.fazerRecarga();
	                break;
	            case 5:
	                telefonia.imprimirFaturas();
	                break;
	            default:
	                System.out.println("Opção inválida!");
	        }
	    }
	}
		
	}
