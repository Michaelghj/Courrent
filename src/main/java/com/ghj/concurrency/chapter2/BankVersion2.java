/**
 * Copyright (C), 2019-2019,
 * FileName: BankVersion2
 * Author:   Administrator
 * Date:     2019/4/13 17:53
 * Description: 银行大厅
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.concurrency.chapter2;

/**
 * 银行大厅
 * 多个窗口同时操作公用一块数据
 */
public class BankVersion2 {

    public static void main(String[] args) {

        TicketWindowRunnable ticketWindowRunnable = new TicketWindowRunnable();
        Thread windowThread1 = new Thread(ticketWindowRunnable,"一号窗口");
        Thread windowThread2 = new Thread(ticketWindowRunnable,"二号窗口");
        Thread windowThread3 = new Thread(ticketWindowRunnable,"三号窗口");
        windowThread1.start();
        windowThread2.start();
        windowThread3.start();
    }
}
