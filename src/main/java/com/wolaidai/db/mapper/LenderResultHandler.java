package com.wolaidai.db.mapper;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Component;

import com.wolaidai.db.model.Lender;

@Component
public class LenderResultHandler implements ResultHandler {

	@Override
	public void handleResult(ResultContext context) {
		Lender lender = (Lender)context.getResultObject();
		System.out.println(lender.getMobile());
	}

}
