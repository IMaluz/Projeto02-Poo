package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MathServlet
 */
@WebServlet(name = "MathServlet", urlPatterns = {"/MathServlet"})
public class MathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html; charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
        	out.println("<!DOCTYPE html>");
        	out.println("<html>");
        	out.println("<head>");
        	out.println("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">");
        	out.println("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">");
        	out.println("<title>Operações Aritméticas</title>");
        	out.println("<style>");
        	out.println("div.centro{\n"
        			+ "	top: 0px;\n"
        			+ "	margin: 10px;\n"
        			+ "	left: 2px;\n"
        			+ "\n"
        			+ "}");
        	out.println("div#container{\n"
        			+ "font-size: 26px;\n"
        			+ "\n"
        			+ "}");
        	out.println("</style>");
        	out.println("  <nav>\n"
        			+ "    <div class=\"nav-wrapper\">\n"
        			+ "	   	 <a href=\"index.html\" class=\"brand-logo right\"><i class=\"material-icons\">home</i></a>"
        			+ "      <div class=\"container center-align\" id=\"container\">Realize Uma Operação Aritmética</div>\n"
        			+ "    </div>\n"
        			+ "  </nav>");
        	out.println("<body>");
        	out.println("<div class=\"centro\">");
        	out.println("<ul class=\"collapsible\">\n"
        			+ "  <li>\n"
        			+ "    <div class=\"collapsible-header\">\n"
        			+ "      <i class=\"material-icons\">add_circle_outline</i>\n"
        			+ "      Adição\n"
        			+ "      </div>\n"
        			+ "		<div class=\"collapsible-body\">"
        			+ "		<div class=\"row\">"
        			+ "			<form action= \"Soma\" class=\"col s12\">"
        			+ "			<div class=\"row\">\n"
        			+ "         <div class=\"input-field col s6\">"
        			+ "				<input type= \"number\" name= \"n1\" placeholder= \"Insira um número aqui\">"
        			+ "			</div>\n"
        			+ "         <div class=\"input-field col s6\">"
        			+ "				<input type= \"number\" name= \"n2\" placeholder= \"Insira outro número\">"
        			+ "			</div>\n"
        			+ " 		<div class=\"container center-align\">"
        			+ "				<p><button class=\"btn waves-effect waves-light\" type= \"submit\" value= \"Calcular\">"
        			+ "					Calcular"
        			+ "				</button></p>"
        			+ "			</div>\n"
        			+ "			</form>"
        			+ "		</div>\n"
        			+ "		</div>\n"
        			+ "  </li>\n"
        			+ "  <li>\n"
        			+ "    <div class=\"collapsible-header\">\n"
        			+ "      <i class=\"material-icons\">remove_circle_outline</i>\n"
        			+ "      Subtração\n"
        			+ "      </div>\n"
        			+ "		<div class=\"collapsible-body\">"
           			+ "		<div class=\"row\">"
        			+ "			<form action= \"Subtrair\" class=\"col s12\">"
        			+ "			<div class=\"row\">\n"
        			+ "         <div class=\"input-field col s6\">"
        			+ "				<input type= \"number\" name= \"n3\" placeholder= \"Insira um número aqui\">"
        			+ "			</div>\n"
        			+ "         <div class=\"input-field col s6\">"
        			+ "				<input type= \"number\" name= \"n4\" placeholder= \"Insira outro número\">"
        			+ "			</div>\n"
        			+ " 		<div class=\"container center-align\">"
        			+ "				<p><button class=\"btn waves-effect waves-light\" type= \"submit\" value= \"Calcular\">"
        			+ "					Calcular"
        			+ "				</button></p>"
        			+ "			</div>\n"
        			+ "			</form>"
        			+ "		</div>\n"
        			+ "		</div>\n"
        			+ "  </li>\n"
        			+ "  <li>\n"
        			+ "    <div class=\"collapsible-header\">\n"
        			+ "      <i class=\"material-icons\">close</i>\n"
        			+ "      Multiplicação\n"
        			+ "      </div>\n"
        			+ "		<div class=\"collapsible-body\">"
           			+ "		<div class=\"row\">"
        			+ "			<form action= \"Multiplicar\" class=\"col s12\">"
        			+ "			<div class=\"row\">\n"
        			+ "         <div class=\"input-field col s6\">"
        			+ "				<input type= \"number\" name= \"n5\" placeholder= \"Insira um número aqui\">"
        			+ "			</div>\n"
        			+ "         <div class=\"input-field col s6\">"
        			+ "				<input type= \"number\" name= \"n6\" placeholder= \"Insira outro número\">"
        			+ "			</div>\n"
        			+ " 		<div class=\"container center-align\">"
        			+ "				<p><button class=\"btn waves-effect waves-light\" type= \"submit\" value= \"Calcular\">"
        			+ "					Calcular"
        			+ "				</button></p>"
        			+ "			</div>\n"
        			+ "			</form>"
        			+ "		</div>\n"
        			+ "		</div>\n"
        			+ "  </li>\n"
        			+ "</ul>");
        	out.println("</div>");
        	out.println("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>");
        	out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>");
        	out.println("<script>");
        	out.println("$(document).ready(function(){\n"
        			+ "    $('.collapsible').collapsible();\n"
        			+ "  });");
        	out.println("</script>");
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