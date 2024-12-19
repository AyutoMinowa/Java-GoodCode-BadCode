package chapter09_collection.party.v1;

import chapter09_collection.party.Member;

import java.util.List;

class BattleManager {
  // 中略

  // パーティメンバーが1人でも生存している場合trueを返す。
  boolean membersAreAlive(List<Member> members) {
    boolean result = false;
    for (Member each : members) {
      if (each.isAlive()) {
        result = true;
        break;
      }
    }
    return result;
  }
}
