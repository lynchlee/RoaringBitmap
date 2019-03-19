package org.roaringbitmap2.runcontainer;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.roaringbitmap2.RoaringBitmap;
import org.roaringbitmap2.buffer.ImmutableRoaringBitmap;
import org.roaringbitmap2.realdata.state.RealDataRoaringOnlyBenchmarkState;

@BenchmarkMode(Mode.Throughput)
public class ArrayContainerAndNotRunContainerBenchmark {

  @Benchmark
  public RoaringBitmap pairwiseACAndNotRC(RealDataRoaringOnlyBenchmarkState bs) {
    RoaringBitmap last = null;
    for (int k = 0; k + 1 < bs.bitmaps.size(); ++k) {
      last = RoaringBitmap.andNot(bs.onlyArrayContainers.get(k), bs.onlyRunContainers.get(k + 1));
    }
    return last;
  }

  @Benchmark
  public ImmutableRoaringBitmap immutablePairwiseACAndNotRC(RealDataRoaringOnlyBenchmarkState bs) {
    ImmutableRoaringBitmap last = null;
    for (int k = 0; k + 1 < bs.immutableBitmaps.size(); ++k) {
      last = ImmutableRoaringBitmap.andNot(bs.immutableOnlyArrayContainers.get(k), bs.immutableOnlyRunContainers.get(k + 1));
    }
    return last;
  }
}
