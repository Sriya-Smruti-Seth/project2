package Parameters;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertdemo {
	@Test
	public void data() {
		int a=1;
		int b=2;
		System.out.println(a);
		System.out.println(b);
		//HardAssert will give false when we give different value for a,b - use only assert.
		System.out.println("Hard Assert");
		System.out.println("Hard and soft Assert");
		//Assert.assertEquals(1+2,3);
		
		//SoftAssert will give output when the value is different value for a,b-use softAssert object.
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(a,b);
	}
	
	

}
