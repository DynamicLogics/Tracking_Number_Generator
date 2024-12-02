package com.tng.bean;

public class NewTrkngNumbGenDtls {
	private String origin_country_id;
	private String destination_country_id;
	private String weight;
	private String created_at;
	private String customer_id;
	private String customer_name;
	private String customer_slug;
	
	public NewTrkngNumbGenDtls(String origin_country_id, String destination_country_id, String weight,
			String created_at, String customer_id, String customer_name, String customer_slug) {
		super();
		this.origin_country_id = origin_country_id;
		this.destination_country_id = destination_country_id;
		this.weight = weight;
		this.created_at = created_at;
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_slug = customer_slug;
	}

	public String getOrigin_country_id() {
		return origin_country_id;
	}

	public void setOrigin_country_id(String origin_country_id) {
		this.origin_country_id = origin_country_id;
	}

	public String getDestination_country_id() {
		return destination_country_id;
	}

	public void setDestination_country_id(String destination_country_id) {
		this.destination_country_id = destination_country_id;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_slug() {
		return customer_slug;
	}

	public void setCustomer_slug(String customer_slug) {
		this.customer_slug = customer_slug;
	}

	@Override
	public String toString() {
		return "NewTrkngNumbGenDtls [origin_country_id=" + origin_country_id + ", destination_country_id="
				+ destination_country_id + ", weight=" + weight + ", created_at=" + created_at + ", customer_id="
				+ customer_id + ", customer_name=" + customer_name + ", customer_slug=" + customer_slug + "]";
	}
	
}
