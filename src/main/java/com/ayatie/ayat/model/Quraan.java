package com.ayatie.ayat.model;

import jakarta.persistence.*;

@Entity
@Table(name = "quraan")
public class Quraan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long srNo;

    private int surahNo;
    private String surahName;
    private String classification;
    @Lob
    private String originalArabicText;
    @Lob
    private String arabicText;
    private int ayahNo;

    // Constructors
    public Quraan() {}

    public Quraan(int surahNo, String surahName, String classification, String originalArabicText, String arabicText, int ayahNo) {
        this.surahNo = surahNo;
        this.surahName = surahName;
        this.classification = classification;
        this.originalArabicText = originalArabicText;
        this.arabicText = arabicText;
        this.ayahNo = ayahNo;
    }

    // Getters and setters
    public Long getSrNo() { return srNo; }
    public void setSrNo(Long srNo) { this.srNo = srNo; }

    public int getSurahNo() { return surahNo; }
    public void setSurahNo(int surahNo) { this.surahNo = surahNo; }

    public String getSurahName() { return surahName; }
    public void setSurahName(String surahName) { this.surahName = surahName; }

    public String getClassification() { return classification; }
    public void setClassification(String classification) { this.classification = classification; }

    public String getOriginalArabicText() { return originalArabicText; }
    public void setOriginalArabicText(String originalArabicText) { this.originalArabicText = originalArabicText; }

    public String getArabicText() { return arabicText; }
    public void setArabicText(String arabicText) { this.arabicText = arabicText; }

    public int getAyahNo() { return ayahNo; }
    public void setAyahNo(int ayahNo) { this.ayahNo = ayahNo; }
}
