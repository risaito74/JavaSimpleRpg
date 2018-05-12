import java.util.Scanner;
import java.util.Random;

public class Hero {
	Scanner scan = new Scanner(System.in);

	String name;
	int hp;
	int str;
	int command;
	boolean escape;		//���������t���O
	boolean win;		//�����t���O
	
	//�R���X�g���N�^
	Hero(String name) {
		this.name = name;
		this.hp = 30;
		this.str = 10;
		this.win = false;
		this.escape = false;
	}
	
	//���O�擾
	public String getName() {
		return this.name;
	}
	
	//hp�擾
	public int getHp() {
		return this.hp;
	}
	
	//�R�}���h�擾
	public int getCommand() {
		return this.command;
	}
	
	//�R�}���h�I��
	public int selectCommand() {
		while (true) {
			System.out.print("�R�}���h�H(�키=1,������=2) > ");
			this.command = scan.nextInt();
			if (this.command >= 1 && this.command <= 2 ) break;
			System.out.println("���̓G���[!!");		
		}
		return this.command;
	}
	
	//win�t���O�Z�b�g
	public void setWin(boolean win) {
		this.win = win;
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
	
	//������
	public void escape() {
		System.out.println(this.name + "�͓����������I");
		this.escape = true;
	}
	
	//����
	public void win(String monName) {
		System.out.println(monName + "��|�����I");
	}
	
	//�s�k
	public void lose() {
		System.out.println(this.name + "�͎��ɂ܂����c GAME OVER");
	}
	
	//�������H
	public boolean isWin() {
		return this.win;
	}
	
	//�������������H
	public boolean isEscape() {
		return this.escape;
	}

}
