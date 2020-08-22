package com.machi.daily.designPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 */
public class VisitorPattern {
    public static void main(String[] args) {
        Department leafDept1 = new Department("叶子部门1");
        Department leafDept2 = new Department("叶子部门2");
        Department leafDept3 = new Department("叶子部门3");

        Department subDept1 = new Department("子部门1");
        subDept1.getChildren().add(leafDept1);
        subDept1.getChildren().add(leafDept2);

        Department subDept2 = new Department("子部门2");
        subDept2.getChildren().add(leafDept3);

        Department parentDept = new Department("父部门");
        parentDept.getChildren().add(subDept1);
        parentDept.getChildren().add(subDept2);

        // 更节点接受remove操作
        Visitor removeVisitor = new RemoveVisitor();
        parentDept.accept(removeVisitor);

        //更节点接受更新操作
        Visitor updateVisitor = new UpdateVisitor("生效");
        parentDept.accept(updateVisitor);
    }

    public static class Department {
        private String name;
        private List<Department> children = new ArrayList<>();

        public Department(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Department> getChildren() {
            return children;
        }

        public void setChildren(List<Department> children) {
            this.children = children;
        }

        /**
         * 访问者模式，接受任何类型的visitor,具体实现由访问者vositor实现
         * @param visitor
         */
        public void accept(Visitor visitor){
            visitor.visitor(this);
        }
    }
}
