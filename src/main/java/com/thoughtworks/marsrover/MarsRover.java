package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.Command;
import com.thoughtworks.marsrover.direction.Direction;
import lombok.Data;

@Data
public class MarsRover {

  RoverStatus roverStatus;

  public MarsRover(int x, int y, Direction facing) {
    this.roverStatus = new RoverStatus(x, y, facing);
  }

  public void executeCommand(Command command) {
    command.doOperate(this.roverStatus);
  }

  public String getCurrentLocation() {
    return this.roverStatus.getStatus();
  }
}
