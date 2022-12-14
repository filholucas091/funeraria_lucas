import java.sql.Connection;
import java.sql.SQLException;

public interface Operacoes {
    public void adicionarCliente(Connection con, CadastroCliente c) throws SQLException;
    public void excluirCliente(Connection con, String identifier) throws SQLException;
    public void alterarClienteNome(Connection con, String identifier, String novoNome) throws SQLException;
    public void alterarClienteNomeBeneficiario1(Connection con, String identifier, String novoNomeBeneficiario1) throws SQLException;
    public void alterarClienteNomeBeneficiario2(Connection con, String identifier, String novoNomeBeneficiario2) throws SQLException;
    public void alterarClienteRg(Connection con, String identifier, String novoRg) throws SQLException;
    public void alterarClienteCpf(Connection con, String identifier, String novoCpf) throws SQLException;
    public void alterarClienteContaBancaria(Connection con, String identifier, String novaContaBancaria) throws SQLException;   
    public void alterarClienteNumTelefone(Connection con, String identifier, int novoNumTelefone) throws SQLException;
    public void alterarClienteTipoPlano(Connection con, String identifier, String novoTipoPlano) throws SQLException;
	

    public void adicionarFuncionario(Connection con, CadastroFuncionarios f) throws SQLException;
    public void excluirFuncionario(Connection con, String identifier) throws SQLException;
    public void alterarFuncionarioNome(Connection con, String identifier, String novoNome) throws SQLException;
    public void alterarFuncionarioRg(Connection con, String identifier, String novoRg) throws SQLException;
    public void alterarFuncionarioCpf(Connection con, String identifier, String novoCpf) throws SQLException;
    public void alterarFuncionarioNumTelefone(Connection con, String identifier, int novoNumTelefone) throws SQLException;
    public void alterarFuncionarioSalario(Connection con, String identifier, double novoSalario) throws SQLException;
    public void alterarFuncionarioCargo(Connection con, String identifier, String novoCargo) throws SQLException;


    public void adicionarProduto(Connection con, CadastroProduto p) throws SQLException;
    public void excluirProduto(Connection con, String identifier) throws SQLException;
    public void alterarProdutoTipoPlano(Connection con, String identifier, String novoTipoPlano) throws SQLException;
    public void alterarProdutoValorPlano(Connection con, String identifier, double novoValorPlano) throws SQLException;
    public void alterarProdutoQtdParcelas(Connection con, String identifier, int novaQtdParcelas) throws SQLException;


    public void adicionarVenda(Connection con, CadastroVendas v) throws SQLException;
    public void excluirVenda(Connection con, String identifier1, String identifier2, String identifier3) throws SQLException;
    public void alterarVendaNomeCliente(Connection con, String identifier1, String identifier2, String identifier3, String novoNome) throws SQLException;
    public void alterarVendaNomeFuncionario(Connection con, String identifier1, String identifier2, String identifier3, String novoNomeFuncionario) throws SQLException;
    public void alterarVendaTipoPlano(Connection con, String identifier1, String identifier2, String identifier3, String novoTipoPlano) throws SQLException;
}
