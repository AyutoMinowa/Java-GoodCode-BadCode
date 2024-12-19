package chapter05_encapsulationpractices.common;

import java.math.BigDecimal;

class AmountIncludingTax {
  final BigDecimal value;

  AmountIncludingTax(final AmountExcludingTax amountExcludingTax, final TaxRate taxRate) {
    value = amountExcludingTax.value.multiply(taxRate.value);
  }
}
