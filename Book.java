/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management;

class Book {
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public int getId() {return id;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    
    public boolean isBorrowed() {return isBorrowed;}       
    public void setBorrowed(boolean borrowed){
        this.isBorrowed = borrowed;
    }
}
