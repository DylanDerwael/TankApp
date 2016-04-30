package com.derwael.tankapp.Models;

/**
 * Created by K103-1 on 21/11/2014.
 */
public class Company {

    private String name;
    private String address;

    public Company() {

    }

    /* BEGIN : Getters */
    public String getName () { return this.name; }
    public String getAddress () { return this.address;}
    /* END : Getters */

    /* BEGIN : Getters */
    public void setName (String name) { this.name = name; }
    public void setAddress (String address) { this.address = address; }
    /* END : Getters */

}
