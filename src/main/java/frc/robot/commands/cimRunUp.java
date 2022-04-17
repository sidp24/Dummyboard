package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.*;

public class cimRunUp extends CommandBase {
    private cim Cmotor;

    public cimRunUp(cim subsystem) {
        addRequirements(subsystem);
        Cmotor = subsystem;
    }

    @Override
    public void execute() {
        Cmotor.raise();
    }

    @Override
    public void end(boolean interrupted) {
        Cmotor.stop();
    }

}
