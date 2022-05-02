package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class WordBoard {
	
	public static int r[] = new int[25];
	public static int g[] = new int[25];
	public static int b[] = new int[25];
	public static String[] words = new String[25];
	
	/* Get word from txt file*/
	public static void assignWordcard() {
			ArrayList<String> wordsList = new ArrayList<String>();
			try {
				for(String word: Files.readAllLines(Paths.get("Database/WordsList.txt"))) {
					wordsList.add(word);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			ArrayList<String> allWords = wordsList;
			Collections.shuffle(allWords);
			for (int i = 0; i < 25; i++) {
				words[i] = allWords.get(i);
			}
	}
	
	public static void assignKeymap() throws IOException {
			/* Ramdon select keymap*/
			ArrayList<String> data = new ArrayList<String>();
			Random random = new Random();
			int RandomKeymap = random.nextInt(0 + 4) + 0;
		    String line;
		     try (Stream<String> lines = Files.lines(Paths.get("./Database/Keymap.txt"))) {
		        line = lines.skip(RandomKeymap).findFirst().get();
		     }
		     data.add(line);
		
		    /* set keymap to wordboard*/
		    String elem = data.get(0);
			String[] myColor = new String[25];
			myColor = elem.split(" ");
			File file2 = new File("./Database/AssignKeymap.txt");		
			    Scanner scanner = new Scanner(file2);
		
			    while(scanner.hasNext()){
					for (int i = 0; i < 25; i++) {
						String[] tokens = scanner.nextLine().split(",");
				        String firstIndex = tokens[tokens.length - 3];
				        int rNumber = Integer.parseInt(firstIndex);
				        String secondIndex = tokens[tokens.length - 2];
				        int gNumber = Integer.parseInt(secondIndex);
				        String LastIndex = tokens[tokens.length -1];
				        int bNumber = Integer.parseInt(LastIndex);
				        r[i] = rNumber;
				        g[i] = gNumber;
				        b[i] = bNumber;
					}
				}
			File file1 = new File("./Database/AssignKeymap.txt");
			FileWriter fw = new FileWriter(file1);
			PrintWriter pw = new PrintWriter(fw);
			for(int i = 0; i+1 < myColor.length + 1; i++) {
				pw.println(myColor[i]);
			}
			pw.close();
}
	}