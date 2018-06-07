import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;
    Config config;


    public MySQLAdsDao(){
        try {
            String url = config.getUrl();
            String user = config.getUser();
            String password = config.getPassword();

            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Database is off", e);
        }
    }

    @Override
    public List<Ad> all() throws SQLException {
        Statement stmt = connection.createStatement();
        List<Ad> allAds = new ArrayList<>();

            ResultSet rs = stmt.executeQuery("SELECT * FROM ads;");
            while(rs.next()) {
                long id = rs.getLong("id");
                long userId = rs.getLong("user_id");
                String title = rs.getString("title");
                String description = rs.getString("description");

                Ad ad = new Ad(id, userId, title, description);
                allAds.add(ad);
            }
        return allAds;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String query = "INSERT INTO ads(user_id, title, description) VALUES(1, 'Software Developer', 'Java and SQL and JavaScript daily. Penetration testing, gathering requirements, mapping data')";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()){
            System.out.println("Inserted a new record! New id: " + rs.getLong(1));
        }
        return rs.getLong(1);
    }
}
