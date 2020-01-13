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
      switch (this.direction) {
        case N:
          this.y++;
          break;
        case S:
          this.y--;
          break;
        case W:
          this.x--;
          break;
        case E:
          this.x++;
          break;
        default:
          break;
      }
    }
  }
}
