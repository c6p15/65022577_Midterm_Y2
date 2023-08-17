public class midterm_exam {
    public static void main(String[] args) {
        Product chair = new Product("Chair", 500.0);
        Electronics tv = new Electronics("Television", 20000.0,"Samsung", "Neo QLED");
        Smartphone iphone = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        Book oppProgramming = new Book("OOP Programing", 250.0, "John Doe", 300);

        chair.getName();
        chair.getPrice();
        System.out.println("******************");

        tv.getName();
        tv.getPrice();
        tv.getBrand();
        tv.getModel();
        System.out.println("******************");

        iphone.getName();
        iphone.getPrice();
        iphone.getBrand();
        iphone.getModel();
        iphone.getOperatingSystem();
        System.out.println("******************");

        oppProgramming.getName();
        oppProgramming.getPrice();
        oppProgramming.getAuthor();
        oppProgramming.getPages();
    }
}

class Product{
    private String Name;
    private double Price;

    Product(String name, double price){
        this.Name = name;
        this.Price = price;
    }

    public void getName(){
        System.out.println("Product Name: "+this.Name);
    }

    public void setName(String Newname){
        this.Name = Newname;
    }

    public void getPrice(){
        System.out.println("Product Price: "+this.Price);
    }

    public void setPrice(double Newprice){
        this.Price = Newprice;
    }
}

class Electronics extends Product{
    private String Brand;
    private String Model;

    Electronics(String name , double price, String brand,String model){
        super(name,price);
        this.Brand = brand;
        this.Model = model;
    }
    
    public void getBrand(){
        System.out.println("Brand: " + this.Brand);
    }

    public void setBrand(String Newbrand){
        this.Brand = Newbrand;
    }
    
    public void getModel(){
        System.out.println("Model: " + this.Model);
    }

    public void setModel(String Newmodel){
        this.Model = Newmodel;
    }
}

class Smartphone extends Electronics{
    private String OperatingSystem;

    Smartphone(String name, double price, String brand, String model, String ops){
        super(name,price,brand,model);
        this.OperatingSystem = ops;
    }

    public void getOperatingSystem(){
        System.out.println("Operating System: " + this.OperatingSystem);
    }

    public void setOperatingSystem(String Newops){
        this.OperatingSystem = Newops;
    }
}

class Book extends Product{
    private String Author;
    private int Pages;

    Book(String name , double price, String author,int pages){
        super(name,price);
        this.Author = author;
        this.Pages = pages;
    }

    public void getAuthor(){
        System.out.println("Author: "+ this.Author);
    }

    public void setAuthor(String Newauthor){
        this.Author = Newauthor;
    }
    
    public void getPages(){
        System.out.println("Pages: " + this.Pages);
    }

    public void setPages(int Newpages){
        this.Pages = Newpages;
    }
}