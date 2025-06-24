package com.ayatie.ayat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "surdata")
public class SurData {

    @Id
    private int surahNo;

    private String surahName;
    private int ayatNo;

    // Constructors
    public SurData() {}

    public SurData(int surahNo, String surahName, int ayatNo) {
        this.surahNo = surahNo;
        this.surahName = surahName;
        this.ayatNo = ayatNo;
    }

    // Getters and setters
    public int getSurahNo() { return surahNo; }
    public void setSurahNo(int surahNo) { this.surahNo = surahNo; }

    public String getSurahName() { return surahName; }
    public void setSurahName(String surahName) { this.surahName = surahName; }

    public int getAyatNo() { return ayatNo; }
    public void setAyatNo(int ayatNo) { this.ayatNo = ayatNo; }
}
