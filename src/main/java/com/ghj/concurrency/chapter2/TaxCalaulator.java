/**
 * Copyright (C), 2019-2019,
 * FileName: TaxCalaulator
 * Author:   Administrator
 * Date:     2019/4/13 18:09
 * Description: 计算器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ghj.concurrency.chapter2;

/**
 * 一个税务计算器
 */
public class TaxCalaulator {

    private final double salary;

    private final double bonus;

    private  CalculatorStrategy calculatorStrategy;

    public CalculatorStrategy getCalculatorStrategy() {
        return calculatorStrategy;
    }

    public void setCalculatorStrategy(CalculatorStrategy calculatorStrategy) {
        this.calculatorStrategy = calculatorStrategy;
    }

    public TaxCalaulator(double salary, double bonus ){
        this.bonus = bonus;
        this.salary = salary;
    }

    public double calcTax(){

        return calculatorStrategy.calculate(salary, bonus );
    }

    public double calculate(){
        return this.calcTax();
    }

    public double getSalary() {
        return salary;
    }
    public double getBonus() {
        return bonus;
    }
}
