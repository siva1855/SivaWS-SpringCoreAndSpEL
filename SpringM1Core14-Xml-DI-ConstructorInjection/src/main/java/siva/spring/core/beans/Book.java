package siva.spring.core.beans;

public class Book {

	private String springAuthor;
	private String javaAuthor;

	public Book(String springAuthor, String javaAuthor) {
		super();
		this.springAuthor = springAuthor;
		this.javaAuthor = javaAuthor;
	}

	public void setSpringAuthor(String springAuthor) {
		this.springAuthor = springAuthor;
	}

	public void setJavaAuthor(String javaAuthor) {
		this.javaAuthor = javaAuthor;
	}

	@Override
	public String toString() {
		return "Book [springAuthor=" + springAuthor + ", javaAuthor=" + javaAuthor + "]";
	}

}
