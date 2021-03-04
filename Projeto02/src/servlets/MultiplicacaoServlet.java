package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MultiplicacaoServlet", urlPatterns = {"/Multiplicar"})
public class MultiplicacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html; charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
        	out.println("<!DOCTYPE html>");
        	out.println("<html>");
        	out.println("<head>");
        	out.println("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">");
        	out.println("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">");
        	out.println("<title>Resultado Da Multiplicação</title>");
        	out.println("<style>");
        	out.println("div.container{\n"
        			+ "font-size: 26px;\n"
					+ "\n"
					+ "}");
        	out.println("</style>");
        	out.println("  <nav>\n"
        			+ "    <div class=\"nav-wrapper\">\n"
        			+ "	   	 <a href=\"MathServlet\" class=\"brand-logo\"><i class=\"material-icons\">arrow_back</i></a>"
        			+ "      <div class=\"container center-align\">Resultado Da Multiplicação</div>\n"
        			+ "    </div>\n"
        			+ "  </nav>");
        	out.println("<body>");
        	out.println("<div class=\"container center-align\" id=\"corpo\">");
        	out.println("<br>");
        	try {
	        	double n5 = Double.parseDouble(request.getParameter("n5"));
	        	double n6 = Double.parseDouble(request.getParameter("n6"));
	        	double mult = n5 * n6;
	        	out.println("<h5>" +n5+ " x " +n6+ " = " +mult+ "</h5>");
			} catch (Exception e) {
				if(e.getMessage() == "empty String") {
					out.println("<script>\n"
							+ "{\n"
							+ "alert(\"Preencha todos os campos e tente novamente.\");\n"
							+ " location= './MathServlet';"
							+ "}\n"
							+ "</script>");
				}
			}
        	out.println("</div>");;
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