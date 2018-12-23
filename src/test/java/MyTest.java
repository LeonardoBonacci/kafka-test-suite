import io.karengryg.kafkatestsuite.kafka.EmbeddedSingleNodeKafkaCluster;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyTest {

    private EmbeddedSingleNodeKafkaCluster kafkaCluster;

    @Before
    public void setUp() throws Exception {
        kafkaCluster = new EmbeddedSingleNodeKafkaCluster();
        kafkaCluster.start();
    }

    @After
    public void tearDown() {
        kafkaCluster.stop();
    }

    @Test
    public void verifyClusterIsRunning() {
        assertTrue(kafkaCluster.isRunning());
    }
}
