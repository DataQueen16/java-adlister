
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="AdsPageServlet", urlPatterns = "/ads")
public class AdsPageServlet extends Java.HTTPServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Post> posts = ListAdsDao.getPostsDao().all();
//        request.setAttribute("posts", posts);
//        request.getRequestDispatcher("/posts.jsp")
//                .forward(request, response);
    }
}
