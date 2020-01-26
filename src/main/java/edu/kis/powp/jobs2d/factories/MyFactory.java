package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.commander.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public interface MyFactory {
    DriverCommand getShape(DriverManager driver);
}