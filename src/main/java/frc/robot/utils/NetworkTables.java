/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.utils;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

/**
 * Add your docs here.
 */
public class NetworkTables {

    NetworkTableInstance inst = NetworkTableInstance.getDefault();
    NetworkTable table = inst.getTable("datatable");

    public static NetworkTableEntry kP;
    public static NetworkTableEntry kI;
    public static NetworkTableEntry kD;
    public static NetworkTableEntry kF;

    public NetworkTables(){

        kP = table.getEntry("kP");
        kI = table.getEntry("kI");
        kD = table.getEntry("kD");
        kF = table.getEntry("kF");

        kP.setDouble(0.0);
        kI.setDouble(0.0);
        kD.setDouble(0.0);
        kF.setDouble(0.0);

        
        




    }
}
