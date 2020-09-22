package com.team4099.robot2021.commands

import com.team4099.robot2021.subsystems.KatyaSubsystem
import edu.wpi.first.wpilibj2.command.CommandBase

class KatyaCommand: CommandBase(){
  init {
    addRequirements(KatyaSubsystem)
  }
  override fun initialize(){
    KatyaSubsystem.setPower(0.5)
  }
  override fun execute(){

  }
  override fun isFinished():Boolean{
    return false;
  }
}
