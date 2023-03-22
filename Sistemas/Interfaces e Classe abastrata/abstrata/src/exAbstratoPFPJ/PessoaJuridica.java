package exAbstratoPFPJ;

public class PessoaJuridica extends Pessoa {
    private String CNPJ;
   
    public String getCNPJ() {
        return CNPJ;
    }


    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }


    public PessoaJuridica() {
       
    }
   
    public PessoaJuridica(int id, String nome, String email, String cnpj) {
        super(id, nome, email);
        this.CNPJ = cnpj;
    }
    
    public String dados() {
    	return "ID: " + getId() + "CPF: " + getCNPJ();
    }


}
