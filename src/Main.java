import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Main {

	public static void main(String[] args) {
		try {
			/*Document doc = Jsoup.connect("http://agoda.com").get();
			String title = doc.title();
			System.out.println(title);*/			
				
			/*Document stockPttDoc = Jsoup.connect("http://www.settrade.com/C04_01_stock_quote_p1.jsp?txtSymbol=PTT").get();
			String stockPttTitle = stockPttDoc.title();
			System.out.println(stockPttTitle);
			Elements currentPrice = stockPttDoc.select(".txt48");
			System.out.println(currentPrice.text());*/
			
			/*Document stockPttDoc = Jsoup.connect("http://www.settrade.com/C04_02_stock_historical_p1.jsp?txtSymbol=PTT&selectPage=2").get();
			String stockPttTitle = stockPttDoc.title();
			System.out.println(stockPttTitle);
			Elements lastPrices = stockPttDoc.select(".tablecolor1 > div.w45");
			
			for(Element lastPrice : lastPrices){
				System.out.println(lastPrice.text());
			}*/
			
			Document stockPttDoc = Jsoup.connect("http://www.settrade.com/C18_Search_Symbol.jsp?txtBrokerId=IPO&selectPage=1&requestPage=%2FC18_Search_Symbol.jsp%3FtxtBrokerId%3DIPO%26selectPage%3D1&txtAlphabet=M").get();
			String stockPttTitle = stockPttDoc.title();
			System.out.println(stockPttTitle);
			Elements StockMNameList = stockPttDoc.select(".boxcontentwhite  .txt12");
			
			for(Element StockMName : StockMNameList){
				System.out.println(StockMName.text());				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
