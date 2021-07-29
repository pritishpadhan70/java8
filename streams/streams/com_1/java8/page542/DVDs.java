package streams.com_1.java8.page542;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DVDs {
	public static void main(String[] args) {
		List<DVDInfo> dvds = loadDVDs("E:\\java8\\java8\\streams\\streams\\com_1\\java8\\page542\\dvdinfo.txt");
		dvds.forEach(System.out::println);
	
	}
	
	public static List<DVDInfo> loadDVDs(String filenames){
		List<DVDInfo> dvds = new ArrayList<DVDInfo>();
		try(Stream<String> stream = Files.lines(Paths.get(filenames))) {
			stream.forEach(line->{
				String[]dvdItems = line.split("/");
				DVDInfo dvd = new DVDInfo(dvdItems[0],dvdItems[1],dvdItems[2]);
				dvds.add(dvd);
			});
		} catch (Exception e) {
			System.out.println("Error reading DVDs");
			e.printStackTrace();
		}
		
		return dvds;
	}
}
