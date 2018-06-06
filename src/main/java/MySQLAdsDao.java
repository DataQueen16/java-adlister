import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;
    Config config;


    public MySQLAdsDao(Config config) throws SQLException {
        this.config = config;
    }

    @Override
    public List<Ad> all() throws SQLException {
        Statement stmt = connection.createStatement();

        long id;
        long userId;
        String title;
        String description;

            ResultSet rs = stmt.executeQuery("SELECT * FROM ads;"));
            while(rs.next()) {
                id = rs.getLong("id");
                userId = rs.getLong("user_id");
                title = rs.getString("title");
                description = rs.getString("description");

                Ad ad = new Ad(id, userId, title, description);
                ad.add(ad);
            }

        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
