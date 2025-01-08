package chapter02_designfirststep.damage.v2;
//課題：再代入はコードの途中で変数の用途が変わってしまう。さまざまな用途に使われてしまうため、バグを埋め込んでしまう可能性がある。
//再代入を使わず、目的ごとの変数を用意する。
public class DamageLogic {
  int playerArmPower;
  int playerWeaponPower;
  int enemyBodyDefence;
  int enemyArmorDefence;
  

  
  

  int damageMethod() {
    int damageAmount = 0;
    damageAmount = playerArmPower + playerWeaponPower;  // …①
    damageAmount = damageAmount - ((enemyBodyDefence + enemyArmorDefence) / 2); // …②
    
    
    /*
     * 目的ごとの変数を用意する
     */
    //int totalPlayerAttackPower = playerArmPower + playerWeaponPower;
    //int totalEnemyDefence = enemyBodyDefence + enemyArmorDefence;

    //int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);
    
    
    if (damageAmount < 0) {
      damageAmount = 0;
    }
    return damageAmount;
  }
}
