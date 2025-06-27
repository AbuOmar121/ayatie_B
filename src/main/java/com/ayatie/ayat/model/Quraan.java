package com.ayatie.ayat.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name = "quraan")
public class Quraan {
@Id
    @Column(name = "sr_no")
    @JsonProperty("srNo")
    private int srNo;

    @Column(name = "surah_no")
    @JsonProperty("surahNo")
    private int surahNo;

    @Column(name = "ayah_no")
    @JsonProperty("ayahNo")
    private int ayahNo;

    @Column(name = "surah_name")
    @JsonProperty("surahName")
    private String surahName;

    @Lob
    @Column(name = "original_arabic_text")
    @JsonProperty("originalArabicText")
    private String originalArabicText;

    @Lob
    @Column(name = "arabic_text")
    @JsonProperty("arabicText")
    private String arabicText;

    public Quraan() {}

    public Quraan(int srNo, int surahNo, String surahName,
                  String originalArabicText, String arabicText, int ayahNo) {
        this.srNo = srNo;
        this.surahNo = surahNo;
        this.surahName = surahName;
        this.originalArabicText = originalArabicText;
        this.arabicText = arabicText;
        this.ayahNo = ayahNo;
    }

    // Getters and Setters...
    public int getSrNo() { return srNo; }
    public void setSrNo(int srNo) { this.srNo = srNo; }

    public int getSurahNo() { return surahNo; }
    public void setSurahNo(int surahNo) { this.surahNo = surahNo; }

    public int getAyahNo() { return ayahNo; }
    public void setAyahNo(int ayahNo) { this.ayahNo = ayahNo; }

    public String getSurahName() { return surahName; }
    public void setSurahName(String surahName) { this.surahName = surahName; }

    public String getOriginalArabicText() { return originalArabicText; }
    public void setOriginalArabicText(String originalArabicText) {
        this.originalArabicText = originalArabicText;
    }

    public String getArabicText() { return arabicText; }
    public void setArabicText(String arabicText) { this.arabicText = arabicText; }
}
