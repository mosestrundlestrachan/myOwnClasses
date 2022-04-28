package com.company;

import java.time.LocalDate;

public class adventure {

    private typeOfAdventure type;
    private String name;
    private String location;
    private LocalDate dateOfAdventure;
    private boolean isRaining;
    public enum typeOfAdventure{
        CAMPING, TROPICAL, SKI
    }

    public adventure(String name, String location, LocalDate dateOfAdventure, adventure.typeOfAdventure type) {

        this.name = name;
        this.location = location;
        this.dateOfAdventure = dateOfAdventure;
        this.type = type;

    }

    public typeOfAdventure getType() {
        return type;
    }

    public void setType(typeOfAdventure type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDateOfAdventure() {
        return dateOfAdventure;
    }

    public void setDateOfAdventure(LocalDate dateOfAdventure) {
        this.dateOfAdventure = dateOfAdventure;
    }

    public boolean isRaining() {
        if (type != typeOfAdventure.TROPICAL) {
            return false;
        }
        return isRaining;
    }

    public void setRaining(boolean raining) {
        isRaining = raining;
    }

}
