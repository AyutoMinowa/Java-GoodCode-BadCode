package chapter10_unhealthycode.level;

class Level {
  private static final int MIN = 1;
  private static final int MAX = 99;
  final int value;

  private Level(final int value) {
    if (value < MIN || MAX < value) {
      throw new IllegalArgumentException();
    }
    this.value = value;
  }

  // 初期レベルを返す
  static Level initialize() {
    return new Level(MIN);
  }

  // レベルアップする
  Level increase() {
    if (value < MAX) return new Level(value + 1);
    return this;
  }
  // 省略
}
