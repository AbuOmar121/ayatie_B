package com.ayatie.ayat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ayat")
public class Ayat {

    @Id
    private String aid;

    private int surahNo;
    private int ayahNo;
    private String cid;

    // Constructors
    public Ayat() {}

    public Ayat(String aid, int surahNo, int ayahNo, String cid) {
        this.aid = aid;
        this.surahNo = surahNo;
        this.ayahNo = ayahNo;
        this.cid = cid;
    }

    // Getters and setters
    public String getAid() { return aid; }
    public void setAid(String aid) { this.aid = aid; }

    public int getSurahNo() { return surahNo; }
    public void setSurahNo(int surahNo) { this.surahNo = surahNo; }

    public int getAyahNo() { return ayahNo; }
    public void setAyahNo(int ayahNo) { this.ayahNo = ayahNo; }

    public String getCid() { return cid; }
    public void setCid(String cid) { this.cid = cid; }
}
