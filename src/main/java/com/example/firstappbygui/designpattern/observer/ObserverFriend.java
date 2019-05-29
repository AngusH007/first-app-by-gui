package com.example.firstappbygui.designpattern.observer;

public class ObserverFriend implements Observer {

    private String name;

    public ObserverFriend(String name) {
        this.name = name;
    }
    @Override
    public void update(String name, String message) {
        System.out.println("【" + this.name + "】看到【" + name + "】发的朋友圈：" + message);
    }
}
