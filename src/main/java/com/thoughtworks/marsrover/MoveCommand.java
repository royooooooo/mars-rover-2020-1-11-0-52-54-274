package com.thoughtworks.marsrover;

public class MoveCommand implements Command{

  @Override
  public void doOperate(MarsRover marsRover) {
    marsRover.getFacing().move(marsRover);
  }
}
