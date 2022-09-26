package model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.MadLib;

/**
 * Servlet implementation class getWordServelt
 */
@WebServlet("/getWordServlet")
public class getWordServelt extends HttpServlet {
	private static final long serialVersionUID = 1L; //this is all static so that I just pass it's current knowledge to the server and only need one input form it.
    private static MadLib myLib = new MadLib();
    private static int counter = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWordServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userInput = request.getParameter("userWord"); //first I take the user's word
		myLib.setHolder(userInput);  //then I pass it into my object
		counter++;
		
		request.setAttribute("myLib", myLib); //and set up the references
		request.setAttribute("counter", counter);
		
		if(counter < 4) {
			getServletContext().getRequestDispatcher("/handler.jsp").forward(request, response); //if it's not the last word I go to this handler which allows for another word to be input
		}else {
			getServletContext().getRequestDispatcher("/results.jsp").forward(request, response); //otherwise it goes to the final page showing the completed madlib
			myLib = new MadLib();
			counter = 0; //and then it resets the static variables to it can be done again.
		}
		
	}
	
}
