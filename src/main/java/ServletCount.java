import javax.servlet.ServletException;
import javax.servlet.ServletResponseWrapper;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCount", urlPatterns = "/count")
public class ServletCount extends HttpServlet {

    private int hitCount;

    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        hitCount++;

        PrintWriter out = response.getWriter();
        String title = "Total Number of Hits";



        out.println(
                "<html>\n" +
                    "<head><title>" + title + "</title></head>\n" +
                    "<body bgcolor = \"f0f0f0\">\n" +
                        "<h1 align = \"center\">" + title + "</h1>\n" +
                        "<h2 align = \"center\">" + hitCount + "</h2>\n" +
                    "</body>" +
                "</html>"
        );

    }
}
