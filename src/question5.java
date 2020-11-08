import java.util.GregorianCalendar;
public class question5 {

	public static void main(String[] args) {
		// 9.5使用GregorianCalendar类
		//当前日期
		GregorianCalendar GC=new GregorianCalendar();
		System.out.println(GC.get(GregorianCalendar.YEAR)+"年"+GC.get(GregorianCalendar.MONTH)+"月"+GC.get(GregorianCalendar.DAY_OF_MONTH)+"日");
		//从1970-1-1起的流逝时间
		GregorianCalendar GC2=new GregorianCalendar();
		GC2.setTimeInMillis(1234567898765L);
		System.out.println(GC2.get(GC2.YEAR)+"年"+GC2.get(GC2.MONTH)+"月"+GC2.get(GC2.DAY_OF_MONTH)+"日");
	}

}
