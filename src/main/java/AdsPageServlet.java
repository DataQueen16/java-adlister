
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="AdsPageServlet", urlPatterns = "/ads")
public class AdsPageServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      Talk to AdsDao to get a collection of all Ad Objects
//      setAttribute on list to pass data into the view
//      render jsp & send the request/response data

        List<Ad> ads = DaoFactory.getAdsDao().all();

        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }
}
