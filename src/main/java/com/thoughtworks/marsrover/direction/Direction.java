package com.thoughtworks.marsrover.direction;

import com.thoughtworks.marsrover.RoverStatus;

public interface Direction {

  RoverStatus move(RoverStatus roverStatus);

  RoverStatus turnLeft(RoverStatus roverStatus);

  RoverStatus turnRight(RoverStatus roverStatus);
}
