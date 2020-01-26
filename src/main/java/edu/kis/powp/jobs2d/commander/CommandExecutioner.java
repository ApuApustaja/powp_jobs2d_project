package edu.kis.powp.jobs2d.commander;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutioner implements DriverCommand{

    private List<DriverCommand> driverCommandList = new ArrayList();

    public void addCommand(DriverCommand driverCommand){
        driverCommandList.add(driverCommand);
    }

    @Override
    public void execute() {
        for(DriverCommand command : driverCommandList) {
            command.execute();
        }
    }
}