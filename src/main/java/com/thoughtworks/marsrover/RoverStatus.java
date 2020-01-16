package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.direction.Direction;
import lombok.Data;

@Data
public class RoverStatus {
  private int x;
  private int y;
  private Direction facing;

  public RoverStatus(int x, int y, Direction facing) {
    this.x = x;
    this.y = y;
    this.facing = facing;
  }

  public String getStatus() {
    return String.format("%d, %d, %s", this.x, this.y, this.facing.toString());
  }
}
