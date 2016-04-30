package com.derwael.tankapp.Models;

/**
 * Created by K103-1 on 21/11/2014.
 */
public class Checklist {

    Boolean check1,
            check2,
            check3,
            check4,
            check5,
            check6,
            check7;

    public  Checklist(){

    }

    //TODO : documentate the different checks

    /*  BEGIN : Getters */
    public Boolean getCheck1 () { return this.check1; }
    public Boolean getCheck2 () { return this.check2; }
    public Boolean getCheck3 () { return this.check3; }
    public Boolean getCheck4 () { return this.check4; }
    public Boolean getCheck5 () { return this.check5; }
    public Boolean getCheck6 () { return this.check6; }
    public Boolean getCheck7 () { return this.check7; }
    /*  END : Getters */

    /*  BEGIN : Setters */
    public void setCheck1 (Boolean c) { this.check1 = c; }
    public void setCheck2 (Boolean c) { this.check2 = c; }
    public void setCheck3 (Boolean c) { this.check3 = c; }
    public void setCheck4 (Boolean c) { this.check4 = c; }
    public void setCheck5 (Boolean c) { this.check5 = c; }
    public void setCheck6 (Boolean c) { this.check6 = c; }
    public void setCheck7 (Boolean c) { this.check7 = c; }
    /*  END : Setters */


}
