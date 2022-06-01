package com.nttdata.bank.buy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bank.buy.model.Buy;
import com.nttdata.bank.buy.service.BuyService;

@RestController
public class BuyController {
	
	@Autowired
	private BuyService buyService;
	
	@PostMapping
	public void buyBootCoin(@RequestBody Buy buy) {
		buyService.buyBootCoin(buy);
	}

}
