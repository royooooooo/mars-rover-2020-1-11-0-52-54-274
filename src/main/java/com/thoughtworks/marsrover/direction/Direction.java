package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.RoverStatus;

public interface Direction {

  void move(RoverStatus roverStatus);

  void turnLeft(RoverStatus roverStatus);

  void turnRight(RoverStatus roverStatus);
}
