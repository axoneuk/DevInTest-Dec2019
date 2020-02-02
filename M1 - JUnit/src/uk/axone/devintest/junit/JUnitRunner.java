package uk.axone.devintest.junit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SimpleJUnitDemo.class,
        AppUtils_Test.class,
        JunitE2ETests.class
}
)

public class JUnitRunner {
}
