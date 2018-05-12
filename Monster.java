import java.util.Random;

public class Monster {
	String name;
	int hp;
	int str;
	boolean win;

	//コンストラクタ
	Monster(String name) {
		this.name = name;
		this.hp = 20;
		this.str = 5;
		this.win = false;
	}
	
	//winフラグセット
	public void setWin(boolean win) {
		this.win = win;
	}
	
	//name取得
	public String getName() {
		return this.name;
	}
	
	//hp取得
	public int getHp() {
		return this.hp;
	}
	
	//戦う
	public int attack() {
		System.out.println(this.name + "の攻撃！");
		return this.str;
	}
	
	//ダメージ
	public int damage(int dmp) {
		this.hp -= dmp;
		if (this.hp <= 0) this.hp = 0;
		System.out.println(this.name + "に" + dmp + "のダメージ！");
		return this.hp;
	}
	
	//勝った？
	public boolean isWin() {
		return this.win;
	}

}
