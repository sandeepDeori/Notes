package org.jsp.GetApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.* ;


@WebServlet("/fs")
public class FirstServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException , IOException {
		String sid=req.getParameter("i") ;
		int id =Integer.parseInt(sid) ;
		
		Connection con = null ;
		PreparedStatement pstmt= null ;
		ResultSet rs = null ;
		String qry = "select * from btm.newstudent where id=?" ;
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt = con.prepareStatement(qry) ;
			pstmt.setInt(1, id) ;
			rs = pstmt.executeQuery() ;
			
			PrintWriter out = resp.getWriter() ;
			
			if(rs.next()){
				int number = rs.getInt("id") ;
				String name = rs.getString("name") ;
				String dept = rs.getString("dept") ;
				double perc = rs.getDouble("perc") ;
				
				out.println("<htmL><body bgcolor='orange'><h1> Student id is "+id+"</br> his name is "+name+"</br>his dept is "+dept+"</br>his percentage is "+perc+"</h1></body></html>") ;
			    out.close() ;
			}
			else {
				out.println("<htmL><body bgcolor='orange'><h1> wrong user id enetered<h1></body></html>") ;
				out.close();
			}
			
			
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace() ;
		}
		finally {
			if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			}
			
			if(pstmt!=null) {
				try {
					pstmt.close();
				}
				catch(SQLException e){
					e.printStackTrace() ;
 				}
			}
			
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException e) {
					e.printStackTrace() ;
				}
			}
		}
		
	}
}
