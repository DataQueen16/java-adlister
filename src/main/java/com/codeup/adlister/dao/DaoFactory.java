package com.codeup.adlister.dao;

import com.codeup.adlister.dao.Ads;
import com.codeup.adlister.dao.Config;
import com.codeup.adlister.dao.MySQLAdsDao;

import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();


    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
