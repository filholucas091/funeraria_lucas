import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfaceGrafica {
    //intancia-se aqui um novo objeto da classe ConexaoBD para conectar-se ao banco de dados

Connection con = null;
ConexaoBD c = new ConexaoBD();
c.conexao();


//-----------instancia-se aqui um novo objeto da interface Operacoes para operar com o banco de dados---------
	Operacoes o = new Implementacao();








//------------------Pergunta introdutória para saber o que o usuário deseja fazer-----------------------
	String introducao = JOptionPane.showInputDialog("Você deseja: \n1 - Adicionar algo \n2 - Excluir algo \n3 - Alterar dados de algo ");
        int i = Integer.parseInt(introducao);


//------------------Concretização das opções apresentadas na pergunta introdutória----------------------


//--------------Caso ele queira adicionar algo: --------------------------------
	
	if(i == 1){
	
	//-----------------Pergunta para saber o que ele deseja adicionar-------------------------
		String adicionar = JOptionPane.showInputDialog("Você deseja adicionar: \n1 - Cliente \n2 - Funcionario \n3 - Produto \n4 - Venda");
                int a = Integer.parseInt(adicionar);
                
		//-------------------------adicionar cliente--------------------------------
		if (a == 1){
			
                        
                        String nomeCliente = JOptionPane.showInputDialog("Nome do Cliente: ");
			String nomeBeneficiario1 = JOptionPane.showInputDialog("Nome do Beneficiário1: ");
			String nomeBeneficiario2 = JOptionPane.showInputDialog("Nome do Beneficiário2: ");
			String rgCliente = JOptionPane.showInputDialog("RG do Cliente: ");
			String cpfCliente = JOptionPane.showInputDialog("CPF do Cliente: ");
			String contaBancaria = JOptionPane.showInputDialog("Conta Bancária do Cliente: ");
			String numTelefoneCliente = JOptionPane.showInputDialog("Número de Telefone do Cliente: ");
			String tipoPlano = JOptionPane.showInputDialog("Tipo de Plano de Cliente: ");
                        
                        int numTelefone = Integer.parseInt(numTelefoneCliente);
			
			CadastroCliente c = new CadastroCliente(nomeCliente, nomeBeneficiario1, nomeBeneficiario2, rgCliente, cpfCliente, contaBancaria, numTelefone, tipoPlano);
                    try {
                        o.adicionarCliente(con, c);
                    } catch (SQLException ex) {
                        Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                    }
			
		}

		//-------------------------adicionar funcionario--------------------------------
		if (a == 2){
			String nomeFuncionario = JOptionPane.showInputDialog("Nome do Funcionário: ");
			String rgFuncionario = JOptionPane.showInputDialog("RG do Funcionário: ");
			String cpfFuncionario = JOptionPane.showInputDialog("CPF do Funcionário: ");
			String numTelefoneFuncionario = JOptionPane.showInputDialog("Número de Telefone do Funcionário: ");
			String salarioFuncionario = JOptionPane.showInputDialog("Salario do Funcionário: ");
			String cargoFuncionario = JOptionPane.showInputDialog("Cargo do Funcionário: ");
                        
                        int num = Integer.parseInt(numTelefoneFuncionario);
                        double salario = Double.parseDouble(salarioFuncionario);

			CadastroFuncionarios f = new CadastroFuncionarios(nomeFuncionario, rgFuncionario, cpfFuncionario, num, salario, cargoFuncionario);
                    try {
                        o.adicionarFuncionario(con, f);
                    } catch (SQLException ex) {
                        Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                    }

		}

		//-------------------------adicionar produto-----------------------------
		if (a == 3){
			String tipoPlano = JOptionPane.showInputDialog("Tipo do Plano: ");
			String valorPlano = JOptionPane.showInputDialog("Valor do Plano: ");
			String qtdParcelas = JOptionPane.showInputDialog("Quantidade de Parcelas do Plano: ");
                        
                        double valor = Double.parseDouble(valorPlano);
                        int qtd = Integer.parseInt(qtdParcelas);

			CadastroProduto p = new CadastroProduto(tipoPlano, valor, qtd);
                    try {
                        o.adicionarProduto(con, p);
                    } catch (SQLException ex) {
                        Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                    }

		}

		//-------------------------adicionar venda-------------------------------
		if (a == 4){
			String nomeCliente = JOptionPane.showInputDialog("Nome do Cliente: ");
			String nomeFuncionario = JOptionPane.showInputDialog("Nome do Funcionário: ");
			String tipoPlano = JOptionPane.showInputDialog("Tipo de Plano: ");
			
			CadastroVendas v = new CadastroVendas(nomeCliente, nomeFuncionario, tipoPlano);
                    try {
                        o.adicionarVenda(con, v);
                    } catch (SQLException ex) {
                        Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}
	}


//---------------------------caso ele queira excluir algo------------------------------------

	if(i == 2){

	//-----------------pergunta para saber o que ele deseja excluir--------------------
		String excluir = JOptionPane.showInputDialog("Você deseja excluir: \n1 - Cliente \n2 - Funcionario \n3 - Produto \n4 - Venda");
                int e = Integer.parseInt(excluir);

		//----------------------excluir cliente-----------------------
		if (e == 1){
			String identifier = JOptionPane.showInputDialog("CPF do cliente que você deseja excluir: ");
                    try {
                        o.excluirCliente(con, identifier);
                    } catch (SQLException ex) {
                        Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}

		//----------------------excluir funcionário-----------------------
		if (e == 2){
			String identifier = JOptionPane.showInputDialog("CPF do funcionário que você deseja excluir: ");
                    try {
                        o.excluirFuncionario(con, identifier);
                    } catch (SQLException ex) {
                        Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}

		//----------------------excluir produto---------------------------
		if (e == 3){
			String identifier = JOptionPane.showInputDialog("Tipo de plano a ser excluido: ");
                    try {
                        o.excluirProduto(con, identifier);
                    } catch (SQLException ex) {
                        Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}

		//----------------------excluir venda-----------------------------
		//---a venda tem 3 identifiers porque ela só pode ser devidamente localizada a partir desses 3 atributos---		
		if (e == 4){
			String identifier1 = JOptionPane.showInputDialog("Nome do cliente da venda a ser excluida: ");
			String identifier2 = JOptionPane.showInputDialog("Nome do Funcionário da venda a ser excluida: ");
			String identifier3 = JOptionPane.showInputDialog("Tipo do plano da venda a ser excluida: ");
                    try {
                        o.excluirVenda(con, identifier1, identifier2, identifier3);
                    } catch (SQLException ex) {
                        Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}
	}
	

//---------------------caso ele queira alterar algum dado-----------------------

	if(i == 3){

	//----------------pergunta para saber de onde ele deseja alterar dados---------------------


		String alterarDados = JOptionPane.showInputDialog("Você deseja alterar dados de: \n1 - Cliente \n2 - Funcionario \3 - Produto \n4 - Venda ");
                int alt = Integer.parseInt(alterarDados);
                
		//--------------------alterar cliente---------------------
		if (alt == 1){

		//-----------pergunta para saber o que do cliente ele deseja alterar------------
			String alterar = JOptionPane.showInputDialog("Você deseja alterar do cliente: \n1 - Nome \n2 - Nome do Beneficiário 1 \n3 - Nome do Beneficiário 2 \n4 - RG \n5 - CPF \n6 - Conta Bancária \n7 - Número de Telefone \n8 - Tipo de Plano ");
                        int alter = Integer.parseInt(alterar);
                        
			//--------------------alterar nome do cliente----------------------
			if (alter == 1){
				String identifier = JOptionPane.showInputDialog("CPF do cliente cujo nome você deseja alterar: ");
				String novoNome = JOptionPane.showInputDialog("Digite o novo nome: ");
                            try {
                                o.alterarClienteNome(con, identifier, novoNome);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}

			//--------------------alterar nome do beneficiário 1------------------------
			if (alter == 2){
				String identifier = JOptionPane.showInputDialog("CPF do cliente cujo nome do beneficiário 1 você deseja alterar: ");
				String novoNomeBeneficiario1 = JOptionPane.showInputDialog("Digite o novo nome do beneficiário 1: ");
                            try {
                                o.alterarClienteNomeBeneficiario1(con, identifier, novoNomeBeneficiario1);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}

			//-------------------alterar nome do beneficiário 2-----------------------
			if (alter == 3){
				String identifier = JOptionPane.showInputDialog("CPF do cliente cujo nome do beneficiário 2 você deseja alterar: ");
				String novoNomeBeneficiario2 = JOptionPane.showInputDialog("Digite o novo nome do beneficiário 2: ");
                            try {
                                o.alterarClienteNomeBeneficiario2(con, identifier, novoNomeBeneficiario2);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}

			//-------------------alterar RG do cliente------------------------
			if (alter == 4){
				String identifier = JOptionPane.showInputDialog("CPF do cliente cujo RG você deseja alterar: ");
				String novoRg = JOptionPane.showInputDialog("Digite o novo RG: ");
                            try {
                                o.alterarClienteRg(con, identifier, novoRg);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}

			//-------------------alterar CPF do cliente--------------------
			if (alter == 5){
				String identifier = JOptionPane.showInputDialog("CPF do cliente cujo CPF você deseja alterar: ");
				String novoCpf = JOptionPane.showInputDialog("Digite o novo CPF: ");
                            try {
                                o.alterarClienteCpf(con, identifier, novoCpf);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }

			}

			//------------------alterar conta bancária do cliente---------------
			if (alter == 6){
				String identifier = JOptionPane.showInputDialog("CPF do cliente cuja conta bancária você deseja alterar: ");
				String novaContaBancaria = JOptionPane.showInputDialog("Digite a nova conta bancaria: ");
                            try {
                                o.alterarClienteContaBancaria(con, identifier, novaContaBancaria);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}

			//------------------alterar número de telefone do cliente-----------------
			if (alter == 7){
				String identifier = JOptionPane.showInputDialog("CPF do cliente cujo número de telefone você deseja alterar: ");
				String novoNumTelefone = JOptionPane.showInputDialog("Digite o novo número de telefone (digite apenas números): ");
                                
                                int novoNum = Integer.parseInt(novoNumTelefone);
                                
                            try {
                                o.alterarClienteNumTelefone(con, identifier, novoNum);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			

			//-----------------alterar tipo de plano do cliente----------------------
			if (alter == 8){
				String identifier = JOptionPane.showInputDialog("CPF do cliente cujo tipo de plano você deseja alterar: ");
				String novoTipoPlano = JOptionPane.showInputDialog("Digite o novo tipo de plano: ");
                            try {
                                o.alterarClienteTipoPlano(con, identifier, novoTipoPlano);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			

		}
		if (alt == 2){
			
                        String alterar = JOptionPane.showInputDialog("Você deseja alterar do Funcionario: \n1 - Nome \n2 - RG \n3 - CPF \n4 - Número de Telefone \n5 - Salário \n6 - Cargo ");
			int alter = Integer.parseInt(alterar);
                        
                        if (alter == 1){
				String identifier = JOptionPane.showInputDialog("CPF do funcionario cujo nome você deseja alterar: ");
				String novoNome = JOptionPane.showInputDialog("Digite o novo nome: ");
                            try {
                                o.alterarFuncionarioNome(con, identifier, novoNome);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			if (alter == 2){
				String identifier = JOptionPane.showInputDialog("CPF do funcionário cujo RG você deseja alterar: ");
				String novoRg = JOptionPane.showInputDialog("Digite o novo RG: ");
                            try {
                                o.alterarFuncionarioRg(con, identifier, novoRg);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			if (alter == 3){
				String identifier = JOptionPane.showInputDialog("CPF do funcionário cujo CPF você deseja alterar: ");
				String novoCpf = JOptionPane.showInputDialog("Digite o novo CPF: ");
                            try {
                                o.alterarFuncionarioCpf(con, identifier, novoCpf);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			if (alter == 4){
				String identifier = JOptionPane.showInputDialog("CPF do funcionário cujo RG você deseja alterar: ");
				String novoNumTelefone = JOptionPane.showInputDialog("Digite o novo número de telefone (digite apenas números): ");
                                
                                int novoNum = Integer.parseInt(novoNumTelefone);
                                
                            try {
                                o.alterarFuncionarioNumTelefone(con, identifier, novoNum);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			if (alter == 5){
				String identifier = JOptionPane.showInputDialog("CPF do funcionário cujo salário você deseja alterar: ");
				String novoSalario = JOptionPane.showInputDialog("Digite o novo salário: ");
                                
                                double novoSal = Double.parseDouble(novoSalario);
                                
                            try {
                                o.alterarFuncionarioSalario(con, identifier, novoSal);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }

			}
			if (alter == 6){
				String identifier = JOptionPane.showInputDialog("CPF do funcionário cujo cargo você deseja alterar: ");
				String novoCargo = JOptionPane.showInputDialog("Digite o novo cargo: ");
                            try {
                                o.alterarFuncionarioCargo(con, identifier, novoCargo);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}

		}
		if (alt == 3){
			
                        String alterar = JOptionPane.showInputDialog("Você deseja alterar do Produto: \n1 - Tipo do plano \n2 - Valor do Plano \n3 - Quantidade de parcelas ");
			int alter = Integer.parseInt(alterar);
                        
                        if (alter == 1){
				String identifier = JOptionPane.showInputDialog("Plano cujo tipo de plano você deseja alterar: ");
				String novoTipoPlano = JOptionPane.showInputDialog("Digite o novo tipo de plano: ");
                            try {
                                o.alterarProdutoTipoPlano(con, identifier, novoTipoPlano);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			if (alter == 2){
				String identifier = JOptionPane.showInputDialog("Plano cujo valor você deseja alterar: ");
				String novoValorPlano = JOptionPane.showInputDialog("Digite o novo valor: ");
                                
                                double novoValorPla = Double.parseDouble(novoValorPlano);
                                
                            try {
                                o.alterarProdutoValorPlano(con, identifier, novoValorPla);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			if (alter == 3){
				String identifier = JOptionPane.showInputDialog("Plano cuja quantidade de parcelas você deseja alterar: ");
				String novaQtdParcelas = JOptionPane.showInputDialog("Digite a nova quantidade de parcelas (digite apenas números): ");
                                
                                int novaQtd = Integer.parseInt(novaQtdParcelas);
                                
                            try {
                                o.alterarProdutoQtdParcelas(con, identifier, novaQtd);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			


		}
		if (alt == 4){
			
                        String alterar = JOptionPane.showInputDialog("Você deseja alterar da venda: \n1 - Nome do cliente \n2 - Nome do funcionário \n3 - Tipo de plano ");
			int alter = Integer.parseInt(alterar);
                        
                        if (alter == 1){
				String identifier1 = JOptionPane.showInputDialog("Nome do cliente que participou da venda que você deseja alterar: ");
				String identifier2 = JOptionPane.showInputDialog("Nome do funcionário que fez a venda você deseja alterar: ");
				String identifier3 = JOptionPane.showInputDialog("Tipo de plano que foi vendido na venda que você deseja alterar: ");
				String novoNomeCliente = JOptionPane.showInputDialog("Digite o novo nome do cliente: ");
                            try {
                                o.alterarVendaNomeCliente(con, identifier1, identifier2, identifier3, novoNomeCliente);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			if (alter == 2){
				String identifier1 = JOptionPane.showInputDialog("Nome do cliente que participou da venda que você deseja alterar: ");
				String identifier2 = JOptionPane.showInputDialog("Nome do funcionário que fez a venda você deseja alterar: ");
				String identifier3 = JOptionPane.showInputDialog("Tipo de plano que foi vendido na venda que você deseja alterar: ");
				String novoNomeFuncionario = JOptionPane.showInputDialog("Digite o novo nome do funcionário: ");
                            try {
                                o.alterarVendaNomeFuncionario(con, identifier1, identifier2, identifier3, novoNomeFuncionario);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			if (alter == 3){
				String identifier1 = JOptionPane.showInputDialog("Nome do cliente que participou da venda que você deseja alterar: ");
				String identifier2 = JOptionPane.showInputDialog("Nome do funcionário que fez a venda você deseja alterar: ");
				String identifier3 = JOptionPane.showInputDialog("Tipo de plano que foi vendido na venda que você deseja alterar: ");
				String novoTipoPlano = JOptionPane.showInputDialog("Digite o novo tipo de plano: ");
                            try {
                                o.alterarVendaTipoPlano(con, identifier1, identifier2, identifier3, novoTipoPlano);
                            } catch (SQLException ex) {
                                Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}

		}






			

  }


}




