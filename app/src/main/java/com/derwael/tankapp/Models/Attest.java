package com.derwael.tankapp.Models;

import java.util.Date;

/**
 * Created by dylan on 04.12.14.
 */
public class Attest {

    private Company company;
    private Customer customer;
    private Tank tank;
    private Checklist checks;
    private String note;
    private Boolean testedOk;
    private Date date;

    public Attest(){}


    /* BEGIN : Getters */
    public Company getCompany(){ return this.company;}
    public Customer getCustomer(){ return this.customer;}
    public Tank getTank(){ return this.tank;}
    public Checklist getChecks(){ return this.checks;}
    public String getNote(){return this.note;}
    public Boolean getTestedOk(){return this.testedOk;}
    public Date getDate(){return this.date;}
    /* END : Getters */

    /* BEGIN : Setters */
    public void setCompany(Company x){ this.company = x;}
    public void setCustomer(Customer x){this.customer = x;}
    public void setTank(Tank x){this.tank = x;}
    public void setChecks(Checklist x){this.checks =x;}
    public void setNote(String note){this.note = note;}
    public void setTestedOk(Boolean ok){this.testedOk = ok;}
    public void setDate(Date date){this.date = date;}
    /* END : Setters */

}
