package banco_2;

public class ContaBancaria {
    private String agencia;
    private String numero;
    private double saldo;
   
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
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
   
    public ContaBancaria() {
       
    }
   
    public ContaBancaria(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
    }
 
    public void Depositar(double valor) {
        this.saldo = this.saldo + valor;
        //this.saldo =+ valor;
    }
   
    public Boolean Sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }
        else {
            return false;
        }
    }
   
    public void Transferir(double valorTransf, Cliente destinatario) {
        Sacar(valorTransf);
        destinatario.getConta().Depositar(valorTransf);
    }
   
    public double ConsultarSaldo() {
        return this.saldo;
    }
 
}

