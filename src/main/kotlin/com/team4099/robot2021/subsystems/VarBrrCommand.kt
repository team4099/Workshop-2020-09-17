package com.team4099.robot2021.subsystems

import edu.wpi.first.wpilibj2.command.CommandBase

class VarBrrCommand : CommandBase() {
  init {
      addRequirements(VarBrrSubsystem)
  }

  override fun initialize() {
    super.initialize()
    VarBrrSubsystem.setPower(1.0)
  }
}
