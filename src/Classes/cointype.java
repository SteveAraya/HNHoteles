/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author marco
 */
public class cointype {
    private String coinname;
    private int changetype;

    public cointype(String coinname, int changetype) {
        this.coinname = coinname;
        this.changetype = changetype;
    }

    public String getCoinname() {
        return coinname;
    }

    public void setCoinname(String coinname) {
        this.coinname = coinname;
    }

    public int getChangetype() {
        return changetype;
    }

    public void setChangetype(int changetype) {
        this.changetype = changetype;
    }
    
    
}
