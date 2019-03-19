/*
 * (c) the authors Licensed under the Apache License, Version 2.0.
 */
package org.roaringbitmap2;

import org.roaringbitmap2.longlong.Roaring64NavigableMap;

/**
 * Enable customizing the {@link BitmapDataProvider} used by {@link Roaring64NavigableMap}
 * 
 * @author Benoit Lacelle
 *
 */
public interface BitmapDataProviderSupplier {
  BitmapDataProvider newEmpty();
}
