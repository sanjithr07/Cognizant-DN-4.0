class Logger{
    private static Logger log;
    private Logger(){};

    public static Logger getinstance(){
        if(log == null){
            log = new Logger();
            System.out.println("log object is null, creating new log instance.");
        }else{
            System.out.println("log object already exists, returning existing log instance.");
        }
        return log;
    }
}

public class  SingletonPatternExample{
    public static void main(String[] args) {
        System.out.println("Testing Singleton Pattern Example");
        System.out.println("Creating first object...");
        Logger log1 = Logger.getinstance();
        System.out.println("Creating second object...");
        Logger log2 = Logger.getinstance();

        
    }
}