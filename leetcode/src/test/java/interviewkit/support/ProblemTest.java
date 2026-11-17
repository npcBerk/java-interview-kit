package interviewkit.support;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.opentest4j.TestAbortedException;

/**
 * Base class for every problem test.
 *
 * <p>While a solution still contains {@code throw new UnsupportedOperationException("TODO")},
 * its tests show up as <em>skipped</em> instead of red, so unsolved problems never clutter
 * the output. Delete that line, write your solution and the tests start running.
 */
@ExtendWith(ProblemTest.TodoAsSkipped.class)
public abstract class ProblemTest {

    /** Placeholder for a test that has no examples yet: reported as skipped, never as passed. */
    protected static void addExamples() {
        throw new TestAbortedException("No examples yet: add the LeetCode examples and your own edge cases");
    }

    public static class TodoAsSkipped implements TestExecutionExceptionHandler {
        @Override
        public void handleTestExecutionException(ExtensionContext ctx, Throwable t) throws Throwable {
            if (t instanceof UnsupportedOperationException && "TODO".equals(t.getMessage())) {
                throw new TestAbortedException("Not solved yet");
            }
            throw t;
        }
    }
}
