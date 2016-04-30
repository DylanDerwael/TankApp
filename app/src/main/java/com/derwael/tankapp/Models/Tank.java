package com.derwael.tankapp.Models;

/**
 * Created by K103-1 on 21/11/2014.
 */
public class Tank {

    private String address;
    private int volume;
    private String material;
    private int id;
    private Boolean accessable;

    public Tank(){}

    /* BEGIN : Getters */
    public String getAddress () { return this.address; }
    public int getVolume () { return this.volume; }
    public String getMaterial () { return this.material; }
    public int getId () { return this.id; }
    public  Boolean getAccessable () { return this.accessable; }
    /* END: Getters */

    /* BEGIN : Setters */
    public void setAddress (String address) { this.address = address;}
    public void setVolume (int volume) { this.volume = volume; }
    public void setMaterial (String material) { this.material = material; }
    public void setId (int id) { this.id = id; }
    public void setAccessable (Boolean accessable) { this.accessable = accessable; }
    /* END: Setters */
}
