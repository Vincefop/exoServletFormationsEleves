package exoFormation.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Formation;
import services.FormationsService;

/**
 * Servlet implementation class FormationsServlet
 */
@WebServlet(name = "lesFormations", urlPatterns = { "/lesFormations" })
public class FormationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Je crée une liste de formations vide
	private List<Formation> formations = new ArrayList<Formation>();
	// Je crée une vraiable qui contiendra plus tard dans mon code 
	private FormationsService formationsService = FormationsService.getInstance();
    /**
     * Default constructor. 
     */
    public FormationsServlet() {
    	// Je récupère la liste de mes formations grâce au service postsServices et sa méthode getFormations()
    	this.formations = formationsService.getFormations();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Je passe les formations dans le JSP en lui set un attribut formations
		request.setAttribute("formations", formations);
		// Je renvoi le JSP posts
		request.getRequestDispatcher("/WEB-INF/lesFormations.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
