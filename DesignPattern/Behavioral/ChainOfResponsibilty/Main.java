package DesignPattern.Behavioral.ChainOfResponsibilty;

abstract class LogProcessor {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

     LogProcessor nextProcessor;
    
     LogProcessor(LogProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
     }

    public void processLog(int level, String message) {
        if (nextProcessor != null) {
            nextProcessor.processLog(level, message);
        }
    }
}

class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void processLog(int level, String message) {
        if (level == INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.processLog(level, message);
        }
    }
}

class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void processLog(int level, String message) {
        if (level == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.processLog(level, message);
        }
    }
}

class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void processLog(int level, String message) {
        if (level == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.processLog(level, message);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.processLog(LogProcessor.INFO, "This is an info message.");
        logProcessor.processLog(LogProcessor.DEBUG, "This is a debug message.");
        logProcessor.processLog(LogProcessor.ERROR, "This is an error message.");
    
    }
    
}
