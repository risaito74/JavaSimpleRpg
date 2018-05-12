import java.util.Random;

public class Monster {
	String name;
	int hp;
	int str;
	boolean win;

	//�R���X�g���N�^
	Monster(String name) {
		this.name = name;
		this.hp = 20;
		this.str = 5;
		this.win = false;
	}
	
	//win�t���O�Z�b�g
	public void setWin(boolean win) {
		this.win = win;
	}
	
	//name�擾
	public String getName() {
		return this.name;
	}
	
	//hp�擾
	public int getHp() {
		return this.hp;
	}
	
	//�키
	public int attack() {
		System.out.println(this.name + "�̍U���I");
		return this.str;
	}
	
	//�_���[�W
	public int damage(int dmp) {
		this.hp -= dmp;
		if (this.hp <= 0) this.hp = 0;
		System.out.println(this.name + "��" + dmp + "�̃_���[�W�I");
		return this.hp;
	}
	
	//�������H
	public boolean isWin() {
		return this.win;
	}

}
