package Interfaces;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    private static int ActualRetry = 0;
    private static final int MaxRetry = 3;

    @Override
    public boolean retry(ITestResult TestResult){
        if(!TestResult.isSuccess()) {
            if (ActualRetry < MaxRetry) {
                ActualRetry++;
                return true;
            }
        }
        return false;
    }
}
