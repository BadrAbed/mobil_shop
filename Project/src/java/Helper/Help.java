/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Bean.USER;
import Bean.product;
import DatabaseConnection.DatabaseConnection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

public class Help {
    
    
    
    static Connection con;
    static PreparedStatement preStmt;
    static ResultSet result;
    private Statement stmt;
    public static USER isExist(String user,String pass ){
         USER  u=null;
        try {
            
            con=DatabaseConnection.getConnection();
            preStmt=con.prepareStatement("select * from user where user_email=? and user_password=? ");    
            ArrayList<Object> paramertes=new ArrayList<Object>();
            paramertes.add(user);
            paramertes.add(pass);
           // paramertes.add(type);
            
            result=DatabaseConnection.executeQuery(preStmt, paramertes);
            if(result.next()){
                u=new  USER ();
                u.setID(result.getInt("ID"));
                u.setName(result.getString("Name"));
              u.setMail(result.getString("user_email"));
              u.setMob(result.getString("Tel"));
              u.setPassword(result.getString("user_password"));
              u.setType(result.getInt("UserType"));
             u.setID(result.getInt("id"));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger( USER.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }
  public static void add(String user,String tell,String email,String pass,int type){
      
              try {
                   con=DatabaseConnection.getConnection();
             String insertstring="insert into user(Name,Tel,user_email,user_password,UserType)values(?,?,?,?,?)";
            
           
            preStmt=con.prepareStatement(insertstring);    
            ArrayList<Object> paramertes=new ArrayList<Object>();
            paramertes.add(user);
            paramertes.add(tell);
             paramertes.add(email);
              paramertes.add(pass);
               paramertes.add(type);
           
         
            DatabaseConnection.executeNonQuery(preStmt, paramertes);
         
             
        } catch (SQLException ex) {
            Logger.getLogger( USER.class.getName()).log(Level.SEVERE, null, ex);
        }
                
  }  
    public static void update(String user,String tell,String email,String pass,int type,int id){
      
              try {
                   con=DatabaseConnection.getConnection();
             String insertstring="update user set Name=? ,Tel=? ,user_email=? ,user_password=? ,UserType=? where id=? ";
             
            
           
            preStmt=con.prepareStatement(insertstring);    
            ArrayList<Object> paramertes=new ArrayList<Object>();
            
            paramertes.add(user);
            paramertes.add(tell);
             paramertes.add(email);
              paramertes.add(pass);
               paramertes.add(type);
             paramertes.add(id);
         
            DatabaseConnection.executeNonQuery(preStmt, paramertes);
         
             
        } catch (SQLException ex) {
            Logger.getLogger( USER.class.getName()).log(Level.SEVERE, null, ex);
        }
                
  }
    
    public static USER newasdd(String user ){
         USER  n=null;
        try {
            
            con=DatabaseConnection.getConnection();
            preStmt=con.prepareStatement("select * from user where user_email=? ");    
            ArrayList<Object> paramertes=new ArrayList<Object>();
            paramertes.add(user);
          //  paramertes.add(user);
           // paramertes.add(type);
            
            result=DatabaseConnection.executeQuery(preStmt, paramertes);
            if(result.next()){
                n=new  USER ();
                n.setID(result.getInt("ID"));
                n.setName(result.getString("Name"));
              n.setMail(result.getString("user_email"));
              n.setMob(result.getString("Tel"));
              n.setPassword(result.getString("user_password"));
              n.setType(result.getInt("UserType"));
             n.setID(result.getInt("id"));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger( USER.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
   public static USER updatepass(String pass,String email){
      USER V=null;
              try {
                   con=DatabaseConnection.getConnection();
             String insertstring="update user set user_password=?  where user_email=? ";
             
            
           
            preStmt=con.prepareStatement(insertstring);    
            ArrayList<Object> paramertes=new ArrayList<Object>();
            
          
             
              paramertes.add(pass);
              paramertes.add(email);
             
         
            DatabaseConnection.executeNonQuery(preStmt, paramertes);
             if(result.next()){
                V=new  USER ();
                V.setID(result.getInt("ID"));
                V.setName(result.getString("Name"));
              V.setMail(result.getString("user_email"));
              V.setMob(result.getString("Tel"));
              V.setPassword(result.getString("user_password"));
              V.setType(result.getInt("UserType"));
             V.setID(result.getInt("id"));
         
             }  
        } catch (SQLException ex) {
            Logger.getLogger( USER.class.getName()).log(Level.SEVERE, null, ex);
        }
              return V;
   }
   public  List view(){
       
     List ldata = new ArrayList();
     USER V= null;
              try {
                   con=DatabaseConnection.getConnection();
             String insertstring="select * from user where UserType <> 1 ";
             
            
           
            preStmt=con.prepareStatement(insertstring);    
           // ArrayList<Object> paramertes=new ArrayList<Object>();
            
          
             result=preStmt.executeQuery();
              
             
         
           // DatabaseConnection.executeNonQuery(preStmt, paramertes);
             while(result.next()){
                V=new  USER ();
                V.setID(result.getInt("ID"));
                V.setName(result.getString("Name"));
              V.setMail(result.getString("user_email"));
              V.setMob(result.getString("Tel"));
              V.setPassword(result.getString("user_password"));
              V.setType(result.getInt("UserType"));
             V.setID(result.getInt("id"));
        ldata.add(V);
             }  
        } catch (SQLException ex) {
            Logger.getLogger( USER.class.getName()).log(Level.SEVERE, null, ex);
        }
              return ldata;
   }
//*************************************************************************************

   public static void delete(String id) throws SQLException{
      
              try {
                   con=DatabaseConnection.getConnection();
             String insertstring="delete from user where ID=? ";
             
            
           
            preStmt=con.prepareStatement(insertstring);    
            ArrayList<Object> paramertes=new ArrayList<Object>();
            
          
             
              paramertes.add(id);
             
             
         
            DatabaseConnection.executeNonQuery(preStmt, paramertes);
              
        } catch (SQLException ex) {
            Logger.getLogger( USER.class.getName()).log(Level.SEVERE, null, ex);
        }
              
}
//*************************************************************************************
     public  List search( int id){
       
     List ldata = new ArrayList();
     USER V= null;
              try {
                   con=DatabaseConnection.getConnection();
             String insertstring="select * from user where id ='"+id+"'";
             
            
           
            preStmt=con.prepareStatement(insertstring);    
           // ArrayList<Object> paramertes=new ArrayList<Object>();
            
          
             result=preStmt.executeQuery();
              
             
         
           // DatabaseConnection.executeNonQuery(preStmt, paramertes);
             while(result.next()){
                V=new  USER ();
                //V.setID(result.getInt("ID"));
                V.setName(result.getString("Name"));
              V.setMail(result.getString("user_email"));
              V.setMob(result.getString("Tel"));
              //V.setPassword(result.getString("user_password"));
              V.setType(result.getInt("UserType"));
             V.setID(result.getInt("id"));
        ldata.add(V);
             }  
        } catch (SQLException ex) {
            Logger.getLogger( USER.class.getName()).log(Level.SEVERE, null, ex);
        }
              return ldata;
   }
     //********************************************************************
     
     public List getallcompanyproduct(String C_mail) {//
        List ldata = new ArrayList();
        
        try {
            String sql = "select * from product  where c_mail='"+C_mail+"' ";
            //session = request.getSession();
            PreparedStatement pre = con.prepareCall(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
            product pro=new product();
            pro.setName(rs.getString("name"));
            pro.setC_mail(rs.getString("c_mail"));
            pro.setC_name(rs.getString("c_name"));
            pro.setProduct_code(rs.getString("product_code"));
            pro.setPrice(rs.getString("price"));
            ldata.add(pro);
            //session.setAttribute("objLst", ldata);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(SQLException.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ldata;
        
        
    }
          //********************************************************************

     public boolean DeleteProduct(String product_code){
                              boolean check=true;
  
         try {
               con=DatabaseConnection.getConnection();
       
            stmt=con.createStatement();
                        stmt.executeUpdate("Delete from product where product_code='"+product_code+"'");

        } catch (SQLException ex) {
           check=false; //Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                     
return check;
       
           
       
       }
    

          public boolean EditProduct(String product_name,int new_product_code,double product_price,int current_product_code){
                              boolean check=true;
  
         try {
               con=DatabaseConnection.getConnection();
       
            stmt=con.createStatement();
                        stmt.executeUpdate("UPDATE `product` SET `name`='"+product_name+"',`product_code`='"+new_product_code+"',`price`='"+product_price+"' WHERE `product_code`='"+current_product_code+"'  ");

        } catch (SQLException ex) {
           check=false; //Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                     
return check;
       
           
       
       }
             public boolean ADDProduct(String product_name,String C_email,String C_name,int product_code,double product_price){
                              boolean check;
  
         try {
             check=true;
                             con=DatabaseConnection.getConnection();
//    String insertstring="INSERT INTO `customer_product` (`product_code`, `customer_email`, `product_name`, `company_name`, `company_email`, `price`) VALUES (?,?,?,?,?,?)";
            
           String insertstring="INSERT INTO `product`(`name`,`c_mail`,`c_name`,`product_code`,`price`) VALUES (?,?,?,?,?)";
         
                   preStmt=con.prepareStatement(insertstring);
    ArrayList<Object> paramertes=new ArrayList<Object>();
    paramertes.add(product_name);
    paramertes.add(C_email);
    paramertes.add(C_name);
    paramertes.add(product_code);
    paramertes.add(product_price);
         
            DatabaseConnection.executeNonQuery(preStmt, paramertes);
        } catch (SQLException ex) {
           check=false;

           Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                     
return check;
       
           
       
       }
     
       public List getallproduct() {
        List ldata = new ArrayList();
        
        try {
            String sql = "select * from product ";
            //session = request.getSession();
            PreparedStatement pre = con.prepareCall(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
            product pro=new product();
            pro.setName(rs.getString(1));
            pro.setC_mail(rs.getString(2));
            pro.setC_name(rs.getString(3));
            pro.setProduct_code(rs.getString(4));
            pro.setPrice(rs.getString(5));
            ldata.add(pro);
            //session.setAttribute("objLst", ldata);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(SQLException.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ldata;
    }
       public boolean add_customer_product(String productCode,String customermail,String productName,String companyName,String companyMail,String productPrice){
      boolean check=true;
              try {
                   con=DatabaseConnection.getConnection();
    String insertstring="INSERT INTO `customer_product` (`product_code`, `customer_email`, `product_name`, `company_name`, `company_email`, `price`) VALUES (?,?,?,?,?,?)";
            
         
                   preStmt=con.prepareStatement(insertstring);
    ArrayList<Object> paramertes=new ArrayList<Object>();
    paramertes.add(productCode);
    paramertes.add(customermail);
    paramertes.add(productName);
    paramertes.add(companyName);
    paramertes.add(companyMail);
    paramertes.add(productPrice); 
         
            DatabaseConnection.executeNonQuery(preStmt, paramertes);
         
             
        } catch (SQLException ex) {
            check=false;
            Logger.getLogger( USER.class.getName()).log(Level.SEVERE, null, ex);
        }
                return check;
  }  
      // ****************************************************************
      public List getalluserproduct(String user_mail) {//
        List ldata = new ArrayList();
        
        try {
            String sql = "select * from customer_product  where customer_email='"+user_mail+"' ";
            //session = request.getSession();
            PreparedStatement pre = con.prepareCall(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
            product pro=new product();
            pro.setProduct_code(rs.getString("product_code"));
            pro.setName(rs.getString("product_name"));
            pro.setC_mail(rs.getString("company_email"));
            pro.setC_name(rs.getString("company_name"));
            pro.setPrice(rs.getString("price"));
            pro.setDate(rs.getString("date"));
           pro.setId(rs.getInt("id"));


            

            ldata.add(pro);
            //session.setAttribute("objLst", ldata);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(SQLException.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ldata;
        
        
    } 
      
           public boolean USERDeleteProduct(String product_code,String user_email,int id){
                              boolean check=true;
  
         try {
               con=DatabaseConnection.getConnection();
       
            stmt=con.createStatement();
                        stmt.executeUpdate("Delete from customer_product where product_code='"+product_code+"' and customer_email='"+user_email+"' and id ='"+id+"' ");

        } catch (SQLException ex) {
           check=false; //Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                     
return check;
       
           
       
       }
           
            public  List viewallCompanies(){
       
     List ldata = new ArrayList();
     USER V= null;
              try {
                   con=DatabaseConnection.getConnection();
             String insertstring="select * from user where UserType = 3 ";
             
            
           
            preStmt=con.prepareStatement(insertstring);    
           // ArrayList<Object> paramertes=new ArrayList<Object>();
            
          
             result=preStmt.executeQuery();
              
             
         
           // DatabaseConnection.executeNonQuery(preStmt, paramertes);
             while(result.next()){
                V=new  USER ();
                V.setID(result.getInt("ID"));
                V.setName(result.getString("Name"));
              V.setMail(result.getString("user_email"));
              V.setMob(result.getString("Tel"));
              V.setPassword(result.getString("user_password"));
              V.setType(result.getInt("UserType"));
             V.setID(result.getInt("id"));
        ldata.add(V);
             }  
        } catch (SQLException ex) {
            Logger.getLogger( USER.class.getName()).log(Level.SEVERE, null, ex);
        }
              return ldata;
   }
      
}


