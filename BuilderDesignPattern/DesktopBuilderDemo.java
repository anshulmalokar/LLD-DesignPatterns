package BuilderDesignPattern;

class Desktop {
    private String motherBoard;
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;

    // Getters
    public String getMotherBoard() {
        return motherBoard;
    }

    public String getProcessor() {
        return processor;
    }

    public String getMemory() {
        return memory;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    // Setters
    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    // Display method
    public void display() {
        System.out.println("Desktop Configuration:");
        System.out.println("Motherboard: " + motherBoard);
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
    }
}

abstract class DesktopBuilder{
    protected Desktop desktop = new Desktop();
    public abstract void buildMotherBoard();
    public abstract void buildProcessor();
    public abstract void buildMemory();
    public abstract void buildStorage();
    public abstract void buildGraphicsCard();
    public abstract Desktop getDesktop();
}

class DellDesktopBuilder extends DesktopBuilder{

    @Override
    public void buildMotherBoard() {
        // TODO Auto-generated method stub
        desktop.setMotherBoard("Dell MotherBoard");
    }

    @Override
    public void buildProcessor() {
        // TODO Auto-generated method stub
        desktop.setProcessor("Dell Processor");
    }

    @Override
    public void buildMemory() {
        // TODO Auto-generated method stub
        desktop.setMemory("Dell Memory");
    }

    @Override
    public void buildStorage() {
        // TODO Auto-generated method stub
        desktop.setStorage("Dell Storage");
    }

    @Override
    public void buildGraphicsCard() {
        // TODO Auto-generated method stub
        desktop.setGraphicsCard("Dell Graphics Card");
    }

    @Override
    public Desktop getDesktop() {
        // TODO Auto-generated method stub
        return super.desktop;
    }

}

class HPDesktopBuilder extends DesktopBuilder{

    @Override
    public void buildMotherBoard() {
        super.desktop.setMotherBoard("HP MotherBoard");
    }

    @Override
    public void buildProcessor() {
        super.desktop.setProcessor("HP Processor");
    }

    @Override
    public void buildMemory() {
        super.desktop.setMemory("HP Memory");
    }

    @Override
    public void buildStorage() {
        super.desktop.setStorage("HP Storage");
    }

    @Override
    public void buildGraphicsCard() {
        super.desktop.setGraphicsCard("HP Graphics Card");
    }

    @Override
    public Desktop getDesktop() {
        // TODO Auto-generated method stub
        return super.desktop;
    }
    
}

class DesktopBuilderDirector{
    public Desktop buildDesktop(DesktopBuilder builder){
        builder.buildMemory();
        builder.buildMotherBoard();
        builder.buildProcessor();
        builder.buildStorage();
        builder.buildGraphicsCard();
        return builder.getDesktop();
    }
}

class MainX{
    public static void main(String[] args) {
        DesktopBuilder builder = new DellDesktopBuilder();
        DesktopBuilderDirector desktopBuilderDirector = new DesktopBuilderDirector();
        Desktop desktop = desktopBuilderDirector.buildDesktop(builder);

        HPDesktopBuilder hpdb = new HPDesktopBuilder();
        Desktop desktop1 = desktopBuilderDirector.buildDesktop(hpdb);
    }
}