package com.machi.daily.designPattern.prototype;

public class PrototypePatternDemo {


    public static void main(String[] args) throws Exception{
        Product product = new Product("测试产品",new Component("测试组件"));
        Product copy = product.clone();
        System.out.println(copy);
    }

    public static class Component{
        private String name;

        public Component(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Component{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        protected Component clone() throws CloneNotSupportedException {
            return new Component(getName());
        }
    }

    public static class Product{
        private String name;
        private Component component;

        public Product(String name, Component component) {
            this.name = name;
            this.component = component;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Component getComponent() {
            return component;
        }

        public void setComponent(Component component) {
            this.component = component;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", component=" + component +
                    '}';
        }

        @Override
        protected Product clone() throws CloneNotSupportedException {
            //浅拷贝，仅仅对当前对成员变量进行拷贝，而里面对成员变量没有拷贝
//            return new Product(getName(),getComponent());

            //深度拷贝，递归对自己引用的对象进行拷贝
            return new Product(getName(),getComponent().clone());
        }
    }
}
