import org.testng.Assert;

/**
 * Created by Julia.Reshetnikova on 25-Nov-16.
 */
public class Test {

    private int retryTimes = 0;

    @org.testng.annotations.Test (retryAnalyzer = RetryAnalyzer.class)
    public void shouldBeTwoIgnored_OneFailed() {
        Assert.fail("This test failed");
    }

    @org.testng.annotations.Test (retryAnalyzer = RetryAnalyzer.class)
    public void shouldBeTwoIgnored_OnePassed() {
        retryTimes++;
        if (retryTimes < 3) {
            Assert.fail("This test failed");
        }
    }

}
