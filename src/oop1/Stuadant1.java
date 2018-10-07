/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

/**
 *
 * @author ا
 */
public class Stuadant1 {
    private String name;
  private String ID;
  private int gpa;
  private String major;
  private String cooleg;
  
  
  public Stuadant1(String name){
      this.name=name;
  }
  
  public String getReport(){
      String report="";
        report+="*****Report about  "+getName()+"**********";
       report+= getCooleg();
       return report;
             
  }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the gpa
     */
    public int getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the cooleg
     */
    public String getCooleg() {
        return cooleg;
    }

    /**
     * @param cooleg the cooleg to set
     */
    public void setCooleg(String cooleg) {
        this.cooleg = cooleg;
    }
    
}
