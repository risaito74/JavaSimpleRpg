import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Hero hero = new Hero("勇者");
		Monster monster = new Monster("スライム");
		
		System.out.println(monster.getName() + "があらわれた！");
		while(true) {
			//パラメータ表示
			System.out.println(hero.getName() + "HP:" + hero.getHp() + " " + monster.getName() + "HP:" + monster.getHp());
			
			//***** ヒーローターン *****
			int command = hero.selectCommand();
			switch (command) {
				case 1:	//戦う
					int monHp = monster.damage(hero.attack());
					if (monHp <= 0) hero.setWin(true);
					break;
				case 2:	//逃げる
					hero.escape();
					break;
			}
			//勝利判定
			if (hero.isWin()) {
				hero.win(monster.getName());
				break;
			}
			//逃走終了判定
			if (hero.isEscape()) break;
			
			//***** モンスターターン *****
			int heroHp = hero.damage(monster.attack());
			if (heroHp <= 0) monster.setWin(true);
			//敗北判定
			if (monster.isWin()) {
				hero.lose();
				break;
			}
		}
		System.out.println("バトル終了");
	}
}
