package jp.co.iccom.suzuki_yoshihiro.calculate_sales;


public class Branch implements Comparable<Branch> {
	String bCode, bName;
	long bAmount;

	Branch(String code, String name, long amount){
		this.bCode = code;
		this.bName = name;
		this.bAmount = amount;
	}
	Branch(){
		this.bCode = "";
		this.bName = "";
		this.bAmount = 0;
	}


	public int compareTo(Branch b) {

		return (int) (this.bAmount - b.bAmount);
	}
}
