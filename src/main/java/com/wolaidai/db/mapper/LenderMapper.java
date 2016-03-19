package com.wolaidai.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wolaidai.db.model.Lender;
import com.wolaidai.db.model.LoanLender;

public interface LenderMapper {
	Lender getLender(@Param("lender_id") Integer lender_id);

	List<LoanLender> getLoanLenders();
}
