package com.reto5.model;

public class Project {
    private int idProject;
    private String constructor;
    private int numberRooms;
    private String city;
    private String clasification;

    public Project() {
    }

    public Project(int idProject, String constructor, int numberRooms, String city, String clasification) {
        this.idProject = idProject;
        this.constructor = constructor;
        this.numberRooms = numberRooms;
        this.city = city;
        this.clasification = clasification;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getClasification() {
        return clasification;
    }

    public void setClasification(String clasification) {
        this.clasification = clasification;
    }
}
