/**
 * Copyright (C), 2019-2019,
 * FileName: TemplateMethod
 * Author:   Administrator
 * Date:     2019/4/13 15:38
 * Description: ceshi
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package main.java.com.ghj.concurrency.chapter1;


/**
 * 模板方法
 * 1.java应用程序的main函数是一个线程，是被JVM启动的时候调用的，现成的名字啊就main
 * 2.实现一个线程，必须创建Thread实例，override run 方法，并且调用start方法
 * 3.在JVM启动后，实际上有多个线程，但是至少有一个非守护线程
 * 4.当调用一个线程的start方法时，此时至少有两个线程，一个是调用你的线程。还有一个是执行run方法的线程也就是自己创建的线程
 * 5.线程生命周期为：new,runnable,running,block.terminate
 */
public class TemplateMethod {

    public final void print(String message){
        //为什么模板方法要定义成final 因为如果不是一个不可变类。那么子类就回去复写它。它源码中start0()方法
        System.out.println("##########");
        wrapPrint(message);
        System.out.println("##########");

    }
    public void wrapPrint(String message){

    }

    public static void main(String[] args) {
        TemplateMethod t1 = new TemplateMethod(){
            @Override
            public void wrapPrint(String message){
                System.out.println("*" + message + "*");
            }
        };
        t1.print("hello Thread");

        TemplateMethod t2 = new TemplateMethod(){
            @Override
            public void wrapPrint(String message){
                System.out.println("+" + message + "+");
            }
        };
        t2.print("hello Thread");

    }
}
