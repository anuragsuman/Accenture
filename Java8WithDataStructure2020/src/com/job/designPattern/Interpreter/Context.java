package com.job.designPattern.Interpreter;

import java.util.Date;

public class Context {

	private String expression;
	private Date date;
	
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
