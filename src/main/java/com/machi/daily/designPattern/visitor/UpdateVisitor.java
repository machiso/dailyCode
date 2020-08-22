package com.machi.daily.designPattern.visitor;

/**
 * 更新类型的visitor
 */
public class UpdateVisitor implements Visitor{
    private String status;

    public UpdateVisitor(String status) {
        this.status = status;
    }

    @Override
    public void visitor(VisitorPattern.Department department) {
        if (department.getChildren().size()>0){
            department.getChildren().stream().forEach(node->{
                node.accept(this);
            });
        }
//            System.out.println("更新" + department.name + "节点为:"+status);
        System.out.println(String.format("更新%s节点状态为:%s",department.getName(),status));

    }
}
