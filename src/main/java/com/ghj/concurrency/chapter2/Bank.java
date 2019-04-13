/**
 * Copyright (C), 2019-2019,
 * FileName: Bank
 * Author:   Administrator
 * Date:     2019/4/13 17:24
 * Description: 银行大厅
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.concurrency.chapter2;
/**
 * 银行大厅
 */
public class Bank {

    public static void main(String[] args) {

        TicketWindow ticketWindow1 = new TicketWindow("一号柜台");
        ticketWindow1.start();

        TicketWindow ticketWindow2= new TicketWindow("二号柜台");
        ticketWindow2.start();

        TicketWindow ticketWindow3 = new TicketWindow("三号柜台");
        ticketWindow3.start();
    }

}
