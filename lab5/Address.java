/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2.lab5;

/**
 *
 * @author rey7s
 */
public class Address {
    private String street1;
    private String street2;
    private String City;
    private int PostalCode;
      
     public Address (String street1, String street2, String City){
     this.street1= street1;
     this.street2=street2;
     this.City=City;
     }
    
    public Address (String street1, String street2, String City, int PostalCode){
     this.street1= street1;
     this.street2=street2;
     this.City=City;
    this.PostalCode=PostalCode;    
    }
    public void setstreet1(String street1){
    this.street1=street1;  
    }
     public String getstreet1(){         
        return  (street1);
     }
        public void setstreet2(String street2){
    this.street2=street2;  
    }
     public String getstreet2(){         
        return  (street2);
     }
        public void setCity(String City){
     this.City=City;
    }
     public String getCity(){         
        return(City);
     }
    public void setPostalCode(int PostalCode){
   this.PostalCode=PostalCode;
    }
     public int getPostalCode(){         
        return (PostalCode);
     }  

    @Override
    public String toString() {
        return "Address{" + "street1=" + street1 + ", street2=" + street2 + ", City=" + City + ", PostalCode=" + PostalCode + '}';
    }
     
}
