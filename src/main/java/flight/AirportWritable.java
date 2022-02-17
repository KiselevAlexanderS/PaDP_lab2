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

    AirportWritable(int Air_ID, int indicator) {
        this.Air_ID = Air_ID;
        this.indicator = indicator;
    }

    @Override
    public void write(DataOutput data) throws IOException {
        data.writeInt(Air_ID);
        data.writeInt(indicator);
    }

    @Override
    public void readFields(DataInput data) throws IOException {
        Air_ID = data.readInt();
        indicator = data.readInt();
    }

    @Override
    public int compareTo(AirportWritable o) {
        return 0;
    }
}
