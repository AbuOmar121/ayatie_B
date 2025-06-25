package com.ayatie.ayat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clusters")
public class Cluster {

    @Id
    private int cid;

    private String cname;

    // Constructors
    public Cluster() {}

    public Cluster(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    // Getters and setters
    public int getCid() { return cid; }
    public void setCid(int cid) { this.cid = cid; }

    public String getCname() { return cname; }
    public void setCname(String cname) { this.cname = cname; }
}
