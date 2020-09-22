package com.team4099.robot2021.commands

import com.team4099.robot2021.subsystems.AidanSubsystem
import edu.wpi.first.wpilibj2.command.CommandBase

class AidanCommand: CommandBase() {
  init {
    addRequirements(AidanSubsystem)
  }

  override fun initialize() {
    AidanSubsystem.setPower(1.0)
  }
}
