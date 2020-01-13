package com.thoughtworks.marsrover;

public enum Command {
  M("M"),
  R("R"),
  L("L");

  public String command;

  Command(String command) {
    this.command = command;
  }
}
