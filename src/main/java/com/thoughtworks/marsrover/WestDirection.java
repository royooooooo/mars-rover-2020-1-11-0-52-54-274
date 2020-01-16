package com.thoughtworks.marsrover;

public class WestDirection implements Direction {

  @Override
  public void move(MarsRover marsRover) {
    marsRover.setX(marsRover.getX() - 1);
  }

  @Override
  public String toString() {
    return "W";
  }
}
