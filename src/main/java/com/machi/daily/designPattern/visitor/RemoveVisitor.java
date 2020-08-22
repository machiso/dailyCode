package com.machi.daily.designPattern.visitor;

/**
 * 删除类型的visitor
 */
class RemoveVisitor implements Visitor{
    @Override
    public void visitor(VisitorPattern.Department department) {
        if (department.getChildren().size()>0){
            department.getChildren().stream().forEach(node -> node.accept(this));
        }
        System.out.println("删除" + department.getName() + "节点");
    }
}
