package edu.kis.powp.jobs2d.command;


public class ShapesFactory {

    public DriverCommand getDiamond(){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.add(new SetPositionCommand(-100, 0));
        complexCommand.add(new OperateToCommand(0, 100));
        complexCommand.add(new OperateToCommand(100, 0));
        complexCommand.add(new OperateToCommand(0, -100));
        complexCommand.add(new OperateToCommand(-100, 0));
        return complexCommand;

    }

    public DriverCommand getRectangle(){
    ComplexCommand complexCommand = new ComplexCommand();
    complexCommand.add(new SetPositionCommand(-100, 0));
    complexCommand.add(new OperateToCommand(-100, 100));
    complexCommand.add(new OperateToCommand(100, 100));
    complexCommand.add(new OperateToCommand(100, 0));
    complexCommand.add(new OperateToCommand(-100, 0));
    return complexCommand;
    }

    public DriverCommand getTriangle(){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.add(new SetPositionCommand(-100, 0));
        complexCommand.add(new OperateToCommand(100, 0));
        complexCommand.add(new OperateToCommand(-50, 100));
        complexCommand.add(new OperateToCommand(-100, 0));
        return complexCommand;
    }



}
