package com.example.andrewsamtoy.busterbearsalmonjournal;

/**
 * Created by andrewsamtoy on 9/5/17.
 */

public class Bear {
    private String name;
    private int belly;

    public Bear(String name){
        this.name = name;
        this.belly = 0;
    }

    public String getName() {
        return name;
    }

    public int getBelly() {
        return belly;
    }

    public int eat() {
        this.belly += 1;
        return belly;
    }
}
