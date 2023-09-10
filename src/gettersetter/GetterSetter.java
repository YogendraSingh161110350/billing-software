
package gettersetter;

public class GetterSetter
{
    private String name ;
    private String email ;
    private String password ;
    private String gender ;
    private String mobile ;
    private int total_sell=0;
    public GetterSetter()
    {
    
    }
    public void setSell(int a)
    {
       this.total_sell =  total_sell+a;
    }
    public int getSell()
    {
        return total_sell;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    
}
