package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyStats {
	private Long marketcap;
	private String companyName;
	
	public Long getmarketcap(){
		return marketcap;
	}
	public String getcompanyName(){
		return companyName;
	}
	
	public void setmarketcap(Long marketcap){
		this.marketcap = marketcap;
	}
	public void setcompanyName(String companyName){
		this.companyName = companyName;
	}
	
	@Override
    public String toString() {
        return "Watchlist{" +
        		"Market Cap=" + marketcap  +
        		"Company Name" + companyName +
                '}';
    }

}

