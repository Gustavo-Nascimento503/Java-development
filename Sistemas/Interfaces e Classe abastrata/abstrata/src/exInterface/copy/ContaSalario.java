package exInterface.copy;

public class ContaSalario extends Conta implements ContaBancaria{
	 private double salario;
	   
	    public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


		public ContaSalario() {
	    	super();
	    }
	    
	   
	    public ContaSalario(String agencia, String numero, double saldo, double salario) {
	        super(agencia, numero, saldo);
	       
	        this.salario = salario;
	    }
	    
	    public String exibirDadosConta() {
	        return "Tipo de Conta: Conta Poupança\n" + super.exibirDadosConta() + "\nRentabilidade: " + salario;
	    }
	    
	    public void Depositar(double valor) {
	    	valor = valor * (1+salario);
	    	
	        super.Depositar(valor);
	    }
	    
	    public Boolean Sacar(double valor) {
	    	if ((getSaldo() + getSalario()) >= valor) {
	    		if (valor > getSaldo()) {
	                valor = valor - getSaldo();
	                
	    			Sacar(getSaldo());		
	    		
	    			salario = salario - valor;    		
	    		}
	    		else {
	    			Sacar(valor);
	    		}
	            return true;
	    	}
	    	else {
	    		return false;
	    	}
	    }
	}
