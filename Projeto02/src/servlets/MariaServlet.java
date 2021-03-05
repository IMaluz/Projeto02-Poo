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
        	out.println("<!DOCTYPE html>\n"
        			+ "<html>\n"
        			+ "<head>\n"
        			+ "<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n"
        			+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\n"
        			+ "<title>Informações</title>\n"
        			+ "</head>\n"
        			+ "<style>\n"
	        		+ "	div#container{\n"
	        		+ "		font-size: 26px;\n"
	        		+ "	}\n"
        			+ "</style>\n"
        			+ "<nav>\n"
        			+ "	<div class=\"nav-wrapper\">\n"
        			+ "		<a href=\"index.html\" class=\"brand-logo right\"><i class=\"material-icons\">home</i></a>\n"
        			+ "		<div class=\"container center-align\" id=\"container\">Quem Sou Eu</div>\n"
        			+ "	</div>\n"
        			+ "</nav>\n"
        			+ "<body>\n"
        			+ "	<div class=\"container center-align\">\n"
        			+ "	<br>\n"
        			+ "	<br>\n"
        			+ "		<div class=\"align-items-center\">\n"
        			+ "			<ul class=\"list-group\">\n"
        			+ "				<li><b>Nome Completo: </b> Maria Luiza Da Silva Augusto </li>\n"
        			+ "				<li><b>RA: </b> 1290482013029 </li>\n"
        			+ "				<li><a href='https://github.com/IMaluz'><b>Github</b></a></li>\n"
        			+ "			</ul>\n"
        			+ "		</div>\n"
        			+ "	</div>\n"
        			+ "</body>\n"
        			+ "</html>");
        	
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