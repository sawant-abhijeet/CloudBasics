package com.google.cloud;
public class Trade {

	private String tradeId;
	private String tradeName;
	private String tradeDetails;
	private String traderName;

	public String getTraderName() {
		return traderName;
	}

	public void setTraderName(String traderName) {
		this.traderName = traderName;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getTradeDetails() {
		return tradeDetails;
	}

	public void setTradeDetails(String tradeDetails) {
		this.tradeDetails = tradeDetails;
	}
}