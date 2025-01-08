package chapter05_encapsulationpractices.primitiveobsession.v1;

class Util {
  /**
   * @param regularPrice 定価
   * @return 適切価格である場合true
   */
	//プリミティブ型に執着するとコード重複が生じやすい
  boolean isFairPrice(int regularPrice) {
    if (regularPrice < 0) {
      throw new IllegalArgumentException();
    }
    return true;
  }
}
