/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.buffer.ByteBufProcessor
 *  io.netty.util.ReferenceCounted
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.channels.GatheringByteChannel
 *  java.nio.channels.ScatteringByteChannel
 *  java.nio.charset.Charset
 */
package awsl;

import awsl.Class606;
import awsl.Class91;
import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufProcessor;
import io.netty.util.ReferenceCounted;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Class234
extends ByteBuf {
    protected ByteBuf Field1296;
    private static boolean Field1297;

    public Class234(ByteBuf a) {
        this.Field1296 = a;
    }

    /*
     * WARNING - void declaration
     */
    public Class606 Method2092() {
        void a;
        Class606 a2 = new Class606();
        String string = this.Method497();
        String a3 = this.Method497();
        int a4 = this.readInt();
        String a5 = this.Method497();
        String a6 = this.Method497();
        String a7 = this.Method497();
        long a8 = this.readLong();
        long a9 = this.readLong();
        long a10 = this.readLong();
        boolean a11 = this.readBoolean();
        boolean a12 = this.readBoolean();
        a2.Field2838 = a;
        a2.Field2839 = a3;
        a2.Field2843 = a4;
        a2.Field2840 = a5;
        a2.Field2841 = a6;
        a2.Field2842 = a7;
        a2.Field2844 = a8;
        a2.Field2845 = a9;
        a2.Field2846 = a10;
        boolean a13 = Class234.Method1270();
        a2.Field2847 = a11;
        a2.Field2848 = a12;
        Class91.Method3647(new String[5]);
        return a2;
    }

    public void Method2093(Class606 a) {
        boolean bl = Class234.Method1269();
        this.Method496(a.Field2838);
        boolean bl2 = bl;
        this.Method496(a.Field2839);
        this.writeInt(a.Field2843);
        this.Method496(a.Field2840);
        this.Method496(a.Field2841);
        this.Method496(a.Field2842);
        this.writeLong(a.Field2844);
        this.writeLong(a.Field2845);
        this.writeLong(a.Field2846);
        this.writeBoolean(a.Field2847);
        this.writeBoolean(a.Field2848);
        if (Class91.Method3648() == null) {
            Class234.Method1268(false);
        }
    }

    public void Method496(String a) {
        this.writeInt(a.getBytes(Charsets.UTF_8).length);
        this.writeBytes(a.getBytes(Charsets.UTF_8));
    }

    public String Method497() {
        byte[] a = new byte[this.readInt()];
        for (int a2 = 0; a2 < a.length; ++a2) {
            a[a2] = this.readByte();
        }
        return new String(a, Charsets.UTF_8);
    }

    public int Method10() {
        int a;
        block1: {
            a = 0;
            boolean a2 = Class234.Method1269();
            int a3 = 0;
            byte a4 = this.readByte();
            a |= (a4 & 0x7F) << a3++ * 7;
            if (a3 > 5) {
                throw new RuntimeException("VarInt too big");
            }
            if ((a4 & 0x80) == 128) break block1;
        }
        return a;
    }

    public static int Method1612(int a) {
        for (int a2 = 1; a2 < 5; ++a2) {
            if ((a & -1 << a2 * 7) != 0) continue;
            return a2;
        }
        return 5;
    }

    public void Method9(int a) {
        while ((a & 0xFFFFFF80) != 0) {
            this.writeByte(a & 0x7F | 0x80);
            a >>>= 7;
        }
        this.writeByte(a);
    }

    public void Method2094(long a) {
        boolean bl = Class234.Method1269();
        if ((a & 0xFFFFFFFFFFFFFF80L) != 0L) {
            this.writeByte((int)(a & 0x7FL) | 0x80);
            a >>>= 7;
        }
        this.writeByte((int)a);
    }

    public int capacity() {
        return this.Field1296.capacity();
    }

    public ByteBuf capacity(int a) {
        return this.Field1296.capacity(a);
    }

    public int maxCapacity() {
        return this.Field1296.maxCapacity();
    }

    public ByteBufAllocator alloc() {
        return this.Field1296.alloc();
    }

    public ByteOrder order() {
        return this.Field1296.order();
    }

    public ByteBuf order(ByteOrder a) {
        return this.Field1296.order(a);
    }

    public ByteBuf unwrap() {
        return this.Field1296.unwrap();
    }

    public boolean isDirect() {
        return this.Field1296.isDirect();
    }

    public int readerIndex() {
        return this.Field1296.readerIndex();
    }

    public ByteBuf readerIndex(int a) {
        return this.Field1296.readerIndex(a);
    }

    public int writerIndex() {
        return this.Field1296.writerIndex();
    }

    public ByteBuf writerIndex(int a) {
        return this.Field1296.writerIndex(a);
    }

    public ByteBuf setIndex(int a, int a2) {
        return this.Field1296.setIndex(a, a2);
    }

    public int readableBytes() {
        return this.Field1296.readableBytes();
    }

    public int writableBytes() {
        return this.Field1296.writableBytes();
    }

    public int maxWritableBytes() {
        return this.Field1296.maxWritableBytes();
    }

    public boolean isReadable() {
        return this.Field1296.isReadable();
    }

    public boolean isReadable(int a) {
        return this.Field1296.isReadable(a);
    }

    public boolean isWritable() {
        return this.Field1296.isWritable();
    }

    public boolean isWritable(int a) {
        return this.Field1296.isWritable(a);
    }

    public ByteBuf clear() {
        return this.Field1296.clear();
    }

    public ByteBuf markReaderIndex() {
        return this.Field1296.markReaderIndex();
    }

    public ByteBuf resetReaderIndex() {
        return this.Field1296.resetReaderIndex();
    }

    public ByteBuf markWriterIndex() {
        return this.Field1296.markWriterIndex();
    }

    public ByteBuf resetWriterIndex() {
        return this.Field1296.resetWriterIndex();
    }

    public ByteBuf discardReadBytes() {
        return this.Field1296.discardReadBytes();
    }

    public ByteBuf discardSomeReadBytes() {
        return this.Field1296.discardSomeReadBytes();
    }

    public ByteBuf ensureWritable(int a) {
        return this.Field1296.ensureWritable(a);
    }

    public int ensureWritable(int a, boolean a2) {
        return this.Field1296.ensureWritable(a, a2);
    }

    public boolean getBoolean(int a) {
        return this.Field1296.getBoolean(a);
    }

    public byte getByte(int a) {
        return this.Field1296.getByte(a);
    }

    public short getUnsignedByte(int a) {
        return this.Field1296.getUnsignedByte(a);
    }

    public short getShort(int a) {
        return this.Field1296.getShort(a);
    }

    public int getUnsignedShort(int a) {
        return this.Field1296.getUnsignedShort(a);
    }

    public int getMedium(int a) {
        return this.Field1296.getMedium(a);
    }

    public int getUnsignedMedium(int a) {
        return this.Field1296.getUnsignedMedium(a);
    }

    public int getInt(int a) {
        return this.Field1296.getInt(a);
    }

    public long getUnsignedInt(int a) {
        return this.Field1296.getUnsignedInt(a);
    }

    public long getLong(int a) {
        return this.Field1296.getLong(a);
    }

    public char getChar(int a) {
        return this.Field1296.getChar(a);
    }

    public float getFloat(int a) {
        return this.Field1296.getFloat(a);
    }

    public double getDouble(int a) {
        return this.Field1296.getDouble(a);
    }

    public ByteBuf getBytes(int a, ByteBuf a2) {
        return this.Field1296.getBytes(a, a2);
    }

    public ByteBuf getBytes(int a, ByteBuf a2, int a3) {
        return this.Field1296.getBytes(a, a2, a3);
    }

    public ByteBuf getBytes(int a, ByteBuf a2, int a3, int a4) {
        return this.Field1296.getBytes(a, a2, a3, a4);
    }

    public ByteBuf getBytes(int a, byte[] a2) {
        return this.Field1296.getBytes(a, a2);
    }

    public ByteBuf getBytes(int a, byte[] a2, int a3, int a4) {
        return this.Field1296.getBytes(a, a2, a3, a4);
    }

    public ByteBuf getBytes(int a, ByteBuffer a2) {
        return this.Field1296.getBytes(a, a2);
    }

    public ByteBuf getBytes(int a, OutputStream a2, int a3) throws IOException {
        return this.Field1296.getBytes(a, a2, a3);
    }

    public int getBytes(int a, GatheringByteChannel a2, int a3) throws IOException {
        return this.Field1296.getBytes(a, a2, a3);
    }

    public ByteBuf setBoolean(int a, boolean a2) {
        return this.Field1296.setBoolean(a, a2);
    }

    public ByteBuf setByte(int a, int a2) {
        return this.Field1296.setByte(a, a2);
    }

    public ByteBuf setShort(int a, int a2) {
        return this.Field1296.setShort(a, a2);
    }

    public ByteBuf setMedium(int a, int a2) {
        return this.Field1296.setMedium(a, a2);
    }

    public ByteBuf setInt(int a, int a2) {
        return this.Field1296.setInt(a, a2);
    }

    public ByteBuf setLong(int a, long a2) {
        return this.Field1296.setLong(a, a2);
    }

    public ByteBuf setChar(int a, int a2) {
        return this.Field1296.setChar(a, a2);
    }

    public ByteBuf setFloat(int a, float a2) {
        return this.Field1296.setFloat(a, a2);
    }

    public ByteBuf setDouble(int a, double a2) {
        return this.Field1296.setDouble(a, a2);
    }

    public ByteBuf setBytes(int a, ByteBuf a2) {
        return this.Field1296.setBytes(a, a2);
    }

    public ByteBuf setBytes(int a, ByteBuf a2, int a3) {
        return this.Field1296.setBytes(a, a2, a3);
    }

    public ByteBuf setBytes(int a, ByteBuf a2, int a3, int a4) {
        return this.Field1296.setBytes(a, a2, a3, a4);
    }

    public ByteBuf setBytes(int a, byte[] a2) {
        return this.Field1296.setBytes(a, a2);
    }

    public ByteBuf setBytes(int a, byte[] a2, int a3, int a4) {
        return this.Field1296.setBytes(a, a2, a3, a4);
    }

    public ByteBuf setBytes(int a, ByteBuffer a2) {
        return this.Field1296.setBytes(a, a2);
    }

    public int setBytes(int a, InputStream a2, int a3) throws IOException {
        return this.Field1296.setBytes(a, a2, a3);
    }

    public int setBytes(int a, ScatteringByteChannel a2, int a3) throws IOException {
        return this.Field1296.setBytes(a, a2, a3);
    }

    public ByteBuf setZero(int a, int a2) {
        return this.Field1296.setZero(a, a2);
    }

    public boolean readBoolean() {
        return this.Field1296.readBoolean();
    }

    public byte readByte() {
        return this.Field1296.readByte();
    }

    public short readUnsignedByte() {
        return this.Field1296.readUnsignedByte();
    }

    public short readShort() {
        return this.Field1296.readShort();
    }

    public int readUnsignedShort() {
        return this.Field1296.readUnsignedShort();
    }

    public int readMedium() {
        return this.Field1296.readMedium();
    }

    public int readUnsignedMedium() {
        return this.Field1296.readUnsignedMedium();
    }

    public int readInt() {
        return this.Field1296.readInt();
    }

    public long readUnsignedInt() {
        return this.Field1296.readUnsignedInt();
    }

    public long readLong() {
        return this.Field1296.readLong();
    }

    public char readChar() {
        return this.Field1296.readChar();
    }

    public float readFloat() {
        return this.Field1296.readFloat();
    }

    public double readDouble() {
        return this.Field1296.readDouble();
    }

    public ByteBuf readBytes(int a) {
        return this.Field1296.readBytes(a);
    }

    public ByteBuf readSlice(int a) {
        return this.Field1296.readSlice(a);
    }

    public ByteBuf readBytes(ByteBuf a) {
        return this.Field1296.readBytes(a);
    }

    public ByteBuf readBytes(ByteBuf a, int a2) {
        return this.Field1296.readBytes(a, a2);
    }

    public ByteBuf readBytes(ByteBuf a, int a2, int a3) {
        return this.Field1296.readBytes(a, a2, a3);
    }

    public ByteBuf readBytes(byte[] a) {
        return this.Field1296.readBytes(a);
    }

    public ByteBuf readBytes(byte[] a, int a2, int a3) {
        return this.Field1296.readBytes(a, a2, a3);
    }

    public ByteBuf readBytes(ByteBuffer a) {
        return this.Field1296.readBytes(a);
    }

    public ByteBuf readBytes(OutputStream a, int a2) throws IOException {
        return this.Field1296.readBytes(a, a2);
    }

    public int readBytes(GatheringByteChannel a, int a2) throws IOException {
        return this.Field1296.readBytes(a, a2);
    }

    public ByteBuf skipBytes(int a) {
        return this.Field1296.skipBytes(a);
    }

    public ByteBuf writeBoolean(boolean a) {
        return this.Field1296.writeBoolean(a);
    }

    public ByteBuf writeByte(int a) {
        return this.Field1296.writeByte(a);
    }

    public ByteBuf writeShort(int a) {
        return this.Field1296.writeShort(a);
    }

    public ByteBuf writeMedium(int a) {
        return this.Field1296.writeMedium(a);
    }

    public ByteBuf writeInt(int a) {
        return this.Field1296.writeInt(a);
    }

    public ByteBuf writeLong(long a) {
        return this.Field1296.writeLong(a);
    }

    public ByteBuf writeChar(int a) {
        return this.Field1296.writeChar(a);
    }

    public ByteBuf writeFloat(float a) {
        return this.Field1296.writeFloat(a);
    }

    public ByteBuf writeDouble(double a) {
        return this.Field1296.writeDouble(a);
    }

    public ByteBuf writeBytes(ByteBuf a) {
        return this.Field1296.writeBytes(a);
    }

    public ByteBuf writeBytes(ByteBuf a, int a2) {
        return this.Field1296.writeBytes(a, a2);
    }

    public ByteBuf writeBytes(ByteBuf a, int a2, int a3) {
        return this.Field1296.writeBytes(a, a2, a3);
    }

    public ByteBuf writeBytes(byte[] a) {
        return this.Field1296.writeBytes(a);
    }

    public ByteBuf writeBytes(byte[] a, int a2, int a3) {
        return this.Field1296.writeBytes(a, a2, a3);
    }

    public ByteBuf writeBytes(ByteBuffer a) {
        return this.Field1296.writeBytes(a);
    }

    public int writeBytes(InputStream a, int a2) throws IOException {
        return this.Field1296.writeBytes(a, a2);
    }

    public int writeBytes(ScatteringByteChannel a, int a2) throws IOException {
        return this.Field1296.writeBytes(a, a2);
    }

    public ByteBuf writeZero(int a) {
        return this.Field1296.writeZero(a);
    }

    public int indexOf(int a, int a2, byte a3) {
        return this.Field1296.indexOf(a, a2, a3);
    }

    public int bytesBefore(byte a) {
        return this.Field1296.bytesBefore(a);
    }

    public int bytesBefore(int a, byte a2) {
        return this.Field1296.bytesBefore(a, a2);
    }

    public int bytesBefore(int a, int a2, byte a3) {
        return this.Field1296.bytesBefore(a, a2, a3);
    }

    public int forEachByte(ByteBufProcessor a) {
        return this.Field1296.forEachByte(a);
    }

    public int forEachByte(int a, int a2, ByteBufProcessor a3) {
        return this.Field1296.forEachByte(a, a2, a3);
    }

    public int forEachByteDesc(ByteBufProcessor a) {
        return this.Field1296.forEachByteDesc(a);
    }

    public int forEachByteDesc(int a, int a2, ByteBufProcessor a3) {
        return this.Field1296.forEachByteDesc(a, a2, a3);
    }

    public ByteBuf copy() {
        return this.Field1296.copy();
    }

    public ByteBuf copy(int a, int a2) {
        return this.Field1296.copy(a, a2);
    }

    public ByteBuf slice() {
        return this.Field1296.slice();
    }

    public ByteBuf slice(int a, int a2) {
        return this.Field1296.slice(a, a2);
    }

    public ByteBuf duplicate() {
        return this.Field1296.duplicate();
    }

    public int nioBufferCount() {
        return this.Field1296.nioBufferCount();
    }

    public ByteBuffer nioBuffer() {
        return this.Field1296.nioBuffer();
    }

    public ByteBuffer nioBuffer(int a, int a2) {
        return this.Field1296.nioBuffer(a, a2);
    }

    public ByteBuffer internalNioBuffer(int a, int a2) {
        return this.Field1296.internalNioBuffer(a, a2);
    }

    public ByteBuffer[] nioBuffers() {
        return this.Field1296.nioBuffers();
    }

    public ByteBuffer[] nioBuffers(int a, int a2) {
        return this.Field1296.nioBuffers(a, a2);
    }

    public boolean hasArray() {
        return this.Field1296.hasArray();
    }

    public byte[] array() {
        return this.Field1296.array();
    }

    public int arrayOffset() {
        return this.Field1296.arrayOffset();
    }

    public boolean hasMemoryAddress() {
        return this.Field1296.hasMemoryAddress();
    }

    public long memoryAddress() {
        return this.Field1296.memoryAddress();
    }

    public String toString(Charset a) {
        return this.Field1296.toString(a);
    }

    public String toString(int a, int a2, Charset a3) {
        return this.Field1296.toString(a, a2, a3);
    }

    public int hashCode() {
        return this.Field1296.hashCode();
    }

    public boolean equals(Object a) {
        return this.Field1296.equals(a);
    }

    public int compareTo(ByteBuf a) {
        return this.Field1296.compareTo(a);
    }

    public String toString() {
        return this.Field1296.toString();
    }

    public ByteBuf retain(int a) {
        return this.Field1296.retain(a);
    }

    public ByteBuf retain() {
        return this.Field1296.retain();
    }

    public int refCnt() {
        return this.Field1296.refCnt();
    }

    public boolean release() {
        return this.Field1296.release();
    }

    public boolean release(int a) {
        return this.Field1296.release(a);
    }

    public ReferenceCounted retain(int n) {
        return this.retain(n);
    }

    public ReferenceCounted retain() {
        return this.retain();
    }

    public int compareTo(Object object) {
        return this.compareTo((ByteBuf)object);
    }

    public static void Method1268(boolean bl) {
        Field1297 = bl;
    }

    public static boolean Method1269() {
        return Field1297;
    }

    public static boolean Method1270() {
        boolean bl = Class234.Method1269();
        return true;
    }

    private static RuntimeException Method2095(RuntimeException runtimeException) {
        return runtimeException;
    }

    static {
        if (Class234.Method1269()) {
            Class234.Method1268(true);
        }
    }
}