import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
 
 /**
 * Default constructor.
 */
 public HelloWorld() {
 }
 
 /*
 * This method will handle all GET request.
 */
 protected void doGet(HttpServletRequest request,
 HttpServletResponse response) throws ServletException, IOException {
 
 	reponse.setContentType( " text / plain " );
	PrintWriter out = reponse.getWriter ();
	out.println( " Hello , hello !!!! " );
 }
 

}