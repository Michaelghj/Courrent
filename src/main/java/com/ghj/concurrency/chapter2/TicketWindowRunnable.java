/**
 * Copyright (C), 2019-2019,
 * FileName: TicketWindowRunnable
 * Author:   Administrator
 * Date:     2019/4/13 17:45
 * Description: 售票窗口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.concurrency.chapter2;

/**
 *
 */
public class TicketWindowRunnable implements Runnable{

    private int index = 0;

    private static final int MAX = 50;

    @Override
    public void run() {

        while (index <= MAX){
            System.out.println(Thread.currentThread() + "的号码是" +  (index++));
        }
    }
}
