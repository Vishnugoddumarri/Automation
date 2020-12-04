package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseSetup;

public class Listeners extends BaseSetup implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Failed Test");
        failed(iTestResult.getMethod().getMethodName());
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
