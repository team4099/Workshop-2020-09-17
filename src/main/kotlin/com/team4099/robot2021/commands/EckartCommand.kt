package com.team4099.robot2021.commands

import com.team4099.robot2021.subsystems.EckartSubsystem
import edu.wpi.first.wpilibj2.command.CommandBase

class EckartCommand: CommandBase() {
  init {
      addRequirements(EckartSubsystem)

  }
  override fun initialize() {
    super.initialize()
    EckartSubsystem.setSparkMax(1.0)
    EckartSubsystem.setTalonPower(-1.0)
  }

  override fun execute() {
    super.execute()
  }
  override fun isFinished(): Boolean {
    return super.isFinished()
  }


}
