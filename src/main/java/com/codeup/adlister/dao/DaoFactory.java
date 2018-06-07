<<<<<<< HEAD:src/main/java/com/codeup/adlister/dao/DaoFactory.java
package com.codeup.adlister.dao;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();
=======
import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    Config config;
>>>>>>> jdbc-exercise:src/main/java/DaoFactory.java

    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
<<<<<<< HEAD:src/main/java/com/codeup/adlister/dao/DaoFactory.java
            adsDao = new MySQLAdsDao(config);
=======
            adsDao = new MySQLAdsDao();
>>>>>>> jdbc-exercise:src/main/java/DaoFactory.java
        }
        return adsDao;
    }
}
