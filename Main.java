import java.sql.SQLException;

public class Main{
  public static void main(String[] args) throws SQLException{
    
    try{
      
      InterfaceGrafica in = new InterfaceGrafica();
      
      
    }catch (SQLException ex){
      System.out.println("Erro!");
    }finally{
      con.close();
    }
  }
  
}