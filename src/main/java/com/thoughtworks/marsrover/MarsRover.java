package com.thoughtworks.marsrover;

import static java.lang.Integer.parseInt;

public class MarsRover {

  private int x;
  private int y;
  private Direction direction;

  public MarsRover(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public MarsRover(String initCommand) {
    String[] initCommandStr = initCommand.split(", ");
    this.x = parseInt(initCommandStr[0]);
    this.y = parseInt(initCommandStr[1]);
    this.direction = Direction.valueOf(initCommandStr[2]);
  }

  public String getCurrentPositionAndDirection() {
    return String.format("%d, %d, %s", this.x, this.y, this.direction.toString());
  }

  public void executeCommand(Command command) {
    if (command.equals(Command.Move)) {
      if (this.direction.equals(Direction.N)) {
        this.y++;
      } else if (this.direction.equals(Direction.S)) {
        this.y--;
      } else if (this.direction.equals(Direction.W)) {
        this.x--;
      } else if (this.direction.equals(Direction.E)) {
        this.x++;
      }
    } else if (command.equals(Command.L)) {
      this.direction = this.direction.turnLeft();
    } else if (command.equals(Command.R)) {
      this.direction = this.direction.turnRight();
    }
  }
}
