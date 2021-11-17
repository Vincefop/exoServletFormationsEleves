package exoFormation.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Formation;
import services.FormationsService;

/**
 * Servlet implementation class FormationServlet
 */
@WebServlet(name = "formation", urlPatterns = { "/formation" })
public class FormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Je récupère l'instance de mon service FormationsService
	private FormationsService formationsService = FormationsService.getInstance();
	// Je crée une vraiable qui contiendra plus tard dans mon code un article 
	private Formation formation; 
    /**
     * Default constructor. 
     */
    public FormationServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Je récupère une formation grâce au titre de la formation passée en paramètre de la requete (request.getParameter("titre"))
		// Je le récupère grâce à la méthode getFormationByName de mon service formationsService
		// Je le stock dans la variable formation
		formation = this.formationsService.getFormationByTitle(request.getParameter("titre"));
		// Si la formation n'existe pas je redirige vers le servlet de la liste des formations et je coupe le code (return)
		if (formation == null ) {
			response.sendRedirect("/exoFormation/lesFormations");
			return; 
		}
		
		// Ici la formation existe 
		// Je l'envoie dans le JSP en le passant dans l'attribut POST 
		request.setAttribute("formation", formation);
		
		// Je renvoi vers le JSP de post
		request.getRequestDispatcher("/WEB-INF/formation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
