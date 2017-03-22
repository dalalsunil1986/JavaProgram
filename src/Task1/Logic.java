package Task1;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Logic {

	void groupingItBySize(List<Fruit> list) {
		Map<String, List<Fruit>> filtered = list.stream().collect(Collectors.groupingBy(Fruit::getSize));

		System.out.println("Grouping It by Size");
		for (Entry<String, List<Fruit>> f : filtered.entrySet()) {
			// System.out.println(f.getKey());
			for (Fruit fr : f.getValue()) {
				System.out.println(
						fr.getId() + "\t" + fr.getSize() + "\t" + fr.getFruitColor() + "\t" + fr.getFruitType());
			}
		}
	}

	void minAndMaxSize(List<Fruit> list) {
		System.out.println("\nFinding Small And Big Size Fruits");

		list.stream().filter(f -> f.getSize() == "Small").forEach(f -> System.out
				.println(f.getId() + "\t" + f.getSize() + "\t" + f.getFruitColor() + "\t" + f.getFruitType()));
		list.stream().filter(f -> f.getSize() == "Big").forEach(f -> System.out
				.println(f.getId() + "\t" + f.getSize() + "\t" + f.getFruitColor() + "\t" + f.getFruitType()));
		
	}

}
