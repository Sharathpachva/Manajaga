package manajaga.utils;

import java.io.*;
import java.util.Map;

import org.junit.Assert;

import java.util.HashMap;


public class TankFileConfig {

	public static String getPropertyValue(String propertyName) throws Exception {
		String userDir = System.getProperty("user.dir");
		BufferedReader br = new BufferedReader(
				new FileReader(userDir + "//src//main//resources//configurations//Tankfile130.properties"));
		String line = br.readLine().trim();
		String propName = "", propValue = "";
		int start = 0;
		boolean semiFound = false;
		while (line != null) {
			line = line.trim();
			if (!line.equals("")) {
				if (line.indexOf("=") > 0) {
					if (line.indexOf(";") > 0) {
						semiFound = true;
						line = line.replaceAll(";", "");
					}
					propName = line.substring(start, line.indexOf("="));
					propValue = line.substring(line.indexOf("=") + 1);
				} else {
					if (line.indexOf(";") > 0) {
						semiFound = true;
						line = line.replaceAll(";", "");
					}
					propValue += "\n" + line;
				}
				if (semiFound) {
					if (propertyName.trim().equals(propName.trim())) {
						return propValue.trim();
					}
					propName = "";
					propValue = "";
					semiFound = false;
				}
			}
			line = br.readLine();
		}
		return null;
	}

	public static void writepropertyvalue(String propertyName) throws Exception {
		boolean append = true;
		String userDir = System.getProperty("user.dir");
		BufferedWriter writer = new BufferedWriter(
				new FileWriter(userDir + "//src//main//resources//configurations//CompletedMessagesTankFile.properties", append));
		writer.write(propertyName);
		writer.close();
	}

	public static void CompareTankFiles() throws Exception {
		String userDir = System.getProperty("user.dir");
		BufferedReader reader1 = new BufferedReader(
				new FileReader(userDir + "//src//main//resources//configurations//CompletedMessagesTankFile.properties"));
		BufferedReader reader2 = new BufferedReader(
				new FileReader(userDir + "//src//main//resources//configurations//SentMessagesfromTankFile.properties"));
		String line1 = reader1.readLine();
		String line2 = reader2.readLine();
		boolean areEqual = true;
		int lineNum = 1;
		boolean isFileDiff=false;
//		while (line1!= null || line2 != null) {
//			if (!line1.contentEquals(line2)) {
//			areEqual = false;
//			System.out.println("Two files have different content. They differ at line"+lineNum);
//			System.out.println("Origina Tank file has"+ line1 + "and File2 has"+line2+"at line" + lineNum);
//			line1 = reader1.readLine();
//			line2 = reader2.readLine();
//			lineNum++;
//			}
//			if (areEqual) {
//			System.out.println("Original Tank File and Tankfile from completetd messages are same");
//			}
//			}
//			reader1.close();
//			reader2.close();
			
		while ( line1!=null || line2!=null ) {
			if (!line1.equalsIgnoreCase(line2)) {
				areEqual = false;
				isFileDiff=true;
				break;
			}
			if (!areEqual)
			System.out.println("Two files have different content. They differ at line " + lineNum);
			if (areEqual){
			} else {
				System.out.println("Two files have different content. They differ at line " + lineNum
						+"\n"+"File1 has" + line1 + " and File2 has " + line2 + " at line " + lineNum);
			}
			line1 = reader1.readLine();
			line2 = reader2.readLine();
			lineNum++;
		}
			if (isFileDiff) {
		System.out.println("Two files have differnt content");
		Assert.fail("files are different");
		}
		reader1.close();
		reader2.close();
	}

	public static String updateMsgString(String inputText, String pattern1, String pattern2, String appendText)
			throws IOException {
		String newStr = "";
		BufferedReader br = new BufferedReader(new StringReader(inputText));
		String inp = br.readLine();
		while (inp != null) {
			int i = inp.indexOf(pattern1);
			if (i > -1) {
				int j = inp.indexOf(pattern2, i + pattern1.length());
				if (j > -1) {
					newStr += inp.substring(0, j + pattern2.length()) + appendText;
				} else {
					newStr += inp;
				}
			} else {
				newStr += inp;
			}
			inp = br.readLine();
			if (inp != null)
			newStr += "\n";
		}
		return newStr;
	}
}
