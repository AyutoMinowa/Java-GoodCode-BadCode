package chapter12_comment.v1;

import chapter12_comment.StateType;
import chapter12_comment.States;

class Member {
  private final States states;

  Member() {
    states = new States();
  }

  // 苦しい状態の場合trueを返す。
  // 毒、麻痺状態の場合trueを返す。
  boolean isPainful() {
    if (states.contains(StateType.poison) ||
            states.contains(StateType.paralyzed) ||
            states.contains(StateType.fear)) {
      return true;
    }

    return false;
  }
}
