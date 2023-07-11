package test;

public class Fruit {
	   
	   private String fruit;
	   private String color;
	   
	   public Fruit(String fruit, String color) {
	      this.fruit=fruit;
	      this.color=color;
	   }
	   
	   public void setName(String f) {
	      fruit = f;
	   }
	   
	   public String getName() {
	      return fruit;
	   }
	   public void setColor(String c) {
	      color = c;
	   }
	   public String getColor() {
	      return color;
	   }

	@Override
	public String toString() {
		return "Fruit [fruit=" + fruit + ", color=" + color + "]";
	}
	   
	}