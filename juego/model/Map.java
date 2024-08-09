package model;

public class Map {
  private boolean[][] map;

  int positionXP;
  int positionYP;

  int positionXN;
  int positionYN;

  public Map(int i) {
   map = new boolean[i][i];
  }
  public void setMap(int positionXP, int positionYP, int positionXN, int positionYN) {
    setPositionXP(positionXP);
    setPositionYP(positionYP);
    setPositionXN(positionXN);
    setPositionYN(positionYN);
  }

  public int getPositionXP() {
    return positionXP;
  }

  public void setPositionXP(int positionXP) {
    this.positionXP = positionXP;
  }
  public int getPositionYP() {
    return positionYP;
  }
  public void setPositionYP(int positionYP) {
    this.positionYP = positionYP;
  }
  public int getPositionXN() {
    return positionXN;
  }
  public void setPositionXN(int positionXN) {
    this.positionXN = positionXN;
  }
  public int getPositionYN() {
    return positionYN;
  }
  public void setPositionYN(int positionYN) {
    this.positionYN = positionYN;
  }

  public String toString() {
    String result = "";
    for (int i = 0; i < map.length; i++) {
        for (int j = 0; j < map[i].length; j++) {

          if(i==positionXP){
            if (j==positionYP) {
              result +=  " X ";
            }else{
              result += " _ ";
            }
          }else if(i==positionXN){
            if (j==positionYN) {
              result +=  " * ";
            }else{
              result += " _ ";
            }
          }else{
            result += " _ ";
          }

        }
        result += "\n";
    }
    return result;
}
}
