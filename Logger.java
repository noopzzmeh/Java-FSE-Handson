package Singleton;

public class Logger {

	private static Logger instance;
	
	private Logger(){
		// TODO Auto-generated constructor stub
		System.out.println("Instance created");
	}
	
	public static Logger getInstance() {
		if(instance==null) {
			instance = new Logger();
		}
		return instance;
	}
	
	public void log(String message) {
		System.out.println("[LOG]"+message);
	}

}
