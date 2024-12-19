package chapter09_collection.earlycontinue.v2;

import chapter09_collection.earlycontinue.Member;
import chapter09_collection.earlycontinue.StateType;

import java.util.List;

public class Logic {
  List<Member> members;
  void method() {
    for (Member member : members) {
      // 生存していない場合continueでループの先頭に戻る。
      // continueの使用にあたり、条件を反転させる。
      if (member.hitPoint == 0) continue;

      if (member.containsState(StateType.poison)) {
        member.hitPoint -= 10;
        if (member.hitPoint <= 0) {
          member.hitPoint = 0;
          member.addState(StateType.dead);
          member.removeState(StateType.poison);
        }
      }
    }
  }
}
