/*
Book models information common to all books. Any book has
fields
an author
a title
an ISBN or International Standard Book Number that provides a unique number used by publishers and book stores. (String)
constructors and methods
a null constructor 
a constructor using 3 parameters for an author, title, and ISBN number
getters and setters
toString should provide a string of the field data in a format: title, author, ISBN
Within a Book class and its subclasses, these fields might be used directly, but processing by other classes and objects should be done via getters and setters.
*/

public class Book{
    private String author;
    private String title;
    private String isbn;

    public Book(){
	this("John Doe", "A Book", "12345");
    }
    public Book(String by, String name, String num){
	setAuthor(by);
	setTitle(name);
	setisbn(num);

    }
    
    public void setAuthor(String by){
	author = by;
    }
    public void setTitle(String name){
	title = name;
    }
    public void setisbn(String num){
	isbn = num;
    }

    public String getAuthor(){
	return author;
    }
    public String getTitle(){
	return title;
    }
    public String getisbn(){
	return isbn;
    }

    public String toString(){
	return getTitle()+" by "+getAuthor()+"\n ISBN number:"+getisbn();
    }

}
