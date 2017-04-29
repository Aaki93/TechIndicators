package stocks;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockHistoryReaderUtil {

  private static final String STOCK_PATH =
      "C:\\...PathTo...\\A.csv"; // windows path
      // //some//mac//or//unix//path//like//this
      // used pwd to see path to working directory and 
      // use double slash to escape slash";
  
  public static List<StockHistory> readStock(String path)
      throws FileNotFoundException {
    Scanner scanner = new Scanner(new File(path));
    scanner.nextLine(); // skip header
    List<StockHistory> stocks = new ArrayList<>();
    while (scanner.hasNextLine()) {
      stocks.add(new StockHistory(scanner.nextLine()));
    }
    scanner.close();
    return stocks;
  }
  
  public static void main(String[] args)
      throws FileNotFoundException {
    List<StockHistory> stocks = readStock(STOCK_PATH);
    System.out.println(stocks.size());
  }
}
