package model;

public class Actor  {
  protected int positionX;
  protected int positionY;

  public Actor (int positionX, int positionY)  {
    this.positionX = positionX;
    this.positionY = positionY;
  }
  public int getPositionX() {
    return positionX;
  }
  public int getPositionY() {
    return positionY;
  }
  public void move() {};
}