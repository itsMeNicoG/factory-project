/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;




import Fabrica.Brujo.Brujo;
import Fabrica.Cazador.Cazador;
import Fabrica.FabricaPjAbs;
import Fabrica.Guerrero.Guerrero;
import Fabrica.Sacerdote.Sacerdote;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carandy
 */
public class CrearPersonaje extends HttpServlet {
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private static FabricaPjAbs personaje;

    public static FabricaPjAbs getPersonaje() {
        return personaje;
    }

    
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.metodoFabrica( request.getParameter("comboBox") );

                
        request.getSession().setAttribute("Arma", personaje.crearArma().getImagenSrc());
        request.getSession().setAttribute("Escudo", personaje.crearEscudo().getImagenSrc());
        request.getSession().setAttribute("Botas", personaje.crearBotas().getImagenSrc());
        request.getSession().setAttribute("Casco", personaje.crearCasco().getImagenSrc());
        request.getSession().setAttribute("Traje", personaje.crearTraje().getImagenSrc());        
        response.sendRedirect("Vistapersonaje.jsp");
    }
    
    
    
    public FabricaPjAbs metodoFabrica(String comboBox){
            switch(comboBox){
            case "Guerrero":
                personaje= Guerrero.getSingleton();
                break;
            case "Cazador":
                personaje= Cazador.getSingleton();
                break;
            case "Sacerdote":
                personaje= Sacerdote.getSingleton();
                break;
            case "Brujo":
                 personaje= Brujo.getSingleton();
                break;
        }
        return personaje;
    }
    

}
