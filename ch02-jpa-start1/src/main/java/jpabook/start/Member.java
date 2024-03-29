package jpabook.start;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import jpabook.model.entity.item.BaseEntity;

@Entity
public class Member extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "MEMBER_ID")
	private Long id;
	
	private String name;
	
	
	private String city;
	private String strret;
	private String zipcode;
	
	@OneToMany(mappedBy = "member")
	private List<Order> orders = new ArrayList<Order>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStrret() {
		return strret;
	}
	public void setStrret(String strret) {
		this.strret = strret;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	 
}
