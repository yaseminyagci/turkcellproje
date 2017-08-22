package com.kadirhan.fragmenttablayout.Model;

/**
 * Created by kadirhan on 18.06.2017.
 */

public class Kisi {

    private String adi;
    private String telefon;
    private int resim;

    public Kisi()
    {

    }

    public Kisi(String adi,String telefon,int resim)
    {
        this.adi = adi;
        this.telefon = telefon;
        this.resim = resim;
    }

    public String getAdi()
    {
        return this.adi;
    }

    public String getTelefon()
    {
        return this.telefon;
    }

    public int getResim() {
        return resim;
    }


}