package jenkins_practice;

import org.testng.annotations.Test;

public class Sample1Test {

	@Test(groups = "regression")
	public void sample1() {
		System.out.println("sample 1 test");
	}
}
