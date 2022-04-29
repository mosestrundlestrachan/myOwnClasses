package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	adventure main = new adventure("Trip To Whistler", "British Columbia", LocalDate.of(2023, Month.FEBRUARY, 07), adventure.typeOfAdventure.SKI);
    sideQuest side = new sideQuest("TO SKI THE EXTREMELY HARD POWDER BOWL", "The West Slope", sideQuest.difficulty.EXPERT);
    adventureGear items = new adventureGear("SNOWBOARD", 27);
        System.out.println("Your trip is a " + main.getName());
        System.out.println("Your adventure begins in " + main.getLocation());
        System.out.println("The date of your adventure is " + main.getDateOfAdventure());
        System.out.println("It is a " + main.getType() + " trip");
        System.out.println("Your first sidequest is to " + side.getName());
        System.out.println("To start your quest go " + side.getLocation());
        System.out.println("The difficulty of your quest is " + side.getType());
        System.out.println("Rewards are only available for EXPERT level quests, so rewardAvailable is " + side.isRewardAvailable());
        System.out.println("Your gear for this adventure is a " + items.getName());
        System.out.println("The wight of your gear is " + items.getWeight());
    }
}
