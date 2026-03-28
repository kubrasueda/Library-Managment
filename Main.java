/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library_management;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Library lib = new Library();
        Scanner input = new Scanner (System.in);
        
        int i = 0;
        while(i < 1){
            
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitaplari Listele");
            System.out.println("3. Kitap Ara");
            System.out.println("4. Kitap Odunc Ver");
            System.out.println("5. Kitap Iade Et");
            System.out.println("6. Cikis");
            System.out.print("Isleminizi Seciniz:");
            
            int c = input.nextInt();
            input.nextLine();
            
            switch(c){
                case 1:
                    System.out.print("Kitap id gir: ");
                    int id = input.nextInt();
                    input.nextLine();
                    
                    System.out.print("Kitap adi gir: ");
                    String title = input.nextLine();
                    
                    System.out.print("Yazar adi gir: ");
                    String author = input.nextLine();
                    
                    Book newB = new Book(id, title, author);
                    lib.addBooks(newB);
                    break;
                    
                case 2:
                    lib.listBook();
                    break;
                    
                case 3:
                    System.out.print("Id 1, adi 2 : ");                  
                    int s = input.nextInt();
                    input.nextLine();
                    
                    switch(s){
                        case 1:
                            System.out.print("Kitap id gir: ");
                            int ids = input.nextInt();
                            input.nextLine();
                            lib.searchBook(ids);
                            break;
                            
                        case 2:
                            System.out.print("Kitap adi gir: ");
                            String ad = input.nextLine();
                            lib.searchBook(ad);
                            break;
                    }
                    break;
                    
                case 4:
                    System.out.print("Odunc almak istediginiz kitabin id: "); 
                    int idb = input.nextInt();
                    input.nextLine();
                    lib.borrowBook(idb);
                    break;
                    
                case 5:
                    System.out.print("Iade etmek istediginiz kitabin id: "); 
                    int idr = input.nextInt();
                    input.nextLine();
                    lib.returnBook(idr);
                    break;
                    
                case 6:
                    i++;
            }
            
        }

    }
    
}
