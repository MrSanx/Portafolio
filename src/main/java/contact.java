/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chalo
 */
@WebServlet(urlPatterns = {"/contact"})
public class contact extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String user = (request.getParameter("name") + " " + request.getParameter("surname"));
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String company = request.getParameter("company");
            String mail = request.getParameter("mail");
            String need = request.getParameter("need");
            String summary = request.getParameter("summary");

            File f = new File("dataBase.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(name + "," + surname + "," + company + "," + mail + "," + need + "," + summary + ",");
            bw.newLine();
            bw.close();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">\n"
                    + "	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "	<link rel=\"icon\" href=\"sources\\brand.png\" type=\"image/icon type\">\n"
                    + "	<title>Home | Sanx Portafolio</title>\n"
                    + "	<!--FONT AWESOME-->\n"
                    + "	<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css\">\n"
                    + "	<!--FONT ROBOTO-->\n"
                    + "            <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;0,500;1,400&display=swap\"\n"
                    + "		rel=\"stylesheet\">\n"
                    + "	<!--FONT OPEN SANS-->\n"
                    + "	<link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@700&display=swap\" rel=\"stylesheet\">\n"
                    + "	<!--CUSTOM CSS-->\n"
                    + "	<link rel=\"stylesheet\" href=\"styles.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<!--Just the header-->\n"
                    + "	<div class=\"header\">\n"
                    + "		<nav class=\"nav-main\">\n"
                    + "			<!--Left Part-->\n"
                    + "			<img src=\"sources\\brand.png\" alt=\"brand\" class=\"nav-brand\">\n"
                    + "			<ul class=\"nav-menu\">\n"
                    + "				<li>\n"
                    + "					<a href=\"index.html\">Home</a>\n"
                    + "				</li>\n"
                    + "				<li>\n"
                    + "					<a href=\"portafolio.html\">Portafolio</a>\n"
                    + "				</li>\n"
                    + "				<li>\n"
                    + "					<a href=\"about_me.html\">About me</a>\n"
                    + "				</li>\n"
                    + "				<li>\n"
                    + "					<a href=\"contact.html\">Contact</a>\n"
                    + "				</li>\n"
                    + "			</ul>\n"
                    + "			<!--Right Part-->\n"
                    + "			<ul>\n"
                    + "				<li>\n"
                    + "					<a href=\"#\">\n"
                    + "						<img src=\"sources\\en.png\" alt=\"Language\" class=\"nav-languages\">\n"
                    + "					</a>\n"
                    + "				</li>\n"
                    + "				<li>\n"
                    + "					<a href=\"#\">\n"
                    + "						<i class=\"fas fa-search\"></i>\n"
                    + "					</a>\n"
                    + "				</li>\n"
                    + "			</ul>\n"
                    + "		</nav>\n"
                    + "		<hr>\n"
                    + "	</div>");
            out.println("<div class=\"container\">");
            out.println("<h1>Contact Saved</h1>");
            out.println("<p>The request was saved sucessfully " + user + ".</p>");
            out.println("<p>You can see it in " + f.getAbsolutePath() + "</p><br>");
            out.println("<a href=\"index.html\" class=\"btn\">" + "Return " + "<i class=\"fas fa-angle-double-right\"></i></a>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
