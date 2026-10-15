package utils;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    private Sheet sheet;

    public ExcelReader(String excelPath, String sheetName) {
        try {
            FileInputStream fis = new FileInputStream(excelPath);
            Workbook workbook = WorkbookFactory.create(fis);
            sheet = workbook.getSheet(sheetName);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCellData(int row, int col) {
        return sheet.getRow(row).getCell(col).getStringCellValue();
    }
}
