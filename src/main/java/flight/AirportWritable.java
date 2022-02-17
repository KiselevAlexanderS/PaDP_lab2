package flight;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritable implements WritableComparable<AirportWritable> {

    private int Air_ID;
    private int indicator;

    AirportWritable(){
        
    }

    @Override
    public void write(DataOutput data) throws IOException {

    }

    @Override
    public void readFields(DataInput data) throws IOException {

    }

    @Override
    public int compareTo(AirportWritable o) {
        return 0;
    }
}
