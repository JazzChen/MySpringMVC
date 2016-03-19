package com.wolaidai.db.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wolaidai.db.mapper.LenderMapper;
import com.wolaidai.db.model.Lender;
import com.wolaidai.db.model.LoanLender;

@Service
public class LenderService {

	@Autowired
	private LenderMapper m_LenderMapper;

	@Transactional
	public Lender getLender(Integer lender_id) {
		return m_LenderMapper.getLender(lender_id);
	}

	public List<LoanLender> getLoanLenders() {
		List<LoanLender> result = m_LenderMapper.getLoanLenders();
		return result;
	}
}
