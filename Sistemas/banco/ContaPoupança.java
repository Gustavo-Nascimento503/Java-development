package banco;

public class ContaPoupança extends Conta {
	private double rentabilidade;
	 
    public double getRentabilidade() {
        return rentabilidade;
    }
 
    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
   
    public ContaPoupança() {
    }
   
    public ContaPoupança(String agencia,String numero, double rentabilidade) {
        super(numero, agencia);
       
        this.rentabilidade = rentabilidade;
    }

}