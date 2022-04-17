package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.*;

public class falconRunDown extends CommandBase {
    private falcon falco;

    public falconRunDown(falcon subsystem) {
        addRequirements(subsystem);
        falco = subsystem;
    }

    @Override
    public void execute() {
        falco.lower();
    }

    @Override
    public void end(boolean interrupted) {
        falco.stop();
    }

}
