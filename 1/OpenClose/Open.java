package OpenClose;
import SingleResponsiblity.Invoice1;

class InvoceDao{
    private Invoice1 invoice1;
    InvoceDao(Invoice1 invoice1){
        this.invoice1 = invoice1;
    }
    private void saveToDb(){};
    private void saveToFile(){}
}
// Now we have a addded another method named saveToFile in the InvoiceDao class
// This will break the single responsiblity principle 
// Also the class InvoiceDao was tested earlier 
// Now we  should not change already tested and presented code

// Solution for Open use and close modification is
interface InvoiceDaoI{
    public void saveToDb();
}

class InvoiceDaoImpl implements InvoiceDaoI{
    @Override
    public void saveToDb() {}
}

class InvoiceDaoImplPostgress implements InvoiceDaoI{
    @Override public void saveToDb(){}
}

// This way we are not breaking the open and close principle

// If some class is already in the production then don't modify that class
// Create a new class and extend the above class and add your code
// Don't add modifications in the same already tested class

// In the single responsiblity pattern we had the Invoice Dao Right