package com.zhanglin.networkSlicingBackend.ms.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.zhanglin.networkSlicingBackend.ms.exception.MyException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyTimeUtil {
	public static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String dateFormatInvalid = "date format is invalid, please check.";
	public static final String timeFormatInvalid = "time format is invalid, please check.";
	public static String getCurrentTimeforParking() {
		 SimpleDateFormat formatter = new SimpleDateFormat(TIMESTAMP_FORMAT);  
		 String currentTime = formatter.format(new Date());
		 return currentTime;
	}
	
	//parse Date String:  dateStr = "2018-05-07"; if dataStr is invalid, return null
		public static String parseDate(String dateStr) throws MyException {
	        String regex = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher m = pattern.matcher(dateStr);
	        boolean dateFlag = m.matches();
	        if (!dateFlag) {
	            throw new MyException(MyException.FAIL,dateFormatInvalid);
	        }
	        DateFormat formatter = new SimpleDateFormat(DATE_FORMAT); 
	        formatter.setLenient(false);
	        String MADateStr = null;
	        try{  
	            Date date = formatter.parse(dateStr); 
	            MADateStr = formatter.format(date);
	        }catch(Exception e){
	        	log.info(e.getMessage());
	        		throw new MyException(MyException.FAIL,dateFormatInvalid);
	        }
	        return MADateStr;
		}
		
	// parse timestamp String: timeStr = "2018-05-07 10:00:00"; if timeStr is invalid, return null
	public static String parseTimeStamp(String timeStr) throws MyException{
		DateFormat formatter = new SimpleDateFormat(TIMESTAMP_FORMAT);
		formatter.setLenient(false);
		String MATimestamp = null;
		try {
			Date date = formatter.parse(timeStr);
			MATimestamp = formatter.format(date);
		} catch (Exception e) {
			log.info(e.getMessage());
			throw new MyException(MyException.FAIL,timeFormatInvalid);
		}
		return MATimestamp;
	}
	
	// transform date to timeStamp
	public static String transformDateToTimeStamp(String dateStr) throws MyException{
		String regex = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(dateStr);
        boolean dateFlag = m.matches();
        if (!dateFlag) {
            throw new MyException(MyException.FAIL,dateFormatInvalid);
        }
        DateFormat formatter = new SimpleDateFormat(DATE_FORMAT); 
        DateFormat formatter2 = new SimpleDateFormat(TIMESTAMP_FORMAT);
        formatter.setLenient(false);
        String MATimeStr ;
        try{  
            Date date = formatter.parse(dateStr); 
            MATimeStr = formatter2.format(date);
        }catch(Exception e){
        		throw new MyException(MyException.FAIL,dateFormatInvalid);
        }
        return MATimeStr;
	}
	
	// transform endDate to timeStamp, for example: 2018-05-31 ==> 2018-06-01 00:00:00
			public static String transformEndDateToTimeStamp(String dateStr) throws MyException{
				String regex = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
		        Pattern pattern = Pattern.compile(regex);
		        Matcher m = pattern.matcher(dateStr);
		        boolean dateFlag = m.matches();
		        if (!dateFlag) {
		            throw new MyException(MyException.FAIL,dateFormatInvalid);
		        }
		        DateFormat formatter = new SimpleDateFormat(DATE_FORMAT); 
		        DateFormat formatter2 = new SimpleDateFormat(TIMESTAMP_FORMAT);
		        formatter.setLenient(false);
		        String MATimeStr = null;
		        try{  
		            Date date = formatter.parse(dateStr); 
		            Calendar   calendar   =   new   GregorianCalendar(); 
		            calendar.setTime(date); 
		            calendar.add(Calendar.DATE,1);//把日期往后增加一天.正数往后推,负数往前推 
		            date=calendar.getTime();   //这个时间就是日期往后推一天的结果 
		            MATimeStr = formatter2.format(date);
		        }catch(Exception e){
					log.info(e.getMessage());
					throw new MyException(MyException.FAIL,dateFormatInvalid);
		        }
		        return MATimeStr;
			}
}
