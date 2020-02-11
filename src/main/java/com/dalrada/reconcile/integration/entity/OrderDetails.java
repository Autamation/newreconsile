package com.dalrada.reconcile.integration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "order_details")
	public class OrderDetails{
		
		@Id
		@GeneratedValue
		@Column
		private Long Sr_No ;
		@Column
		private String Order_Date;
		@Column
		private String Store_Order_Id;
		@Column
		private String Order_Number;
		@Column
		private String PO_Number;
		@Column
		private String Reference_Number;
		@Column
		private String Channel_Name;
		@Column
		private String Order_Status;
		@Column
		private String SKU;
		@Column
		private String Product_Name;
		@Column
		private String Quantity;
		@Column
		private String Supplier_Cost_Per_SKU;
		@Column
		private String Sale_Price;
		@Column
		private String Supplier_Cost_Total;
		@Column
		private String Order_Total;
		@Column
		private String Supplier_Name;
		@Column
		private String Store_Shipping_Method;
		@Column
		private String Shipping_Carrier;
		@Column
		private String Shipping_Method;
		@Column
		private String Tracking_Numbers;
		@Column
		private String Customer_Name;
		@Column
		private String Customer_Email;
		@Column
		private String Customer_Phone;
		@Column
		private String Address_Line1;
		@Column
		private String Address_Line2;
		@Column
		private String City;
		@Column
		private String State;
		@Column
		private String Zip;
		@Column
		private String Country;
		@Column
		private String Company;
		
		public Long getSr_No() {
			return Sr_No;
		}
		public void setSr_No(Long sr_No) {
			Sr_No = sr_No;
		}
		public String getOrder_Date() {
			return Order_Date;
		}
		public void setOrder_Date(String order_Date) {
			Order_Date = order_Date;
		}
		public String getStore_Order_Id() {
			return Store_Order_Id;
		}
		public void setStore_Order_Id(String store_Order_Id) {
			Store_Order_Id = store_Order_Id;
		}
		public String getOrder_Number() {
			return Order_Number;
		}
		public void setOrder_Number(String order_Number) {
			Order_Number = order_Number;
		}
		public String getPO_Number() {
			return PO_Number;
		}
		public void setPO_Number(String pO_Number) {
			PO_Number = pO_Number;
		}
		public String getReference_Number() {
			return Reference_Number;
		}
		public void setReference_Number(String reference_Number) {
			Reference_Number = reference_Number;
		}
		public String getChannel_Name() {
			return Channel_Name;
		}
		public void setChannel_Name(String channel_Name) {
			Channel_Name = channel_Name;
		}
		public String getOrder_Status() {
			return Order_Status;
		}
		public void setOrder_Status(String order_Status) {
			Order_Status = order_Status;
		}
		public String getSKU() {
			return SKU;
		}
		public void setSKU(String sKU) {
			SKU = sKU;
		}
		public String getProduct_Name() {
			return Product_Name;
		}
		public void setProduct_Name(String product_Name) {
			Product_Name = product_Name;
		}
		public String getQuantity() {
			return Quantity;
		}
		public void setQuantity(String quantity) {
			Quantity = quantity;
		}
		public String getSupplier_Cost_Per_SKU() {
			return Supplier_Cost_Per_SKU;
		}
		public void setSupplier_Cost_Per_SKU(String supplier_Cost_Per_SKU) {
			Supplier_Cost_Per_SKU = supplier_Cost_Per_SKU;
		}
		public String getSale_Price() {
			return Sale_Price;
		}
		public void setSale_Price(String sale_Price) {
			Sale_Price = sale_Price;
		}
		public String getSupplier_Cost_Total() {
			return Supplier_Cost_Total;
		}
		public void setSupplier_Cost_Total(String supplier_Cost_Total) {
			Supplier_Cost_Total = supplier_Cost_Total;
		}
		public String getOrder_Total() {
			return Order_Total;
		}
		public void setOrder_Total(String order_Total) {
			Order_Total = order_Total;
		}
		public String getSupplier_Name() {
			return Supplier_Name;
		}
		public void setSupplier_Name(String supplier_Name) {
			Supplier_Name = supplier_Name;
		}
		public String getStore_Shipping_Method() {
			return Store_Shipping_Method;
		}
		public void setStore_Shipping_Method(String store_Shipping_Method) {
			Store_Shipping_Method = store_Shipping_Method;
		}
		public String getShipping_Carrier() {
			return Shipping_Carrier;
		}
		public void setShipping_Carrier(String shipping_Carrier) {
			Shipping_Carrier = shipping_Carrier;
		}
		public String getShipping_Method() {
			return Shipping_Method;
		}
		public void setShipping_Method(String shipping_Method) {
			Shipping_Method = shipping_Method;
		}
		public String getTracking_Numbers() {
			return Tracking_Numbers;
		}
		public void setTracking_Numbers(String tracking_Numbers) {
			Tracking_Numbers = tracking_Numbers;
		}
		public String getCustomer_Name() {
			return Customer_Name;
		}
		public void setCustomer_Name(String customer_Name) {
			Customer_Name = customer_Name;
		}
		public String getCustomer_Email() {
			return Customer_Email;
		}
		public void setCustomer_Email(String customer_Email) {
			Customer_Email = customer_Email;
		}
		public String getCustomer_Phone() {
			return Customer_Phone;
		}
		public void setCustomer_Phone(String customer_Phone) {
			Customer_Phone = customer_Phone;
		}
		public String getAddress_Line1() {
			return Address_Line1;
		}
		public void setAddress_Line1(String address_Line1) {
			Address_Line1 = address_Line1;
		}
		public String getAddress_Line2() {
			return Address_Line2;
		}
		public void setAddress_Line2(String address_Line2) {
			Address_Line2 = address_Line2;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String getState() {
			return State;
		}
		public void setState(String state) {
			State = state;
		}
		public String getZip() {
			return Zip;
		}
		public void setZip(String zip) {
			Zip = zip;
		}
		public String getCountry() {
			return Country;
		}
		public void setCountry(String country) {
			Country = country;
		}
		public String getCompany() {
			return Company;
		}
		public void setCompany(String company) {
			Company = company;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("OrderDetails [Sr_No=").append(Sr_No).append(", Order_Date=").append(Order_Date)
					.append(", Store_Order_Id=").append(Store_Order_Id).append(", Order_Number=").append(Order_Number)
					.append(", PO_Number=").append(PO_Number).append(", Reference_Number=").append(Reference_Number)
					.append(", Channel_Name=").append(Channel_Name).append(", Order_Status=").append(Order_Status)
					.append(", SKU=").append(SKU).append(", Product_Name=").append(Product_Name).append(", Quantity=")
					.append(Quantity).append(", Supplier_Cost_Per_SKU=").append(Supplier_Cost_Per_SKU)
					.append(", Sale_Price=").append(Sale_Price).append(", Supplier_Cost_Total=").append(Supplier_Cost_Total)
					.append(", Order_Total=").append(Order_Total).append(", Supplier_Name=").append(Supplier_Name)
					.append(", Store_Shipping_Method=").append(Store_Shipping_Method).append(", Shipping_Carrier=")
					.append(Shipping_Carrier).append(", Shipping_Method=").append(Shipping_Method)
					.append(", Tracking_Numbers=").append(Tracking_Numbers).append(", Customer_Name=").append(Customer_Name)
					.append(", Customer_Email=").append(Customer_Email).append(", Customer_Phone=").append(Customer_Phone)
					.append(", Address_Line1=").append(Address_Line1).append(", Address_Line2=").append(Address_Line2)
					.append(", City=").append(City).append(", State=").append(State).append(", Zip=").append(Zip)
					.append(", Country=").append(Country).append(", Company=").append(Company).append("]");
			return builder.toString();
		}
	}