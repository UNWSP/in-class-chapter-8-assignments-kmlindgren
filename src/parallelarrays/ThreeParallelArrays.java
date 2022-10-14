package parallelarrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class ThreeParallelArrays {

	public static void main(String[] args) {
		String states[] = {"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
		String statesAbbreviation[] = {"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
		String capitals[] = {"Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover","Tallahassee","Atlanta","Honolulu","Boise","Springfield","Indianapolis","Des Moines","Topeka","Frankfort","Baton Rouge","Augusta","Annapolis","Boston","Lansing","St. Paul","Jackson","Jefferson City","Helena","Lincoln","Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus","Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin","Salt Lake City","Montpelier","Richmond","Olympia","Charleston","Madison","Cheyenne"};
		String state = null;
		String abbrev = null;
		String capital = null;
		String zip;
		
		Scanner inputDevice = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter the name of a state: ");
			state = inputDevice.next();
			
			int index = -1;
			
			for(int x = 0; x < 50; ++x) {
				if(state.equals(states[x])) {
					abbrev = statesAbbreviation[x];
					capital = capitals[x];
					index = x;
					break;
					
				}
			}
			if(index != -1) {
				System.out.println("State abbreviation: " + abbrev + "\nState capital: " + capital);
				System.out.print("Enter the zip code for this area: ");
				zip = inputDevice.next();
				String capzip = capital + " - " + zip;
				Array.set(capitals, index, capzip);
			}
			else {
				System.out.print("Invalid input.");
				break;
			}
			
		}			
	}
}
