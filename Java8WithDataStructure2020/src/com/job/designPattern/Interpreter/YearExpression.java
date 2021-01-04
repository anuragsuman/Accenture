package com.job.designPattern.Interpreter;

import java.util.Date;

public class YearExpression extends AbstractExpression {

	@Override
	public void evaluate(Context context) {
		String expression = context.getExpression();
		Date date = context.getDate();
		Integer year = date.getYear()+1900;
		String yearExpression = expression.replaceAll("YYYY", year.toString());
		context.setExpression(yearExpression);
	}
}
