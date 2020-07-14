package com.machi.daily.designPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightPatternDemo {

    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.get("对象1");
        flyweight1.execute();

        Flyweight flyweight2 = FlyweightFactory.get("对象1");
        flyweight2.execute();

        System.out.println(flyweight1 == flyweight2);
    }

    public static interface Flyweight{
        void execute();
    }

    public static class ConcreteFlyweight implements Flyweight{

        private String name;

        public ConcreteFlyweight(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public void execute() {
            System.out.println(name+"执行功能逻辑");
        }
    }

    public static class FlyweightFactory{
        private static Map<String,Flyweight> cache = new HashMap<>();
        static Flyweight flyweight;

        public static Flyweight get(String name){
            flyweight = cache.get(name);
            if (flyweight == null){
                System.out.println("创建flyweight");
                flyweight = new ConcreteFlyweight(name);
                cache.put(name,flyweight);
            }
            return flyweight;
        }
    }
}
