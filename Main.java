import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Hero hero = new Hero("�E��");
		Monster monster = new Monster("�X���C��");
		
		System.out.println(monster.getName() + "�������ꂽ�I");
		while(true) {
			//�p�����[�^�\��
			System.out.println(hero.getName() + "HP:" + hero.getHp() + " " + monster.getName() + "HP:" + monster.getHp());
			
			//***** �q�[���[�^�[�� *****
			int command = hero.selectCommand();
			switch (command) {
				case 1:	//�키
					int monHp = monster.damage(hero.attack());
					if (monHp <= 0) hero.setWin(true);
					break;
				case 2:	//������
					hero.escape();
					break;
			}
			//��������
			if (hero.isWin()) {
				hero.win(monster.getName());
				break;
			}
			//�����I������
			if (hero.isEscape()) break;
			
			//***** �����X�^�[�^�[�� *****
			int heroHp = hero.damage(monster.attack());
			if (heroHp <= 0) monster.setWin(true);
			//�s�k����
			if (monster.isWin()) {
				hero.lose();
				break;
			}
		}
		System.out.println("�o�g���I��");
	}
}
