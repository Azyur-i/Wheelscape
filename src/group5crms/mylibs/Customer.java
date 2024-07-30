
package group5crms.mylibs;

public class Customer extends User {
    private String gender;
    private int age;
    private String phoneNum;
    private String email;
    private String address;

    Customer(CustomerBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.gender = builder.gender;
        this.age = builder.age;
        this.phoneNum = builder.phoneNum;
        this.email = builder.email;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return username + "|" + password + "|" + gender + "|" + age + "|" + phoneNum + "|" + email + "|" + address;
    }
    
    public static class CustomerBuilder extends User {
        private String gender;
        private int age;
        private String phoneNum;
        private String email;
        private String address;
        
        public CustomerBuilder username(String username) {
            this.username = username;
            return this;
        }
        
        public CustomerBuilder password(String password) {
            this.password = password;
            return this;
        }
        
        public CustomerBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }
        
        public CustomerBuilder age(int age) {
            this.age = age;
            return this;
        }
        
        public CustomerBuilder phoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        
        public CustomerBuilder email(String email) {
            this.email = email;
            return this;
        }
        
        public CustomerBuilder address(String address) {
            this.address = address;
            return this;
        }
        
        public Customer build() {
            return new Customer(this);
        }
    }
}
