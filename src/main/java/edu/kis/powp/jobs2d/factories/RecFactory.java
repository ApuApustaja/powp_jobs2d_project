package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.commander.CommandExecutioner;
import edu.kis.powp.jobs2d.commander.DriverCommand;
import edu.kis.powp.jobs2d.commander.OperateToCommand;
import edu.kis.powp.jobs2d.commander.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class RecFactory implements MyFactory {
    private CommandExecutioner complexCommand = new CommandExecutioner();

    @Override
    public DriverCommand getShape(DriverManager driver) {
        complexCommand.addCommand(new SetPositionCommand(-100, -100, driver.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(-100, 100, driver.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(100, 100, driver.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(100, -100, driver.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(-100, -100, driver.getCurrentDriver()));

        return complexCommand;
    }
}
