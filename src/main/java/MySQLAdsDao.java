import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;
    Config config;


    public MySQLAdsDao(Config config) throws SQLException {
        String url = config.getUrl();
        String user = config.getUser();
        String password = config.getPassword();

        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(url, user, password);
        this.config = config;
    }

    @Override
    public List<Ad> all() throws SQLException {
        Statement stmt = connection.createStatement();
        List<Ad> allAds = new ArrayList<>();

        long id;
        long userId;
        String title;
        String description;

            ResultSet rs = stmt.executeQuery("SELECT * FROM ads;");
            while(rs.next()) {
                id = rs.getLong("id");
                userId = rs.getLong("user_id");
                title = rs.getString("title");
                description = rs.getString("description");

                Ad ad = new Ad(id, userId, title, description);
                allAds.add(ad);
            }
        System.out.println(allAds);
        return allAds;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String query = "INSERT INTO ads(title, description) VALUES('Software Developer', 'Java and SQL and JavaScript daily. Penetration testing, gathering requirements, mapping data')";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next(){
            System.out.println("Inserted a new record! New id: " + rs.getLong(1));
        }
    }
}
