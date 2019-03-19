package org.roaringbitmap2.realdata.wrapper;

public interface BitmapAggregator {

  Bitmap aggregate(Iterable<Bitmap> bitmaps);

}
