package com.charles.jph.charlesbcjph.infra;

public enum Scheme {
  HTTPS, HTTP;

  public String lowercaseName() {
    return this.name().toLowerCase();
  }
}
