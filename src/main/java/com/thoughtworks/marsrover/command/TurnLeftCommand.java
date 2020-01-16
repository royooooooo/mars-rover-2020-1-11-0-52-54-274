package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.RoverStatus;

public class TurnLeftCommand implements Command {

  @Override
  public void doOperate(RoverStatus roverStatus) {
    roverStatus.getFacing().turnLeft(roverStatus);
  }
}
