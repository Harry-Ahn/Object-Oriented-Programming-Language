import java.util.ArrayList;

public class Company extends EquityValuation{
	private String cname;
	private String name;
	private ArrayList<Company> CL = new ArrayList<Company>();

	
	public Company() {
		super();
	}
	
	public Company(String cname ,String name, double newPrice, double newRoe, double newDiv, double newDivPOR) {
		super(newPrice, newRoe, newDiv, newDivPOR);
		this.cname = cname;
		this.name = name;		
		CL = new ArrayList<Company>();
	}
	public String getCName() {
		return cname;
	}
	
	public void setCName(String cname) {
		this.cname = cname;
	}	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public void addCompany(String cname ,String name, double newPrice, double newRoe, double newDiv, double newDivPOR) {
		Company addCom = new Company(cname, name, newPrice , newRoe, newDiv, newDivPOR);
		CL.add(addCom);
	}
	
	public ArrayList<Company> getCL(){
		return CL;
	}
}
