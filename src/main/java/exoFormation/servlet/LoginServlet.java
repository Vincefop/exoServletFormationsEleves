package exoFormation.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Pour garder les login et password sur le formulaire
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		if(login==null) login ="";
		if(password==null) password="";
		request.setAttribute("login", login);
		request.setAttribute("password", password);

		response.sendRedirect(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		
		if(login.equals("Vince") && password.equals("pass")) {
			String contextPath = request.getContextPath();
			response.sendRedirect(contextPath + "/accueil");
			
		}else {
			doGet(request, response);
		}
	}

}
