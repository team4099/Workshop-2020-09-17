package com.team4099.robot2021.subsystems

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import edu.wpi.first.wpilibj2.command.SubsystemBase


object RehanSubsystem: SubsystemBase() {
  private val intakeMotor = TalonSRX(5)

  fun setPower(power: Double) {
    intakeMotor.set(ControlMode.PercentOutput, power)
  }
}
