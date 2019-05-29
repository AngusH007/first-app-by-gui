package com.example.firstappbygui.designpattern.observer;

/**
 * 观察者模式：被观察对象
 */
public interface Observable {

    /**
     * @methodName: addObserver
     * @Description:  //TODO 添加观察者
     * @Author:  angus
     * @Date:  2019/5/29
     **/
    void addObserver(Observer observer);

    /**
     * @methodName: removeObserver
     * @Description:  //TODO 删除观察者
     * @Author:  angus
     * @Date:  2019/5/29
     **/
    void removeObserver(Observer observer);

    /**
     * @methodName: notifyObservers
     * @Description:  //TODO 通知观察者
     * @Author:  angus
     * @Date:  2019/5/29
     **/
    void notifyObservers(String message);


}
