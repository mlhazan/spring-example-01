
package com.spring.mvc;

import java.util.ArrayList;
import java.util.Date;

public class Student {
     String studentName;
     String studentHobby;
     Long studentMobile;
     Date studentDOB;
     private Address studentAddress;

     public Address getStudentAddress() {
          return studentAddress;
     }

     public void setStudentAddress(Address studentAddress) {
          this.studentAddress = studentAddress;
     }
     
     private ArrayList<String> studentSkills;

     public String getStudentName() {
          return studentName;
     }

     public void setStudentName(String studentName) {
          this.studentName = studentName;
     }

     public String getStudentHobby() {
          return studentHobby;
     }

     public void setStudentHobby(String studentHobby) {
          this.studentHobby = studentHobby;
     }

     public Long getStudentMobile() {
          return studentMobile;
     }

     public void setStudentMobile(Long studentMobile) {
          this.studentMobile = studentMobile;
     }

     public Date getStudentDOB() {
          return studentDOB;
     }

     public void setStudentDOB(Date studentDOB) {
          this.studentDOB = studentDOB;
     }

     public ArrayList<String> getStudentSkills() {
          return studentSkills;
     }

     public void setStudentSkills(ArrayList<String> studentSkills) {
          this.studentSkills = studentSkills;
     }
     

}