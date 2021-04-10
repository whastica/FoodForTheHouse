/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.foodforthehouse.server.app;

import co.unicauca.foodforthehouse.server.infra.FoodForTheHouseServerSocket;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FoodForTheHouseApp {
    public static void main(String args[]){
        FoodForTheHouseServerSocket server = new FoodForTheHouseServerSocket();
        server.start();
    }
}
    

