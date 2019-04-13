/**
 * Copyright (C), 2019-2019,
 * FileName: SimpleCalculatorStrategy
 * Author:   Administrator
 * Date:     2019/4/13 23:33
 * Description: 简单的实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.concurrency.chapter2;

/**
 * 〈一句话功能简述〉<br> 
 * 〈简单的实现〉
 *
 * @author Administrator
 * @create 2019/4/13
 * @since 1.0.0
 */
public class SimpleCalculatorStrategy implements CalculatorStrategy{

    private final static double SALARY_RATE = 0.1;
    private final static double BOUNS_RATE = 0.1;
    @Override
    public double calculate(double salary, double bouns){
        return salary * SALARY_RATE + bouns * BOUNS_RATE;
    }
}
