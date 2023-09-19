package program;
import java.sql.*;

//To perform createStatement?

//here we use create statement with insert,update,delete
public class jdbc_program1 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");  //interface
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quastech","root","Nayan@29112001");
		Statement st=con.createStatement();  //create method is from DriverManager
		System.out.println("Connection Established");	
		
		//insert record in mysql database
//		String query="insert into employes values(11,'Shivam','Paython Developer','IT',5,8000000)";
		
		
//		update record in mysql database
//		String query="update employes set exp=0 where id=1";
		
		//delete employes record in mysql
		String query="delete from employes where id=9";
		st.execute(query);
//		System.out.println("record inserted");
//		System.out.println("Record Updated");
		System.out.println("Deleted record");
		st.close();
		con.close();
		System.out.println("Connection Closed");
		
	}
}