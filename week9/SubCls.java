package week9;

public class SubCls extends SupCls{
	int sum;
	double avg;
	String addr;
	public SubCls() {
		
	}
	public SubCls(int kor, int eng, int math) {
		super(kor,eng,math);
		sum = kor + eng + math;
		avg = sum / 3.0;
	}
	@Override //상속 받은걸 재상속하는 것
	public String toString() {
		return "kor= " + kor + ",eng= " + eng + ",math= " + math + ",sum= " + sum + ",avg= " + avg;
	}
	
}
