package com.rebelscrum.MSUBanner.Application.Entity;

import javax.persistence.*;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String userType;


   public String getFirstName() {
       return firstName;
   }
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }

   public Integer getId(){
       return id;
   }

   public void setId(Integer id) {
       this.id = id;
   }

   public void setUserType(String userType) {
       this.userType = userType;
   }

   public String getUserType() {
       return userType;
   }



    }

