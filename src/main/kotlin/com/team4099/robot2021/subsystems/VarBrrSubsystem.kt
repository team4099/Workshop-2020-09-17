package com.team4099.robot2021.subsystems

import com.revrobotics.CANSparkMax
import com.revrobotics.CANSparkMaxLowLevel
import edu.wpi.first.wpilibj2.command.SubsystemBase

object VarBrrSubsystem: SubsystemBase() {

  private val intakeMotor = CANSparkMax(5, CANSparkMaxLowLevel.MotorType.kBrushless)

  fun setPower(power: Double) {
    intakeMotor.set(power)
  }
}
