package com.bridzelabz.indianStateCensus;

import java.io.IOException;

public class CensusAnalyserException extends IOException {

	    public enum ExceptionType {
	        FILE_NOT_FOUND, INCORRECT_FILE_TYPE, INCORRECT_DELIMITER_OR_HEADER
	    }
	    public ExceptionType type;

	    public CensusAnalyserException(String message, ExceptionType type) {
	        super(message);
	        this.type = type;
	    }
}
