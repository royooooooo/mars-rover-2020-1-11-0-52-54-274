package com.thoughtworks.marsrover;

import static java.util.Arrays.asList;

public enum Direction {
  N("N"),
  S("S"),
  E("E"),
  W("W");

  private String direction;
  private final String[] directionArray = new String[] {"N", "E", "S", "W"};

  Direction(String direction) {
    this.direction = direction;
  }

  public Direction turnLeft() {
    return valueOf(directionArray[(asList(directionArray).indexOf(this.direction) + 2) % 3]);
  }

  public Direction turnRight() {
    return valueOf(directionArray[(asList(directionArray).indexOf(this.direction) + 1) % 3]);
  }
}
