import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/przelicznik")
public class PrzelicznikServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String textarea = request.getParameter("textarea");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        response.getWriter().println("<i>" + textarea +"</i><br>");
        String[] tabTextarea = textarea.split(" ");
        response.getWriter().println("<h2>Ilość słów: " + tabTextarea.length + "</h2>");
        response.getWriter().println("<h2>Ilość znaków: " + textarea.length()+ "</h2>");
        response.getWriter().println("<h2>Ilość znaków (bez spacji): " + textarea.replace(" ","").length() + "</h2>");
        response.getWriter().println("<h2>Palindrom: " + textarea.equals(new StringBuilder(textarea).reverse().toString()) + "</h2>");




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
