package OOP.Inheritance.AllConceptsOfInheritance_InExample;

public class PublishingSystemDemo{
    public static void main(String[] args) {

        // Create instances of each class
        Publication pub = new Publication("Generic Publication","Publisher A",9.99);

        Book book = new Book("Java","Publisher B",29.99,300,"Jhon Doe");

        TextBook textbook = new TextBook("Advanced Java","Publisher C",79.99,500,"Jane smith","computer science",3);


        // Publication Example
        System.out.println("==================Publication Examples===================");
        System.out.println("---About property---");
        System.out.println("Title of the Book: "+pub.title);
        System.out.println("Publisher of the Book: "+pub.publisher);
        System.out.println("Base price of the Book: "+pub.basePrice);

        System.out.println("\n---About methods---");
        pub.displayInfo();   // Basic Info
        pub.displayInfo(true);   // With publisher
        pub.displayInfo(true,true);   // With publisher and price

        System.out.println("\n---About Cost---");
        System.out.printf("Publication price: $%.2f\n",pub.calculatePrice());


        System.out.println("\n===========Book Examples====================");
        System.out.println("---About property---");
        System.out.println("Title of the Book: "+book.title);
        System.out.println("Publisher of the Book: "+book.publisher);
        System.out.println("Base price of the Book"+book.basePrice);

        System.out.println("\n---About methods---");
        book.displayInfo();   // Basic Info
        book.displayInfo(true);   // With publisher
        book.displayInfo(true,true);   // With publisher and price

        System.out.println("\n---About Cost---");
        System.out.printf("Publication price: $%.2f\n",book.calculatePrice());


        System.out.println("\n===========TextBook Examples====================");
        System.out.println("---About property---");
        System.out.println("Title of the Book: "+textbook.title);
        System.out.println("Publisher of the Book: "+textbook.publisher);
        System.out.println("Base price of the Book: "+textbook.basePrice);

        System.out.println("\n---About methods---");
        textbook.displayInfo();   // Basic Info
        textbook.displayInfo(true);   // With publisher
        textbook.displayInfo(true,true);   // With publisher and price

        System.out.println("\n---About Cost---");
        System.out.printf("Publication price: $%.2f",textbook.calculatePrice());
    }
}
