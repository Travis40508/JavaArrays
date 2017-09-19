package com.company;

public class Main {

    public static void main(String[] args) {
        /**Here we're simply instantiating our home object and calling the init method to start the app. We do this to break out of
         * the static context of the main method. */
        Home home = new Home();
        home.init();
    }
}
