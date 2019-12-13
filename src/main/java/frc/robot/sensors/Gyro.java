/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.sensors;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.smartdashboard.SendableBuilder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * Add your docs here.
 */
public class Gyro implements Sendable{
    
public AnalogGyro gyro;
private double angle;
private DoubleSupplier x;
private DoubleConsumer y;
private String name;
private SendableBuilder builder;
    
    public Gyro(){

        gyro = new AnalogGyro(1);

        this.x = () -> gyro.getAngle();
        this.y = value -> { };
        this.name = "Sendable Gyro";
    }
    
    public double getAngleValue(){
    
        angle = gyro.getAngle();
        
        return angle;
    }

    public void updateDashboard()
    {
        SmartDashboard.putData("Gyro", this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getSubsystem() {
        return this.name;
    }

    @Override
    public void setSubsystem(String subsystem) {

    }

    @Override
    public void initSendable(SendableBuilder builder) {

        builder.setSmartDashboardType("Gyro");
        builder.addDoubleProperty("Value", x, y);

    }

    
        


}
