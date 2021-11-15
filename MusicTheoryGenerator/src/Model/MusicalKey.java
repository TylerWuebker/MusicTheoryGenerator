package Model;
import java.util.Scanner;
import java.util.Random;

public class MusicalKey {
	
public void selectKey() {
		
		Scanner input = new Scanner(System.in);
		int keySel = 0;
		int keyScaleSel = 0;
		int measuresSel = 0;
		int timeSignatureSel = 0;
		
													//SELECT KEY
		System.out.println("Now it is time to select the key you would like to have the melody generated in!");
		System.out.println("There are 12 keys per octave to choose from, Please select one:");
		System.out.println("Key of:");
		System.out.println("		1.) C             8.) C#");
		System.out.println("		2.) D             9.) D#");
		System.out.println("		3.) E            ");
		System.out.println("		4.) F            10.) F#");
		System.out.println("		5.) G            11.) G#");
		System.out.println("		6.) A            12.) A#");
		System.out.println("		7.) B            ");
		keySel = input.nextInt();
													//SELECT KEYSCALE
		System.out.println("Now select whether to generate in Major or Minor");
		System.out.println("1.) Major             2.) Minor");
		keyScaleSel = input.nextInt();
		
													//SELECT NUMBER OF MEASURES
		System.out.println("How many measures would you like to generate?");
		measuresSel = input.nextInt();
		
													//SELECT TIME SIGNATURE
		System.out.println("How many notes in a measure?");
		System.out.println("Ex.");
		System.out.println("   1");
		System.out.println("   2");
		System.out.println("   4");
		System.out.println("   8");
		timeSignatureSel = input.nextInt();
		
		generateKey(keySel, keyScaleSel, measuresSel, timeSignatureSel);
	}
	
	public void generateKey(int key, int keyScale, int numberOfMeasures, int timeSig) {
		
		String[] Progression = { };
		String[] Translation = { };
		
			switch(key) {
				case 1:
					if(keyScale == 1) {
						String[] notesInCMProgression = {"C", "D", "E", "F", "G", "A", "B"};
						String[] CMTranslation = 		{"8", "9", "0", "q", "w", "e", "r"};
						Progression = notesInCMProgression;
						Translation = CMTranslation;
					}
					else {
						String[] notesInCmProgression = {"C", "D", "D#", "F", "G", "G#", "A#"};
						String[] CmTranslation = 		{"8", "9", "(",  "q", "w", "W",  "E"};	
						Progression = notesInCmProgression;
						Translation = CmTranslation;
					}
						break;
				case 2:
					if(keyScale == 1) {
						String[] notesInDMProgression = {"D", "E", "F#", "G", "A", "B", "C#"};
						String[] DMTranslation = 		{"9", "0", "Q",  "w", "e", "r", "*"};
						Progression = notesInDMProgression;
						Translation = DMTranslation;
					}
					else {
						String[] notesInDmProgression = {"D", "E", "F", "G", "A", "A#", "C"};
						String[] DmTranslation = 		{"9", "0", "q", "w", "e", "E",  "8"};
						Progression = notesInDmProgression;
						Translation = DmTranslation;
					}
						break;
				case 3:
					if(keyScale == 1) {
						String[] notesInEMProgression = {"E", "F#", "G#", "A", "B", "C#", "D#"};
						String[] EMTranslation = 		{"0", "Q",  "W",  "e", "r", "*",  "("};
						Progression = notesInEMProgression;
						Translation = EMTranslation;
					}
					else {
						String[] notesInEmProgression = {"E", "F#", "G", "A", "B", "C", "D"};
						String[] EmTranslation = 		{"0", "Q",  "w", "e", "r", "8", "9"};
						Progression = notesInEmProgression;
						Translation = EmTranslation;
					}
						break;
				case 4:
					if(keyScale == 1) {
						String[] notesInFMProgression = {"F", "G", "A", "A#", "C", "D", "E"};
						String[] FMTranslation = 		{"q", "w", "e", "E",  "8", "9", "0"};
						Progression = notesInFMProgression;
						Translation = FMTranslation;
					}
					else {
						String[] notesInFmProgression = {"F", "G", "G#", "A#", "C", "C#", "D#"};
						String[] FmTranslation =        {"q", "w", "W",  "E",  "8", "*",  "("};
						Progression = notesInFmProgression;
						Translation = FmTranslation;
					}
						break;
				case 5:
					if(keyScale == 1) {
						String[] notesInGMProgression = {"G", "A", "B", "C", "D", "E", "F#"};
						String[] GMTranslation = 		{"w", "e", "r", "8", "9", "0", "Q"};
						Progression = notesInGMProgression;
						Translation = GMTranslation;
					}
					else {
						String[] notesInGmProgression = {"G", "A", "A#", "C", "D", "D#", "F"};
						String[] GmTranslation = 		{"w", "e", "E",  "8", "9", "(",  "q"};
						Progression = notesInGmProgression;
						Translation = GmTranslation;
					}
						break;
				case 6:
					if(keyScale == 1) {
						String[] notesInAMProgression = {"A", "B", "C#", "D", "E", "F#", "G#"};
						String[] AMTranslation = 		{"e", "r", "*",  "9", "0", "Q",  "W"};
						Progression = notesInAMProgression;
						Translation = AMTranslation;
					}
					else {
						String[] notesInAmProgression = {"A", "B", "C", "D", "E", "F", "G"};
						String[] AmTranslation = 		{"e", "r", "8", "9", "0", "q", "w"};
						Progression = notesInAmProgression;
						Translation = AmTranslation;
					}
						break;
				case 7:
					if(keyScale == 1) {
						String[] notesInBMProgression = {"B", "C#", "D#", "E", "F#", "G#", "A#"};
						String[] BMTranslation = 		{"r", "*",  "(",  "0", "Q",  "W",  "E"};
						Progression = notesInBMProgression;
						Translation = BMTranslation;
					}
					else {
						String[] notesInBmProgression = {"B", "C#", "D", "E", "F#", "G", "A"};
						String[] BmTranslation = 		{"r", "*",  "9", "0", "Q",  "w", "e"};
						Progression = notesInBmProgression;
						Translation = BmTranslation;
					}
						break;
				case 8:
					if(keyScale == 1) {
						String[] notesInCSharpMProgression = {"C#", "D#", "F", "F#", "G#", "A#", "C"};
						String[] CSharpMTranslation = 		 {"*",  "(",  "q", "Q",  "W",  "E",  "8"};
						Progression = notesInCSharpMProgression;
						Translation = CSharpMTranslation;
					}
					else {
						String[] notesInCSharpmProgression = {"C#", "D#", "E", "F#", "G#", "A", "B"};
						String[] CSharpmTranslation = 		 {"*",  "(",  "0", "Q",  "W",  "e", "r"};
						Progression = notesInCSharpmProgression;
						Translation = CSharpmTranslation;
					}
						break;
				case 9:
					if(keyScale == 1) {
						String[] notesInDSharpMProgression = {"D#", "F", "G", "G#", "A#", "C", "D"};
						String[] DSharpMTranslation = 		 {"(",  "q", "w", "W",  "E",  "8", "9"};
						Progression = notesInDSharpMProgression;
						Translation = DSharpMTranslation;
					}
					else {
						String[] notesInDSharpmProgression = {"D#", "F", "F#", "G#", "A#", "B", "C#"};
						String[] DSharpmTranslation = 		 {"(",  "q", "Q",  "W",  "E",  "r", "*"};
						Progression = notesInDSharpmProgression;
						Translation = DSharpmTranslation;
					}
						break;
				case 10:
					if(keyScale == 1) {
						String[] notesInFSharpMProgression = {"F#", "G#", "A#", "B", "C#", "D#", "F"};
						String[] FSharpMTranslation = 		 {"Q",  "W",  "E",  "r", "*",  "(",  "q"};
						Progression = notesInFSharpMProgression;
						Translation = FSharpMTranslation;
					}
					else {
						String[] notesInFSharpmProgression = {"F#", "G#", "A", "B", "C#", "D", "E"};
						String[] FSharpmTranslation = 		 {"Q",  "W",  "e", "r", "*",  "9", "0"};
						Progression = notesInFSharpmProgression;
						Translation = FSharpmTranslation;
					}
						break;
				case 11:
					if(keyScale == 1) {
						String[] notesInGSharpMProgression = {"G#", "A#", "C", "C#", "D#", "F", "G"};
						String[] GSharpMTranslation = 		 {"W",  "E",  "8", "*",  "(",  "q", "w"};
						Progression = notesInGSharpMProgression;
						Translation = GSharpMTranslation;
					}
					else {
						String[] notesInGSharpmProgression = {"G#", "A#", "B", "C#", "D#", "E", "F#"};
						String[] GSharpmTranslation = 		 {"W",  "E",  "r", "*",  "(",  "0", "Q"};
						Progression = notesInGSharpmProgression;
						Translation = GSharpmTranslation;
					}
						break;
				case 12:
					if(keyScale == 1) {
						String[] notesInASharpMProgression = {"A#", "C", "D", "D#", "F", "G", "A"};
						String[] ASharpMTranslation = 		 {"E",  "8", "9", "(",  "q", "w", "e"};
						Progression = notesInASharpMProgression;
						Translation = ASharpMTranslation;
					}
					else {
						String[] notesInASharpmProgression = {"A#", "C", "C#", "D#", "F", "F#", "G#"};
						String[] ASharpmTranslation = 		 {"E",  "8", "*",  "(",  "q", "Q",  "W"};
						Progression = notesInASharpmProgression;
						Translation = ASharpmTranslation;
					}
						break;
			}
			
			generateProgression(Progression ,Translation, numberOfMeasures, timeSig);
				
		
	}
	
	public void generateProgression(String[] key, String[] Translation, int numberOfMeasures, int timeSig) {
		
		Random rand = new Random();
		String measures = "";
		String translation = "";
		
		for(int i = 0; i < numberOfMeasures; i++) {											//create the amount of measures
			measures += "|-";
			for(int k = 0; k < timeSig; k++) {
				//create the notes in the measure
				int randomNum = rand.nextInt(7);
				//String note = key[rand.nextInt(7)];
				String note = key[randomNum];
				measures += note + "-";
				translation += Translation[randomNum];
			}
			measures += "|";
		}
		System.out.println("Here is the generated sequence in the desired key!");
		System.out.println(measures);
		System.out.println("****************************************************************************************************************************");
		System.out.println("Here is a translation code to copy and paste into the virtual piano. Give it a try!");
		System.out.println("Here is the virtual browser piano:  https://virtualpiano.net/ ");
		System.out.println("Copy and paste the translation on the next line into the piano box by selecting the pencil button on the top right of the piano, press 'Go!' and then press play!\n");
		System.out.println("                   " + translation);
		System.out.println("\n");
		System.out.println("Enter 1 if you would like to regenerate a new progression in the same key:");
		System.out.println("Enter -99 if you want to exit:");
	}

	
}
