package in.ramesh.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ramesh.dao.HotelServiceDao;
import in.ramesh.model.Hotel;
import in.ramesh.service.AddHotelService;

/**
 * Servlet implementation class AddHotelServlet
 */
@WebServlet("/AddHotelServlet")
public class AddHotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@SuppressWarnings("unlikely-arg-type")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Hotel hotel=new Hotel();
		hotel.setHotelName(request.getParameter("hotel"));
		System.out.println("Hotel name: "+hotel.getHotelName());

		boolean isValid = AddHotelService.addHotels();
		if (isValid) {

			response.sendRedirect("displayHotels.jsp");

		} else {
			String errorMessage = "Already exists";
			response.sendRedirect("displayHotels.jsp?errorMessage=" + errorMessage);
			
		}
		
	}

}
