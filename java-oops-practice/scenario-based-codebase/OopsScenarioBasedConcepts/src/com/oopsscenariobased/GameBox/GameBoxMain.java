package com.oopsscenariobased.GameBox;


import java.util.Scanner;

public class GameBoxMain {

    // main method
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter user name: ");
        String userName = sc.nextLine();
        User user = new User(userName);

        System.out.print("Enter Arcade Game name: ");
        String arcadeName = sc.nextLine();

        System.out.print("Enter Arcade Game price: ");
        double arcadePrice = sc.nextDouble();

        System.out.print("Enter Arcade Game rating: ");
        double arcadeRating = sc.nextDouble();
        sc.nextLine(); 

        Game arcade = new ArcadeGame(arcadeName, arcadePrice, arcadeRating);

        System.out.print("Enter Strategy Game name: ");
        String strategyName = sc.nextLine();

        System.out.print("Enter Strategy Game price: ");
        double strategyPrice = sc.nextDouble();

        System.out.print("Enter Strategy Game rating: ");
        double strategyRating = sc.nextDouble();

        Game strategy = new StrategyGame(strategyName, strategyPrice, strategyRating);


        arcade.playDemo();
        strategy.playDemo();

        // Seasonal offer
        System.out.print("Enter seasonal offer percentage: ");
        int offer = sc.nextInt();
        strategy.applySeasonalOffer(offer);

        // Buying games
        user.buyGame(arcade);
        user.buyGame(strategy);

        // Download games
        arcade.download();
        strategy.download();

        // Show owned games
        user.showOwnedGames();

        sc.close();
    }
}
