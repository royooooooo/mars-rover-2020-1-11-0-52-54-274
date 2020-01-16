package com.thoughtworks.marsrover;

public class EastDirection implements Direction {

  @Override
  public void move(MarsRover marsRover) {
    marsRover.setX(marsRover.getX() + 1);
  }

  @Override
  public void turnLeft(MarsRover marsRover) {
    marsRover.setFacing(new NorthDirection());
  }

  @Override
  public String toString() {
    return "E";
  }
}
