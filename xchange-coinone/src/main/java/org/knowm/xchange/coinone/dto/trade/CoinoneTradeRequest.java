package org.knowm.xchange.coinone.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CoinoneTradeRequest {

	@JsonProperty("access_token")
	protected String accessTocken;

	@JsonProperty("nonce")
	protected Long nonce;

	@JsonProperty("price")
	protected BigDecimal price;

	@JsonProperty("qty")
	protected BigDecimal qty;

	@JsonProperty("currency")
	protected String currency;

	/**
	 * Constructor
	 *
	 * @param nonce
	 */
	public CoinoneTradeRequest(
			String accessTocken, Long nonce, double price, double qty, String currency) {

		this.accessTocken = accessTocken;
		this.nonce = nonce;
		this.price = new BigDecimal(String.valueOf(price));
		this.qty = new BigDecimal(String.valueOf(qty));
		this.currency = currency;
	}

	public String getAccessTocken() {
		return accessTocken;
	}

	public void setAccessTocken(String accessTocken) {
		this.accessTocken = accessTocken;
	}

	public Long getNonce() {
		return nonce;
	}

	public void setNonce(Long nonce) {
		this.nonce = nonce;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
