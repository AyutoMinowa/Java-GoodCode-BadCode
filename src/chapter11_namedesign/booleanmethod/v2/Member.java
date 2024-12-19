package chapter11_namedesign.booleanmethod.v2;

import chapter11_namedesign.booleanmethod.StateType;
import chapter11_namedesign.booleanmethod.States;

class Member {
  private final States states;

  Member() {
    states = new States();
  }

  boolean isInConfusion() {
    return states.contains(StateType.confused);
  }
}
