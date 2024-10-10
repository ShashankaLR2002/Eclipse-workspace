package com.xworkz.sortingandfiltering;

import java.io.Serializable;

public class ProductDTO implements Serializable, Comparable<ProductDTO> {
	private int id;
	private String name;
	private double cost;
	private String vendor;

	public ProductDTO(int id, String name, double cost, String vendor) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.vendor = vendor;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public String getVendor() {
		return vendor;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vendor == null) ? 0 : vendor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ProductDTO))
			return false;
		ProductDTO other = (ProductDTO) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vendor == null) {
			if (other.vendor != null)
				return false;
		} else if (!vendor.equals(other.vendor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", cost=" + cost + ", vendor=" + vendor + "]";
	}

	// Comparing based on cost for sorting
	@Override
	public int compareTo(ProductDTO o) {
		return Double.compare(this.cost, o.cost);
	}
}
