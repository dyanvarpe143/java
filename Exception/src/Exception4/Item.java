package Exception4;

public class Item {

	int itemid;
	String name;
	int cost;
	
	public Item(int itemid,String name,int cost)
	{
		this.itemid=itemid;
		this.name=name;
		this.cost=cost;
	}
	void display(int itemid,String name,int cost)
	{
		this.itemid=itemid;
		this.name=name;
		this.cost=cost;
		
		System.out.println("Itemid of product:"+itemid);
		System.out.println(" name of product:"+name);
		System.out.println("Cost of product:"+cost);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i=new Item(101, "abc", 1024);
		i.display(101, "abc", 1024);

	}

}
