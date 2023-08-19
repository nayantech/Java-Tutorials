package program;
import java.sql.*;

//To perform ResultSet?

//here we use ResultSet 
public class jdbc_program2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");  //interface
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quastech","root","Nayan@29112001");
		Statement st=con.createStatement();  //create method is from DriverManager
		System.out.println("Connection Established");
		
		ResultSet rs=st.executeQuery("select * from employes");
		ResultSetMetaData rsmd=rs.getMetaData();
		String c1 = rsmd.getColumnName(1);
		String c2 = rsmd.getColumnName(2);
		String c3 = rsmd.getColumnName(3);
		String c4 = rsmd.getColumnName(4);
		String c5 = rsmd.getColumnName(5);
		String c6 = rsmd.getColumnName(6);
//		String c7 = rsmd.getColumnName(7);
		
		
//		System.out.println(c1+"\t"+c2+"\t"+c3+"\t"+c4+"\t"+c5+"\t"+c6+"\t"+c7);
		System.out.println(c1+"\t"+c2+"\t"+c3+"\t"+c4+"\t"+c5+"\t"+c6);
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
//			int age=rs.getInt("age");
			String dept=rs.getString("dept");
			String desg=rs.getString("desg");
			int exp=rs.getInt("exp");
			int sal=rs.getInt("sal");
			
//			System.out.println(id+"\t"+name+"\t"+age+"\t"+dept+"\t"+desg+"\t"+exp+"\t"+sal);
			System.out.println(id+"\t"+name+"\t"+dept+"\t"+desg+"\t"+exp+"\t"+sal);
			
		}
		
		st.close();
		con.close();
		System.out.println("Connection Closed");
	}

}