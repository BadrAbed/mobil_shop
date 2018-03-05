/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author ahmed
 */
public class product {
    
    
    
      private String name;
     
      private String c_mail;
 
      private String c_name;
      private String product_code;
      private String price;
      private int id;
      private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setC_mail(String c_mail) {
        this.c_mail = c_mail;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getC_mail() {
        return c_mail;
    }

    public String getC_name() {
        return c_name;
    }

    public String getProduct_code() {
        return product_code;
    }

    public String getPrice() {
        return price;
    }
    
}
