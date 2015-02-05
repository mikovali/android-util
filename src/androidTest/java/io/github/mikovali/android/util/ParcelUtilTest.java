package io.github.mikovali.android.util;

import android.os.Parcel;

import junit.framework.TestCase;

public class ParcelUtilTest extends TestCase {

    // Integer

    public void testWriteAndReadInteger() {
        final Parcel parcel = Parcel.obtain();
        ParcelUtil.writeInteger(3, parcel);
        parcel.setDataPosition(0);
        assertEquals(Integer.valueOf(3), ParcelUtil.readInteger(parcel));
        parcel.recycle();
    }

    public void testWriteAndReadNullInteger() {
        final Parcel parcel = Parcel.obtain();
        ParcelUtil.writeInteger(null, parcel);
        parcel.setDataPosition(0);
        assertEquals(null, ParcelUtil.readInteger(parcel));
        parcel.recycle();
    }
}
