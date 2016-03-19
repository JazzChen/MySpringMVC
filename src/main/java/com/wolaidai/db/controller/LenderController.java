package com.wolaidai.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wolaidai.db.model.Lender;
import com.wolaidai.db.model.LoanLender;
import com.wolaidai.db.server.LenderService;

@Controller
@RequestMapping("/lender")
public class LenderController {

	@Autowired
	private LenderService lenderService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Lender getLender(@PathVariable("id") Integer lender_id) {
		return lenderService.getLender(lender_id);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public List<LoanLender> getLoanLenders() {
		List<LoanLender> loanLenders = lenderService.getLoanLenders();
		return loanLenders;
	}
}
