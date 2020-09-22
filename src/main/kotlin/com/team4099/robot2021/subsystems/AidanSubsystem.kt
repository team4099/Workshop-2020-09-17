package com.team4099.robot2021.subsystems

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import edu.wpi.first.wpilibj2.command.SubsystemBase

object AidanSubsystem: SubsystemBase() {
  private val myTalon = TalonSRX(5)

  fun setPower(power: Double) {
    myTalon.set(ControlMode.PercentOutput, power)
  }
}
