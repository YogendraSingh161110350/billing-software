package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegitraionVelidation 
{
    private Pattern name,email,phno,password;
    private Matcher matcher;
    String name_pattern = "^[A-Za-z]\\w{3,30}$";
    String email_pattern="^[a-zA-Z0-9]+@(.+)$";
    String phno_pattern = "^[0-9]{10}$";
    public RegitraionVelidation ()
    {
        name = Pattern.compile(name_pattern);   
        email = Pattern.compile(email_pattern);
        phno = Pattern.compile(phno_pattern);
    }
    public boolean nameValidtaion(String user_name)
    {
       
        matcher = name.matcher(user_name);
        return matcher.matches();
    }
    public boolean emailValidation(String user_email)
    {
        matcher = email.matcher(user_email);
        return matcher.matches();
    }
    public boolean phoneValdition(String user_phone)
    {
        matcher=phno.matcher(user_phone);
        return matcher.matches();
        
    }
}
