create database ayatie;
use ayatie;

CREATE TABLE clusters (
  cid INT PRIMARY KEY,
  cname VARCHAR(255) NOT NULL
);

CREATE TABLE ayat (
  aid INT PRIMARY KEY,
  surah_no INT NOT NULL,
  ayah_no INT NOT NULL,
  cid INT NOT NULL,
  FOREIGN KEY (cid) REFERENCES clusters(cid)
);

CREATE TABLE quraan (
  sr_no INT PRIMARY KEY,
  surah_no INT NOT NULL,
  surah_name VARCHAR(255) NOT NULL,
  classification VARCHAR(50),
  original_arabic_text TEXT NOT NULL,
  arabic_text TEXT NOT NULL,
  ayah_no INT NOT NULL
);

CREATE TABLE surdata (
  surah_no INT PRIMARY KEY,
  surah_name VARCHAR(255) NOT NULL,
  ayat_no INT NOT NULL
);

-- drop database ayatie