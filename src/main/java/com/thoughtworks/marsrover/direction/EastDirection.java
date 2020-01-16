package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.RoverStatus;

public class EastDirection implements Direction {

  @Override
  public void move(RoverStatus roverStatus) {
    roverStatus.setX(roverStatus.getX() + 1);
  }

  @Override
  public void turnLeft(RoverStatus roverStatus) {
    roverStatus.setFacing(new NorthDirection());
  }

  @Override
  public void turnRight(RoverStatus roverStatus) {
    roverStatus.setFacing(new SouthDirection());
  }

  @Override
  public String toString() {
    return "E";
  }
}
