package thetestingacademy.oops.ecapsulation;

public class GoodExample {

    public static void main(String[] args) {
        vwoLoginFixed vwoLogin = new vwoLoginFixed("admin","admin");
        boolean check = vwoLogin.isLoggedIn("admin","admin");
        System.out.println(check);
        //vwoLogin.username = "dads";
    }
}

class vwoLoginFixed{

    private String username;
    public String password;

    vwoLoginFixed(String u, String p){
        this.password = p;
        this.username = u;
    }

    boolean isLoggedIn(String username, String password){
        if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged IN!!");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }

    }


}
