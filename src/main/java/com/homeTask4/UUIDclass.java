package com.homeTask4;


import java.util.Random;

public class UUIDclass {
    private int uuid;

    public UUIDclass() {
        this.uuid = new Random().nextInt();
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }
}
