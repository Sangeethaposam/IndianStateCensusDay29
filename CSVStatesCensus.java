package com.bridzelabz.indianStateCensus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;

public class CSVStatesCensus {
	
	    private int recordCount;
	    public void loadData(String fileName) {
	        try {
	            BufferedReader br = new BufferedReader(new FileReader(fileName));
	            Iterator<String[]> iterator = br.lines().map(line -> line.split(",")).iterator();
	            while (iterator.hasNext()) {
	                iterator.next();
	                recordCount++;
	            }
	            br.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public int getRecordCount() {
	        return recordCount;
	    }
}
