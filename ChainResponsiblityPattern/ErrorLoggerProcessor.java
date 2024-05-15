package ChainResponsiblityPattern;

public class ErrorLoggerProcessor extends LoggerProcessor{
    public ErrorLoggerProcessor(LoggerProcessor loggerProcessor){
        super(loggerProcessor);
    }

    public void log(int level, String message){
        if(level == LoggerProcessor.ERROR){
            System.out.println("ERROR: " + message);
        }else{
            super.log(level, message);
        }
    }

}

