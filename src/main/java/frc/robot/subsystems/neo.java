package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.REVLibError;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMax.SoftLimitDirection;

import static frc.robot.Constants.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class neo extends SubsystemBase {
    private final CANSparkMax m_spark = new CANSparkMax(NEO_ID, MotorType.kBrushless);
    private RelativeEncoder encoder;
    private SparkMaxPIDController m_pidController;
    public double kP, kI, kD, kIz, kFF, kMaxOutput, kMinOutput;

    public neo () {
        m_spark.restoreFactoryDefaults();
        this.encoder = m_spark.getEncoder();
        this.m_pidController = m_spark.getPIDController();
    }

    public void restoreFactoryDefaults() {
        m_spark.restoreFactoryDefaults();
    }

    public void raise() {
        m_spark.set(NEO_SPEED);
    }

    public void lower() {
        m_spark.set(NEO_SPEED);
    }

    public void stop() {
        m_spark.set(0);
    }

    @Override
    public void periodic() {
        // SmartDashboard.putNumber("Encoder Position: ", encoder.getPosition());
    }
}
