package com.nttdata.bank.buy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Buy {

	private Double amount;
	
	private int mobile;
	
	private Byte payMode;
	
}
