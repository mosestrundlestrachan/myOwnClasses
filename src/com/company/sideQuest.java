package com.company;


public class sideQuest {

    private String name;
    private String location;
    public difficulty type;
    public enum difficulty {
        GREEN, BLUE, BLACK, DOUBLEBLACK, EXPERT
    }
    private boolean rewardAvailable;


    public sideQuest(String name, String location, sideQuest.difficulty type) {

        this.name = name;
        this.location = location;
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

    public void setDifficulty(String difficulty) {
        this.type = type;
    }

    public difficulty getType() {
        return type;
    }

    public boolean isRewardAvailable() {

        if(type != difficulty.EXPERT) {
            rewardAvailable = false;
        }
        if (type == difficulty.EXPERT) {
            rewardAvailable = true;
        }
        return rewardAvailable;
    }

    public void setRewardAvailable(boolean rewardAvailable) {
        this.rewardAvailable = rewardAvailable;
    }

}
