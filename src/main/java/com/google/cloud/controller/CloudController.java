package com.google.cloud.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.cloud.Trade;

@Path("/cloud")
public class CloudController {

@GET
@Path("/tardeDetails")
@Produces(MediaType.APPLICATION_JSON)
public Trade getTrade() {
	
	Trade trade = new Trade();
	trade.setTradeId("1");
	trade.setTradeName("BOND");
	trade.setTradeDetails("Bloomberg");
	trade.setTraderName("Abhijeet Sawant");
	return trade;
	}
}
