import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CsvMaker{

    Scanner scnr;
    String csv;


    private void readFile(File file) {
        this.csv = "";
        while (scnr.hasNext()) {
                csv += scnr.next() + ",";
         }
    };

    // private void convertToCsv(String[] inputArray){

    //     csv = "";
    //     for(int i = 0; i < inputArray.length; i++) {
    //         csv += "" + inputArray[i] + ",";
    //     }
        
    // }

    public String getCSV(){
        return csv;
    }

    CsvMaker(File file){
        try {
            this.scnr = new Scanner(file);
           // Pattern ptrn = Pattern.compile("\\w+@badgerherald.com|\\w+@wisc.edu");
            
            readFile(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("other exception");
        }
        
    }

}