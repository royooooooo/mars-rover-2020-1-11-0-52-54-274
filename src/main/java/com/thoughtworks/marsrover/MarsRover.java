package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.Command;
import com.thoughtworks.marsrover.direction.Direction;
import lombok.Data;

@Data
public class MarsRover {

  private int x;
  private int y;
  private Direction facing;

  public MarsRover(int x, int y, Direction facing) {
    this.x = x;
    this.y = y;
    this.facing = facing;
  }

  public void executeCommand(Command command) {
    command.doOperate(this);
  }

  public String getCurrentLocation() {
    return String.format("%d, %d, %s", this.x, this.y, this.facing.toString());
  }
}
