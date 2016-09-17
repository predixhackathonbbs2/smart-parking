package com.ge.smartparking.app.util;

import com.google.gson.Gson;


public class RestResponse  {

	private int statusCode;

	private String message;

	private Object responseData;



	public RestResponse() {
		super();
		// TODO Auto-generated constructor stub
	}



	public RestResponse(int statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}



	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public Object getResponseData() {
		return responseData;
	}



	public void setResponseData(Object responseData) {
		String response=getJSON(responseData);
		this.responseData = response;
	}



	public static String getJSON(Object object) {
		Gson gson=new Gson();
		return gson.toJson(object);
	}


}
