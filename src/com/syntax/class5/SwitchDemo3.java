package com.syntax.class5;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
        System.out.println("Where are you from?");

        String country = in.nextLine();
        String favoriteFood;
        switch(country) {

        case "USA":
            favoriteFood= "burgers andfries";
            break;

        case "Moldova":
            favoriteFood="mamaliga";
            break;

        case "Turkey":
            favoriteFood="arepa";
            break;
        case "India":
            favoriteFood="chicken curry";
            break;
        case "Yemen":
            favoriteFood="mandi";
            break;
        case "Morocco":
            favoriteFood="couscous";
            break;
        case "Afganistan":
            favoriteFood="qaboli palow";
            break;
        default:
            favoriteFood="Unknown";
            break;
        }
        System.out.println("You are from " + country+ " and your favorite food is "+ favoriteFood);
        }



	}


