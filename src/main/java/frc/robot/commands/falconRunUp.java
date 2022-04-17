package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.*;

public class falconRunUp extends CommandBase {
    private falcon falco;

    public falconRunUp(falcon subsystem) {
        addRequirements(subsystem);
        falco = subsystem;
    }

    @Override
    public void execute() {
        falco.raise();
    }

    @Override
    public void end(boolean interrupted) {
        falco.stop();
    }

}
