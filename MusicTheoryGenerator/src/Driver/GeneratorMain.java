package Driver;
import Model.MusicalKey;
/*This program is meant to generate sequences of randomly generated notes in a selected key.
 * User will be able to:
 * 		-Select a key they wish to have a randomly generated melody created in
 * 		-Select how many measures to be generated
 * 		-Select the time signature/ number of notes in a measure
 * 		-Whether the selected key is Major, Minor, or includes 7th chords
 * 		Optional
 * 		-Generated sequence can be translated into a readable format by virtual piano at https://virtualpiano.net/
 * 		which can be then copied and pasted into the text box, which then will be played by the virtual piano
*/

public class GeneratorMain {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Music Generator!");
		System.out.println("");
		MusicalKey MK = new MusicalKey();
		
		MK.selectKey();
	}
}
