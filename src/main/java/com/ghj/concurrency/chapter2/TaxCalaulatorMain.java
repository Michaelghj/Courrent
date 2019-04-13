/**
 * Copyright (C), 2019-2019,
 * FileName: TaxCalaulatorMain
 * Author:   Administrator
 * Date:     2019/4/13 18:15
 * Description: 主函数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.concurrency.chapter2;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

/**
 * 〈一句话功能简述〉<br> 
 * 〈主函数〉
 *
 * @author Administrator
 * @create 2019/4/13
 * @since 1.0.0
 */
public class TaxCalaulatorMain {

   /* public static void main(String[] args) {
        TaxCalaulator taxCalaulator = new TaxCalaulator(10000d, 2000d){
            @Override
            public double calcTax(){
                return getSalary() * 0.1 + getBonus() * 0.15;
            }
        };
        double tax = taxCalaulator.calculate();
        System.out.println(tax);
    }*/
   public static void main(String[] args) {

       TaxCalaulator calaulator = new TaxCalaulator(10000d,2000d);

       CalculatorStrategy strategy = new SimpleCalculatorStrategy();

       calaulator.setCalculatorStrategy(strategy);

       System.out.println(calaulator.calculate());
   }



}
