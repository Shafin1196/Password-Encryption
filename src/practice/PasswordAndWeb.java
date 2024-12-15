
package practice;

public class PasswordAndWeb {
    private String password,webSite,handel;
    public Encryption en=new Encryption();
    PasswordAndWeb(String password,String webSite,String handel)
    {
        this.password=password;
        this.webSite=webSite;
        this.handel=handel;
    }
    public String getPass(){
        return password;
    }
    public String getWeb(){
        return webSite;
    }
    public String getHandel(){
        return handel;
    }
    public void setPass(String pass){
        this.password=pass;
    }
    
}
