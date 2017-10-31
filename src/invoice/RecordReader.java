package invoice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import service.Record;

public class RecordReader {

	private BufferedReader reader;

	public RecordReader() {

	}

	public RecordReader(Reader reader) {

	}

	public Record read() {
		try {
		String file = "c:¥¥tmp¥¥test.txt";
		reader = new BufferedReader(new FileReader(file));

		String str = reader.readLine();
		while (str != null) {
			Record record = new Record(str);
			str = reader.readLine();
		}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*public void close() {
		try {
			reader.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}*/

}
