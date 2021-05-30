package in.ramesh.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.ramesh.service.UserLoginService;

/**
 * Servlet implementation class userLogin
 */
@WebServlet("/userLogin")
public class userLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   @Override
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   String userName = request.getParameter("loginUserName");
		String password = request.getParameter("loginPassword");
		if(UserLoginService.loginUser(userName, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("LOGGED_IN_USER", userName);
			response.sendRedirect("displayHotels.jsp");

		}
		else {
			String errorMessage="Invalid Login Credentials";
			response.sendRedirect("UserLogin.jsp?errorMessage="+errorMessage);

		}
   }

}
