package com.example.ktx.entity;

import javax.persistence.*;

@Entity
@Table(name = "tblstudent")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "masv")
   private String maSV;

   @Column(name = "cmt")
   private String CMT;

   @Column(name = "birthday")
   private String birthDay;

   @Column(name = "classSV")
   private String classSV;
   @Column(name = "hometown")
   private String homeTown;

   public User() {
   }

   public User(Long id, String maSV, String CMT, String birthDay, String classSV, String homeTown) {
      this.id = id;
      this.maSV = maSV;
      this.CMT = CMT;
      this.birthDay = birthDay;
      this.classSV = classSV;
      this.homeTown = homeTown;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getMaSV() {
      return maSV;
   }

   public void setMaSV(String maSV) {
      this.maSV = maSV;
   }

   public String getCMT() {
      return CMT;
   }

   public void setCMT(String CMT) {
      this.CMT = CMT;
   }

   public String getBirthDay() {
      return birthDay;
   }

   public void setBirthDay(String birthDay) {
      this.birthDay = birthDay;
   }

   public String getClassSV() {
      return classSV;
   }

   public void setClassSV(String classSV) {
      this.classSV = classSV;
   }

   public String getHomeTown() {
      return homeTown;
   }

   public void setHomeTown(String homeTown) {
      this.homeTown = homeTown;
   }
}