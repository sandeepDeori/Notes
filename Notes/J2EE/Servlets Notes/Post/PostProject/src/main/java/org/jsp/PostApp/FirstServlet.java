package org.jsp.PostApp;

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

	protected void doPost(HttpServletRequest req , HttpServletResponse resp) throws ServletException , IOException{
		
		String sid=req.getParameter("sn") ;
		int id = Integer.parseInt(sid) ;
		
		String name = req.getParameter("nm") ;
		String rank = req.getParameter("rk") ;
		String salary = req.getParameter("sl") ;
		double sal = Double.parseDouble(salary) ;
		
		PrintWriter out=resp.getWriter();
		out.println("<html> <body bgcolor='yellow'> <h1>Student name is "+name+" and rank is "+rank+"</h1></body></html>");
		out.close();
		
		
		Connection con =null ;
		PreparedStatement pstmt= null ;
		String qry="insert into btm.heroes values(?,?,?,?,?)" ;
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin") ;
			pstmt = con.prepareStatement(qry) ;
			pstmt.setInt(1,id) ;
			pstmt.setString(2,name) ;
			pstmt.setString(3,rank) ;
		    pstmt.setDouble(4,sal) ;
			pstmt.executeUpdate() ;
			
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace() ;
			
		}
		finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				}
				catch(SQLException e) {
					e.printStackTrace() ;
				}
			}
			
			
			if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			}
			
			
		}
		

	}
}
