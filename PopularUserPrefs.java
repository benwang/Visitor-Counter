import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class PopularUserPrefs {
	
	public PopularUserPrefs() {
		
	}
	
	//Expect one input: chrome or firefox at args[0]
	public static void main(String[] args) {
		String browser = args[0];
		try{
			BufferedReader in = new BufferedReader(new FileReader("browser.txt"));
			FileWriter w = new FileWriter("browsernew.txt");//existing file to write to
			String line = in.readLine();
			
			//Browse through each line; assume the file will have format: <browser>,<count>
			//If browsers match, increase count; otherwise keep searching til end of file
			//I will assume only Firefox and Chrome are possible
			while(line != null){
				String[] lineArr = line.split(",");
				String browserCheck = lineArr[0];
				if (browserCheck.equals(browser)) {
					Integer intmid = Integer.parseInt(lineArr[1]) + 1;
					String browserCount = Integer.toString(intmid);
//					String browserCount = Integer.toString(Integer.parseInt(lineArr[0]) + 1);
					w.write(browser + "," + browserCount + "\n");
					System.out.println("You are user #" + browserCount + " to use " + browser +".");
				} else {
					w.write(browserCheck + "," + lineArr[1] + "\n");
				}
				line = in.readLine();
			}
			w.close();
			in.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
		}
		return;
	}
}
