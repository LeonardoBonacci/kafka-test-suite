import com.corelogic.idap.pipeline.kafkatestsuite.kafka.EmbeddedSingleNodeKafkaCluster;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyTest {

    @Test
    public void name() throws Exception {
        EmbeddedSingleNodeKafkaCluster kafkaCluster = new EmbeddedSingleNodeKafkaCluster();
        kafkaCluster.start();
        assertTrue(kafkaCluster.isRunning());
    }
}
