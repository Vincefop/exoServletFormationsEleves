package exoFormation.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Eleve;
import models.Formation;
import services.FormationsService;

/**
 * Servlet implementation class ElevesServlet
 */
@WebServlet(name = "lesEleves", urlPatterns = { "/lesEleves" })
public class ElevesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Je crée une liste d'eleves vide
	private List<Eleve> eleves = new ArrayList<Eleve>();
	// Je crée une vraiable qui contiendra plus tard dans mon code 
	private FormationsService formationsService = FormationsService.getInstance();
    /**
     * Default constructor. 
     */
    public ElevesServlet() {
    	// Je récupère la liste de mes eleves grâce au service postsServices et sa méthode getEleves()
    	this.eleves = formationsService.getEleves();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Je passe les eleves dans le JSP en lui set un attribut formations
		request.setAttribute("eleves", eleves);
		// Je renvoi le JSP posts
		request.getRequestDispatcher("/WEB-INF/lesEleves.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
