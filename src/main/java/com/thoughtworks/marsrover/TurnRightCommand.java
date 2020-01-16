package com.thoughtworks.marsrover;

public class TurnRightCommand implements Command{

  @Override
  public void doOperate(MarsRover marsRover) {
    marsRover.getFacing().turnRight(marsRover);
  }
}
