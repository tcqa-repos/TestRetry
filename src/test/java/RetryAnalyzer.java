import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Julia.Reshetnikova on 12-Mar-16.
 */
public class RetryAnalyzer implements IRetryAnalyzer {
    final static int MAX_RETRY_COUNT = 2;
    int count;

    @Override
    public boolean retry(ITestResult result) {
        if (count < MAX_RETRY_COUNT) {
            count++;
            return true;
        }
        return false;
    }
}
