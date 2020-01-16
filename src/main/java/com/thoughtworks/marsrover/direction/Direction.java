package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.MarsRover;

public interface Direction {

  void move(MarsRover marsRover);

  void turnLeft(MarsRover marsRover);

  void turnRight(MarsRover marsRover);
}
