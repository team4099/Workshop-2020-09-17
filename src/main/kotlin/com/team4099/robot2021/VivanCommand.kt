package com.team4099.robot2021.subsystems

import edu.wpi.first.wpilibj2.command.CommandBase


class VivanCommand: CommandBase() {
  override fun initialize() {
    VivanSubsystem.setPower(1.00);
    VivanSubsystem.setPower2(1.00);
  }
  init{
    addRequirements(VivanSubsystem)
  }

  override fun execute(){

  }

  override fun isFinished(): Boolean {

    return false;
  }
}
