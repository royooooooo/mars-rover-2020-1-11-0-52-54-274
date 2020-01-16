package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.MarsRover;

public class NorthDirection implements Direction {

  @Override
  public void move(MarsRover marsRover) {
    marsRover.setY(marsRover.getY() + 1);
  }

  @Override
  public void turnLeft(MarsRover marsRover) {
    marsRover.setFacing(new WestDirection());
  }

  @Override
  public void turnRight(MarsRover marsRover) {
    marsRover.setFacing(new EastDirection());
  }

  @Override
  public String toString() {
    return "N";
  }
}
