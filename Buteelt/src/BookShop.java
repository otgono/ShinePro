import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> li = new ArrayList<>();

        boolean a = true;
        while (a) {
            System.out.println("1).Add book information");
            System.out.println("2).Display");
            System.out.println("3).Set Informations");
            System.out.println("8).Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Book obj1 = new Book();
                    System.out.println("Title:");
                    String title = sc.nextLine();
                    obj1.setTitle(title);
                    System.out.println("Author:");
                    String author = sc.nextLine();
                    obj1.setAuthor(author);
                    System.out.println("Price:");
                    double price = sc.nextDouble();
                    obj1.setPrice(price);
                    System.out.println("Quantity:");
                    int qnt = sc.nextInt();
                    obj1.setQnt(qnt);
                    li.add(obj1);
                    break;
                case 2:
                    for (int i = 0; i < li.size(); i++) {
                        System.out.println((i + 1) + ". " + li.get(i));
                    }
                    break;
                case 3:
                    for (int i = 0; i < li.size(); i++) {
                        System.out.println((i + 1) + ". " + li.get(i));
                    }
                   
                    
                    int index = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("1)modify title");
                    System.out.println("2)modify author");
                    System.out.println("3)modify price");
                    System.out.println("4)modify quantity");
                    int mod = sc.nextInt();
                    sc.nextLine();
                    if(mod == 1) {
                    System.out.println("Modify title:");
                    String ti = sc.nextLine();
                    li.get(index - 1).setTitle(ti); 
                    }
                    else if(mod == 2) {
                    	System.out.println("Modify Author:");
                        String aut = sc.nextLine();
                        li.get(index - 1).setAuthor(aut); 
                    }
                    else if(mod == 3) {
                    	System.out.println("Modify Price:");
                        double pri = sc.nextDouble();
                        li.get(index - 1).setPrice(pri); 
                    }
                    else if(mod == 4) {
                    	System.out.println("Modify Quantity:");
                        int qua = sc.nextInt();
                        li.get(index - 1).setQnt(qua); 
                    }
                    break;
                case 8:
                	a = false;
            }
        }

    }

}

class Book {
    private String title;
    private String author;
    private double qnt;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public String toString() {
        return "Book:" +
                "title-" + title +
                ", author-" + author +
                ", price-" + price + ", qnt-" + qnt;
    }
}
//20:37
