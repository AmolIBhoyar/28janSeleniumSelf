package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example11_getAlldataInAcolumn
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\amol\\abcd.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		int lastrowindex = sh.getLastRowNum();
		for(int i=0;i<=lastrowindex;i++)
		{
			Cell cellinfo = sh.getRow(i).getCell(0);
			CellType s1 = cellinfo.getCellType();
			if(s1==CellType.STRING)
			{
			String value = cellinfo.getStringCellValue();
			System.out.println(value);
			}
			else if (s1==CellType.NUMERIC)
			{
				double value = cellinfo.getNumericCellValue();
				System.out.println(value);
			}
			else if (s1==CellType.BOOLEAN)
			{
				boolean value = cellinfo.getBooleanCellValue();
				System.out.println(value);
			}
			
			
			
		}
		
		
	}

}
