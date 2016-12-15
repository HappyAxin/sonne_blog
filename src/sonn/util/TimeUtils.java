package sonn.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
* @ClassName: TimeUtils 
* @Description: ʱ�乤����
* @author sonne
* @date 2016-12-14 ����8:05:14 
* @version 1.0
 */
public final class TimeUtils {
	
	private TimeUtils() {
	}
	
	/*
	 * ��ȡ�û�ע��������˶�����-��
	 */
	public static int[] getHowLongFromNow(Date oldDate) throws ParseException {
		//�ʼ���û�û������ֶΣ�dateΪnull
		if (oldDate == null) {
			DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
			oldDate = dateFormat1.parse("2016-11-06");
		}
        
        Calendar startCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();

        startCalendar.setTime(oldDate);
        endCalendar.setTime(new Date());
        
        int day = endCalendar.get(Calendar.DAY_OF_MONTH)
                - startCalendar.get(Calendar.DAY_OF_MONTH);
        int month = endCalendar.get(Calendar.MONTH)
                - startCalendar.get(Calendar.MONTH);
        int year = endCalendar.get(Calendar.YEAR)
                - startCalendar.get(Calendar.YEAR);

        if (day < 0) {
            month--;
        }

        if (month < 0) {
            month += 12;
            year--;
        }
        
        int[] RET_ARR = new int[3];
        /*ע�ᳬ��һ����û�*/
        RET_ARR[0] = year;
        RET_ARR[1] = month;
		return RET_ARR;
	}

}
