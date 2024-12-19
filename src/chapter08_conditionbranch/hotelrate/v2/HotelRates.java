package chapter08_conditionbranch.hotelrate.v2;

import chapter08_conditionbranch.hotelrate.Money;

interface HotelRates {
  Money fee();
  Money busySeasonFee();  // 繁忙期料金
}
