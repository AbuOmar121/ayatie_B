package com.ayatie.ayat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ayat")
public class Ayat {

    @Id
    private int aid;

    private int surahNo;
    private int ayahNo;
    private int cid;

    // Constructors
    public Ayat() {}

    public Ayat(int aid, int surahNo, int ayahNo, int cid) {
        this.aid = aid;
        this.surahNo = surahNo;
        this.ayahNo = ayahNo;
        this.cid = cid;
    }

    // Getters and setters
    public int getAid() { return aid; }
    public void setAid(int aid) { this.aid = aid; }

    public int getSurahNo() { return surahNo; }
    public void setSurahNo(int surahNo) { this.surahNo = surahNo; }

    public int getAyahNo() { return ayahNo; }
    public void setAyahNo(int ayahNo) { this.ayahNo = ayahNo; }

    public int getCid() { return cid; }
    public void setCid(int cid) { this.cid = cid; }
}
