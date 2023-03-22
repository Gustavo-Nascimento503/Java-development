package exInterfacePFPJ.copy;

public class PessoaFisica extends Pessoa implements PessoaInterface{
    private String CPF;


    public String getCPF() {
        return CPF;
    }


    public void setCPF(String cPF) {
        CPF = cPF;
    }


    public PessoaFisica() {
        super();
    }


    public PessoaFisica(int id, String nome, String email, String cpf) {
        super(id, nome, email);
        this.CPF = cpf;
    }
    
    public String dados() {
    	return "ID: " + getId() + "CPF: " + getCPF();
    }
}

