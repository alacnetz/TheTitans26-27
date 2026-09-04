package org.firstinspires.ftc.teamcode.nextFTC;

import org.firstinspires.ftc.teamcode.nextFTC.mechanisms.Claw;
import org.firstinspires.ftc.teamcode.nextFTC.mechanisms.Intake;

import java.util.Set;

import dev.nextftc.robot.Mechanism;
import dev.nextftc.robot.NextRobot;

public class Robot implements NextRobot {
    Claw claw = new Claw();
    Intake intake = new Intake();

    @Override
    public Set<Mechanism> getMechanisms() {
        return Set.of(claw, intake);
    }
}
