package flight;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritable implements WritableComparable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void write(DataOutput data) throws IOException {

    }

    @Override
    public void readFields(DataInput data) throws IOException {

    }
}
