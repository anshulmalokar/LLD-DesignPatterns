package SingleResponsiblity;

// public class Single{

// }

class Marker{
    private String name;
    private String colour;
    private int price;
    Marker(){

    }
    public int getPrice(){
        return this.price;
    }
}

class Invoice{
    Marker marker;

    private void printInvoce(){}
    private void calculate(Marker m, int x){}
    private void saveTodDB(){}
}


// Single responsiblity means one reason to change
// In the above class it will be having three reasons to change
// One being the calculate logic
// One being the print invoice
// One being the saveToDB
// So we can create three classes
// One for calculate
// One for print
// One for save

public class Invoice1{
    private Marker marker;
    private int quantity;
    public Invoice1(Marker marker,int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    private int calculte(){
        return this.quantity + this.marker.getPrice();
    }
}

class InvoiceDao{
    Invoice1 invoice1;
    private void addToDb(){};
}

class InvoicePrinter{
    Invoice1 invoice1;
    InvoicePrinter(Invoice1 invoice1){}
    private void printInvoice(){}
}


// Now the code will be more redable 
// And the code will be independent and will reduce the redudency
// As if a particular method changes the that object only will be changing nothing else;

