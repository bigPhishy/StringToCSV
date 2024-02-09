import java.io.File;

public class CSVRunner {
    public static void main (String[] args){
        File file = new File("BH_EmailList.txt");
        CsvMaker csvMaker = new CsvMaker(file);
        System.out.println(csvMaker.getCSV());

    }
}
