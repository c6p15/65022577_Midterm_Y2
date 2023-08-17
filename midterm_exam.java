public class midterm_exam {
    public static void main(String[] args) {
        Product chair = new Product("Chair", 500.0);
        Electronics tv = new Electronics("Television", 20000.0,"Samsung", "Neo QLED");
        Smartphone iphone = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        Book oppProgramming = new Book("OOP Programing", 250.0, "John Doe", 300);

        chair.getName();
        chair.getPrice();
        chair.setName("ArmChair");
        chair.getName();
        chair.setPrice(420.0);
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

    public String getName(){
        System.out.println("Product Name: "+this.Name);
        return this.Name;
    }

    public String setName(String Newname){
        this.Name = Newname;
        return this.Name;
    }

    public double getPrice(){
        System.out.println("Product Price: "+this.Price);
        return this.Price;
    }

    public double setPrice(double Newprice){
        this.Price = Newprice;
        return this.Price;
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
    
    public String getBrand(){
        System.out.println("Brand: " + this.Brand);
        return this.Brand;
    }

    public String setBrand(String Newbrand){
        this.Brand = Newbrand;
        return this.Brand;
    }
    
    public String getModel(){
        System.out.println("Model: " + this.Model);
        return this.Model;
    }

    public String setModel(String Newmodel){
        this.Model = Newmodel;
        return this.Model;
    }
}

class Smartphone extends Electronics{
    private String OperatingSystem;

    Smartphone(String name, double price, String brand, String model, String ops){
        super(name,price,brand,model);
        this.OperatingSystem = ops;
    }

    public String getOperatingSystem(){
        System.out.println("Operating System: " + this.OperatingSystem);
        return this.OperatingSystem;
    }

    public String setOperatingSystem(String Newops){
        this.OperatingSystem = Newops;
        return this.OperatingSystem;
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

    public String getAuthor(){
        System.out.println("Author: "+ this.Author);
        return this.Author;
    }

    public String setAuthor(String Newauthor){
        this.Author = Newauthor;
        return this.Author;
    }
    
    public int getPages(){
        System.out.println("Pages: " + this.Pages);
        return this.Pages;
    }

    public int setPages(int Newpages){
        this.Pages = Newpages;
        return this.Pages;
    }
}