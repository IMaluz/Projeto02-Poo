package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MariaServlet", urlPatterns = {"/MariaServlet"})
public class MariaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html; charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
        	out.println("<!DOCTYPE html>");
        	out.println("<html>");
        	out.println("<head>");
           	out.println("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">");
        	out.println("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">");
        	out.println("<title>Informações</title>");
        	out.println("</head>");
        	out.println("<style>");
        	out.println("div#container{\n"
        			+ "font-size: 26px;\n"
        			+ "\n"
        			+ "}");
        	out.println("</style>");
        	out.println("  <nav>\n"
        			+ "    <div class=\"nav-wrapper\">\n"
        			+ "	   	 <a href=\"index.html\" class=\"brand-logo right\"><i class=\"material-icons\">home</i></a>"
        			+ "      <div class=\"container center-align\" id=\"container\">Quem Sou Eu</div>\n"
        			+ "    </div>\n"
        			+ "  </nav>");
        	out.println("<body>");
        	out.println("<div class=\"container center-align\">\n"
        			+ "			<br>"
        			+ "			<br>"
        			+ "			<div class=\"align-items-center\">\n"
        			+ "				<ul class=\"list-group\">\n"
        			+ "					<li><b>Nome Completo: </b> Maria Luiza Da Silva Augusto </li>\n"
        			+ "					<li><b>RA: </b> 1290482013029 </li>\n"
        			+ "					<li><a href='https://github.com/IMaluz'><b>Github</b></a></li>\n"
        			+ "				</ul>\n"
        			+ "			</div>\n"
        			+ "	</div>");
        	out.println("</body>");
        	out.println("</html");
        	
        }
    }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       processRequest(request, response);
   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       processRequest(request, response);
   }

   @Override
   public String getServletInfo() {
       return "Short description";
   }

}