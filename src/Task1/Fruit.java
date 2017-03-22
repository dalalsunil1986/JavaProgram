package Task1;

public class Fruit {
	private Integer id;
	private String size;
	private String fruitType;
	private String fruitColor;

	public enum Color {
		RED, GREEN, YELLOW;
	}

	public enum Type {
		SEEDED, SEEDLESS;
	}

	public String getFruitType() {
		return fruitType;
	}

	public void setFruitType(String fruitType) {
		this.fruitType = fruitType;
	}

	public String getFruitColor() {
		return fruitColor;
	}

	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Fruit(int id, String size, String fruitType, String fruitColor) {
		super();
		this.id = id;
		this.size = size;
		this.fruitType = fruitType;
		this.fruitColor = fruitColor;
	}

	public Fruit() {

	}

}
