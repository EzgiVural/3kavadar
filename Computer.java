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

public class Computer extends Product {

	private float processor;

	private String ramSize;

        private int price;

	public Computer(int pid, String brand, String model, float processor, String ramSize, int price) {

		super(pid, brand, model);

		this.processor = processor;

		this.ramSize = ramSize;
                
                this.price= price;
	}
	public float getProcessor() {

		return processor;
	}
	public void setProcessor(float processor) {

		this.processor = processor;
	}
	public String getRamSize() {

            return ramSize;
	}
	public void setRamSize(String ramSize) {

		this.ramSize = ramSize;
	}
        public int getprice() {

		return price;
	}
	public void setprice(int price) {

		this.price = price;
	}
	@Override

	public String toString() {

		return super.toString() + " --CellPhone [processor=" + processor + ", ramSize=" + ramSize + ", price=" + price +"]";
	}

}
