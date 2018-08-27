package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyStats {
	private Long marketcap;
	
	public Long getmarketcap(){
		return marketcap;
	}
	
	public void setmarketcap(Long marketcap){
		this.marketcap = marketcap;
	}
	
	@Override
    public String toString() {
        return "Watchlist{" +
        		"Market Cap=" + marketcap  +
                '}';
    }

}

