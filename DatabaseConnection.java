import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection{
	public static Connection getConnection(){
	  Connection cn=null;
      //String url=null;
      //String driverClass=null;
	  //url="jdbc:mysql://localhost:3306/csit_third";
	  //driverClass ="com.mysql.jdbc.Driver";
	  try
	  {
		  Class.forName("com.mysql.jdbc.Driver");//loading the driver
		  cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/csit_third","root","");
		  System.out.println("Connected");
		  return cn;
	  }
	  catch(Exception e){
		  System.out.println("Exception:"+e.getMessage());
		  e.printStackTrace();//To trace further info of exception
	  }
	  return null; 	  
	}
	public static void main(String[] args){
		getConnection();
	}
} 