package mini_projects.LoginpageApp;

public class User {
    //3-name,username,email,password
    private String name;
    private String username;
    private String email;
    private String password;
    //4-user objesi oluşturulurken öz. set edilsin.
    public User(String name,String username,String email,String password){
        this.name=name;
        this.username=username;
        this.email=email;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}