package MainMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import Methods.GroupingByColor;
import Methods.MinMaxByColor;
import Methods.MinMaxByEachColor;
import POJO.Fruit;
import POJO.Fruit.Color;
import POJO.Fruit.Type;


/*
 Problem - 2: 
 ------------
 
  # I have a list with fruits
  #	Fruit has 2 properties (id, type, size and color)
  # Type and color are pre-defined set of properties	
  
  -- I need group the fruits by color
  -- Find which color has minimum and maximum number of fruits
  -- Find the min and max size of the fruit with-in each color group

 */
public class Task2MainMethod {

	static Logger log = Logger.getLogger(Task1MainMethod.class.getName());

	public static void main(String[] args) throws NumberFormatException, IOException {
		BasicConfigurator.configure();

		List<Fruit> list = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		log.info("How many Objects have to create");
		int size = Integer.parseInt(br.readLine());

		for (int i = 0; i < size; i++) {
			log.info("Enter fruit Id:");
			Integer fruitId = Integer.parseInt(br.readLine());
			log.info("Type fruit Size:");
			log.info("\n1.Small 2.Medium 3.Big");
			String fruitSize = br.readLine();
			log.info("Select fruit Type:");
			log.info("\n1.Seeded 2.Seedless");
			Integer fruitTypeChoice = Integer.parseInt(br.readLine());
			String fruitType = null;
			switch (fruitTypeChoice) {
			case 1:
				fruitType = Type.SEEDED.name();
				break;
			case 2:
				fruitType = Type.SEEDLESS.name();
				break;
			default:
				log.warn("Invalid Choice");
			}
			log.info("Select fruit Color:");
			log.info("\n1.Red 2.Green 3.Yellow");
			Integer fruitColorChoice = Integer.parseInt(br.readLine());
			String fruitColor = null;
			switch (fruitColorChoice) {
			case 1:
				fruitColor = Color.RED.name();
				break;
			case 2:
				fruitColor = Color.GREEN.name();
				break;
			case 3:
				fruitColor = Color.YELLOW.name();
				break;
			default:
				log.warn("Invalid Choice");
			}

			list.add(new Fruit(fruitId, fruitSize, fruitType, fruitColor));
		}

		List<Fruit> result = new GroupingByColor().groupingByColor(list);
		log.info("Grouping by Color");

		for (Fruit fr : result) {
			log.info(fr.getId() + "\t" + fr.getSize() + "\t" + fr.getFruitType() + "\t" + fr.getFruitColor());

		}

		List<Fruit> minMaxByColor = new MinMaxByColor().minAndMaxFruitsByColor(list);
		log.info("\n \nMinimum and Maximum by Color");
		for (Fruit fr : minMaxByColor) {
			log.info(fr.getId() + "\t" + fr.getSize() + "\t" + fr.getFruitType() + "\t" + fr.getFruitColor());

		}

		Map<String, List<Fruit>> filtered = new MinMaxByEachColor().minAndMaxSizeByEachColorGroup(list);

		log.info("\n \nMin and Max Size by Color");
		for (Entry<String, List<Fruit>> f : filtered.entrySet()) {
			log.info(f.getKey());
			for (Fruit fr : f.getValue()) {
				if (fr.getSize().equals("Small") || fr.getSize().equals("Big")) {
					log.info(fr.getId() + "\t" + fr.getSize() + "\t" + fr.getFruitType() + "\t" + fr.getFruitColor());

				}
			}
		}

	}
}
