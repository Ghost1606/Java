package week7;

class Point {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}	
	@Override
	public String toString() {
		return "(x=" + x + ", y=" + y + ")";
	}

	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}