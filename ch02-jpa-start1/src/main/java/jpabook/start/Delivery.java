package jpabook.start;

import javax.persistence.*;

@Entity
public class Delivery {
	
	@Id @GeneratedValue
	@Column(name = "DELIVERY_ID")
	private Long id;
	
	@OneToOne(mappedBy = "delivery")
	private Order order;
	
	private String ciry;
	private String street;
	private String zipcode;
	
	@Enumerated(EnumType.STRING)
	private DeliveryStatus status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getCiry() {
		return ciry;
	}

	public void setCiry(String ciry) {
		this.ciry = ciry;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public DeliveryStatus getStatus() {
		return status;
	}

	public void setStatus(DeliveryStatus status) {
		this.status = status;
	}
	
	
}
