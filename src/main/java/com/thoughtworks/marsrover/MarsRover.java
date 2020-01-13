package com.thoughtworks.marsrover;

import static java.lang.Integer.parseInt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MarsRover {

  private int x;
  private int y;
  private Direction facing;

  public MarsRover(int x, int y, Direction facing) {
    this.x = x;
    this.y = y;
    this.facing = facing;
  }

  public MarsRover(String initCommand) {
    String[] initCommandStr = initCommand.split(", ");
    this.x = parseInt(initCommandStr[0]);
    this.y = parseInt(initCommandStr[1]);
    this.facing = Direction.valueOf(initCommandStr[2]);
  }

  public void executeCommand(Command command) {
    if (command.equals(Command.M)) {
      executeMoveCommand();
    } else if (command.equals(Command.L)) {
      this.facing = this.facing.turnLeft();
    } else if (command.equals(Command.R)) {
      this.facing = this.facing.turnRight();
    }
  }

  private void executeMoveCommand() {
    if (this.facing.equals(Direction.N)) {
      this.y++;
    } else if (this.facing.equals(Direction.S)) {
      this.y--;
    } else if (this.facing.equals(Direction.W)) {
      this.x--;
    } else if (this.facing.equals(Direction.E)) {
      this.x++;
    }
  }

  public void executeCommand(String multipleCommand) {
    List<Command> commands = generateMultipleCommand(multipleCommand);
    for (Command command : commands) {
      executeCommand(command);
    }
  }

  private List<Command> generateMultipleCommand(String multipleCommand) {
    return Arrays.stream(multipleCommand.split(""))
        .map(Command::valueOf)
        .collect(Collectors.toList());
  }

  public String getCurrentPositionAndDirection() {
    return String.format("%d, %d, %s", this.x, this.y, this.facing.toString());
  }
}
