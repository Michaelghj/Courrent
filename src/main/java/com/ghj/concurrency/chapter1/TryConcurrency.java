/**
 * Copyright (C), 2019-2019,
 * FileName: TryConcurrency
 * Author:   Administrator
 * Date:     2019/4/13 11:02
 * Description: 多线程
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package main.java.com.ghj.concurrency.chapter1;


/**
 * 读数据库时读磁盘
 * 读写操作不会同时执行，先读而且只有在读操作完成之后才会进行写操作
 */
public class TryConcurrency {

    public static void main(String[] args) {

       /* new Thread("READE-Thread"){
            @Override
            public void run(){
                readFromDataBase();
            }
        }.start();*/
       Thread t1 = new Thread("READE-Thread") {
           @Override
           public void run() {
               println(Thread.currentThread().getName());
               readFromDataBase();
           }
       };
       t1.start();//READE-Thread,但是要是没有t1.start()、该线程就不会启动，
        //println(Thread.currentThread().getName());直接调用run()方法时，该方法获得的线程就是main线程
        new Thread("WRITE-Thread"){
            @Override
            public void run(){
                writeDataToFile();
            }
        }.start();

      /*  Thread t1 = new Thread(){
            @Override
            public void run(){
                for(int i = 0; i < 1000; i++){
                    println("Task 1->"+ i);
                }
                try {
                    Thread.sleep(100 * 10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();

        for(int j = 0; j < 100; j++){
            println("Task 2->"+ j);
        }
        try {
            Thread.sleep(3000 * 10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
//        readFromDataBase();
//        writeDataToFile();
    }

    private static void readFromDataBase(){
        //从数据库读数据
        try {
            println("Begin reaf data from db");
            Thread.sleep(1000 * 10L);
            println("Read data done and start handle it.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("The data handle finish and successful.");
    }

    private static void writeDataToFile(){
        //从数据库读数据
        try {
            println("Begin write data to file");
            Thread.sleep(2000 * 20L);
            println("Write data done and start handle it.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("The data handle finish and successful.");
    }

    private static void println(String message){
        System.out.println(message);
    }
}
