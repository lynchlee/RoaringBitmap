package org.roaringbitmap2.realdata;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.roaringbitmap2.realdata.state.RealDataBenchmarkState;
import org.roaringbitmap2.realdata.wrapper.Bitmap;
import org.roaringbitmap2.realdata.wrapper.BitmapIterator;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class RealDataBenchmarkIterate {

  @Benchmark
  public int iterate(RealDataBenchmarkState bs) {
    int total = 0;
    for (int k = 0; k < bs.bitmaps.size(); ++k) {
      Bitmap bitmap = bs.bitmaps.get(k);
      BitmapIterator i = bitmap.iterator();
      while (i.hasNext()) {
        total += i.next();
      }
    }
    return total;
  }

}
