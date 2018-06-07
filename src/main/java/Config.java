public class Config {
    private String url = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    private String user = "adListJen";
    private String password = "goodpassword";

    public String getUrl(){
        return url;
    }

    public String getUser(){
        return user;
    }

    public String getPassword(){
        return password;
    }
}
