package com.reto5.model;
import java.util.Date;

public class Leader {
    private int idLeader;
    private String name;
    private String surname;
    private String cityResidence;
    public Leader() {
    }

    public Leader(int idLeader, String name, String surname, String cityResidence) {
        this.idLeader = idLeader;
        this.name = name;
        this.surname = surname;
        this.cityResidence = cityResidence;
    }

    public int getIdLeader() {
        return idLeader;
    }

    public void setIdLeader(int idLeader) {
        this.idLeader = idLeader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCityResidence() {
        return cityResidence;
    }

    public void setCityResidence(String cityResidence) {
        this.cityResidence = cityResidence;
    }
}
