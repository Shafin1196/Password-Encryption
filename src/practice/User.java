
package practice;
import javax.swing.ImageIcon;
import java.util.*;
public class User {
    private String name,password,mobile,userName,email;
    private ImageIcon dp;
    private ArrayList<PasswordAndWeb>passwordList=new ArrayList<>();
    User()
    {
        
    }
    User(String name,String userName,String email,String mobile,String password)
    {
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.password=password;
        this.userName=userName;
        
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getUserHandel(){
        return userName;
    }
    public String getPass(){
        return password;
    }
    public void setPass(String pass){
        this.password=pass;
    }
    public String getMobile(){
        return mobile;
    }
    public void setMobile(String mobile){
        this.mobile=mobile;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getHandelPass()
    {
        return password;
    }
    public void  addPassToList(PasswordAndWeb data)
    {
        passwordList.add(data);
    }
    public PasswordAndWeb getData()
    {
        return passwordList.get(passwordList.size() - 1);
    }
    
    public ArrayList<PasswordAndWeb> getList()
    {
        return passwordList;
        
    }
    
    public void addDp(ImageIcon dp)
    {
        this.dp=dp;
    }
    public ImageIcon getDp()
    {
        return dp;
    }
    public void deleteData(PasswordAndWeb delData)
    {
        for(PasswordAndWeb data:passwordList)
        {
            if(data==delData){
                passwordList.remove(delData);
            }
        }
    }
    public static void main(String[] args) {
        User user=new User("sds","dsada","dasdsa","dsad","dsadsa");
        System.out.println(user.getPass());
    }
    
}
