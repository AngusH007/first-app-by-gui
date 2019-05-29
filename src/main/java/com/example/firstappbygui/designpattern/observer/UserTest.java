package com.example.firstappbygui.designpattern.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description:  //TODO
 * 观察者模式 是一个比较特殊的设计模式，它定义了触发机制，观察者只要订阅了被观察者，就可以第一时间得到被观察者传递的信息。
 * 在工作中，使用观察者模式的场景也比较多，比如消息队列消费，Android 开发中的事件触发机制等等。好，观察者模式就到这。
 * @Author:  angus
 * @Date:  2019/5/29
 **/
public class UserTest   {

    public static void main(String[] args) {
        User xiaoMing2 = new User("小明");
        User xiaoHong2 = new User("小红");
        User xiaoDong2 = new User("小东");

        //xiaoMing2的朋友圈
        xiaoMing2.addObserver(xiaoHong2);
        xiaoMing2.addObserver(xiaoDong2);
        xiaoMing2.sendMessage("今天真开心");
        xiaoMing2.removeObserver(xiaoHong2);
        xiaoMing2.sendMessage("希望明天也像今天一样开心");

        //xiaoHong2的朋友圈
        xiaoHong2.addObserver(xiaoMing2);
        xiaoHong2.addObserver(xiaoDong2);
        xiaoHong2.sendMessage("今天和小明吵架了，屏蔽他的朋友圈");

        //xiaoDong2的朋友圈
        xiaoDong2.addObserver(xiaoMing2);
        xiaoDong2.addObserver(xiaoHong2);
        xiaoDong2.sendMessage("小明和小红吵架了，夹在中间好尴尬");
    }

}
