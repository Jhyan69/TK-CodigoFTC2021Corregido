package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.hardware.*;
import frc.robot.Robot;

public class Intake {
public void IntakeTest(){

    if (Robot.control.readJoystickButtons(Constantes.LG_B5)){
        testTalon.set(ControlMode.PercentOutput, -0.25);
    }
    else if(Robot.control.readJoystickButtons(Constantes.LG_B6)){  
        testTalon.set(ControlMode.PercentOutput, 0.25); 
    }
        testTalon.set(ControlMode.PercentOutput, -0.25);
    }
        testTalon.set(ControlMode.PercentOutput, -0.25);
    }
    else{
        testTalon.set(ControlMode.PercentOutput,0.0);
    }

}
    
}
