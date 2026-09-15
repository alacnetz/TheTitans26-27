package org.firstinspires.ftc.teamcode.nextFTC.opmodes.teleop;

import org.firstinspires.ftc.teamcode.nextFTC.Robot;

import dev.nextftc.robot.Telemetry;
import dev.nextftc.robot.opmode.BulkReadHook;
import dev.nextftc.robot.opmode.NextOpMode;
import dev.nextftc.robot.opmode.NextTeleop;

@NextTeleop(name = "My Teleop")
public class MyTeleop extends NextOpMode {
    private final Robot robot;
    public MyTeleop(Robot robot) {
        super(robot, BulkReadHook.INSTANCE);
        this.robot = robot;
    }

    @Override
    public void start() {
        Telemetry.log("Status, Runs Once");
    }

    // Repeatedly, while the OPMode is running
    @Override
    public void periodic() {
        Telemetry.log("Status:", "Running");
    }
}
