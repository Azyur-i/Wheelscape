
package group5crms.mylibs;


public class Admin extends User {

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return username + "|" + password;
    }
    
}
