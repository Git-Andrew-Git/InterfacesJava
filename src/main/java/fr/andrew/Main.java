package fr.andrew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drone> drone = new ArrayList<>(Arrays.asList(
                new Drone(0, 23),
                new Drone(1, 300),
                new Drone(2, 200),
                new Drone(3, 100)
        ));
        drone.get(0).voler();
        drone.get(0).voler();
        drone.get(0).voler();
        drone.get(0).voler();
        drone.get(1).voler();
        drone.get(1).voler();
        drone.get(1).voler();
        drone.get(2).voler();
        drone.get(2).voler();
        drone.get(3).voler();


        drone.get(0).recharger();
        drone.get(1).recharger();
        drone.get(2).recharger();
        drone.get(3).recharger();



    }
}