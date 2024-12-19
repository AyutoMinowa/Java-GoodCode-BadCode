package chapter08_conditionbranch.hotelrate.v2;

import chapter08_conditionbranch.hotelrate.Money;

public class CallHotelRatesLogic {
  HotelRates hotelRates;
  void method() {
    Money busySeasonFee = hotelRates.busySeasonFee();
  }
}
