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

    public void setIndicator(int indicator) {
        this.indicator = indicator;
    }

    public int getIndicator() {
        return indicator;
    }

    

    public int getAir_ID() {
        return Air_ID;
    }

    @Override
    public int compareTo(AirportWritable o) {
        int first = this.Air_ID - o.Air_ID;
        int second = this.indicator - o.indicator;
        if (first == 1 || first == -1)
            first += first;
        return (first + second);
    }
}
