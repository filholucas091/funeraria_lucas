public class CadastroFuncionarios {
    private String nomeFuncionario;
    private String rgFuncionario;
    private String cpfFuncionario;
    private int numTelefoneFuncionario;
    private double salarioFuncionario;
    private String cargoFuncionario;

    public CadastroFuncionarios(String nomeFuncionario, String rgFuncionario, String cpfFuncionario, int numTelefoneFuncionario, double salarioFuncionario, String cargoFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.rgFuncionario = rgFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.numTelefoneFuncionario = numTelefoneFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.cargoFuncionario = cargoFuncionario;
    }
    
    

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getRgFuncionario() {
        return rgFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public int getNumTelefoneFuncionario() {
        return numTelefoneFuncionario;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setRgFuncionario(String rgFuncionario) {
        this.rgFuncionario = rgFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public void setNumTelefoneFuncionario(int numTelefoneFuncionario) {
        this.numTelefoneFuncionario = numTelefoneFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }
   
   
}
