package chapter05_encapsulationpractices.staticmiss;

public class OrderLogic {
  MoneyData moneyData1;
  MoneyData moneyData2;

  void method() {
	  //moneyData1, moneyData2はデータクラス
	  //staticメソッドとデータクラスはセットで登場させてはいけない
	  //dataとロジックが別のクラスに定義されており、カプセル化されていないため。
    moneyData1.amount = OrderManager.add(moneyData1.amount, moneyData2.amount);
  }
}
