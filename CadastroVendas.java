public class CadastroVendas {
    private String nomeCliente; // FK de cadastroCliente
    private String nomeFuncionario; // FK de cadastroFuncionario;
    private String tipoPlano; //FK de cadastroProduto;

    public CadastroVendas(String nomeCliente, String nomeFuncionario, String tipoPlano) {
        this.nomeCliente = nomeCliente;
        this.nomeFuncionario = nomeFuncionario;
        this.tipoPlano = tipoPlano;
    }
    
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getTipoDePlano() {
        return tipoPlano;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setTipoDePlano(String tipoDePlano) {
        this.tipoPlano = tipoDePlano;
    }

}
