package com.nttdata.bank.buy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

import com.nttdata.bank.buy.model.Buy;

@Service
public class BuyService {
	
	@Autowired
	private StreamBridge streamBridge;
	
	public void buyBootCoin(Buy buy) {
		streamBridge.send("output-buy", buy);
	}

}
