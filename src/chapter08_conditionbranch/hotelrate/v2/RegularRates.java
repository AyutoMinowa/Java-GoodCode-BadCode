package chapter08_conditionbranch.hotelrate.v2;

import chapter08_conditionbranch.hotelrate.Money;

class RegularRates implements HotelRates {
  public Money fee() {
    return new Money(7000);
  }

  public Money busySeasonFee() {
    return fee().add(3000);
  }
}
