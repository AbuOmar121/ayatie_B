package com.ayatie.ayat.model;

import jakarta.persistence.*;

@Entity
@Table(name = "quraan")
public class Quraan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int srNo;

    private int surahNo;
    private String surahName;
    private String classification;

    @Lob
    private String orignalArabicText;

    @Lob
    private String arabicText;

    private int ayahNo;

    public Quraan() {}

    public Quraan(int srNo, int surahNo, String surahName, String classification,
                  String orignalArabicText, String arabicText, int ayahNo) {
        this.srNo = srNo;
        this.surahNo = surahNo;
        this.surahName = surahName;
        this.classification = classification;
        this.orignalArabicText = orignalArabicText;
        this.arabicText = arabicText;
        this.ayahNo = ayahNo;
    }

    public int getSrNo() {
        return srNo;
    }

    public void setSrNo(int srNo) {
        this.srNo = srNo;
    }

    public int getSurahNo() {
        return surahNo;
    }

    public void setSurahNo(int surahNo) {
        this.surahNo = surahNo;
    }

    public String getSurahName() {
        return surahName;
    }

    public void setSurahName(String surahName) {
        this.surahName = surahName;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getOrignalArabicText() {
        return orignalArabicText;
    }

    public void setOrignalArabicText(String orignalArabicText) {
        this.orignalArabicText = orignalArabicText;
    }

    public String getArabicText() {
        return arabicText;
    }

    public void setArabicText(String arabicText) {
        this.arabicText = arabicText;
    }

    public int getAyahNo() {
        return ayahNo;
    }

    public void setAyahNo(int ayahNo) {
        this.ayahNo = ayahNo;
    }
}
