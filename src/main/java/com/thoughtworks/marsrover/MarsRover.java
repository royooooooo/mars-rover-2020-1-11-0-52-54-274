package com.thoughtworks.marsrover;

public class MarsRover {

  private int x;
  private int y;
  private Direction direction;

  public MarsRover(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public String getCurrentPositionAndDirection() {
    return String.format("%d, %d, %s", this.x, this.y, this.direction.toString());
  }
}
