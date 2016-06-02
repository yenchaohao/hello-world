

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloGet extends HttpServlet {
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charest=UTF-8");
		PrintWriter out = res.getWriter();
		
		String name[] = req.getParameterValues("name");
		if(name != null){
			for(int i=0; i<name.length; i++){
				String name2 = new String(name[i].getBytes("ISO-8859-1"), "UTF-8");
				out.println("<HTML>");
            	out.println("<HEAD><TITLE>Hello, " + name2 + "</TITLE></HEAD>");
            	out.println("<BODY>");
            	out.println("Hello, 你好: " + name2);
			}
		} else {
			out.println("未勾選");
		}
		out.println("</BODY></HTML>");
		
	}
	
}
