package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String parametrization(int row, String SheetName, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("D:\\selenioum\\Practice Excell Sheet.xlsx");
		String value=WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}

}
