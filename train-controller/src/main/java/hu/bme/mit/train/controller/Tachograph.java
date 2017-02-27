package hu.bme.mit.train.controller;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Tachograph {
	Table<String, Integer, Integer> dataTable = HashBasedTable.create();
	
	public void addData(int pos, int speed){
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		dataTable.put(timeStamp, pos, speed);
	}
	public boolean isEmpty(){
		return dataTable.isEmpty();
	}
	
}
