package com.bridzelabz.indianStateCensus;

import org.junit.Assert;
import org.junit.Test;

public class IndianStateCensusTest {

	IndianStateCensus  analyser = new IndianStateCensus();
	    // Test case 1
	    @Test
	    public void givenStatesCensusCSVFile_whenNumberOfRecordMatches_shouldReturnTrue() {
	        int recordCount = analyser.getRecordCount();
	        Assert.assertEquals(29, recordCount);
	    }

	    // Test case 2
	    @Test
	    public void givenStatesCensusCSVFile_whenFileNotFound_shouldThrowCustomException() {
	        try {
	            analyser.loadData("InvalidFileName.csv");
	        } catch (CensusAnalyserException e) {
	            Assert.assertEquals(CensusAnalyserException.ExceptionType.FILE_NOT_FOUND, e.type);
	        }
	    }

	    // Test case 3
	    @Test
	    public void givenStatesCensusCSVFile_whenFileTypeIncorrect_shouldThrowCustomException() {
	        try {
	            analyser.loadData("IndiaStateCensusData.txt");
	        } catch (CensusAnalyserException e) {
	            Assert.assertEquals(CensusAnalyserException.ExceptionType.INCORRECT_FILE_TYPE, e.type);
	        }
	    }

	    // Test case 4
	    @Test
	    public void givenStatesCensusCSVFile_whenFileDelimiterIncorrect_shouldThrowCustomException() {
	        try {
	            analyser.loadData("IndiaStateCensusDataWithIncorrectDelimiter.csv");
	        } catch (CensusAnalyserException e) {
	            Assert.assertEquals(CensusAnalyserException.ExceptionType.INCORRECT_DELIMITER_OR_HEADER, e.type);
	        }
	    }

	    // Test case 5
	    @Test
	    public void givenStatesCensusCSVFile_whenFileHeaderIncorrect_shouldThrowCustomException() {
	        try {
	            analyser.loadData("IndiaStateCensusDataWithIncorrectHeader.csv");
	        } catch (CensusAnalyserException e) {
	            Assert.assertEquals(CensusAnalyserException.ExceptionType.INCORRECT_DELIMITER_OR_HEADER, e.type);
	        }
	    }
}
