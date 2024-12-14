package jtbc_pj;

public interface BookInt {
	
	public void bookInsert(BookDto dto);
	public void bookUpdate(BookDto dto);
	public void bookDelete(int bookNo);
	public void bookSelect(int bookNo);

}