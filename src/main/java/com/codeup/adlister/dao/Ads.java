<<<<<<< HEAD:src/main/java/com/codeup/adlister/dao/Ads.java
package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

=======
import java.sql.SQLException;
>>>>>>> jdbc-exercise:src/main/java/Ads.java
import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all() throws SQLException;
    // insert a new ad and return the new ad's id
    Long insert(Ad ad) throws SQLException;
}
