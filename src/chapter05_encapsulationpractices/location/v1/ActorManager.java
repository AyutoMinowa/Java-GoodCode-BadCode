package chapter05_encapsulationpractices.location.v1;

class ActorManager {
  // ゲームキャラの位置を移動する。
  void shift(Location location, int shiftX, int shiftY) {
    location.x += shiftX;
    location.y += shiftY;
  }
}
