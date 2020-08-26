package com.machi.daily.designPattern.command;

/**
 * 命令模式
 */
public class CommandPattern {
    public static void main(String[] args) {
        CommandA commandA = new CommandA();
        CommandB commandB = new CommandB();
        Invoker invoker = new Invoker();
        invoker.setCommand(commandA);
        invoker.execute();
        invoker.setCommand(commandB);
        invoker.execute();
    }

    public interface Command{
        void execute();
    }

    public static class Invoker{
        private Command command;

        public Command getCommand() {
            return command;
        }

        public void setCommand(Command command) {
            this.command = command;
        }

        public void execute(){
            command.execute();
        }
    }

    public static class CommandA implements Command{
        @Override
        public void execute() {
            System.out.println("A的业务逻辑");
        }
    }

    public static class CommandB implements Command{
        @Override
        public void execute() {
            System.out.println("B的业务逻辑");
        }
    }
}
