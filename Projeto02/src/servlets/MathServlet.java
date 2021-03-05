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
        	out.println("<!DOCTYPE html>\n"
        			+ "<html>\n"
        			+ "<head>\n"
        			+ "<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n"
        			+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\n"
        			+ "<title>Operações Aritméticas</title>\n"
        			+ "</head>\n"
        			+ "<style>\n"
        			+ "	div.centro{\n"
        			+ "		top: 0px;\n"
        			+ "		margin: 10px;\n"
        			+ "		left: 2px;\n"
        			+ "	}\n"
        			+ "	div#container{\n"
        			+ "		font-size: 26px;\n"
        			+ "	}\n"
        			+ "</style>\n"
        			+ "<nav>\n"
        			+ "	<div class=\"nav-wrapper\">\n"
        			+ "		<a href=\"index.html\" class=\"brand-logo right\"><i class=\"material-icons\">home</i></a>\n"
        			+ "		<div class=\"container center-align\" id=\"container\">Realize Uma Operação Aritmética</div>\n"
        			+ "	</div>\n"
        			+ "</nav>\n"
        			+ "<body>\n"
        			+ "	<div class=\"centro\">\n"
        			+ "		<ul class=\"collapsible\">\n"
        			+ "			<li>\n"
        			+ "    			<div class=\"collapsible-header\">\n"
        			+ "					<i class=\"material-icons\">add_circle_outline</i>\n"
        			+ "						Adição\n"
        			+ "				</div>\n"
        			+ "				<div class=\"collapsible-body\">\n"
        			+ "					<div class=\"row\">\n"
        			+ "						<form action= \"Soma\" class=\"col s12\">\n"
        			+ "							<div class=\"input-field col s6\">\n"
        			+ "								<input type= \"number\" name= \"n1\" placeholder= \"Insira um número aqui\">\n"
        			+ "							</div>\n"
        			+ "							<div class=\"input-field col s6\">\n"
        			+ "								<input type= \"number\" name= \"n2\" placeholder= \"Insira outro número\">\n"
        			+ "							</div>\n"
        			+ "							<div class=\"container center-align\">\n"
        			+ "								<p><button class=\"btn waves-effect waves-light\" type= \"submit\" value= \"Calcular\">\n"
        			+ "									Calcular\n"
        			+ "								</button></p>\n"
        			+ "							</div>\n"
        			+ "						</form>\n"
        			+ "					</div>\n"
        			+ "				</div>\n"
        			+ "			</li>\n"
        			+ "			<li>\n"
        			+ "				<div class=\"collapsible-header\">\n"
        			+ "					<i class=\"material-icons\">remove_circle_outline</i>\n"
        			+ "						Subtração\n"
        			+ "				</div>\n"
        			+ "				<div class=\"collapsible-body\">\n"
           			+ "					<div class=\"row\">\n"
        			+ "						<form action= \"Subtrair\" class=\"col s12\">\n"
        			+ "							<div class=\"input-field col s6\">\n"
        			+ "								<input type= \"number\" name= \"n3\" placeholder= \"Insira um número aqui\">\n"
        			+ "							</div>\n"
        			+ "							<div class=\"input-field col s6\">\n"
        			+ "								<input type= \"number\" name= \"n4\" placeholder= \"Insira outro número\">\n"
        			+ "							</div>\n"
        			+ "							<div class=\"container center-align\">\n"
        			+ "								<p><button class=\"btn waves-effect waves-light\" type= \"submit\" value= \"Calcular\">\n"
        			+ "									Calcular\n"
        			+ "								</button></p>\n"
        			+ "							</div>\n"
        			+ "						</form>\n"
        			+ "					</div>\n"
        			+ "				</div>\n"
        			+ "			</li>\n"
        			+ "			<li>\n"
        			+ "				<div class=\"collapsible-header\">\n"
        			+ "					<i class=\"material-icons\">close</i>\n"
        			+ "						Multiplicação\n"
        			+ "				</div>\n"
        			+ "				<div class=\"collapsible-body\">\n"
           			+ "					<div class=\"row\">\n"
        			+ "						<form action= \"Multiplicar\" class=\"col s12\">\n"
        			+ "							<div class=\"input-field col s6\">\n"
        			+ "								<input type= \"number\" name= \"n5\" placeholder= \"Insira um número aqui\">\n"
        			+ "							</div>\n"
        			+ "							<div class=\"input-field col s6\">\n"
        			+ "								<input type= \"number\" name= \"n6\" placeholder= \"Insira outro número\">\n"
        			+ "							</div>\n"
        			+ "							<div class=\"container center-align\">\n"
        			+ "								<p><button class=\"btn waves-effect waves-light\" type= \"submit\" value= \"Calcular\">\n"
        			+ "									Calcular\n"
        			+ "								</button></p>\n"
        			+ "							</div>\n"
        			+ "						</form>\n"
        			+ "					</div>\n"
        			+ "				</div>\n"
        			+ "			</li>\n"
        			+ "		</ul>\n"
        			+ "	</div>\n"
        			+ "	<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n"
        			+ "	<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>\n"
        			+ "	<script>\n"
        			+ "		$(document).ready(function(){\n"
        			+ "    		$('.collapsible').collapsible();\n"
        			+ "		});\n"
        			+ "	</script>\n"
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