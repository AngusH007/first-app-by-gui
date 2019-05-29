package com.example.firstappbygui.designpattern.observer;

import java.util.LinkedList;
import java.util.List;

public class User implements Observable , Observer {


    private List<Observer> friends;
    private String name;

    public User(String name) {
        this.name = name;
        this.friends = new LinkedList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.friends.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.friends.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        this.friends.forEach(friend -> {
            friend.update(this.name, message);
        });
    }

    @Override
    public void update(String name, String message) {
        System.out.println("【" + this.name + "】看到【" + name + "】发的朋友圈：" + message);
    }

    public void sendMessage(String message) {
        this.notifyObservers(message);
    }
}
