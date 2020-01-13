package com.thoughtworks.marsrover;

public enum Direction {
  N("N"),
  S("S"),
  E("E"),
  W("W");

  public String direction;

  Direction(String direction) {
    this.direction = direction;
  }
}
