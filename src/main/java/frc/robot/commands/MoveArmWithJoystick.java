package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;

public class MoveArmWithJoystick extends CommandBase {
  /** Creates a new MoveArmWithJoystick. */

  //initialize your subsystems, controllers
  private ArmSubsystem armSubsystem;
  private XboxController joystick;


  public MoveArmWithJoystick(ArmSubsystem armSubsystem, XboxController joystick) {
    //add your parameters to the command
    this.armSubsystem = armSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    this.joystick = joystick;
    addRequirements(armSubsystem);
  }

  @Override
  public void initialize() {
    armSubsystem.coast();
  }

  @Override
  public void execute() {
    if (Math.abs(joystick.getLeftY()) <= 0.1) {
      armSubsystem.setPower(0);
      armSubsystem.brake();   
    }
    else {
      armSubsystem.coast();
      armSubsystem.setPower(0.5);
    }
  }


  @Override
  public void end(boolean interrupted) {
    armSubsystem.coast();
    
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
