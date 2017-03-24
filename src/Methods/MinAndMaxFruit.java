package Methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import POJO.Fruit;

/*
 *  returning the Minimum and Maximum Size of Fruit in the FruitList
 */
public class MinAndMaxFruit {

	public Map<String, List<Fruit>> minAndMaxFruit(List<Fruit> list) {
		Map<String, List<Fruit>> result = new HashMap<>();
		List<Fruit> smallFruit = new ArrayList<>();
		List<Fruit> bigFruit = new ArrayList<>();
		for (Fruit f : list) {
			if (f.getSize().equals("Small")) {
				smallFruit.add(f);
				result.put(f.getSize(), smallFruit);
			} else if (f.getSize().equals("Big")) {
				bigFruit.add(f);
				result.put(f.getSize(), bigFruit);
			}
		}
		return result;
	}

}
