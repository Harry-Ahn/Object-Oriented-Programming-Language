import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class StockYieldCalculator extends Application{
	private TextField tfCompany = new TextField();
	private TextField tfSymbol = new TextField();
	private TextField tfPrice = new TextField();
	private TextField tfRRR = new TextField();
	private TextField tfGR = new TextField();
	private TextField tfInput = new TextField();
	private TextField tfOutput = new TextField();
	private Button btRecommend = new Button("Recommendation");
	private Button btReset = new Button("Reset");
	private Button btShow = new Button("Show");
	private Button btExit = new Button("Exit");
	private String[] companyTitle = {"Walmart", "Apple", "CVS Health", "IBM","JPMorgan Chase","Oracle", "Morgan Stanley","Microsoft", "Pfizer", "Visa", "Waste Management", "Republic Services"};
	private ImageView[] companyLogo = {new ImageView("https://cdn.corporate.walmart.com/dims4/WMT/c2bbbe9/2147483647/strip/true/crop/2389x930+0+0/resize/1446x563!/quality/90/?url=https%3A%2F%2Fcdn.corporate.walmart.com%2Fd6%2Fe7%2F48e91bac4a8ca8f22985b3682370%2Fwalmart-logos-lockupwtag-horiz-blu-rgb.png"),
			new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Apple_logo_grey.svg/758px-Apple_logo_grey.svg.png"),
			new ImageView("https://cvshealth.com/sites/default/files/styles/large/public/cvs-health-logo.png?itok=H5qGpC_k"),
			new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/IBM_logo.svg/1920px-IBM_logo.svg.png"),
			new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/J_P_Morgan_Chase_Logo_2008_1.svg/1920px-J_P_Morgan_Chase_Logo_2008_1.svg.png"),
			new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Oracle_logo.svg/995px-Oracle_logo.svg.png"),
			new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Morgan_Stanley_Logo.svg/1920px-Morgan_Stanley_Logo.svg.png"),
			new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/Microsoft_logo_%282012%29.svg/768px-Microsoft_logo_%282012%29.svg.png"),
			new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Pfizer_%282021%29.svg/1920px-Pfizer_%282021%29.svg.png"),
			new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Visa_2014_logo_detail.svg/1920px-Visa_2014_logo_detail.svg.png"),
			new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Waste_Management_logo.svg/1920px-Waste_Management_logo.svg.png"),
			new ImageView("https://media.republicservices.com/image/square-custom-thumbnail.jpg")
	};
	private ComboBox<String> cbo = new ComboBox<>();
	private BorderPane borderPane = new BorderPane();
	private GridPane gridPane = new GridPane();	
	private TextArea taR = new TextArea();
	private Button btShows = new Button("See Better Recommendation");	
	private Company ev = new Company();
	private ArrayList<Company> CL = ev.getCL();
	private Button btUpdate = new Button("Update");
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		ev.addCompany("Walmart Inc.","NYSE: WMT", StockPrice.wmt(), 16.21, 2.16, 50.46);		
		ev.addCompany("Apple Inc.", "NASDAQ: AAPL", StockPrice.aapl(), 103.40, 0.82, 18.34);		
		ev.addCompany("CVS Health Corporation", "NYSE: CVS", StockPrice.cvs(), 10.85, 2.00, 35.59);		
		ev.addCompany("IBM Corporation", "NYSE: IBM", StockPrice.ibm(), 25.36, 6.52, 110.88);		
		ev.addCompany("JPMorgan Chase & Co.","NYSE: JPM", StockPrice.jpm(), 14.97, 3.60, 28.57);		
		ev.addCompany("Oracle Corporation","NYSE: ORCL", StockPrice.orcl(), 104.66, 0.96, 23.02);		
		ev.addCompany("Morgan Stanley","NYSE: MS", StockPrice.ms(), 13.93, 1.40, 18.31);		
		ev.addCompany("Microsoft Corporation","NASDAQ: MSFT", StockPrice.msft(), 44.99, 2.19, 29.16);		
		ev.addCompany("Pfizer Inc.","NYSE: PFE", StockPrice.pfe(), 14.03, 1.53, 92.17);		
		ev.addCompany("Visa Inc.","NYSE: V", StockPrice.v(), 29.50, 1.26, 25.62);		
		ev.addCompany("Waste Management, Inc.","NYSE: WM", StockPrice.wm(), 21.96, 2.21, 60.38);		
		ev.addCompany("Republic Services, Inc.","NYSE: RSG", StockPrice.rs(), 12.16, 1.68, 52.83);
		
		companyLogo[0].setFitHeight(100);
		companyLogo[0].setFitWidth(257);
		companyLogo[1].setFitHeight(100);
		companyLogo[1].setFitWidth(84);
		companyLogo[2].setFitHeight(32);
		companyLogo[2].setFitWidth(257);
		companyLogo[3].setFitHeight(100);
		companyLogo[3].setFitWidth(250);
		companyLogo[4].setFitHeight(55);
		companyLogo[4].setFitWidth(450);
		companyLogo[5].setFitHeight(50);
		companyLogo[5].setFitWidth(352);
		companyLogo[6].setFitHeight(50);
		companyLogo[6].setFitWidth(330);
		companyLogo[7].setFitHeight(75);
		companyLogo[7].setFitWidth(350);
		companyLogo[8].setFitHeight(100);
		companyLogo[8].setFitWidth(245);
		companyLogo[9].setFitHeight(84);
		companyLogo[9].setFitWidth(257);
		companyLogo[10].setFitHeight(100);
		companyLogo[10].setFitWidth(272);
		companyLogo[11].setFitHeight(100);
		companyLogo[11].setFitWidth(108);
		gridPane.setVgap(5);
		gridPane.setPadding(new Insets(5,5,5,5));
		Label lbl0 = new Label("Enter your required rate of return (%) :");
		lbl0.setFont(Font.font("SansSerif", FontWeight.BOLD, 10));
		gridPane.add(lbl0, 3, 1);
		tfInput.setPrefColumnCount(15);
		tfInput.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(tfInput, 5, 1);
		tfOutput.setPrefColumnCount(15);
		tfOutput.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(tfOutput, 5, 2);
		Label lbl1 = new Label("Company :");
		lbl1.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(lbl1, 3, 3);
		tfCompany.setPrefColumnCount(15);
		tfCompany.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(tfCompany, 5, 3);
		Label lbl2 = new Label("Symbol :");
		lbl2.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(lbl2, 3, 4);
		tfSymbol.setPrefColumnCount(15);
		tfSymbol.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(tfSymbol, 5, 4);
		Label lbl3 = new Label("Current Price :");
		lbl3.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(lbl3, 3, 5);
		tfPrice.setPrefColumnCount(15);
		tfPrice.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(tfPrice, 5, 5);
		Label lbl5 = new Label("Growth Rate :");
		lbl5.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(lbl5, 3, 6);
		tfGR.setPrefColumnCount(15);
		tfGR.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(tfGR, 5, 6);
		Label lbl4 = new Label("Required Rate of Return :");
		lbl4.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		lbl4.setTextFill(Color.BLUE);
		gridPane.add(lbl4, 3, 7);
		tfRRR.setPrefColumnCount(15);
		tfRRR.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(tfRRR, 5, 7);	
		gridPane.add(btRecommend, 3, 2);
		btRecommend.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(btReset, 5, 8);
		btReset.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(btShow, 5, 8);
		btShow.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
		gridPane.add(btExit, 3, 8);
		btExit.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));	
		gridPane.add(btUpdate, 3, 8);
		btUpdate.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));	
		
		gridPane.add(taR, 5, 10);
		taR.setPrefColumnCount(35);
		taR.setPrefRowCount(15);
		taR.setFont(Font.font("SansSerif", FontWeight.BOLD, 11));
		gridPane.add(btShows, 3, 9);
		btShows.setFont(Font.font("SansSerif", FontWeight.BOLD, 11));
		
		
		gridPane.setAlignment(Pos.CENTER);
		tfInput.setAlignment(Pos.BOTTOM_RIGHT);
		tfOutput.setAlignment(Pos.BOTTOM_RIGHT);
		tfCompany.setAlignment(Pos.BOTTOM_RIGHT);
		tfSymbol.setAlignment(Pos.BOTTOM_RIGHT);
		tfPrice.setAlignment(Pos.BOTTOM_RIGHT);
		tfRRR.setAlignment(Pos.BOTTOM_RIGHT);
		tfGR.setAlignment(Pos.BOTTOM_RIGHT);
		tfInput.setEditable(true);
		tfOutput.setEditable(false);
		tfCompany.setEditable(false);
		tfSymbol.setEditable(false);
		tfPrice.setEditable(false);
		tfRRR.setEditable(false);
		tfGR.setEditable(false);
		GridPane.setHalignment(btShow, HPos.RIGHT);
		GridPane.setHalignment(btExit, HPos.LEFT);
		GridPane.setHalignment(btRecommend, HPos.LEFT);
		GridPane.setHalignment(btReset, HPos.LEFT);
		GridPane.setHalignment(btUpdate, HPos.RIGHT);
		
		btExit.setOnAction(e -> exit());

		BorderPane paneForCB = new BorderPane();
		Label lblCB = new Label(" Select a Company :");
		lblCB.setFont(Font.font("SansSerif", FontWeight.BOLD, 13));
		paneForCB.setLeft(lblCB);
		paneForCB.setRight(cbo);
		borderPane.setTop(paneForCB);
		cbo.setValue("Walmart");
		setDisplay(0);
		
		ObservableList<String> items =
				FXCollections.observableArrayList(companyTitle);
		cbo.getItems().addAll(items);
		
		cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));
		
		btShows.setOnAction(e -> {
			try {
				print(items.indexOf(cbo.getValue()));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		});
		
		btShow.setOnAction(e -> {
			try {
				calculateRequiredRateOfReturn(items.indexOf(cbo.getValue()));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});		
		
		tfInput.setOnAction(e -> {
			try {
				recommendViewer(items.indexOf(cbo.getValue()));
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		});
		
		btRecommend.setOnAction(e -> {
			try {
				recommendViewer(items.indexOf(cbo.getValue()));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		
		btUpdate.setOnAction(e -> {	
			try {
				update(items.indexOf(cbo.getValue()));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		
		btReset.setOnAction(e -> reset());

		ScrollPane showPane = new ScrollPane(borderPane);	
		
		Scene scene = new Scene(showPane, 590, 608);
		primaryStage.setTitle("Real-time Required rate of return Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void update(int index) throws IOException{
		CL.get(0).setPrice(StockPrice.wmt());
		CL.get(1).setPrice(StockPrice.aapl());
		CL.get(2).setPrice(StockPrice.cvs());
		CL.get(3).setPrice(StockPrice.ibm());
		CL.get(4).setPrice(StockPrice.jpm());
		CL.get(5).setPrice(StockPrice.orcl());
		CL.get(6).setPrice(StockPrice.ms());
		CL.get(7).setPrice(StockPrice.msft());
		CL.get(8).setPrice(StockPrice.pfe());
		CL.get(9).setPrice(StockPrice.v());
		CL.get(10).setPrice(StockPrice.wm());
		CL.get(11).setPrice(StockPrice.rs());

		if(tfOutput.getText().isEmpty() == false) {
			recommendViewer(index);
	    }	
		
		if(tfPrice.getText().isEmpty() == false) { 
			calculateRequiredRateOfReturn(index);
		}
		
		if(taR.getText().isEmpty() == false) {	
			print(index);
		}
	}
	
	private void calculateRequiredRateOfReturn(int index) throws IOException {
		tfCompany.setText(CL.get(index).getCName());
		tfSymbol.setText(CL.get(index).getName());
		tfPrice.setText(String.format("$%.2f",CL.get(index).getPrice()));
		tfRRR.setText(String.format("%.2f %%",Math.round(CL.get(index).getExpRR()*10000)/100.0));
		tfGR.setText(String.format("%.2f %%",Math.round(CL.get(index).getGR()*10000)/100.0));
	}
	
	private void setDisplay(int index) {
		tfInput.clear();
		tfOutput.clear();
		tfCompany.clear();
		tfSymbol.clear();
		tfPrice.clear();
		tfRRR.clear();
		tfGR.clear();
		taR.clear();
		borderPane.setCenter(gridPane);
		StackPane stPane = new StackPane(companyLogo[index]);
		borderPane.setBottom(stPane);
		companyLogo[index].getImage();
	}
	
	private void reset() {
		tfInput.clear();
		tfOutput.clear();
		tfCompany.clear();
		tfSymbol.clear();
		tfPrice.clear();
		tfRRR.clear();
		tfGR.clear();
		taR.clear();
	}
	
	private void recommendViewer(int index) throws IOException {
		try {
			Double.parseDouble(tfInput.getText());
		}catch(NumberFormatException e) {
			tfOutput.setText("Please input Number");
		}
		
		double userRate = Double.parseDouble(tfInput.getText());
		if(userRate <= Math.round(CL.get(index).getExpRR()*10000)/100.0){
			tfOutput.setText("Recommend");
		}
		else {
			tfOutput.setText("Not Recommend");	
		}
	}
	
	private void print(int index) throws IOException {
		String output = "";
		output+=("Better required rate of return than "+CL.get(index).getCName()+"\n");
		output+=(" Price\t\t RRR\t\t GR\t\t\tCompany\n");
		int count = 0;
		for(int i=0 ; i< CL.size(); i++) {
			if(Math.round(CL.get(i).getExpRR()*10000)/100.0 >= Math.round(CL.get(index).getExpRR()*10000)/100.0) {
				if(CL.get(i).getCName()==CL.get(index).getCName()){
					continue;
				}	
				else {
				count++;
				output+=("$"+CL.get(i).getPrice()+ "\t\t" +Math.round(CL.get(i).getExpRR()*10000)/100.0 
	    				+ "%\t\t" + Math.round(CL.get(i).getGR()*10000)/100.0 + "%\t\t"+ CL.get(i).getCName()+"\n");
				}
			}
			else
				continue;
		}
		output+=("The number of Companies : " + count+"\n");
		if(count==0) {
			output+=("Sorry. There isn't any company better than " + CL.get(index).getCName() + "\n");
		}
		taR.setText(output);
	}
	
	private void exit() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		launch(args);
	}	
}
