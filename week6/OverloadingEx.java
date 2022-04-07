package week6;

class MethondSample{
	// 시그니처가 다르면 같은 메소드 사용 해도 됨
	int oveloadingEx(int i, int j) {
		return i + j;
	}
	int oveloadingEx(int i, int j, int k) {
		return i + j + k;
	}
	double oveloadingEx(double i, double j) {
		return i + j;
	}
	double oveloadingEx(double i, int j) {
		return i + j;
	}
	double oveloadingEx(int i, double j) {
		return i + j;
	}
	/*double overloadingEx(int i , int j) {
		return i  +j;
	}*/
}

public class OverloadingEx {

	public static void main(String[] args) {
		
	}

}
