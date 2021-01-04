package com.job.designPattern.Interpreter;

import java.util.Date;

public class DayExpression extends AbstractExpression{

	@Override
	public void evaluate(Context context) {
		String expression = context.getExpression();
		Date date = context.getDate();
		Integer day = date.getDate();
		String dayExpression = expression.replaceAll("DD", day.toString());
		context.setExpression(dayExpression);
	}

}
