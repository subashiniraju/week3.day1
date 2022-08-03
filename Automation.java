package week4.day1;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation run=new Automation();
		run.ruby();
		run.Java();
		run.Selenium();
		run.python();
		
	}

	@Override
	void ruby() {
		System.out.println("Ruby");
		
		}

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void Java() {
		System.out.println("java");
		
		
	}

	

}
