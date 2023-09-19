package program;
import java.sql.*;

//To perform createStatement?

//here we use create statement we use insert,update
public class jdbc_program {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quastech","root","Nayan@29112001");
		Statement st=con.createStatement();
		System.out.println("Connection Established");
		
		//insert query
//		String query="insert into employes values(10,'Richard','Paython Developer','IT',5,8000000)";
		
		//update query
		String query="update employes set exp=100 where id=1";
		st.execute(query);
		
		
//		System.out.println("record inserted");
		
		System.out.println("Record Updated");
		st.close();
		con.close();
		System.out.println("Connection Closed");
		
	}
}