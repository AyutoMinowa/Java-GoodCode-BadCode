package chapter03_encapsulationbasic;

import java.util.Currency;

public class MoneyTraining {

	//インスタンス変数しか持っていない、典型的な貧血ドメインモデル
	class Money1 {
		int amount; //金額値
		Currency currency; //通貨単位
	}

	//必ずコンストラクタで初期化する
	//不正値を渡せてしまう
	//Money money = new Money(-100, null);
	class Money2 {
		int amount; //金額値
		Currency currency; //通貨単位

		Money2(int amount, Currency currency) {
			this.amount = amount;
			this.currency = currency;
		}
	}

	//コンストラクタで正常値のみが確実に設定されるしくみ
	class Money3 {
		int amount; //金額値
		Currency currency; //通貨単位

		Money3(int amount, Currency currency) {
			if (amount < 0) {
				throw new IllegalArgumentException("金額には0以上を指定してください。");
			}
			if (currency == null) {
				throw new NullPointerException("通貨単位を指定してください。");
			}

			this.amount = amount;
			this.currency = currency;
		}

		Money3 add(final Money3 other) {
			//異なる通貨単位での加算を防止
			if (!currency.equals(other.currency)) {
				throw new IllegalArgumentException("通貨単位が違います。");
			}
			//ローカル変数も不変にする
			final int added = amount + other.amount;
			return new Money3(added, currency);
		}

	}
}
