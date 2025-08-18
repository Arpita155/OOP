package OOP.Inheritance.AllConceptsOfInheritance_InExample;

// First level of Inheritance : Book extends Publication

class Book extends Publication{
    protected int pageCount;
    protected String author;

    // constructor using super to call parent constructor
    public Book (String title, String publisher, double basePrice, int pageCount, String author){
        super(title,publisher,basePrice);  // Using super to call parent constructor
        this.pageCount = pageCount;
        this.author = author;
    }

    // overriding the calculatePrice method
    @Override
    public double calculatePrice(){
        // Add $0.01 per page to base price
        return super.calculatePrice() +(0.01%.2f * pageCount);     // Using super to call parent method
    }

    // Additional overloaded method specific to Book
    public void displayInfo(boolean showPublisher, boolean showPrice, boolean showAuthor){
        super.displayInfo(showPublisher,showPrice);    // using super to call parent method
        if (showAuthor){
            System.out.println("Author: "+author);
        }
    }
}
