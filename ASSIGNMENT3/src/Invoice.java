import java.util.Scanner;
public class Invoice {
	private String part_num;
	private String part_desc;
	private int quantity_item;
	private double price_per_item;
	
	public Invoice(){
		part_num="";
		part_desc="";
		quantity_item=0;
		price_per_item=0.0;
	}
	public Invoice(String part_num, String part_desc,int quantity_item,double price_per_item)
	{
		this.part_num=part_num;
		this.part_desc=part_desc;
		this.quantity_item=quantity_item;
		this.price_per_item=price_per_item;
	}
	//Setter
	void setPartNum(String part_num) {
		this.part_num=part_num;
	}
	void setPartDesc(String part_desc) {
		this.part_desc=part_desc;
	}
	void setQuantityItem(int quantity_item) {
		this.quantity_item=quantity_item;
	}
	void setPricePerItem(int price_per_item) {
		this. price_per_item= price_per_item;
	}
	//getter
	String getPartNum() {
		return part_num;
	}
	String getPartDesc() {
		return part_desc;
	}
	int getQuantityItem() {
		return quantity_item;
	}
	double getPricePerItem() {
		return price_per_item;
	}	
	
	void acceptInvoice() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Part Number: ");
		part_num = sc.nextLine();
		System.out.println("Enter Part Description: ");
		part_desc = sc.nextLine();
		System.out.println("Enter a quantity of the item being purchased : ");
		quantity_item = sc.nextInt();
		if(quantity_item<0) {
			quantity_item=0;
		}
		System.out.println("Enter a price per item: ");
		price_per_item = sc.nextDouble();
		if(price_per_item<0) {
			price_per_item=0.0;
		}
		sc.close();
	}
	void calculateInvoice() {
		double invoice_amt=quantity_item*price_per_item;
		System.out.println("Invoice amount: "+invoice_amt);
	}
}
