package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.RoverStatus;

public class SouthDirection implements Direction {

  @Override
  public RoverStatus move(RoverStatus roverStatus) {
    return RoverStatus.builder()
        .x(roverStatus.getX())
        .y(roverStatus.getY() - 1)
        .facing(roverStatus.getFacing())
        .build();
  }

  @Override
  public RoverStatus turnLeft(RoverStatus roverStatus) {
    return RoverStatus.builder()
        .x(roverStatus.getX())
        .y(roverStatus.getY())
        .facing(new EastDirection())
        .build();
  }

  @Override
  public RoverStatus turnRight(RoverStatus roverStatus) {
    return RoverStatus.builder()
        .x(roverStatus.getX())
        .y(roverStatus.getY())
        .facing(new WestDirection())
        .build();
  }

  @Override
  public String toString() {
    return "S";
  }
}
