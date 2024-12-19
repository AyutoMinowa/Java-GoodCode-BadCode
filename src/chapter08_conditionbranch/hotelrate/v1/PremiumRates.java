package chapter08_conditionbranch.hotelrate.v1;

import chapter08_conditionbranch.hotelrate.Money;

class PremiumRates implements HotelRates {
  public Money fee() {
    return new Money(12000);
  }
}
