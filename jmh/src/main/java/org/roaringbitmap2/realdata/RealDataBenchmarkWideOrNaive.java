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
public class RealDataBenchmarkWideOrNaive {

  @Benchmark
  public int wideOr_naive(RealDataBenchmarkState bs) {
    BitmapAggregator aggregator = bs.bitmaps.get(0).naiveOrAggregator();
    return aggregator.aggregate(bs.bitmaps).cardinality();
  }

}
