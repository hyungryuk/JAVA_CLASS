package workshop.book.entity;

public class Magazine extends Publication{
	private String publishingPeriod;

	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Magazine(String title, String publishingData, int page, int price,String publishingPeriod) {
		super(title,publishingData,page,price);
		this.publishingPeriod = publishingPeriod;
	}

	public String getPublishingPeriod() {
		return publishingPeriod;
	}

	public void setPublishingPeriod(String publishingPeriod) {
		this.publishingPeriod = publishingPeriod;
	}
		
}