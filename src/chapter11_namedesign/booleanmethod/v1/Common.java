package chapter11_namedesign.booleanmethod.v1;

import chapter11_namedesign.booleanmethod.StateType;

class Common {
  // メンバーが混乱状態であればtrueを返す。
  static boolean isMemberInConfusion(Member member) {
    return member.states.contains(StateType.confused);
  }
}
