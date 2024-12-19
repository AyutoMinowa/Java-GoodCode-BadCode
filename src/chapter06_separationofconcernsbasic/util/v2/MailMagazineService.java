package chapter06_separationofconcernsbasic.util.v2;

import chapter06_separationofconcernsbasic.util.MailMagazine;

class MailMagazineService {
  private final MailMagazine mailMagazine;  // メールマガジン
  MailMagazineService() {
    mailMagazine = new MailMagazine();
  }
  // 中略
  void beginSend() {
    // mailMagazineを使ったメール配信開始処理
  }
}
