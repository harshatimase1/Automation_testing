package collection;

import java.util.HashMap;
import java.util.HashSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HashSetClass {

	public static void main(String[] args) {

		HashSet<String> Companies = new HashSet<String>();

		Companies.add("Wipro");
		Companies.add("Wipro");
		Companies.add("QK");
		Companies.add(null);
		Companies.add("Google");

		Companies.add("TCS");

		Companies.add("Microsoft");

		Companies.add("Oracle");
		Companies.add("PWC");
		Companies.add("Infosys");

		System.out.println(Companies);

	
		System.out.println(Companies.clone());
		System.out.println(Companies.isEmpty());

		
		System.out.println(Companies.size());

		System.out.println(Companies.contains("TCS"));

		Companies.remove("PWC");

		System.out.println(Companies);
		
		Companies.clear();
		System.out.println(Companies);

	}

}
