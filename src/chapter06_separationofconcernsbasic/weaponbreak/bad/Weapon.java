package chapter06_separationofconcernsbasic.weaponbreak.bad;

public class Weapon {
  public String name;
  public int power;
  public int durability;

  Weapon(String name, int power, int durability) {
    this.name = name;
    this.power = power;
    this.durability = durability;
  }
}
