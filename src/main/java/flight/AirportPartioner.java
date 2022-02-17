package flight;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportPartioner extends Partitioner<AirportWritable, Text>{

    @Override
    public int getPartition(AirportWritable airportWritable, Text text, int i) {
        return (airportWritable.getAir_ID() % i);
    }
}
