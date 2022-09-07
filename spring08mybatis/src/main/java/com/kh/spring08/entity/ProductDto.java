package com.kh.spring08.entity;

import java.util.Date;

public class ProductDto {
	
		private int no;
		private String name;
		private String type;
		private int price;
		
		//date와 string을 병행해서 사용하도록 설정
		private String madeString;
		private Date made;
		private String expireString;
		private Date expire;
		@Override
		public String toString() {
			return "ProductDto [no=" + no + ", name=" + name + ", type=" + type + ", price=" + price + ", made=" + made
					+ ", expire=" + expire + "]";
		}
		public ProductDto() {
			super();
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getMadeString() {
			return madeString;
		}
		public void setMadeString(String madeString) {
			this.madeString = madeString;
		}
		public Date getMade() {
			return made;
		}
		public void setMade(Date made) {
			this.made = made;
		}
		public String getExpireString() {
			return expireString;
		}
		public void setExpireString(String expireString) {
			this.expireString = expireString;
		}
		public Date getExpire() {
			return expire;
		}
		public void setExpire(Date expire) {
			this.expire = expire;
		}
		
		public String getMadeStringNotNull() {
			if(this.made == null) {
				return "";
			}
			else { 
				return this.made.toString();
			}
		}
		public String getExpireStringNotNull() {
			if(this.expire == null) return "";
			else return this.expire.toString();
		}
		
	}


