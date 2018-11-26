package com.zhanglin.networkSlicingBackend.ms.exception;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	public static final int FAIL = -1;
	public static final int PARAMETER_INVALID = 2;
	public static final int SIGNATURE_INVALID = 3;
	public static final int TOKEN_INVALID = 40101;
	public static final int NO_AUTHORITY = 40102;
	
	private int code;
	
	public MyException(int code,String message) {
        super(message);
        this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
