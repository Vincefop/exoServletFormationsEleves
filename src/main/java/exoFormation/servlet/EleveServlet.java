package exoFormation.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Eleve;
import services.FormationsService;

/**
 * Servlet implementation class EleveServlet
 */
@WebServlet(name = "eleve", urlPatterns = { "/eleve" })
public class EleveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Je r�cup�re l'instance de mon service FormationsService
	private FormationsService formationsService = FormationsService.getInstance();
	// Je cr�e une vraiable qui contiendra plus tard dans mon code un eleves 
	private Eleve eleve; 
    /**
     * Default constructor. 
     */
    public EleveServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Je r�cup�re un eleve gr�ce au nom de l'�l�ve pass�e en param�tre de la requete (request.getParameter("nom"))
		// Je le r�cup�re gr�ce � la m�thode getEleveByName de mon service formationsService
		// Je le stock dans la variable eleve
		eleve = this.formationsService.getEleveByName(request.getParameter("nom"));
		// Si la formation n'existe pas je redirige vers le servlet de la liste des formations et je coupe le code (return)
		if (eleve == null ) {
			response.sendRedirect("/exoFormation/lesEleves");
			return; 
		}
		
		// Ici la formation existe 
		// Je l'envoie dans le JSP en le passant dans l'attribut POST 
		request.setAttribute("eleve", eleve);
		
		// Je renvoi vers le JSP de post
		request.getRequestDispatcher("/WEB-INF/eleve.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
