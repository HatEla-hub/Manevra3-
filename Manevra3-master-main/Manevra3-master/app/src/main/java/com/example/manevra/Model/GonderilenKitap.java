package com.example.manevra.Model;

public class GonderilenKitap {
    private String GonderilenKitapID;
    private String GonderilenKitapResmi;
    private String GonderilenKitapHakkinda;
    private String Gonderen;

    public GonderilenKitap() {
    }

    public GonderilenKitap(String gonderilenKitapID, String gonderilenKitapResmi, String gonderilenKitapHakkinda, String gonderen) {
        GonderilenKitapID = gonderilenKitapID;
        GonderilenKitapResmi = gonderilenKitapResmi;
        GonderilenKitapHakkinda = gonderilenKitapHakkinda;
        Gonderen = gonderen;
    }

    public String getGonderilenKitapID() {
        return GonderilenKitapID;
    }

    public void setGonderilenKitapID(String gonderilenKitapID) {
        GonderilenKitapID = gonderilenKitapID;
    }

    public String getGonderilenKitapResmi() {
        return GonderilenKitapResmi;
    }

    public void setGonderilenKitapResmi(String gonderilenKitapResmi) {
        GonderilenKitapResmi = gonderilenKitapResmi;
    }

    public String getGonderilenKitapHakkinda() {
        return GonderilenKitapHakkinda;
    }

    public void setGonderilenKitapHakkinda(String gonderilenKitapHakkinda) {
        GonderilenKitapHakkinda = gonderilenKitapHakkinda;
    }

    public String getGonderen() {
        return Gonderen;
    }

    public void setGonderen(String gonderen) {
        Gonderen = gonderen;
    }
}