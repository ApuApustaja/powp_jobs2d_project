package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.factories.MyFactory;
import edu.kis.powp.jobs2d.factories.RecFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecListener implements ActionListener {

    private DriverManager driverManager;

    public RecListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyFactory figuresFactory = new RecFactory();
        figuresFactory.getShape(driverManager).execute();
    }
}