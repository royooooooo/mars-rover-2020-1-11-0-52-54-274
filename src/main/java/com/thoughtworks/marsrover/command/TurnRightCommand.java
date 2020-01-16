package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.RoverStatus;

public class TurnRightCommand implements Command {

  @Override
  public void doOperate(RoverStatus roverStatus) {
    roverStatus.getFacing().turnRight(roverStatus);
  }
}
