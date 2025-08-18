package OOP.Inheritance.AllConceptsOfInheritance_InExample;

// Second level of Inheritance : Textbook extends Book

class TextBook extends Book {
    private String subject;
    private int edition;

    public TextBook(String title, String publisher, double basePrice, int pageCount, String author, String subject, int edition){
        super(title, publisher, basePrice, pageCount, author);        // using super to call parent constructor
        this.subject = subject;
        this.edition = edition;
    }

    // Further overriding the calculatePrice method
    @Override
    public double calculatePrice(){
        // Add edition premium to the book's price calculation
        return super.calculatePrice()+(edition*10);    // using super to call parent's method
    }

    // Additional overloaded method specific to TextBook
    public void displayInfo(boolean showPublisher, boolean showPrice, boolean showAuthor, boolean showSubject){
        super.displayInfo(showPublisher, showPrice, showAuthor);       // Using super to call parent's method
        if(showSubject){
            System.out.println("Subject: "+subject);
            System.out.println("Edition: "+edition);
        }
    }
}
