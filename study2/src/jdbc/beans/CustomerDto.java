package jdbc.beans;

public class CustomerDto {
	private int customerNo;
	private String customerId;
	private String customerPhone;
	private String customerRegistDate;
	private String customerPurchaseDate;
	private int customerMileage;
	private String customerLevel;
	@Override
	public String toString() {
		return "CustomerDto [customerNo=" + customerNo + ", customerId=" + customerId + ", customerPhone="
				+ customerPhone + ", customerRegistDate=" + customerRegistDate + ", customerPurchaseDate="
				+ customerPurchaseDate + ", customerMileage=" + customerMileage + ", customerLevel=" + customerLevel
				+ "]";
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerRegistDate() {
		return customerRegistDate;
	}
	public void setCustomerRegistDate(String customerRegistDate) {
		this.customerRegistDate = customerRegistDate;
	}
	public String getCustomerPurchaseDate() {
		return customerPurchaseDate;
	}
	public void setCustomerPurchaseDate(String customerPurchaseDate) {
		this.customerPurchaseDate = customerPurchaseDate;
	}
	public int getCustomerMileage() {
		return customerMileage;
	}
	public void setCustomerMileage(int customerMileage) {
		this.customerMileage = customerMileage;
	}
	public String getCustomerLevel() {
		return customerLevel;
	}
	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}
	public CustomerDto() {
		super();
	}
}
