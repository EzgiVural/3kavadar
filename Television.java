/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

/**
 *
 * @author Melike
 */
public class Television extends Product {

	private int size;

	private String resolution;

        private int price;

	public Television(int pid, String brand, String model, int size, String resolution, int price) {

		super(pid, brand, model);

		this.size = size;

		this.resolution = resolution;
                
                this.price= price;

	}
	public int gettvSize()
        {

		return size;
	}
	public void settvSize(int size) {

		this.size = size;
	}

        public String getResolution() {

		return resolution;
	}

	public void setResolution(String resolution) {

		this.resolution = resolution;
	}


        public int getprice() {

		return price;

	}



	public void setprice(int price) {

		this.price = price;

	}
	@Override

	public String toString() {

		return super.toString() + " --CellPhone [size=" + size + ", resolution=" + resolution + ", price=" + price +"]";

	}



}

