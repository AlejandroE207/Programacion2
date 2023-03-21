/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import navesAlianza.*;

/**
 *
 * @author USUARIO
 */
@WebServlet(name = "miServlet", urlPatterns = {"/miServlet"})
public class miServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet miServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet miServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }

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
//        processRequest(request, response);
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
            
        
        String tipo = request.getParameter("tipo");
        int numeroPasajeros = Integer.parseInt(request.getParameter("numPasajeros"));
        double consumo = Double.parseDouble(request.getParameter("consumoCombustible"));
        int numeroNaves = Integer.parseInt(request.getParameter("numNaves"));
        double recorrido = Double.parseDouble(request.getParameter("numParc"));
        
        double consumoTot=0.0;
        
        
        switch(tipo){
            case "HalconMilenario":
                HalconMilenario nave1 = new HalconMilenario(tipo, numeroPasajeros, consumo, numeroNaves);
                consumoTot = nave1.calcularCombustible(recorrido);
                request.getSession().setAttribute("tipo", nave1.getTipo());
                request.getSession().setAttribute("numPasajeros", nave1.getNumPasajeros());
                request.getSession().setAttribute("consumoNav", nave1.getCombustibleParsec());
                request.getSession().setAttribute("numNaves", nave1.getNumNaves());
                request.getSession().setAttribute("consumoTot", consumoTot);
                 
                break;
            case "DestructorEstelar":
                DestructorEstelar nave2 = new DestructorEstelar(tipo, numeroPasajeros, consumo, numeroNaves);
                consumoTot = nave2.calcularCombustible(recorrido);
                request.getSession().setAttribute("tipo", nave2.getTipo());
                request.getSession().setAttribute("numPasajeros", nave2.getNumPasajeros());
                request.getSession().setAttribute("consumoNav", nave2.getCombustibleParsec());
                request.getSession().setAttribute("numNaves", nave2.getNumNaves());
                request.getSession().setAttribute("consumoTot", consumoTot);
                
                break;
            case "LanzaderaImperial":
                LanzaderaImperial nave3 = new LanzaderaImperial(tipo, numeroPasajeros, consumo, numeroNaves);
                consumoTot = nave3.calcularCombustible(recorrido);
                request.getSession().setAttribute("tipo", nave3.getTipo());
                request.getSession().setAttribute("numPasajeros", nave3.getNumPasajeros());
                request.getSession().setAttribute("consumoNav", nave3.getCombustibleParsec());
                request.getSession().setAttribute("numNaves", nave3.getNumNaves());
                request.getSession().setAttribute("consumoTot", consumoTot);
                break;
            case "Supremacy":
                Supremacy nave4 = new Supremacy(tipo, numeroPasajeros, consumo, numeroNaves);
                consumoTot = nave4.calcularCombustible(recorrido);
                request.getSession().setAttribute("tipo", nave4.getTipo());
                request.getSession().setAttribute("numPasajeros", nave4.getNumPasajeros());
                request.getSession().setAttribute("consumoNav", nave4.getCombustibleParsec());
                request.getSession().setAttribute("numNaves", nave4.getNumNaves());
                request.getSession().setAttribute("consumoTot", consumoTot);
                break;
            case "AtAt":
                AtAt nave5 = new AtAt(tipo, numeroPasajeros, consumo, numeroNaves);
                consumoTot = nave5.calcularCombustible(recorrido);
                request.getSession().setAttribute("tipo", nave5.getTipo());
                request.getSession().setAttribute("numPasajeros", nave5.getNumPasajeros());
                request.getSession().setAttribute("consumoNav", nave5.getCombustibleParsec());
                request.getSession().setAttribute("numNaves", nave5.getNumNaves());
                request.getSession().setAttribute("consumoTot", consumoTot);
                break;
                
            default:
                System.out.println("No ha digitado una opcion valida");
        }
        response.sendRedirect("mostrar.jsp"); 
        System.out.println("El tipo es: "+tipo);
        System.out.println("El numero de pasajeros es: "+numeroPasajeros);
        
        
//        
//        RequestDispatcher rd = request.getRequestDispatcher("mostrar.jsp");
//        rd.forward(request, response);
//        request.setAttribute("tipo", tipo);
        
//        
//        HttpSession session = request.getSession();
//        session.setAttribute("tip", tipo);
        
        
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
