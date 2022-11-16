package com.inspire17.tutorial.lld.creationalpattern.prototype;

public class ChessSetUp implements Cloneable {
  private Position blackKing = new Position(1, 2);
  private Position whiteKing = new Position(4, 5);

  public static void main(String[] args) throws CloneNotSupportedException {
    ChessSetUp initialSetUp = new ChessSetUp();
    ChessSetUp clonedOne = initialSetUp.clone();
    clonedOne.setBlackKing(new Position(2, 2));
    clonedOne.setWhiteKing(new Position(2, 2));
    System.out.println(initialSetUp.blackKing.getX() + "," + initialSetUp.blackKing.getY());
    System.out.println(clonedOne.blackKing.getX() + "," + clonedOne.blackKing.getY());
    System.out.println(initialSetUp.whiteKing.getX() + "," + initialSetUp.whiteKing.getY());
    System.out.println(clonedOne.whiteKing.getX() + "," + clonedOne.whiteKing.getY());
  }

  public ChessSetUp clone() throws CloneNotSupportedException {
    return (ChessSetUp) super.clone();
  }

  public Position getBlackKing() {
    return blackKing;
  }

  public void setBlackKing(Position blackKing) {
    this.blackKing = blackKing;
  }

  public Position getWhiteKing() {
    return whiteKing;
  }

  public void setWhiteKing(Position whiteKing) {
    this.whiteKing = whiteKing;
  }
}
