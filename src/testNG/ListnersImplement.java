package testNG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import screenShot.ScreenShot;

public class ListnersImplement extends Listners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(" On Test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(" On Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ScreenShot sc= new ScreenShot();
		String name= result.getName();
		
	   try {
		sc.captureScreen(ref, name);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(" On Test Skipped");
	}
	
	
	
	
	
	

}
