import io.karengryg.kafkatestsuite.kafka.EmbeddedSingleNodeKafkaCluster;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyTest {

    private EmbeddedSingleNodeKafkaCluster sut;

    @Before
    public void setUp() throws Exception {
        sut = new EmbeddedSingleNodeKafkaCluster();
        sut.start();
    }

    @After
    public void tearDown() {
        sut.stop();
    }

    @Test
    public void verifyClusterIsRunning() {
        assertTrue(sut.isRunning());
    }
}
