import java.util.GregorianCalendar;
public class question5 {

	public static void main(String[] args) {
		// 9.5ʹ��GregorianCalendar��
		//��ǰ����
		GregorianCalendar GC=new GregorianCalendar();
		System.out.println(GC.get(GregorianCalendar.YEAR)+"��"+GC.get(GregorianCalendar.MONTH)+"��"+GC.get(GregorianCalendar.DAY_OF_MONTH)+"��");
		//��1970-1-1�������ʱ��
		GregorianCalendar GC2=new GregorianCalendar();
		GC2.setTimeInMillis(1234567898765L);
		System.out.println(GC2.get(GC2.YEAR)+"��"+GC2.get(GC2.MONTH)+"��"+GC2.get(GC2.DAY_OF_MONTH)+"��");
	}

}
