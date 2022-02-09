package Assignment1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WordCount {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Map<String, Integer>m1 = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell\\eclipse-workspace\\CoreJava\\src\\Assignment1\\Demodata.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
            	if(m1.containsKey(line))
            	{
            		m1.put(line, m1.get(line)+1);
                }
            	else {
            		m1.put(line, 1);
            	}
            }
        }
        List<Map.Entry <String, Integer>> rm = new ArrayList<>(m1.entrySet());
        Collections.sort(rm, (o1, o2) -> o2.getValue() - o1.getValue());
        for (Entry<String, Integer> pn: rm) {
        	System.out.println("Name " + pn.getKey() + " " + pn.getValue());
        }
        }
   }