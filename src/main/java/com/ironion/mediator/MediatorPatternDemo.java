package com.ironion.mediator;

/**
 * @author ironion
 * @date 2022/6/24 18:20
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User zhang = new User("张三");
        User lee = new User("李四");
        zhang.sendMessage("hello lisi");
        lee.sendMessage("hello zhangsan");
    }
}
