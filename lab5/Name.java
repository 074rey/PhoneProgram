/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2.lab5;

/**
 *
 * @author rey7s
 */
public class Name {
    private String FirstName;
    private String LastName;
    private String Company;

     public Name(String FirstName){
        this.FirstName=FirstName;
   
    }
      public Name(String FirstName,String LastName){
        this.FirstName=FirstName;
        this.LastName=LastName;
        
    }
     
    public Name(String FirstName,String LastName, String Company){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Company=Company;
    }
    public void setFirstName(String FirstName){
     this.FirstName=FirstName;  
    }
     public String getFirstName(){
         
        return  (FirstName);
         
     }
      public void setLastName(String LastName){
      this.LastName=LastName; 
      }
       public String getLastName(){
           
        return (LastName);
           
       }
        public void setCompany(String Company){
       this.Company=Company; 
        }
         public String getCompany(){
             
         return (Company);
             
         }

         public String toString(){
             return "Name{" + "FirstName= "+ ", LastName= "+ LastName+ " , Company= " +Company+'}';
         }
}
