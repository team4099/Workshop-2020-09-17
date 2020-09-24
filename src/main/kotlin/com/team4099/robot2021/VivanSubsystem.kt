package com.team4099.robot2021.subsystems

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import com.revrobotics.CANSparkMax
import com.revrobotics.CANSparkMaxLowLevel
import edu.wpi.first.wpilibj2.command.CommandBase
import edu.wpi.first.wpilibj2.command.SubsystemBase

object VivanSubsystem: SubsystemBase(){
  private val motorControl1 = TalonSRX(5);

  fun setPower(vroomvroom: Double){
    motorControl1.set(ControlMode.PercentOutput, vroomvroom);
  }


  private val motorControl2 = CANSparkMax(6, CANSparkMaxLowLevel.MotorType.kBrushless);

  fun setPower2(vroomvroom: Double){
    motorControl2.set(vroomvroom);
  }
}


