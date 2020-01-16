package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.MarsRover;

public class WestDirection implements Direction {

  @Override
  public void move(MarsRover marsRover) {
    marsRover.setX(marsRover.getX() - 1);
  }

  @Override
  public void turnLeft(MarsRover marsRover) {
    marsRover.setFacing(new SouthDirection());
  }

  @Override
  public void turnRight(MarsRover marsRover) {
    marsRover.setFacing(new NorthDirection());
  }

  @Override
  public String toString() {
    return "W";
  }
}
