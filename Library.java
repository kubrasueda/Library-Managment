/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management;

import java.util.ArrayList;

class Library {
    private ArrayList<Book> books = new ArrayList<>();
    
    public void addBooks(Book b){
        for(Book book : books){
            if(book.getId() == b.getId()){
                System.out.println("Bu id zaten kullaniliyor!");
                return;
            }
        }
        books.add(b);
        System.out.println("Kitap eklendi: " + b.getId() + " - " + b.getTitle() + " - " + b.getAuthor());
    }
    
    public void listBook(){
        if(books.isEmpty()){
            System.out.println("Hic kitap yok.");
            return;
        }
        
        for(Book b : books)
            System.out.println(b.getId() + " - " + b.getTitle() + " - " + b.getAuthor());    
    }
    
    public void searchBook(int id){
        boolean find = false;
        for(Book b : books){
            if(b.getId() == id){
                System.out.println("Bulunan Kitap: " + b.getId() + " - " + b.getTitle() + " - " + b.getAuthor());
                find = true;
            }
        }
        if(!find)
            System.out.println("Aradiginiz Kitap Bulunamadi!");
    }
    
    public void searchBook(String title){
        boolean find = false;
        for(Book b : books){
            if(b.getTitle().equalsIgnoreCase(title)){
                System.out.println("Bulunan Kitap: " + b.getId() + " - " + b.getTitle() + " - " + b.getAuthor());
                find = true;
            }
        }
        if(!find)
            System.out.println("Aradiginiz Kitap Bulunamadi!");
    }
    
    public void borrowBook(int id){
        for(Book b : books){
            if(b.getId() == id){
                if(!b.isBorrowed()){
                    System.out.println("Kitap odunc alindi.");
                    b.setBorrowed(true);
                }
                else
                    System.out.println("Bu kitap zaten odunc alindi.");
                return;
            }
        }
        System.out.println("Kitap bulunamadi!");
    }
    
    public void returnBook(int id){
        for(Book b : books){
            if(b.getId() == id){
                if(b.isBorrowed()){
                    System.out.println("Kitap iade edildi.");
                    b.setBorrowed(true);
                }
                else
                    System.out.println("Bu kitap odunc alinmamis.");
                return;
            }
        }
        System.out.println("Kitap bulunamadi!");
    }
}
