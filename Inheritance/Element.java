package week3.day1.Inheritance;

public class Element extends Button {

	public static void main(String[] args) {
		Button b=new Button();
		b.click();
		b.settext("Hello");
		b.submit();
		TextField t=new TextField();
		// TODO Auto-generated method stub
		t.click();
		t.settext("Madam");
		t.gettext();
		RadioButton rb=new RadioButton();
		rb.click();
		rb.settext("Sir");
		rb.submit();
		rb.selectradiobuttoon();
		CheckBox ch=new CheckBox();
	      ch.click();
	      ch.clickcheckButton();
	      ch.submit();

	}

}
