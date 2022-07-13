package oop;

public class Marine extends Terran implements SteamPack, Attackable{
	
	//��� ������ ������ �� ���� �Ӽ�(��ü �Ӽ�)�� ���� �Ѵ�. ���⿡ ���ǵǴ� �Ӽ��� ����ʵ�(Member fields) ��� �Ѵ�.
	String name; //�̸�
	int hp;//ü��
	int ap;//���ݷ�
	int pt;//����
	
	@Override
	public void useSteamPack() {
		System.out.println("�̼��� 10 ����, ���ݷ��� 10 �����߽��ϴ�.");
		
	}
	
	//������(constructor) : Ŭ�������� ��ü�� ���� �������ִ� ������ �ϴ� �ڵ�
	// ���� �����ڴ� ������ ���� ��ü�� �ʱ�ȭ�� �Ѵ�. --> ��ü�� �ʱ�ȭ�� ��ü ����ʵ��� ���� Ư�� ������ �ʱ�ȭ ���ִ� ���� ���Ѵ�.
	/*
	 * �������� �ʼ� ���� :
	 * 1. �����ڸ��� �ݵ�� Ŭ���� ��� ���ƾ��Ѵ�. 
	 * 2. �����ڴ� �޼��尡 �ƴϱ⿡ ����Ÿ���� ����.
	 * 3. ��ü �ʱ�ȭ ������ ���� �ϳ� �̻��� �Ķ���͸� �߰� �� �� ����.
	 * 4. �⺻ ������ (�Ķ���Ͱ� ���� ������)�� ���α׷��Ӱ� ���� �����ڸ� �ϳ��� �������� ������ �����Ͻ� �����Ϸ��� �ڵ����� �����Ͽ� �־��ش�.
	 * �̸��� �ݴ�� �������� �ϳ��� �����ڸ� �����ϸ� �⺻�����ڴ� ���� ���� �ʴ´ٴ� �ǹ��̴�. (�߿�)
	 */
	
	//�����Ϸ��� �����ϴ� �⺻ ������ 
	/*public Marine() {
		
	}*/
	
	public Marine() {
		if(theunitCount > UnitCounter.MAX_UNIT) {
			System.out.println("������ "+ UnitCounter.MAX_UNIT + " �� �ʰ��մϴ�.");
			return;
		}
		theunitCount++;
		name = null; hp = 0; ap = 0; pt = 0;
	}
	//�̸��� �ʱ�ȭ �ϴ� ������ ����
    public Marine(String name) {
    	//�ڽ��� ��ü�� REF �ϴ� Ű���� this �� �̿��ؼ� �ڽ��� ���ʿ� �Ķ������ ���� �����Ѵ�.
		this.name = name;
	}
    
    public Marine(String name, int hp) {
    	/*
    	 * ������ this() : �����ڿ��� �ٸ� �����ڸ� ȣ�� �� �� ���Ǵ� Ű����, �ݵ�� ������ ù�Ӹ��� ���;��ϸ�
    	 * �����ϴ� �����ڸ� ȣ�� �� �� �ִ�.
    	 */
    	this(name);
    	this.hp = hp;
    }
    
    public Marine(String name, int hp, int ap) {
    	this(name, hp);
    	this.ap = ap;
    	
    }
    
    public Marine(String name, int hp, int ap, int pt) {
    	this(name, hp, ap);
    	this.pt = pt;
    	
    }
    
    //��ü�� ��¹�(syso)�� ���Ű�� �⺻������ hashCode ���� ��µȴ�.
    // ��ü�� �⺻ �Ӽ����� ��� ��Ű���� Ư�� �޼��带 �����ϵ��� �Ѵ�.. toString() �̶�� �޼��� �̴�. ����ϼ���.
    
    public String toString() {
    	return this.name + "���� ���� �� : "+this.hp + "���ݷ� : " + this.ap + "���� :"+pt;
    }
    /*
    public void attack(String target) {
    	System.out.println("������ " + target + " �� �����մϴ�.");
    }
    
    //�޼��� �����ε� : ���� �̸��� �޼��带 (���� ����Ÿ�Ե� ���ƾ��Ѵ�) �Ķ���ͷ� ������ ��� �����ϴ� ����(������ �����ε��� ����)
    //�̶� �����ؾ��� ���� �Ķ������ ����, ����, Ÿ���� ��ġ�ϸ� ���� �޼���� �ν� �Ǿ����ٴ� ���̴� (������ ����)
    //���� : ��������� ���ݾ� Ʋ�� ����� ������ �� �ٸ� �̸����� �����ϴ� �� ���� ���������� ����� �� �ִٶ�� ������ �ִ�.
    
    public void attack(Zerg theZerg) {
    	
    }
    public void attack(int x, int y, Zerg theZerg) {
    	
    }
    
    public void attack(int x, int y, Protos theProtos) {
    	
    }
    */
    public void move(int x, int y) {
    	System.out.println("������ "+ x + ", "+ y + "��ǥ�� �̵��մϴ�.");
    }
    public void dbClick(Marine theMarine) {
    	System.out.println(theMarine.name + "�� ���� �ϸ� ������ �մϴ�.");
    }
    
    
    
    //�޼��� ����. ��ü�� ������ �� ����� ���� ������ �޼��带 �̿��ؼ� ǥ���Ѵ�.
    //������ ����� �޼��带 �����ϼ���.
    
    //������ �����ε� (overLaoding): ���� �̸��� �����ڷ� �Ķ���͸� Ʋ���� �����ϴ� ����. ���߿� �޼��� ��
	public static void main(String[] args) {
		//Marine ��ü ����.. new ��� Ű���带 �̿��ؼ� �����Ѵ�.
		/*
		Marine m1 = new Marine("Alpha",5,10,3); //m1 ������ü ����
		Marine m2 = new Marine("john",5,10,3);//m2 ������ü �����ϸ鼭 �̸�, ���� �� �ʱ�ȭ�Ѵ�.
		System.out.println(m1);//��ü ����
		System.out.println(m2);
		//��ü�� �Ӽ��� ���� ���� ������
		//m1.name = "John";
		
		
		//��ü �Ӽ��� �˾ƺ��ô�. "."�� �̿��ؼ� �Ӽ�, �޼��带 ȣ���ϸ� �˴ϴ�.. 
		System.out.println(m1.name);
		System.out.println(m1.hp);
		System.out.println(m1.ap);
		System.out.println(m1.pt);
		
		m1.attack("����");
		m1.move(300, 200);
		m1.dbClick(m1);
		*/
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("������ ��������� ������ �մϴ�.");
		
	}

	@Override
	public void attack(Zerg theZerg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int x, int y, Zerg theZerg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int x, int y, Protos theProtos) {
		// TODO Auto-generated method stub
		
	}

}
