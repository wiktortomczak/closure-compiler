package com.google.javascript.jscomp.deps;


public class ExternModule {
  // TODO: Apply to module object (object named moduleName, name derived from modulePath).
  public final String format;
  public final String externsPath;

  public ExternModule(String format, String externsPath) {
    this.format = format;
    this.externsPath = externsPath;
  }
}
