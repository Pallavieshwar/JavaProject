package com.assesment.solution;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Month;

public class DirFileCounter {
	static String Path = new File("").getAbsolutePath();
	
	/*files Count 5
	Created Month SEPTEMBER
	Created Month SEPTEMBER
	Created Month SEPTEMBER
	Created Month SEPTEMBER
	Created Month SEPTEMBER*/

	
	public static void main(String[] args) throws IOException {
		File dir = new File(Path);
  
		File[] files = dir.listFiles();

		System.out.println("files Count " + files.length);

		SimpleDateFormat sdf = new SimpleDateFormat("MM");

		for (File f : files) {

			String months = sdf.format(f.lastModified());

			int j = Integer.parseInt(months);

			Month month = Month.of(j);

			System.out.println("Created Month " + month);
		}
	}
}
