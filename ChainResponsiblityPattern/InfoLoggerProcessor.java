package ChainResponsiblityPattern;


public class InfoLoggerProcessor extends LoggerProcessor{

    public InfoLoggerProcessor(LoggerProcessor loggerProcessor){
        super(loggerProcessor);
    }

    @Override
    public void log(int level, String message) {
        if(level == LoggerProcessor.INFO){
            System.out.println( "INFO:" + message);
        }else{
            super.log(level,message);
        }
    }
    
}

