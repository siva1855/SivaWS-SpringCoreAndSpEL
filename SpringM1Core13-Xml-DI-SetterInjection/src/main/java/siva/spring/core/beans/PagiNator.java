package siva.spring.core.beans;

public class PagiNator {
	
	private int totalRecords;
	private Page page;
	
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	public void setPage(Page page) {
		this.page = page;
	}
	
	public void showPagiNator() {
		System.out.println("PagiNator Class");
	}

}
