package com.google.cloud.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.google.cloud.Trade;

@Path("/cloud")
public class CloudController {

@GET
@Path("/tardeDetails")
public Response getTrade() {
	
	Trade trade = new Trade();
	trade.setTradeId("1");
	trade.setTradeName("REPO");
	trade.setTradeDetails("Bloomberg");
	return Response.status(200).entity("Trade").build();
	}
}
