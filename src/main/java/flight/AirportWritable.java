package flight;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritable implements WritableComparable {
    public int compareTo(Object o) {
        return 0;
    }

    public void write(DataOutput data) throws IOException {

    }

    public void readFields(DataInput data) throws IOException {

    }
}
