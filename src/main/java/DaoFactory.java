import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    Config config;

    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao();
        }
        return adsDao;
    }
}
