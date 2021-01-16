/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrainSubsytem extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  public VictorSP leftMotor = new VictorSP(Constants.leftMotorController);
  public VictorSP rightMotor = new VictorSP(Constants.rightMotorController);
  public DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);

  public DriveTrainSubsytem() {
  }

  public void manualDrive(final double move, final double turn, final boolean fastTurn) {
    drive.curvatureDrive(move, turn, fastTurn);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
