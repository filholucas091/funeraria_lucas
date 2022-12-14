public class CadastroProduto {
    private String tipoPlano;
    private double valorPlano;
    private int qtdParcelas;

    public CadastroProduto(String tipoPlano, double valorPlano, int qtdParcelas) {
        this.tipoPlano = tipoPlano;
        this.valorPlano = valorPlano;
        this.qtdParcelas = qtdParcelas;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public double getValorPlano() {
        return valorPlano;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public void setValorPlano(double valorPlano) {
        this.valorPlano = valorPlano;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }
   
   
}
