package invoice;

import service.Record;
import service.Service;
import service.ServiceCollection;

public class Main {

	private static final int INITIAL_BASIC_CHARGE = 1000;

	private static final int INITIAL_CALL_UNIT_PRICE = 20;

	private static final char RC_OWNER_INFO = '1';

	private static final char RC_SERVICE_INFO = '2';

	private static final char RC_CALL_LOG = '5';

	private static final char RC_SEPARATOR = '9';

	public static void main(String[] args) {
		ServiceCollection service = new ServiceCollection();
		RecordReader reader = new RecordReader();
		InvoiceWriter writer = new InvoiceWriter();
		Invoice invoice = new Invoice();
		Record record = reader.read();
		char recordCode = record.getRecordCode(); //何が取れる？
		
	}

	private static void service(Service service, Record record) {

	}

	private static void call(Invoice invoice, Service service, Record record) {

	}

	private static void separate(Invoice invoice, Service service, InvoiceWriter writer) {

	}

}
