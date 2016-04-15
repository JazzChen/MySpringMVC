package com.wolaidai.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.ResultHandler;

import com.wolaidai.db.model.Lender;
import com.wolaidai.db.model.LoanLender;

public interface LenderMapper {
	Lender getLender(@Param("lender_id") Integer lender_id);

	List<LoanLender> getLoanLenders();
	
	void selectAllLenders(ResultHandler handler);
	
	void selectAllLendersLargeThan(@Param("id")Integer id, ResultHandler handler);
}
