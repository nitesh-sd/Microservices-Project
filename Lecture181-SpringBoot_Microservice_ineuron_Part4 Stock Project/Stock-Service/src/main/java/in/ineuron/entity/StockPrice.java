package in.ineuron.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "STOCK_PRICE")
public class StockPrice {
	 @Id
	 @Column(name = "STOCK_ID")
	private Integer stockId;
	 @Column(name = "COMPANY_NAME")
	private String companyName;
	
	 @Column(name = "COMPANY_PRICE")
	private Double companyPrice;
	//Tell me in the case of Embedded database , if the Application stops can you get your data back 
	 // the data will be lost so for that we need a backup of it 

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getCompanyPrice() {
		return companyPrice;
	}

	public void setCompanyPrice(Double companyPrice) {
		this.companyPrice = companyPrice;
	}

	@Override
	public String toString() {
		return "StockPrice [stockId=" + stockId + ", companyName=" + companyName + ", companyPrice=" + companyPrice
				+ "]";
	}
	 
	 

}
