package com.thoughtworks.marsrover;

import static java.util.Arrays.asList;

public enum Direction {
  N,
  S,
  E,
  W;

  private final String[] directionArray = new String[] {"N", "E", "S", "W"};

  public Direction turnLeft() {
    return valueOf(directionArray[(asList(directionArray).indexOf(this.toString()) + 2) % 3]);
  }

  public Direction turnRight() {
    return valueOf(directionArray[(asList(directionArray).indexOf(this.toString()) + 1) % 3]);
  }
}
