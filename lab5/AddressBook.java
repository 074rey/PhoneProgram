

package pkg2.lab5;

public class AddressBook {
    Contact[] contacts ;
    public static int NumberOfContacts=0;
    
    public AddressBook (){
        contacts=new Contact[100];
        
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }
    
    public void AddContact(Contact c){
    contacts[NumberOfContacts]=c;
    NumberOfContacts++;
    }
    public void UpdateContact(Contact c,int i){
    contacts[i]=c;
    }
    public void DisplayContact(int i){
     System.out.println(contacts[i]);
    }
    public void  favoriteContact(int i){
     contacts[i].setFavorite(true);
    }
    
        public void Displayfavorite(){
     for (int i = 0; i<NumberOfContacts;i++) 
     { if (contacts[i].isFavorite())
         System.out.println(contacts[i]);
         }
    }
    public void DisplayallContact(){
     for (int i = 0; i<NumberOfContacts;i++) 
     {
         System.out.println(contacts[i]);
         }    
    }
    public void blockContact(int i){
    contacts[i].setBlock(true);
    }
    public void DisplaBlock(){
         for (int i = 0; i<NumberOfContacts;i++) 
     { if (contacts[i].isBlock())
         System.out.println(contacts[i]);
         }    
    }
    public void Displayrecent(){
         for (int i = 0; i<NumberOfContacts;i++) 
     { if ( ! contacts[i].isFavorite())
         System.out.println(contacts[i]);
         }    
    }

    void UpdateContact(long neu, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}