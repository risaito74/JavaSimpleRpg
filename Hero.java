import java.util.Scanner;
import java.util.Random;

public class Hero {
	Scanner scan = new Scanner(System.in);

	String name;
	int hp;
	int str;
	int command;
	boolean escape;		//逃走成功フラグ
	boolean win;		//勝利フラグ
	
	//コンストラクタ
	Hero(String name) {
		this.name = name;
		this.hp = 30;
		this.str = 10;
		this.win = false;
		this.escape = false;
	}
	
	//名前取得
	public String getName() {
		return this.name;
	}
	
	//hp取得
	public int getHp() {
		return this.hp;
	}
	
	//コマンド取得
	public int getCommand() {
		return this.command;
	}
	
	//コマンド選択
	public int selectCommand() {
		while (true) {
			System.out.print("コマンド？(戦う=1,逃げる=2) > ");
			this.command = scan.nextInt();
			if (this.command >= 1 && this.command <= 2 ) break;
			System.out.println("入力エラー!!");		
		}
		return this.command;
	}
	
	//winフラグセット
	public void setWin(boolean win) {
		this.win = win;
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
		System.out.println(this.name + "は" + dmp + "のダメージ！");
		return this.hp;
	}
	
	//逃げる
	public void escape() {
		System.out.println(this.name + "は逃げだした！");
		this.escape = true;
	}
	
	//勝利
	public void win(String monName) {
		System.out.println(monName + "を倒した！");
	}
	
	//敗北
	public void lose() {
		System.out.println(this.name + "は死にました… GAME OVER");
	}
	
	//勝った？
	public boolean isWin() {
		return this.win;
	}
	
	//逃走成功した？
	public boolean isEscape() {
		return this.escape;
	}

}
