package com.myapp.utilities;
import org.testng.*;
import org.testng.annotations.ITestAnnotation;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class ListenersUtil implements ITestListener, IRetryAnalyzer, IAnnotationTransformer {
    /*
    Listeners are used to LISTEN the test classes when they pass, fail, skip, start, end,...
    They are used to customize the testNG framework
    We will also use Listeners for adding special functionality under speci cases,
    such as take the screenshot for only failed test cases, or rerun the faieled test case more than once automatically
    onStart,onFinish,onTestStart,onTestFinish,... are special method names
     */
    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart : execute ONCE before ALL test cases(@Test) : "+context.getName());
    }
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish : execute ONCE after ALL test cases(@Test) : "+context.getName());
    }
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart : execute ONCE before EACH test cases(@Test) : "+result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess : execute ONCE after EACH PASSING test cases(@Test) : "+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
//        System.out.println("onTestFailure : execute ONCE after EACH FAILED test cases(@Test) : "+result.getName());
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped : execute ONCE after EACH SKIPPED test cases(@Test) : "+result.getName());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage : execute ONCE based on total test success percentage : "+result.getName());
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout : execute ONCE after EACH failed test case due to a TIMEOUT ISSUE : "+result.getName());
    }
    //    IRetryAnalyzer Method Is Implemented
//    This method will be called automatically to RETRY THE FAILED TEST CASES
    private int retryCount = 0;
    private static final int maxRetryCount = 3;//RERUN COUNT
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
    //    IIAnnotationTransformer method is added
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(ListenersUtil.class);
    }
}