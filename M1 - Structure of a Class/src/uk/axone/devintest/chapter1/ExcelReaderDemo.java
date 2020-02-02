package uk.axone.devintest.chapter1;

public class ExcelReaderDemo {

    public static void main(String[] args) {

        ExcelReader myReader = new ExcelReader("/Users/ramduvvuri/IdeaProjects/Developer In Test - Dec 2019/M1 - Structure of a Class/Test Data.xlsx", "TestData");
        int rows = myReader.getRowCount();
        int cols = myReader.getColumnCount();

        System.out.println("No. of rows - "+rows);
        System.out.println("No. of cols - "+cols);

        System.out.println(myReader.getCellValue(1, 5));

        for (int i=1; i < rows; i++) {
            for(int j=0; j< cols; j++) {
                System.out.print(myReader.getCellValue(i, j));
            }
            System.out.println();
        }


    }

}
