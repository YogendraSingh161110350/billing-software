package dbOperation;

import dbconnection.DBConnection;
import gettersetter.GetterSetter;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class DBOperator
{
    String name,email,password,gender,mobile ;
    public DBOperator(GetterSetter gs) 
    {
          name = gs.getName();
        email = gs.getEmail();
         password = gs.getPassword();
         gender = gs.getGender();
        mobile =gs.getMobile();
    }
    
    public  boolean registerEmployee()
    {
        boolean flag = false;
        Connection con=null;
        try
        {
            con = dbconnection.DBConnection.getConnection();
            PreparedStatement ps1 = con.prepareStatement("insert into emp_details value(?,?,?,?,?,?)");
            PreparedStatement ps2 = con.prepareStatement("select * from emp_details where email");
            ps1.setString(1, name);
            ps1.setString(2, email);
            ps1.setString(3, password);
            ps1.setString(4, gender);
            ps1.setString(5, mobile);
            ps1.setString(6, "employee");
            int a = ps1.executeUpdate();
            if(a>0)
            {
                flag = true;
            }
            else
            {
                flag = false;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return flag;
    }
    public static ResultSet showEmployeeTable()
    {
        ResultSet rs = null;
        Connection con = null;
        try
        {
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from emp_details where module = 'employee' ");
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public static  int updateEmployee(GetterSetter gs) 
    {
        int a = 0;
        try
        {
          Connection con =   DBConnection.getConnection();
          PreparedStatement ps = con.prepareStatement("update emp_details set name=?,phone_number=?,password=?,gender=? where email=?");
          ps.setString(1, gs.getName());
          ps.setString(2, gs.getMobile());
          ps.setString(3, gs.getPassword());
          ps.setString(4, gs.getGender());
          ps.setString(5, gs.getEmail());
          a = ps.executeUpdate();
          if(a>0)
          {
              a = 1;
          }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return a;
    }
    public static ResultSet fillValueInEmpDetailsTabale(String email)
    {
        ResultSet rs = null;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from emp_details where email=?");
            ps.setString(1, email);
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public static boolean deleteEmployee(String email)
    {
        boolean flag = true;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from emp_details where email=?");
            ps.setString(1, email);
            int a = ps.executeUpdate();
            if(a>0)
            {
                flag = false;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }
    public static boolean saveItemDataInDatabase(FileInputStream fis,String...item)
    {
        boolean is_insert = false;
        String item_id = item[0];
        String item_name = item[1];
        String item_price = item[2];
        String item_category = item[3];
        String item_desc = item[4];
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into item_details value (?,?,?,?,?,?)");
            ps.setString(1, item_id);
            ps.setString(2, item_name);
            ps.setString(3, item_price);
            ps.setString(4, item_category);
            ps.setString(5, item_desc);
            ps.setBinaryStream(6,fis );
            int a = ps.executeUpdate();
            if(a>0)
            {
                is_insert = true;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return is_insert;
    }
    public static ResultSet getItem()
    {
        ResultSet rs=null;
            try
            {
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement("select * from item_details");
                rs= ps.executeQuery();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            
            }
            return rs;
    }
    public static ResultSet getItemDetailsInTable(String item_id)
    {
        ResultSet rs =null;
        try
        {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("select * from item_details where item_id = ?");
        ps.setString(1, item_id);
        rs  = ps.executeQuery();
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public static boolean changePassword(String password)
    {
        boolean status = false;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("update emp_details set password =? where email=?");
            ps.setString(1, password);
            ps.setString(2, "yogendrasingh1611035@gmail.com");
            int a = ps.executeUpdate();
            if(a>0)
            {
                status = true;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }
    public static ResultSet checkOldPassword(String old_password)
    {
        ResultSet rs = null;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from emp_details where module= ? and password =?");
            ps.setString(1, "admin");
            ps.setString(2, old_password);
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public static ResultSet loginVarification(String email,String password)
    {
        ResultSet rs =null;
        Connection con = DBConnection.getConnection();
        try
        {
            PreparedStatement ps = con.prepareStatement("select * from emp_details where email= ? and password =?");
            ps.setString(1, email);
            ps.setString(2, password);
            rs= ps.executeQuery();
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return rs;
    }
    public static ResultSet changeEmployeePassword(String email,String password)
    {
        ResultSet rs = null;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from emp_details where email = ? and password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
        }
        catch(Exception e)
        {
        
            e.printStackTrace();
        }
    
       return rs;
    }
    public static int  updateEmployeePassword(String pass,String email)
    { 
        int a = 0;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("update emp_details set password=? where email = ?");
            ps.setString(1, pass);
            ps.setString(2, email);
            a= ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return a;
    }
    public static ResultSet selectEmployeeData()
    {
        ResultSet rs = null;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps =con.prepareStatement("select * from emp_details where module= ?");
            ps.setString(1, "employee");
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public static int updateEmployee(String... b)
    {
        int a = 0;
        Connection con = DBConnection.getConnection();
        try
        {
            PreparedStatement ps  = con.prepareStatement("update emp_details set name=?,phone_number=?,gender=? where email=?");
            
            ps.setString(1, b[0]);
            ps.setString(2, b[1]);
            ps.setString(3, b[2]);
            ps.setString(4, b[3]);
            a = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return a;
    }
    public static ResultSet getItemDetails(String item_id)
    {
        ResultSet rs= null;
        try
        {
            Connection con= DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from item_details where item_id=?");
            ps.setString(1, item_id);
            rs = ps.executeQuery();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public  static int addCostumer(String... cos_details)
    {
        int a = 0;
        Connection con = DBConnection.getConnection();
        try
        {
            PreparedStatement ps = con.prepareCall("insert into emp_details values (?,?,?,?,?,?)");
            ps.setString(1, cos_details[0]);
            ps.setString(2, cos_details[1]);
            ps.setString(3, cos_details[2]);
            ps.setString(4, cos_details[3]);
            ps.setString(5, cos_details[4]);
            ps.setString(6, cos_details[5]);
            a = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return a;
    }
    public static ResultSet isCostumerAlreadyRegistered(String phon_number)
    {
        ResultSet rs = null;
        Connection con = DBConnection.getConnection();
        try
        {
            PreparedStatement ps =con.prepareStatement("select * from emp_details where phone_number = ? and module = ?");
            ps.setString(1, phon_number);
            ps.setString(2, "costumer");
            rs = ps.executeQuery();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public static int insertCostumerHistory(String... details)
    {
        int a= 0;
        try
        {
                Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement("insert into costumer_history value(?,?,?,?,?)");
                ps.setString(1, details[0]);
                ps.setString(2, details[1]);
                ps.setString(3, details[2]);
                ps.setString(4, details[3]);
                ps.setString(5, details[4]);
                a = ps.executeUpdate();
                
               
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return a;
    }
    public static ResultSet getCostumerShopingDetails(String mobile_number)
    {
        ResultSet rs=null;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps= con.prepareStatement("select * from costumer_history where costumer_phone = ?");
            ps.setString(1, mobile_number);
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  rs;
    }
    public static int updateItems(String... details)
    {
        int a = 0;
        String item_id = details[0];
        String item_price = details[1];
        String item_desc = details[2];
        Connection con = DBConnection.getConnection();
       try
       {
           PreparedStatement ps =  con.prepareStatement("update item_details set item_price=?,item_desc = ? where item_id = ? ");
           ps.setString(1, item_price);
           ps.setString(2, item_desc);
           ps.setString(3, item_id);
           a = ps.executeUpdate();
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return a;
    }
    public static int deleteItems(String id)
    {
        int a = 0;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from item_details where item_id = ?");
            ps.setString(1, id);
            a = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return a;
    }
    public static ResultSet forgatePassword(String name,String email,String phone_number)
    {
        ResultSet rs = null;
        Connection con = DBConnection.getConnection();
        try
        {
            PreparedStatement ps = con.prepareStatement("select * from emp_details where name=? and email=? and phone_number=?");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone_number);
            rs = ps.executeQuery();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs ;
    }
    public static void soundOfButton()
    {
        File music_path = new File("Click Sound Effect (HD).WAV");
        if(music_path.exists())
        {
            try
            {
                AudioInputStream ais = AudioSystem.getAudioInputStream(music_path);
                Clip clip = AudioSystem.getClip();
                clip.open(ais);
                clip.start();
            }
            catch(Exception e)
            {
                 e.printStackTrace();
             }
        }
    }
}

















