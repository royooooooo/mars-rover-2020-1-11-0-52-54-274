package com.thoughtworks.marsrover;

public class NorthDirection implements Direction {

  @Override
  public void move(MarsRover marsRover) {
    marsRover.setX(marsRover.getY() + 1);
  }

  @Override
  public String toString() {
    return "N";
  }
}
