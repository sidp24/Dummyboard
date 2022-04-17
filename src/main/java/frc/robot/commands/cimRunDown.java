package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.*;

public class cimRunDown extends CommandBase {
    private cim Cmotor;

    public cimRunDown(cim subsystem) {
        addRequirements(subsystem);
        Cmotor = subsystem;
    }

    @Override
    public void execute() {
        Cmotor.lower();
    }

    @Override
    public void end(boolean interrupted) {
        Cmotor.stop();
    }

}
