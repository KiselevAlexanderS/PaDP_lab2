package flight;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        int air_id_col = 14;
        int air_delay_col = 18;

        String line = value.toString();
        String[] words = line.split(",");
        if (key.get() > 0){
            float arr_delay = 0;
            if (words[air_delay_col].length() > 0)
                arr_delay = Float.parseFloat(words[air_delay_col]);
            if (arr_delay > 0) {
                int air_id = Integer.parseInt(words[air_id_col]);
                context.write(new AirportWritable(air_id, 1), new Text(String.valueOf(arr_delay)));
            }
        }
    }
}
