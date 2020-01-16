package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.RoverStatus;

public interface Command {

  void doOperate(RoverStatus roverStatus);
}
