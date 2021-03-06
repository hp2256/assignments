package com.hp.springbootstarter.Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
	@Autowired
	CardCheckService ccs;

	@RequestMapping(method = RequestMethod.POST, value = "/card")
	public String addNos(@RequestBody Card c) {
		return ccs.checkCard(c.x);
	}
}
