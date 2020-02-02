package uk.axone.devintest.filehandling;

public class ExcelReaderDemo {


    public static void main(String[] args) {
        ExcelReader myReader = new ExcelReader("/Users/ramduvvuri/IdeaProjects/Developer In Test - Dec 2019/M1 - File Handling/Test Data.xlsx","TestData");
        int rows = myReader.getRowCount();
        int cols = myReader.getColumnCount();

        System.out.println(rows + "    "+ cols);
        System.out.println(myReader.getCellValue(1,1));

        for(int i=1; i < rows ; i++){
            for(int j=0; j < cols ; j++){

                System.out.print(myReader.getCellValue(i ,j) + "     ");

            }
            System.out.println();

        }

    }
}
