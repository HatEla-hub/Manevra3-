package com.example.manevra.Model;

public class Kullanıcı {
    private String id;
    private String kullaniciAdi;
    private String ad;
    private String resimUri;

    public Kullanıcı(){

    }

    public Kullanıcı(String id, String kullaniciAdi, String ad, String resimUri) {
        this.id = id;
        this.kullaniciAdi = kullaniciAdi;
        this.ad = ad;
        this.resimUri = resimUri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getResimUri() {
        return resimUri;
    }

    public void setResimUri(String resimUri) {
        this.resimUri = resimUri;
    }
}