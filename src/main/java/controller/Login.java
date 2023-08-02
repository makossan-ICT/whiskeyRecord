package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    String name = request.getParameter("name");
	    String password = request.getParameter("password");

	    User user = new User(name, password);

	    LoginLogic loginLogic = new LoginLogic();
	    boolean isLogic = loginLogic.execute(user);
	    if (isLogic) {
	        HttpSession session = request.getSession();
	        session.setAttribute("loginUser", user);
	    }
	    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/loginResult.jsp");
	    rd.forward(request, response);
	}

}
