package com.job.designPattern.Interpreter;

import java.util.Date;

public class MonthExpression extends AbstractExpression {

	@Override
	public void evaluate(Context context) {
		String expression = context.getExpression();
		Date date = context.getDate();
		Integer month = date.getMonth()+1;
		String monthExpression = expression.replaceAll("MM", month.toString());
		context.setExpression(monthExpression);
	}

}
