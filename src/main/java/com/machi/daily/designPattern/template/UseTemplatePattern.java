package com.machi.daily.designPattern.template;

/**
 * 使用模版方法模式
 */
public class UseTemplatePattern {

    public static void main(String[] args) {
        Calculator1 calculator1 = new Calculator1();
        calculator1.calculate();
        Calculator2 calculator2 = new Calculator2();
        calculator2.calculate();
    }

    public interface DiscountCalculator {
        void calculate();
    }
    /**
     * 抽象类，包含公共方法
     */
    public static abstract class AbstraceCalculator implements DiscountCalculator{
        public void calculate() {
            //公共的逻辑
            commonCalculate();
            //抽象的方法，由各自子类实现
            specialCalculate();
        }

        public abstract void specialCalculate();

        private void commonCalculate() {
            System.out.println("这是公共的代码逻辑");
        }
    }

    public static class Calculator1 extends AbstraceCalculator{
        @Override
        public void specialCalculate() {
            System.out.println("这是1的特殊逻辑");
        }
    }

    public static class Calculator2 extends AbstraceCalculator{
        @Override
        public void specialCalculate() {
            System.out.println("这是2的特殊逻辑");
        }
    }
}
