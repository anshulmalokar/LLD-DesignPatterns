package ChainResponsiblityPattern;

import java.util.logging.Logger;

public class DebugLoggerProcessor extends LoggerProcessor{

    
    public DebugLoggerProcessor(LoggerProcessor loggerProcessor){
        super(loggerProcessor);
    }

    @Override
    public void log(int level, String message) {
        // TODO Auto-generated method stub
        if(level == LoggerProcessor.DEBUG){
            System.out.println("DEBUG: " + message);
        }else{
            super.log(level, message);
        }
    }

}

