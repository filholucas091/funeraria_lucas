import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Implementacao implements Operacoes{
    //-----------------------adicionar------------------------------------
	@Override
	public void adicionarCliente(Connection con, CadastroCliente c) throws SQLException{
		String comando = "insert into Cliente(nomeCliente, beneficiario1, beneficiario2, rgCliente, cpfCliente, contaBancaria, numTelefoneCliente, tipoPlano) values (?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, c.getNomeCliente());
		pstm.setString(2, c.getBeneficiario1());
		pstm.setString(3, c.getBeneficiario2());
		pstm.setString(4, c.getRgCliente());
		pstm.setString(5, c.getCpfCliente());
		pstm.setString(6, c.getContaBancaria());
		pstm.setInt(7, c.getNumTelefoneCliente());
		pstm.setString(8, c.getTipoPlano());
		
	}

	@Override
	public void adicionarFuncionario(Connection con, CadastroFuncionarios f) throws SQLException{
		String comando = "insert into Funcionario(nomeFuncionario, rgFuncionario, cpfFuncionario, numTelefoneFuncionario, salarioFuncionario, cargoFuncionario) values (?, ?, ?, ?, ?, ?)";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, f.getNomeFuncionario());
		pstm.setString(2, f.getRgFuncionario());
		pstm.setString(3, f.getCpfFuncionario());
		pstm.setInt(4, f.getNumTelefoneFuncionario());
		pstm.setDouble(5, f.getSalarioFuncionario());
		pstm.setString(6, f.getCargoFuncionario());
		
	}

	@Override
	public void adicionarProduto(Connection con, CadastroProduto p) throws SQLException{
		String comando = "insert into Produto(tipoPlano, valorPlano, qtdParcelas) values (?, ?, ?)";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, p.getTipoPlano());
                pstm.setDouble(2, p.getValorPlano());
                pstm.setInt(3, p.getQtdParcelas());
	}

	@Override
	public void adicionarVenda(Connection con, CadastroVendas v) throws SQLException{
		String comando = "insert into Vendas(nomeCliente, nomeFuncionario, tipoPlano) values (?, ?, ?)";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, v.getNomeCliente());
                pstm.setString(2, v.getNomeFuncionario());
                pstm.setString(3, v.getTipoDePlano());
		
	}




//----------------------------excluir-----------------------------

	@Override
	public void excluirCliente(Connection con, String identifier) throws SQLException{
		String comando = "delete from Cliente where cpfCliente = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, identifier);
	}
	
	@Override
	public void excluirFuncionario(Connection con, String identifier) throws SQLException{
		String comando = "delete from Funcionario where cpfFuncionario = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, identifier);
	}
	
	@Override
	public void excluirProduto(Connection con, String identifier) throws SQLException{
		String comando = "delete from Produto where tipoPlano = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, identifier);
	}

	@Override
	public void excluirVenda(Connection con, String identifier1, String identifier2, String identifier3) throws SQLException{
		String comando = "delete from Vendas where nomeCliente = ? and nomeFuncionario = ? and tipoPlano = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, identifier1);
		pstm.setString(2, identifier2);
		pstm.setString(3, identifier3);
	}


//--------------------------alterar-----------------------------------------

	//--------------------------alterarCliente----------------------------------

	@Override
	public void alterarClienteNome(Connection con, String identifier, String novoNome) throws SQLException{
		String comando = "update cliente set nome = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoNome);
		pstm.setString (2, identifier);
	}
	
	@Override
	public void alterarClienteNomeBeneficiario1(Connection con, String identifier, String novoNomeBeneficiario1) throws SQLException{
		String comando = "update cliente set nomeBeneficiario1 = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoNomeBeneficiario1);
		pstm.setString(2, identifier);
	}

	@Override
	public void alterarClienteNomeBeneficiario2(Connection con, String identifier, String novoNomeBeneficiario2) throws SQLException{
		String comando = "update cliente set nomeBeneficiario2 = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoNomeBeneficiario2);
		pstm.setString(2, identifier);
	}

	@Override
	public void alterarClienteRg(Connection con, String identifier, String novoRg) throws SQLException{
		String comando = "update cliente set rg = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoRg);
		pstm.setString(2, identifier);
	}

	@Override
	public void alterarClienteCpf(Connection con, String identifier, String novoCpf) throws SQLException{
		String comando = "update cliente set cpf = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoCpf);
		pstm.setString(2, identifier);
	}

	@Override
	public void alterarClienteContaBancaria(Connection con, String identifier, String novaContaBancaria) throws SQLException{
		String comando = "update cliente set contaBancaria = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novaContaBancaria);
		pstm.setString(2, identifier);
	}

	@Override
	public void alterarClienteNumTelefone(Connection con, String identifier, int novoNumTelefone) throws SQLException{
		String comando = "update cliente set numTelefone = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setInt(1, novoNumTelefone);
		pstm.setString(2, identifier);
	}
	
	@Override
	public void alterarClienteTipoPlano(Connection con, String identifier, String novoTipoPlano) throws SQLException{
		String comando = "update cliente set tipoPlano = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoTipoPlano);
		pstm.setString(2, identifier);
	}

	
	//-------------------------------alterarFuncionario-------------------------------------
	
	@Override
	public void alterarFuncionarioNome(Connection con, String identifier, String novoNome) throws SQLException{
		String comando = "update funcionario set nome = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoNome);
		pstm.setString(2, identifier);
	}
	
	@Override
	public void alterarFuncionarioRg(Connection con, String identifier, String novoRg) throws SQLException{
		String comando = "update funcionario set rg = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoRg);
		pstm.setString(2, identifier);
	}
	
	@Override
	public void alterarFuncionarioCpf(Connection con, String identifier, String novoCpf) throws SQLException{
		String comando = "update funcionario set cpf = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoCpf);
		pstm.setString(2, identifier);
	}

	@Override
	public void alterarFuncionarioNumTelefone(Connection con, String identifier, int novoNumTelefone) throws SQLException{
		String comando = "update funcionario set numTelefone = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setInt(1, novoNumTelefone);
		pstm.setString(1, identifier);
	}
	
	@Override
	public void alterarFuncionarioSalario(Connection con, String identifier, double novoSalario) throws SQLException{
		String comando = "update funcionario set salario = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setDouble(1, novoSalario);
		pstm.setString(1, identifier);
	}
	
	@Override
	public void alterarFuncionarioCargo(Connection con, String identifier, String novoCargo) throws SQLException{
		String comando = "update funcionario set cargo = ? where cpf = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoCargo);
		pstm.setString(1, identifier);
	}



	//------------------------------alterarProduto---------------------------------------

	@Override
	public void alterarProdutoTipoPlano(Connection con, String identifier, String novoTipoPlano) throws SQLException{
		String comando = "update produto set tipoPlano = ? where tipoPlano = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoTipoPlano);
		pstm.setString(1, identifier);
	}
	
	@Override
	public void alterarProdutoValorPlano(Connection con, String identifier, double novoValorPlano) throws SQLException{
		String comando = "update produto set valorPlano = ? where tipoPlano = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setDouble(1, novoValorPlano);
		pstm.setString(1, identifier);
	}

	@Override
	public void alterarProdutoQtdParcelas(Connection con, String identifier, int novaQtdParcelas) throws SQLException{
		String comando = "update produto set qtdParcelas = ? where tipoPlano = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setInt(1, novaQtdParcelas);
		pstm.setString(1, identifier);
	}




	//------------------------------alterarVenda-----------------------------------------

	@Override
	public void alterarVendaNomeCliente(Connection con, String identifier1, String identifier2, String identifier3, String novoNomeCliente) throws SQLException{
		String comando = "update vendas set nomeCliente = ? where nomeCliente = ? and nomeFuncionario = ? and tipoPlano = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoNomeCliente);
		pstm.setString(2, identifier1);
		pstm.setString(3, identifier2);
		pstm.setString(4, identifier3);
	}

	@Override
	public void alterarVendaNomeFuncionario(Connection con, String identifier1, String identifier2, String identifier3, String novoNomeFuncionario) throws SQLException{
		String comando = "update vendas set tipoPlano = ? where nomeCliente = ? and nomeFuncionario = ? and tipoPlano = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoNomeFuncionario);
		pstm.setString(2, identifier1);
		pstm.setString(3, identifier2);
		pstm.setString(4, identifier3);
	}


	@Override
	public void alterarVendaTipoPlano(Connection con, String identifier1, String identifier2, String identifier3, String novoTipoPlano) throws SQLException{
		String comando = "update vendas set tipoPlano = ? where nomeCliente = ? and nomeFuncionario = ? and tipoPlano = ?";
		PreparedStatement pstm = con.prepareStatement(comando);
		pstm.setString(1, novoTipoPlano);
		pstm.setString(2, identifier1);
		pstm.setString(3, identifier2);
		pstm.setString(4, identifier3);
	}
}
