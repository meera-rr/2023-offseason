// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

public class LimitSwitch extends SubsystemBase {
    private TalonFX armTalonFX;
    private DigitalInput limitSwitchDigitalInput;
    private boolean isActivated;

    public LimitSwitch() {
        
        armTalonFX = new TalonFX(1);
        limitSwitchDigitalInput = new DigitalInput(1);
    }
      
      
    @Override
    public void periodic() {
        
        if (limitSwitchDigitalInput.get()) {
          isActivated = true;
        }
        else {
          isActivated = false;
            
        }
    }

    public boolean getLimitSwitch() {
      return isActivated;

    }
}
