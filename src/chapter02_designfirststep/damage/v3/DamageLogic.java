package chapter02_designfirststep.damage.v3;

public class DamageLogic {
  int playerArmPower;
  int playerWeaponPower;
  int enemyBodyDefence;
  int enemyArmorDefence;
  /*
   * 課題：処理がベタ書きになっている
   * 目的と異なるものを分離する
   */
  
  //プレイヤーの攻撃力を合算する
  int sumUpPlayerAttackPower(int playerArmPower, int playerWeaponPower) {
	  return playerArmPower + playerWeaponPower;
  }
  
  //敵の防御力を合算する
  int sumUpEnemyDefence(int enemyBodyDefence, int enemyArmorDefence) {
	  return enemyBodyDefence + enemyArmorDefence;
  }
  
  //ダメージ量を評価する
  int estimateDamage(int totalPlayerAttackPower, int totalEnemyDefence) {
	  int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);
	  if(damageAmount < 0) {
		  return 0;
	  }
	  return damageAmount;
  }
  

  //メソッドを呼び出す形に整理
  //int totalPlayerAttackPower = sumUpPlayerAttackPower(playerBodyPower, playerWeaponPower);
  int totalEnemyDefence = sumUpEnemyDefence(enemyBodyDefence, enemyArmorDefence);
  //int damageAmount = estimateDamage(totalPlayerAttackPower, totalEnemyDefence);
  
  
  //改善前
  int damageMethod() {
    int totalPlayerAttackPower = playerArmPower + playerWeaponPower;
    int totalEnemyDefence = enemyBodyDefence + enemyArmorDefence;

    int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);
    if (damageAmount < 0) {
      damageAmount = 0;
    }
    return damageAmount;
  }
  
  
  
}
