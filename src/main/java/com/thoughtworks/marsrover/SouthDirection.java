package com.thoughtworks.marsrover;

public class SouthDirection implements Direction {

  @Override
  public void move(MarsRover marsRover) {
    marsRover.setY(marsRover.getY() - 1);
  }

  @Override
  public String toString() {
    return "S";
  }
}
