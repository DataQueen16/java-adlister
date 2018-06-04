package Java;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="AdsPageServlet", urlPatterns = "/ads")
public class AdsPageServlet extends HTTPServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        ListAdsDao ads = new ListAdsDao();
        Object allAds = ads.all();
    }
}
