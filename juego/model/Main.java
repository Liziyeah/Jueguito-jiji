package model;
import java.util.Scanner;
import java.lang.ModuleLayer.Controller;
import java.util.Random;

public class Main {
  private Scanner reader;
  private Controller cont;
  private Random rand;  

  public static void main(String[] args) {

    int numberOfMap = 6;
    Map map = new Map(6);

    System.out.println("Ingresa el primer número adónde quieras que se dirija el personaje (x): ");
    int positionXP = reader.nextInt();
    System.out.println("Ingresa el segundo número adónde quieras que se dirija (y): ");
    int positionYP = reader.nextInt();

    int positionXN = new Random().nextInt(5 - 0 + 1);
    int positionYN = new Random().nextInt(5 - 0 + 1);

    Player player = new Player(positionXP,positionYP);
    Npc npc = new Npc(positionXN, positionYN);

    map.setMap(positionXP,positionYP,positionXN,positionYN);
    System.out.println(map.toString());
  }


}
