package com.kh.spring08.entity;

public class OlympicDto {
	private int rank;
	private String name;
	private int gold;
	private int silver;
	private int bronze;
	//기본생성자 + setter/getter + toString(옵션)
	public OlympicDto() {
		super();
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getSilver() {
		return silver;
	}
	public void setSilver(int silver) {
		this.silver = silver;
	}
	public int getBronze() {
		return bronze;
	}
	public void setBronze(int bronze) {
		this.bronze = bronze;
	}
	@Override
	public String toString() {
		return "OlympicDto [rank=" + rank + ", name=" + name + ", gold=" + gold + ", silver=" + silver + ", bronze="
				+ bronze + "]";
	}
}