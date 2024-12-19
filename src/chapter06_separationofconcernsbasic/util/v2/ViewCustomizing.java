package chapter06_separationofconcernsbasic.util.v2;

import chapter06_separationofconcernsbasic.util.ViewSettings;

class ViewCustomizing {
  private final ViewSettings viewSettings;  // 画面表示設定
  ViewCustomizing() {
    viewSettings = new ViewSettings();
  }
  // 中略
  void darkMode() {
    // viewSettingsを使ったダークモード表示への変更処理
  }
}
