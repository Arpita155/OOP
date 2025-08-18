package OOP.Inheritance.AllConceptsOfInheritance_InExample;

// Base class representing a general publication

class Publication {
    protected String title;
    protected String publisher;
    protected double basePrice;

    //Constructor
    public Publication(String title, String publisher, double basePrice){
        this.title = title;
        this.publisher = publisher;
        this.basePrice = basePrice;
    }

    // Method that will be overridden by child classes
    public double calculatePrice(){
        return basePrice;
    }

    // Method overloading example - different ways to display publication info
    public void displayInfo(){
        System.out.println("Title : "+title);
    }

    public void displayInfo(boolean showPublisher){
        System.out.println("Title : "+title);
        if(showPublisher){
            System.out.println("Publisher: "+publisher);
        }
    }

    public void displayInfo(boolean showPublisher, boolean showPrice){
        System.out.println("Title : "+title);
        if(showPublisher){
            System.out.println("Publisher: "+publisher);
        }
        if(showPrice){
            System.out.println("showPrice: $ "+calculatePrice());
        }
    }
}
