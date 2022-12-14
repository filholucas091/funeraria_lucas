import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
  private Connection con;
  public void conexao() throws SQLException{
    this.con = DriverManager.getConnection("https://replit.com/@filholucas092/ProjetoDefinitivo#funeraria.sql");
      
  } 
  
  
  
}
    
    