package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.RoverStatus;

public class WestDirection implements Direction {

  @Override
  public RoverStatus move(RoverStatus roverStatus) {
    return RoverStatus.builder()
        .x(roverStatus.getX() - 1)
        .y(roverStatus.getY())
        .facing(roverStatus.getFacing())
        .build();
  }

  @Override
  public RoverStatus turnLeft(RoverStatus roverStatus) {
    return RoverStatus.builder()
        .x(roverStatus.getX())
        .y(roverStatus.getY())
        .facing(new SouthDirection())
        .build();
  }

  @Override
  public RoverStatus turnRight(RoverStatus roverStatus) {
    return RoverStatus.builder()
        .x(roverStatus.getX())
        .y(roverStatus.getY())
        .facing(new NorthDirection())
        .build();
  }

  @Override
  public String toString() {
    return "W";
  }
}
