package Task2;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import Task2.Fruit;

public class Logic {

	void groupingItBySize(List<Fruit> list) {
		Map<String, List<Fruit>> filtered = list.stream().collect(Collectors.groupingBy(Fruit::getFruitColor));

		System.out.println("Grouping It by Color");
		for (Entry<String, List<Fruit>> f : filtered.entrySet()) {
			// System.out.println(f.getKey());
			for (Fruit fr : f.getValue()) {
				System.out.println(
						fr.getId() + "\t" + fr.getSize() + "\t" + fr.getFruitColor() + "\t" + fr.getFruitType());
			}
		}
	}

	void minAndMaxFruitsByColor(List<Fruit> list) {
		Map<String, List<Fruit>> filtered = list.stream().collect(Collectors.groupingBy(Fruit::getFruitColor));

		System.out.println("\nMin and Max Fruits by Color");

		for (Entry<String, List<Fruit>> f : filtered.entrySet()) {
			System.out.println(f.getKey() + "\t" + f.getValue().size());
		}
	}

	void minAndMaxSizeByEachColorGroup(List<Fruit> list) {
		Map<String, List<Fruit>> filtered = list.stream().collect(Collectors.groupingBy(Fruit::getFruitColor));

		System.out.println("\nMin and Max Size by Color");
		for (Entry<String, List<Fruit>> f : filtered.entrySet()) {
			System.out.println(f.getKey());
			for (Fruit fr : f.getValue()) {
				if (fr.getSize() == "Small" || fr.getSize() == "Big") {
					System.out.println(fr.getId() + "\t" + fr.getSize() + "\t" + fr.getFruitType());

				}
			}
		}
	}
}
