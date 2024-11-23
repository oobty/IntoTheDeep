package org.firstinspires.ftc.teamcode.EPIC.Components;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.EPIC.RobotStates.ClawStates;

public class SpecimenClaw extends AComponents implements IClaw{
    private Servo leftFinger;
    private Servo rightFinger;

    public SpecimenClaw(HardwareMap hardwareMap) {
        rightFinger = hardwareMap.get(Servo.class, "RSF");
        leftFinger = hardwareMap.get(Servo.class, "LSF");
    }

    @Override
    public void displayComponentValues() {
        telemetry.addData("Claw", "INITIALIZED");
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void move(ClawStates state) {

    }
}
