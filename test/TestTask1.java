import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import Methods.GroupingBySize;
import Methods.MinAndMaxFruit;
import POJO.Fruit;

/*
 * Test Case for Task -1 
 * Testing Methods like GroupingBySize,MinMAxFruit.
 */
public class TestTask1 {

	GroupingBySize bySize = new GroupingBySize();
	MinAndMaxFruit minMax = new MinAndMaxFruit();

	// Test case for Minimum and Maximum Size ofFruit in the FruitList
	@Test
	public void minMaxFruitTest() {
		ArrayList<Fruit> list = new ArrayList<>();
		list.add(new Fruit(1, "Small", "Seeded", "Green"));
		list.add(new Fruit(2, "Big", "Seedless", "Red"));
		list.add(new Fruit(3, "Small", "Seeded", "Yellow"));
		list.add(new Fruit(4, "Medium", "Seedless", "Red"));
		list.add(new Fruit(5, "Big", "Seeded", "Green"));

		// locally storing the values from the method
		Map<String, List<Fruit>> minMaxResult = minMax.minAndMaxFruit(list);

		// Creating Test Values for Minimum and Maximum Size ofFruit in the
		// FruitList
		Map<String, List<Fruit>> minMaxTest = new HashMap<>();
		ArrayList<Fruit> smallSize = new ArrayList<>();
		ArrayList<Fruit> bigSize = new ArrayList<>();
		smallSize.add(new Fruit(1, "Small", "Seeded", "Green"));
		smallSize.add(new Fruit(3, "Small", "Seeded", "Yellow"));
		bigSize.add(new Fruit(2, "Big", "Seedless", "Red"));
		bigSize.add(new Fruit(5, "Big", "Seeded", "Green"));
		minMaxTest.put("Small", smallSize);
		minMaxTest.put("Big", bigSize);

		Assert.assertTrue(minMaxResult.equals(minMaxResult));
	}

	// Test case for Grouping By Size
	@Test
	public void groupingBySizeTest() {
		ArrayList<Fruit> list = new ArrayList<>();
		list.add(new Fruit(1, "Small", "Seeded", "Green"));
		list.add(new Fruit(2, "Big", "Seedless", "Red"));
		list.add(new Fruit(3, "Small", "Seeded", "Yellow"));
		list.add(new Fruit(4, "Medium", "Seedless", "Red"));
		list.add(new Fruit(5, "Big", "Seeded", "Green"));

		// locally storing the values from the method
		Map<String, List<Fruit>> bySizeResult = minMax.minAndMaxFruit(list);

		// Creating Test Values for Grouping By Size
		Map<String, List<Fruit>> bySizeTest = new HashMap<>();
		ArrayList<Fruit> smallSize = new ArrayList<>();
		ArrayList<Fruit> bigSize = new ArrayList<>();
		smallSize.add(new Fruit(1, "Small", "Seeded", "Green"));
		smallSize.add(new Fruit(3, "Small", "Seeded", "Yellow"));
		bigSize.add(new Fruit(2, "Big", "Seedless", "Red"));
		bigSize.add(new Fruit(5, "Big", "Seeded", "Green"));
		bySizeTest.put("Small", smallSize);
		bySizeTest.put("Big", bigSize);

		Assert.assertEquals("Reason", bySizeTest, bySizeResult);
	}

}
