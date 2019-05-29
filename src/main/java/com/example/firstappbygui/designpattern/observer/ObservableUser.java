package com.example.firstappbygui.designpattern.observer;

import java.util.LinkedList;
import java.util.List;

public class ObservableUser implements Observable {

    /**
     * 存放观察者的集合
     */
    private List<Observer> friends;

    private String name;

    public ObservableUser(String name) {
        this.name = name;
        this.friends = new LinkedList<>();
    }

    public void sendMessage(String message) {
        this.notifyObservers(message);
    }

    @Override
    public void addObserver(Observer observer) {

        friends.add( observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        friends.remove( observer);
    }

    @Override
    public void notifyObservers(String message) {
        this.friends.forEach(friend -> {
            friend.update(this.name, message);
        });

    }
}
