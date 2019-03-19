/*
 * (c) the authors Licensed under the Apache License, Version 2.0.
 */
package org.roaringbitmap2.buffer;

import org.roaringbitmap2.BitmapDataProvider;
import org.roaringbitmap2.BitmapDataProviderSupplier;

/**
 * A {@link BitmapDataProviderSupplier} providing {@link MutableRoaringBitmap} as
 * {@link BitmapDataProvider}
 * 
 * @author Benoit Lacelle
 *
 */
public class MutableRoaringBitmapSupplier implements BitmapDataProviderSupplier {

  @Override
  public BitmapDataProvider newEmpty() {
    return new MutableRoaringBitmap();
  }

}
