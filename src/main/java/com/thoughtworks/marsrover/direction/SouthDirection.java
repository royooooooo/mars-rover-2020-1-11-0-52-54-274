package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.RoverStatus;

public class SouthDirection implements Direction {

  @Override
  public void move(RoverStatus roverStatus) {
    roverStatus.setY(roverStatus.getY() - 1);
  }

  @Override
  public void turnLeft(RoverStatus roverStatus) {
    roverStatus.setFacing(new EastDirection());
  }

  @Override
  public void turnRight(RoverStatus roverStatus) {
    roverStatus.setFacing(new WestDirection());
  }

  @Override
  public String toString() {
    return "S";
  }
}
