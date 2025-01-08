package chapter03_encapsulationbasic;

import java.util.Currency;

class Money {
  //finalで再代入できなくし、思わぬ副作用を防ぐ
  //変数宣言時かコンストラクタのみ代入できる
  final int amount;
  final Currency currency;

  //必ずコンストラクタで初期化する
  //生焼けオブジェクト(未初期設定化状態)を防ぐ
  Money(final int amount, final Currency currency) {
    //不正値を防ぐ（ガード節）
    if (amount < 0) {
      throw new IllegalArgumentException("金額には0以上を指定してください。");
    }
    if (currency == null) {
      throw new NullPointerException("通貨単位を指定してください。");
    }

    this.amount = amount;
    this.currency = currency;
  }

  /*
   *「値の渡し間違い」を型で防止する
   * final int ticketCount = 3; //チケット枚数 
   * money.add(ticketCount); //金額ではない値を渡せてしまう
   * 
   * Money型どうしのみで加算するメソッド構造にする。
   * 
  */
  //変更値を持ったMoneyクラスのインスタンスを生成する
  //不変にしつつ、変更ができる
  Money add(final Money other) {
    //異なる通貨単位での加算を防止
    if (!currency.equals(other.currency)) {
      throw new IllegalArgumentException("通貨単位が違います。");
    }

    //ローカル変数も不変にする
    final int added = amount + other.amount;
    return new Money(added, currency);
  }
}
