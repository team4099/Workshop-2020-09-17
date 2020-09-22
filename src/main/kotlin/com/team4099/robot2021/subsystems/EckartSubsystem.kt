package com.team4099.robot2021.subsystems

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import com.revrobotics.CANSparkMax
import com.revrobotics.CANSparkMaxLowLevel
import edu.wpi.first.wpilibj2.command.Subsystem


object EckartSubsystem : Subsystem {
  private val intakeMotor = TalonSRX(5)
  fun setTalonPower(power: Double) {
    intakeMotor.set(ControlMode.PercentOutput, power)
  }
  private val sparkMaxMotor = CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless)
  fun setSparkMax(power: Double) {
    sparkMaxMotor.set(power)
  }
}



