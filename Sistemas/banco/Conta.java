package banco;

public class Conta {
	private String agencia;
    private String numero;
    private double saldo;
   
    public String getAgencia() {
        return agencia;
    }
 
    public String getNumero() {
        return numero;
    }
 
    public void setNumero(String numero) {
        this.numero = numero;
    }
 
    public double getSaldo() {
        return saldo;
    }
 
    protected String exibirMensagem() {
        return "Bem vindo ao Internet Banking do Gustavo!";
    }  
   
    Conta(){
       this.agencia = "001";
       this.saldo = 0.0;
    }
   
    Conta(String numero, String agencia){
        this.agencia = "001";
        this.numero = numero;
        this.saldo = 0;
    }
}
