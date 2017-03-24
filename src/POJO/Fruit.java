package POJO;

/*
 * Fruit Object Which contains properties of id,Size,Type and Color.
 * Color and Type are Pre-defined. 
 */

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruitColor == null) ? 0 : fruitColor.hashCode());
		result = prime * result + ((fruitType == null) ? 0 : fruitType.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (fruitColor == null) {
			if (other.fruitColor != null)
				return false;
		} else if (!fruitColor.equals(other.fruitColor))
			return false;
		if (fruitType == null) {
			if (other.fruitType != null)
				return false;
		} else if (!fruitType.equals(other.fruitType))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}

}
