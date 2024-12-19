package chapter11_namedesign.booleanmethod.v1;

import chapter11_namedesign.booleanmethod.States;

class Member {
  final States states;

  Member() {
    states = new States();
  }
}
