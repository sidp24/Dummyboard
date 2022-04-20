package frc.robot.subsystems;

import static frc.robot.Constants.*;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class falcon extends SubsystemBase {
    private final TalonFX falco = new TalonFX(FALCO_ID);

    public falcon() {
        falco.configFactoryDefault();
    }

    public void raise() {
        falco.set(ControlMode.PercentOutput, -FALCON_SPEED);
    }

    public void lower() {
        falco.set(ControlMode.PercentOutput, FALCON_SPEED);
    }

    public void stop() {
        falco.set(ControlMode.Velocity, 0);
    }

    @Override
    public void periodic() {

    }
}
