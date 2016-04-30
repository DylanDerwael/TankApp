package com.derwael.tankapp.Models;

/**
 * Created by K103-1 on 21/11/2014.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private int customerId;
    private String phoneNr;
    private String email;

    public Customer(){

    }

    /*  BEGIN : Getters */
    public String getFirstName () { return this.firstName; }
    public String getLastName () {  return this.lastName; }
    public String getAddress () { return this.address; }
    public int getCustomerId () { return this.customerId; }
    public String getPhoneNr () { return this.phoneNr; }
    public String getEmail() { return this.email; }
    /*  END : Getters */


    /*  BEGIN : Setters */
    public void setFirstName (String name){ this.firstName = name; }
    public void setLastName (String name) { this.lastName = name; }
    public void setAddress (String address) {this.address = address; }
    public void setCustomerId (int id) { this.customerId = id; }
    public void setPhoneNr (String phone) {this.phoneNr = phone; }
    public void setEmail (String emai) { this.email = emai; }
    /*  END : Setters */

}
