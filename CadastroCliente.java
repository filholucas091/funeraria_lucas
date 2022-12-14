public class CadastroCliente {
    private String nomeCliente;
    private String beneficiario1;
    private String beneficiario2;
    private String rgCliente;
    private String cpfCliente;
    private String contaBancaria;
    private int numTelefoneCliente;
    private String tipoPlano; //fk de CadastroProduto;

    public CadastroCliente(String nomeCliente, String beneficiario1, String beneficiario2, String rgCliente, String cpfCliente, String contaBancaria, int numTelefoneCliente, String tipoPlano) {
        this.nomeCliente = nomeCliente;
        this.beneficiario1 = beneficiario1;
        this.beneficiario2 = beneficiario2;
        this.rgCliente = rgCliente;
        this.cpfCliente = cpfCliente;
        this.contaBancaria = contaBancaria;
        this.numTelefoneCliente = numTelefoneCliente;
        this.tipoPlano = tipoPlano;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getBeneficiario1() {
        return beneficiario1;
    }

    public String getBeneficiario2() {
        return beneficiario2;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public int getNumTelefoneCliente() {
        return numTelefoneCliente;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setBeneficiario1(String beneficiario1) {
        this.beneficiario1 = beneficiario1;
    }

    public void setBeneficiario2(String beneficiario2) {
        this.beneficiario2 = beneficiario2;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public void setNumTelefoneCliente(int numTelefoneCliente) {
        this.numTelefoneCliente = numTelefoneCliente;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
}
