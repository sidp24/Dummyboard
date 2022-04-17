package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class cim extends SubsystemBase {

    private VictorSPX Cmotor = new VictorSPX(CIM_ID);

    public cim() {

    }

    public void raise() {

        Cmotor.set(ControlMode.PercentOutput, CIM_SPEED); // up!
    }

    public void lower() {

        Cmotor.set(ControlMode.PercentOutput, -CIM_SPEED); // down
    }

    public void stop() {
        Cmotor.set(ControlMode.PercentOutput, 0);  //Stop
    }

    @Override
    public void periodic() {

    }

}
