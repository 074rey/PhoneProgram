/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2.lab5;

/**
 *
 * @author rey7s
 */
public class Contact {
    Name name;
    Date date;
    Address address;
    long Number;
    boolean Block;
    String email;
    boolean favorite;
            
    public Contact(){
        Block=false;
        favorite=false;
    }

    public Contact(Name name, long Number) {
        this.name = name;
        this.Number = Number;
    }
    

    public Contact(Name name, Date date, Address address, long Number, String email) {
        this.name = name;
        this.date = date;
        this.address = address;
        this.Number = Number;
        Block=false;
        this.email = email;
        favorite=false;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getNumber() {
        return Number;
    }

    public void setNumber(long Number) {
        this.Number = Number;
    }

    public boolean isBlock() {
        return Block;
    }

    public void setBlock(boolean Block) {
        this.Block = Block;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
//should the another class be have toString so i can print them here all.
    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", date=" + date + ", address=" + address + ", Number=" + Number + ", Block=" + Block + ", email=" + email + ", favorite=" + favorite + '}';
    }
    
}
