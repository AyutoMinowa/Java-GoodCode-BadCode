package chapter09_collection.prison.v2;

import chapter09_collection.prison.Item;

import java.util.List;

public class PrisonLogic {
  List<Item> items;

  void method() {
    boolean hasPrisonKey = items.stream().anyMatch(item -> item.name.equals("牢屋の鍵"));
  }
}
