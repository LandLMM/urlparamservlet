import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UrlParam", value = "/urlparam")
public class UrlParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String name = httpServletRequest.getParameter("name");
        String surname = httpServletRequest.getParameter("surname");

        httpServletResponse.getWriter().print("<html><body><h1>Welcome "
                + name + " " + surname + "<br> You are a king of servlets" + "</body> </html>");
    }
}
