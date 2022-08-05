
public class EquityValuation {
	private double expectedRateOfReturn;
	private double price;
	private double roe;
	private double dividend;
	private double growthRate;
	private double divPOR;
	
	public EquityValuation(){
		
	}
	public EquityValuation(double newPrice, double newRoe, double newDiv, double newDivPOR){
		price = newPrice;
		roe = newRoe/100;
		dividend = newDiv;
		divPOR = newDivPOR/100;
		growthRate = roe * (1 - divPOR);
		expectedRateOfReturn = (dividend * (1+growthRate)/price ) + growthRate;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
		setExpRR(newPrice);
	}
	public double getPrice() {
		return price;
	}
	
	public void setRoe(double newRoe) {
		roe = newRoe/100;
	}
	public double getRoe() {
		return roe;
	}
	
	public void setDiv(double newDiv) {
		dividend = newDiv;
	}
	
	public double getDiv() {
		return dividend;
	}
	
	public void setDivPOR(double newDivPOR) {
		divPOR = newDivPOR/100;
	}
	public double getDivPOR() {
		return divPOR;
	}
	
	public void setGR(double newRoe, double newDivPOR) {
		growthRate = newRoe/100 * (1 - newDivPOR/100);
	}
	
	public double getGR() {
		return growthRate;
	}
	
	public void setExpRR(double newPrice) {
		expectedRateOfReturn = (getDiv() * (1+getGR())/newPrice ) + getGR();
	}
	
	public double getExpRR() {
		return expectedRateOfReturn;
	}

}

