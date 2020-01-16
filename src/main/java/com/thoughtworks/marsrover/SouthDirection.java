package com.thoughtworks.marsrover;

public class SouthDirection implements Direction {

  @Override
  public void move(MarsRover marsRover) {
    marsRover.setY(marsRover.getY() - 1);
  }

  @Override
  public void turnLeft(MarsRover marsRover) {
    marsRover.setFacing(new EastDirection());
  }

  @Override
  public void turnRight(MarsRover marsRover) {
    marsRover.setFacing(new WestDirection());
  }

  @Override
  public String toString() {
    return "S";
  }
}
