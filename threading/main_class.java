package threading;

public class main_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		getnumber gn=new getnumber();
		getstring gs=new getstring();
		
		gn.start();
		Thread.sleep(100);
		gs.start();

	}

}
