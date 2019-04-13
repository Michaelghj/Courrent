/**
 * Copyright (C), 2019-2019,
 * FileName: TicketWindow
 * Author:   Administrator
 * Date:     2019/4/13 17:23
 * Description: 售票窗口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.concurrency.chapter2;

/**
 * 售票口窗口
 */
public class TicketWindow extends Thread {

    private final String name;
    //问题？ 如果这两个变量没有用static修饰，在new一个对象是每new一个对象就会实例化一次；
    //就会出现每个柜台都由他自己的1-50个客户
    private static final int MAX = 50;

    private static int index = 1;

    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run(){

        while (index <= MAX){

            System.out.println("当前的柜台是" + name + "当前的号码为：" + (index++));
        }
    }
}

