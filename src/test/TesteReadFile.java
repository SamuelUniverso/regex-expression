package test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.Test;

import br.univates.SimpleReader;

public class TesteReadFile {
	
	private List<String> matching = new ArrayList<>();

	@Test
	public void testSensoPopulacional()
	{
		Pattern p = Pattern.compile("\s");

		String path = "files/POP2021.csv";
		List<String> content = loadVectorSenso(path);
	}
	
	public List<String> loadVectorSenso(String path)
	{
		List<String> vector = new ArrayList<>();

		SimpleReader reader = new SimpleReader(path);
		String line = reader.readLine();
		while(line != null)
		{
			vector.add(line.toString());
			line = reader.readLine();
		}
		reader.close();
		
		return vector;
	}
}
