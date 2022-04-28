package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	adventure main = new adventure("Trip To Whistler", "British Columbia", LocalDate.of(2023, Month.FEBRUARY, 07), adventure.typeOfAdventure.SKI);
    sideQuest side = new sideQuest("THE EXTREMELY HARD POWDER BOWL", "The West Slope", sideQuest.difficulty.EXPERT);
    adventureGear important = new adventureGear("SNOWBOARD", "MY RIDE");
        System.out.println(main.getName());
        System.out.println(main.getLocation());
        System.out.println(main.getDateOfAdventure());
        System.out.println(main.getType());
        System.out.println(side.getName() );
        System.out.println(side.getLocation());
        System.out.println(side.getType());
        System.out.println(side.isRewardAvailable());
        System.out.println(adventureGear.getName);
    }
}
