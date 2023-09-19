package program;
import java.sql.*;

//To perform PreparedStatement?

//here we use PreparedStatement 
public class jdbc_program3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");  //interface  //giving driver name
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quastech","root","Nayan@29112001"); //connection established  //getConnection is a method of driver manager
//		Statement st=con.createStatement();  //is method of collection interface
		System.out.println("Connection Established");
		
		//for insert
//		String query="insert into employes values(?,?,?,?,?,?)";
		
		//for update 
//		String query="update employes set exp=? where id=?";
		
//		for delete
		String query="delete from employes where id=?";
		
		PreparedStatement pst=con.prepareStatement(query);
		
		//delete
		pst.setInt(1, 6);
		
		
//		update
//		pst.setInt(1, 12000);  //first is experience given
//		pst.setInt(2, 3);      //second is id given
//		
		
		//insert
//		pst.setInt(1,8);
//		pst.setString(2, "shyam");
//		pst.setInt(3, 29);
//		pst.setString(4, "IT");
//		pst.setString(5, "Software Developer");
//		pst.setInt(6, 2);
//		pst.setInt(7, 32000);
		
//		insert in my home system
//		pst.setInt(1, 12);
//		pst.setString(2, "Juli");
//		pst.setString(3, "Software Testing");
//		pst.setString(4, "Testing");
//		pst.setInt(5, 2);
//		pst.setInt(6, 300000);
		pst.executeUpdate();
		pst.close();
		con.close();
//		st.close();
		System.out.println("Connection Closed");
		
	}

}

//note
//we cannot perform select query in preparedStatement