import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Double;

public class StockPrice{
	public static double wmt() throws IOException{
		URL url = new URL("https://www.google.com/finance/quote/WMT:NYSE");
		URLConnection urlCon = url.openConnection();
		urlCon.addRequestProperty("User-Agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "Not Found";
		String line = buff.readLine();
		while(line != null) {
			if(line.contains("fxKbKc\">$")) {
				int target = line.indexOf("fxKbKc\">$");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '$') {
					start--;
				}
				price = line.substring(start +1, deci +3);	
			}
			line = buff.readLine();
		}
		double NewPrice = Double.parseDouble(price);
		return NewPrice;
	}
	
	public static double aapl() throws IOException{
		URL url = new URL("https://www.google.com/finance/quote/AAPL:NASDAQ");
		URLConnection urlCon = url.openConnection();
		urlCon.addRequestProperty("User-Agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "Not Found";
		String line = buff.readLine();
		while(line != null) {
			if(line.contains("fxKbKc\">$")) {
				int target = line.indexOf("fxKbKc\">$");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '$') {
					start--;
				}
				price = line.substring(start +1, deci +3);	
			}
			line = buff.readLine();
		}
		double NewPrice = Double.parseDouble(price);
		return NewPrice;	
	}
	
	public static double cvs() throws IOException{
		URL url = new URL("https://www.google.com/finance/quote/CVS:NYSE");
		URLConnection urlCon = url.openConnection();
		urlCon.addRequestProperty("User-Agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "Not Found";
		String line = buff.readLine();
		while(line != null) {
			if(line.contains("fxKbKc\">$")) {
				int target = line.indexOf("fxKbKc\">$");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '$') {
					start--;
				}
				price = line.substring(start +1, deci +3);	
			}
			line = buff.readLine();
		}
		double NewPrice = Double.parseDouble(price);
		return NewPrice;
	}
	
	public static double ibm() throws IOException{
		URL url = new URL("https://www.google.com/finance/quote/IBM:NYSE");
		URLConnection urlCon = url.openConnection();
		urlCon.addRequestProperty("User-Agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "Not Found";
		String line = buff.readLine();
		while(line != null) {
			if(line.contains("fxKbKc\">$")) {
				int target = line.indexOf("fxKbKc\">$");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '$') {
					start--;
				}
				price = line.substring(start +1, deci +3);	
			}
			line = buff.readLine();
		}
		double NewPrice = Double.parseDouble(price);
		return NewPrice;
	}
	
	public static double jpm() throws IOException{
		URL url = new URL("https://www.google.com/finance/quote/JPM:NYSE");
		URLConnection urlCon = url.openConnection();
		urlCon.addRequestProperty("User-Agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "Not Found";
		String line = buff.readLine();
		while(line != null) {
			if(line.contains("fxKbKc\">$")) {
				int target = line.indexOf("fxKbKc\">$");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '$') {
					start--;
				}
				price = line.substring(start +1, deci +3);	
			}
			line = buff.readLine();
		}
		double NewPrice = Double.parseDouble(price);
		return NewPrice;
	}
	
	public static double orcl() throws IOException{
		URL url = new URL("https://www.google.com/finance/quote/ORCL:NYSE");
		URLConnection urlCon = url.openConnection();
		urlCon.addRequestProperty("User-Agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "Not Found";
		String line = buff.readLine();
		while(line != null) {
			if(line.contains("fxKbKc\">$")) {
				int target = line.indexOf("fxKbKc\">$");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '$') {
					start--;
				}
				price = line.substring(start +1, deci +3);	
			}
			line = buff.readLine();
		}
		double NewPrice = Double.parseDouble(price);
		return NewPrice;
	}
	
	public static double ms() throws IOException{
		URL url = new URL("https://www.google.com/finance/quote/MS:NYSE");
		URLConnection urlCon = url.openConnection();
		urlCon.addRequestProperty("User-Agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "Not Found";
		String line = buff.readLine();
		while(line != null) {
			if(line.contains("fxKbKc\">$")) {
				int target = line.indexOf("fxKbKc\">$");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '$') {
					start--;
				}
				price = line.substring(start +1, deci +3);	
			}
			line = buff.readLine();
		}
		double NewPrice = Double.parseDouble(price);
		return NewPrice;
	}
	
	public static double msft() throws IOException{
		URL url = new URL("https://www.google.com/finance/quote/MSFT:NASDAQ");
		URLConnection urlCon = url.openConnection();
		urlCon.addRequestProperty("User-Agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "Not Found";
		String line = buff.readLine();
		while(line != null) {
			if(line.contains("fxKbKc\">$")) {
				int target = line.indexOf("fxKbKc\">$");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '$') {
					start--;
				}
				price = line.substring(start +1, deci +3);	
			}
			line = buff.readLine();
		}
		double NewPrice = Double.parseDouble(price);
		return NewPrice;
	}
	
	public static double pfe() throws IOException{
		URL url = new URL("https://www.google.com/finance/quote/PFE:NYSE");
		URLConnection urlCon = url.openConnection();
		urlCon.addRequestProperty("User-Agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "Not Found";
		String line = buff.readLine();
		while(line != null) {
			if(line.contains("fxKbKc\">$")) {
				int target = line.indexOf("fxKbKc\">$");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '$') {
					start--;
				}
				price = line.substring(start +1, deci +3);	
			}
			line = buff.readLine();
		}
		double NewPrice = Double.parseDouble(price);
		return NewPrice;
	}
	
	public static double v() throws IOException{
		URL url = new URL("https://www.google.com/finance/quote/V:NYSE");
		URLConnection urlCon = url.openConnection();
		urlCon.addRequestProperty("User-Agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "Not Found";
		String line = buff.readLine();
		while(line != null) {
			if(line.contains("fxKbKc\">$")) {
				int target = line.indexOf("fxKbKc\">$");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '$') {
					start--;
				}
				price = line.substring(start +1, deci +3);	
			}
			line = buff.readLine();
		}
		double NewPrice = Double.parseDouble(price);
		return NewPrice;
	}
	
	public static double wm() throws IOException{
		URL url = new URL("https://www.google.com/finance/quote/WM:NYSE");
		URLConnection urlCon = url.openConnection();
		urlCon.addRequestProperty("User-Agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "Not Found";
		String line = buff.readLine();
		while(line != null) {
			if(line.contains("fxKbKc\">$")) {
				int target = line.indexOf("fxKbKc\">$");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '$') {
					start--;
				}
				price = line.substring(start +1, deci +3);	
			}
			line = buff.readLine();
		}
		double NewPrice = Double.parseDouble(price);
		return NewPrice;
	}
	
	public static double rs() throws IOException{
		URL url = new URL("https://www.google.com/finance/quote/RSG:NYSE");
		URLConnection urlCon = url.openConnection();
		urlCon.addRequestProperty("User-Agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
		BufferedReader buff = new BufferedReader(inStream);
		String price = "Not Found";
		String line = buff.readLine();
		while(line != null) {
			if(line.contains("fxKbKc\">$")) {
				int target = line.indexOf("fxKbKc\">$");
				int deci = line.indexOf(".",target);
				int start = deci;
				while(line.charAt(start) != '$') {
					start--;
				}
				price = line.substring(start +1, deci +3);	
			}
			line = buff.readLine();
		}
		double NewPrice = Double.parseDouble(price);
		return NewPrice;
	}	
}