package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.button.*;
import edu.wpi.first.wpilibj2.command.*;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.cimRunDown;
import frc.robot.commands.cimRunUp;
import frc.robot.commands.neoRunDown;
import frc.robot.commands.neoRunUp;
import frc.robot.commands.falconRunDown;
import frc.robot.commands.falconRunUp;
import frc.robot.subsystems.*;
import static frc.robot.Constants.*;

public class RobotContainer {
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  private final cim cmotorCim = new cim();
  private final neo arm = new neo();
  private final falcon intake = new falcon();

  final XboxController xbox = new XboxController(XBOX_CTRL_PORT);
  final Joystick logi = new Joystick(LOGIJOY_PORT);

  public RobotContainer() {

  }

  private void configureButtonBindings() {

    // Intake
    new JoystickButton(xbox, Button.kLeftBumper.value)
        .whileHeld(new cimRunDown(cmotorCim));

    new JoystickButton(xbox, Button.kRightBumper.value)
        .whileHeld(new cimRunUp(cmotorCim));

  }

  public Command getAutonomousCommand() {
    return m_autoCommand;
  }

}