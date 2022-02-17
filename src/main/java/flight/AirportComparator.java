package flight;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportComparator extends WritableComparator {
    protected AirportComparator() {
        super(AirportWritable.class, true);
    }

    @Override
    public int compare(WritableComparable x, WritableComparable y) {
        return (((AirportWritable)x).getAir_ID() - ((AirportWritable)y).getAir_ID());
    }
}
