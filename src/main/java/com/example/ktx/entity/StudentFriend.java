package com.example.ktx.entity;

import javax.persistence.*;

@Entity
@Table (name = "studentfriend")
public class StudentFriend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cmt")
    private String CMT;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "textnote")
    private String textnote;

    @Column(name = "ondate")
    private String ondate;

    @Column(name = "outdate")
    private String outdate;

    public StudentFriend() {
    }

    public StudentFriend(Integer id, String CMT, String name, String birthday, String textnote, String ondate, String outdate) {
        this.id = id;
        this.CMT = CMT;
        this.name = name;
        this.birthday = birthday;
        this.textnote = textnote;
        this.ondate = ondate;
        this.outdate = outdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTextnote() {
        return textnote;
    }

    public void setTextnote(String textnote) {
        this.textnote = textnote;
    }

    public String getOndate() {
        return ondate;
    }

    public void setOndate(String ondate) {
        this.ondate = ondate;
    }

    public String getOutdate() {
        return outdate;
    }

    public void setOutdate(String outdate) {
        this.outdate = outdate;
    }
}
