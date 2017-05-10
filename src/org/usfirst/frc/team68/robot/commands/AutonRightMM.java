
package org.usfirst.frc.team68.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
public class AutonRightMM extends CommandGroup 
{

    public AutonRightMM() 
    {
     	addSequential(new AutonDrive(4.35, -0.73, -0.71)); //Drive forward
    	addSequential(new AutonDrive(2.45, 0.53, -0.51)); // Turn left
    	addSequential(new AutonDrive(2.5, -0.63, -0.61));  //Drive forward 
     	addSequential(new GearDeploy());  // Spin the gear motors
     	addSequential(new AutonDrive(1.35, 0.53, 0.51)); //Drive backward
     	/*
     	 *addSequential(new AutonDrive(6.35, -0.53, -0.51)); //Drive forward
    	addSequential(new AutonDrive(2.45, 0.53, -0.51)); // Turn left
    	addSequential(new AutonDrive(3.0, -0.53, -0.51));  //Drive forward 
     	addSequential(new GearDeploy());  // Spin the gear motors
     	addSequential(new AutonDrive(1.35, 0.53, 0.51)); //Drive backward
     	 */

    } 
    
}