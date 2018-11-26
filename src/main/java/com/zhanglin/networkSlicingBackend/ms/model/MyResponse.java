package com.zhanglin.networkSlicingBackend.ms.model;

public class MyResponse<T> {

	public static final Integer OK_CODE = 0;
	public static final Integer ERROR_CODE = -1;
	public static final String OK_MESSAGE = "ok";

	//@JsonView(View.MyView.class)
	private int respCode;

	//@JsonView(View.MyView.class)
	private String respMsg;

	//@JsonView(View.MyView.class)
	private T data;

	public MyResponse() {

	}
	private MyResponse(T data) {
		this.respCode = OK_CODE;
		this.respMsg = OK_MESSAGE;
		this.data = data;
	}
	private MyResponse(int respCode, String respMsg, T data) {
		this.respCode = respCode;
		this.respMsg = respMsg;
		this.data = data;
	}

	public static MyResponse ok() {
		return new MyResponse(null);
	}
	public static MyResponse ok(Object data) {
		return new MyResponse(data);
	}
	public static MyResponse ok(String respMsg,Object data) {
		return new MyResponse(OK_CODE,respMsg,data);
	}
	public static MyResponse error(int respCode, String respMsg) {
		return new MyResponse(respCode, respMsg, null);
	}

	public int getRespCode() {
		return respCode;
	}
	public void setRespCode(int respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

}

