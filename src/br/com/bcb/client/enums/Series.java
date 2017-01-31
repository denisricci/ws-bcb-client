package br.com.bcb.client.enums;

public enum Series {
	SELIC(11),
	CDI(12);
	
	private int code;
	
	private Series(int code){
		this.code=code;
	}
	
	public int getCode(){
		return this.code;
	}
}
