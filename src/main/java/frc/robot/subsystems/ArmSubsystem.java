package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {

  //add motors here
  
  private final TalonFX armTalonFX;
  

  public ArmSubsystem() {
    //make proper initializations

    armTalonFX = new TalonFX(50);
    armTalonFX.configFactoryDefault();    
    armTalonFX.setInverted(true);

  }

  //consider what methods are necessary for the motor to run effectively
  public TalonFX geTalonFX(){
    return armTalonFX;
  }

  public void setPower(double power) {
    armTalonFX.set(ControlMode.PercentOutput, power);
  }
  

  public void coast(){
    armTalonFX.setNeutralMode(NeutralMode.Coast);
  }
  public void brake(){
    armTalonFX.setNeutralMode(NeutralMode.Brake);
  }

  
  @Override
  public void periodic() {

  }
}
