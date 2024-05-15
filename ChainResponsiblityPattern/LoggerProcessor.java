package ChainResponsiblityPattern;

abstract public class LoggerProcessor{

    LoggerProcessor loggerProcessor;
    public static final int INFO = 0;
    public static final int DEBUG = 1;
    public static final int ERROR = 2;

    public LoggerProcessor(LoggerProcessor loggerProcessor){
        this.loggerProcessor = loggerProcessor;
    }

    public void log(int level, String message){
        if(loggerProcessor != null){
            this.loggerProcessor.log(level, message);
        }else{
            System.out.println("No Logger detected!");
        }
    }
}

