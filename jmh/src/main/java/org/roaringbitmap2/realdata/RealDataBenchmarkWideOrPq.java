package org.roaringbitmap2.realdata;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.roaringbitmap2.realdata.state.RealDataBenchmarkState;
import org.roaringbitmap2.realdata.wrapper.BitmapAggregator;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class RealDataBenchmarkWideOrPq {

  @Benchmark
  public int wideOr_pq(RealDataBenchmarkState bs) {
    BitmapAggregator aggregator = bs.bitmaps.get(0).priorityQueueOrAggregator();
    return aggregator.aggregate(bs.bitmaps).cardinality();
  }

}
