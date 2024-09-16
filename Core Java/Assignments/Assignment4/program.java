package example3.org.copy;


public class program {
	
    public static void main(String[] args) {
    	int choice;
    	BMITrackerUtil bmiu = new BMITrackerUtil();
		
		while((choice=bmiu.menulist())!=0)
		{
			switch(choice)
			{
			case 1: bmiu.acceptRcord();
			break;
			case 2: bmiu.printRecord();
			break;
			}
		}
		
		bmiu.Resourcerelease();
    }
}
