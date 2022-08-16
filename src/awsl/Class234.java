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
import obfuscate.a;

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
        void a2;
        Class606 a3 = new Class606();
        String string = this.Method497();
        String a4 = this.Method497();
        int a5 = this.readInt();
        String a6 = this.Method497();
        String a7 = this.Method497();
        String a8 = this.Method497();
        long a9 = this.readLong();
        long a10 = this.readLong();
        long a11 = this.readLong();
        boolean a12 = this.readBoolean();
        boolean a13 = this.readBoolean();
        a3.Field2838 = a2;
        a3.Field2839 = a4;
        a3.Field2843 = a5;
        a3.Field2840 = a6;
        a3.Field2841 = a7;
        a3.Field2842 = a8;
        a3.Field2844 = a9;
        a3.Field2845 = a10;
        a3.Field2846 = a11;
        boolean a14 = Class234.Method1270();
        a3.Field2847 = a12;
        a3.Field2848 = a13;
        a.trash(new String[5]);
        return a3;
    }

    public void Method2093(Class606 a2) {
        boolean bl = Class234.Method1269();
        this.Method496(a2.Field2838);
        boolean bl2 = bl;
        this.Method496(a2.Field2839);
        this.writeInt(a2.Field2843);
        this.Method496(a2.Field2840);
        this.Method496(a2.Field2841);
        this.Method496(a2.Field2842);
        this.writeLong(a2.Field2844);
        this.writeLong(a2.Field2845);
        this.writeLong(a2.Field2846);
        this.writeBoolean(a2.Field2847);
        this.writeBoolean(a2.Field2848);
        if (a.trash() == null) {
            Class234.Method1268(false);
        }
    }

    public void Method496(String a2) {
        this.writeInt(a2.getBytes(Charsets.UTF_8).length);
        this.writeBytes(a2.getBytes(Charsets.UTF_8));
    }

    public String Method497() {
        byte[] a2 = new byte[this.readInt()];
        for (int a3 = 0; a3 < a2.length; ++a3) {
            a2[a3] = this.readByte();
        }
        return new String(a2, Charsets.UTF_8);
    }

    public int Method10() {
        int a2;
        block1: {
            a2 = 0;
            boolean a3 = Class234.Method1269();
            int a4 = 0;
            byte a5 = this.readByte();
            a2 |= (a5 & 0x7F) << a4++ * 7;
            if (a4 > 5) {
                throw new RuntimeException("VarInt too big");
            }
            if ((a5 & 0x80) == 128) break block1;
        }
        return a2;
    }

    public static int Method1612(int a2) {
        for (int a3 = 1; a3 < 5; ++a3) {
            if ((a2 & -1 << a3 * 7) != 0) continue;
            return a3;
        }
        return 5;
    }

    public void Method9(int a2) {
        while ((a2 & 0xFFFFFF80) != 0) {
            this.writeByte(a2 & 0x7F | 0x80);
            a2 >>>= 7;
        }
        this.writeByte(a2);
    }

    public void Method2094(long a2) {
        boolean bl = Class234.Method1269();
        if ((a2 & 0xFFFFFFFFFFFFFF80L) != 0L) {
            this.writeByte((int)(a2 & 0x7FL) | 0x80);
            a2 >>>= 7;
        }
        this.writeByte((int)a2);
    }

    public int capacity() {
        return this.Field1296.capacity();
    }

    public ByteBuf capacity(int a2) {
        return this.Field1296.capacity(a2);
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

    public ByteBuf order(ByteOrder a2) {
        return this.Field1296.order(a2);
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

    public ByteBuf readerIndex(int a2) {
        return this.Field1296.readerIndex(a2);
    }

    public int writerIndex() {
        return this.Field1296.writerIndex();
    }

    public ByteBuf writerIndex(int a2) {
        return this.Field1296.writerIndex(a2);
    }

    public ByteBuf setIndex(int a2, int a3) {
        return this.Field1296.setIndex(a2, a3);
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

    public boolean isReadable(int a2) {
        return this.Field1296.isReadable(a2);
    }

    public boolean isWritable() {
        return this.Field1296.isWritable();
    }

    public boolean isWritable(int a2) {
        return this.Field1296.isWritable(a2);
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

    public ByteBuf ensureWritable(int a2) {
        return this.Field1296.ensureWritable(a2);
    }

    public int ensureWritable(int a2, boolean a3) {
        return this.Field1296.ensureWritable(a2, a3);
    }

    public boolean getBoolean(int a2) {
        return this.Field1296.getBoolean(a2);
    }

    public byte getByte(int a2) {
        return this.Field1296.getByte(a2);
    }

    public short getUnsignedByte(int a2) {
        return this.Field1296.getUnsignedByte(a2);
    }

    public short getShort(int a2) {
        return this.Field1296.getShort(a2);
    }

    public int getUnsignedShort(int a2) {
        return this.Field1296.getUnsignedShort(a2);
    }

    public int getMedium(int a2) {
        return this.Field1296.getMedium(a2);
    }

    public int getUnsignedMedium(int a2) {
        return this.Field1296.getUnsignedMedium(a2);
    }

    public int getInt(int a2) {
        return this.Field1296.getInt(a2);
    }

    public long getUnsignedInt(int a2) {
        return this.Field1296.getUnsignedInt(a2);
    }

    public long getLong(int a2) {
        return this.Field1296.getLong(a2);
    }

    public char getChar(int a2) {
        return this.Field1296.getChar(a2);
    }

    public float getFloat(int a2) {
        return this.Field1296.getFloat(a2);
    }

    public double getDouble(int a2) {
        return this.Field1296.getDouble(a2);
    }

    public ByteBuf getBytes(int a2, ByteBuf a3) {
        return this.Field1296.getBytes(a2, a3);
    }

    public ByteBuf getBytes(int a2, ByteBuf a3, int a4) {
        return this.Field1296.getBytes(a2, a3, a4);
    }

    public ByteBuf getBytes(int a2, ByteBuf a3, int a4, int a5) {
        return this.Field1296.getBytes(a2, a3, a4, a5);
    }

    public ByteBuf getBytes(int a2, byte[] a3) {
        return this.Field1296.getBytes(a2, a3);
    }

    public ByteBuf getBytes(int a2, byte[] a3, int a4, int a5) {
        return this.Field1296.getBytes(a2, a3, a4, a5);
    }

    public ByteBuf getBytes(int a2, ByteBuffer a3) {
        return this.Field1296.getBytes(a2, a3);
    }

    public ByteBuf getBytes(int a2, OutputStream a3, int a4) throws IOException {
        return this.Field1296.getBytes(a2, a3, a4);
    }

    public int getBytes(int a2, GatheringByteChannel a3, int a4) throws IOException {
        return this.Field1296.getBytes(a2, a3, a4);
    }

    public ByteBuf setBoolean(int a2, boolean a3) {
        return this.Field1296.setBoolean(a2, a3);
    }

    public ByteBuf setByte(int a2, int a3) {
        return this.Field1296.setByte(a2, a3);
    }

    public ByteBuf setShort(int a2, int a3) {
        return this.Field1296.setShort(a2, a3);
    }

    public ByteBuf setMedium(int a2, int a3) {
        return this.Field1296.setMedium(a2, a3);
    }

    public ByteBuf setInt(int a2, int a3) {
        return this.Field1296.setInt(a2, a3);
    }

    public ByteBuf setLong(int a2, long a3) {
        return this.Field1296.setLong(a2, a3);
    }

    public ByteBuf setChar(int a2, int a3) {
        return this.Field1296.setChar(a2, a3);
    }

    public ByteBuf setFloat(int a2, float a3) {
        return this.Field1296.setFloat(a2, a3);
    }

    public ByteBuf setDouble(int a2, double a3) {
        return this.Field1296.setDouble(a2, a3);
    }

    public ByteBuf setBytes(int a2, ByteBuf a3) {
        return this.Field1296.setBytes(a2, a3);
    }

    public ByteBuf setBytes(int a2, ByteBuf a3, int a4) {
        return this.Field1296.setBytes(a2, a3, a4);
    }

    public ByteBuf setBytes(int a2, ByteBuf a3, int a4, int a5) {
        return this.Field1296.setBytes(a2, a3, a4, a5);
    }

    public ByteBuf setBytes(int a2, byte[] a3) {
        return this.Field1296.setBytes(a2, a3);
    }

    public ByteBuf setBytes(int a2, byte[] a3, int a4, int a5) {
        return this.Field1296.setBytes(a2, a3, a4, a5);
    }

    public ByteBuf setBytes(int a2, ByteBuffer a3) {
        return this.Field1296.setBytes(a2, a3);
    }

    public int setBytes(int a2, InputStream a3, int a4) throws IOException {
        return this.Field1296.setBytes(a2, a3, a4);
    }

    public int setBytes(int a2, ScatteringByteChannel a3, int a4) throws IOException {
        return this.Field1296.setBytes(a2, a3, a4);
    }

    public ByteBuf setZero(int a2, int a3) {
        return this.Field1296.setZero(a2, a3);
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

    public ByteBuf readBytes(int a2) {
        return this.Field1296.readBytes(a2);
    }

    public ByteBuf readSlice(int a2) {
        return this.Field1296.readSlice(a2);
    }

    public ByteBuf readBytes(ByteBuf a2) {
        return this.Field1296.readBytes(a2);
    }

    public ByteBuf readBytes(ByteBuf a2, int a3) {
        return this.Field1296.readBytes(a2, a3);
    }

    public ByteBuf readBytes(ByteBuf a2, int a3, int a4) {
        return this.Field1296.readBytes(a2, a3, a4);
    }

    public ByteBuf readBytes(byte[] a2) {
        return this.Field1296.readBytes(a2);
    }

    public ByteBuf readBytes(byte[] a2, int a3, int a4) {
        return this.Field1296.readBytes(a2, a3, a4);
    }

    public ByteBuf readBytes(ByteBuffer a2) {
        return this.Field1296.readBytes(a2);
    }

    public ByteBuf readBytes(OutputStream a2, int a3) throws IOException {
        return this.Field1296.readBytes(a2, a3);
    }

    public int readBytes(GatheringByteChannel a2, int a3) throws IOException {
        return this.Field1296.readBytes(a2, a3);
    }

    public ByteBuf skipBytes(int a2) {
        return this.Field1296.skipBytes(a2);
    }

    public ByteBuf writeBoolean(boolean a2) {
        return this.Field1296.writeBoolean(a2);
    }

    public ByteBuf writeByte(int a2) {
        return this.Field1296.writeByte(a2);
    }

    public ByteBuf writeShort(int a2) {
        return this.Field1296.writeShort(a2);
    }

    public ByteBuf writeMedium(int a2) {
        return this.Field1296.writeMedium(a2);
    }

    public ByteBuf writeInt(int a2) {
        return this.Field1296.writeInt(a2);
    }

    public ByteBuf writeLong(long a2) {
        return this.Field1296.writeLong(a2);
    }

    public ByteBuf writeChar(int a2) {
        return this.Field1296.writeChar(a2);
    }

    public ByteBuf writeFloat(float a2) {
        return this.Field1296.writeFloat(a2);
    }

    public ByteBuf writeDouble(double a2) {
        return this.Field1296.writeDouble(a2);
    }

    public ByteBuf writeBytes(ByteBuf a2) {
        return this.Field1296.writeBytes(a2);
    }

    public ByteBuf writeBytes(ByteBuf a2, int a3) {
        return this.Field1296.writeBytes(a2, a3);
    }

    public ByteBuf writeBytes(ByteBuf a2, int a3, int a4) {
        return this.Field1296.writeBytes(a2, a3, a4);
    }

    public ByteBuf writeBytes(byte[] a2) {
        return this.Field1296.writeBytes(a2);
    }

    public ByteBuf writeBytes(byte[] a2, int a3, int a4) {
        return this.Field1296.writeBytes(a2, a3, a4);
    }

    public ByteBuf writeBytes(ByteBuffer a2) {
        return this.Field1296.writeBytes(a2);
    }

    public int writeBytes(InputStream a2, int a3) throws IOException {
        return this.Field1296.writeBytes(a2, a3);
    }

    public int writeBytes(ScatteringByteChannel a2, int a3) throws IOException {
        return this.Field1296.writeBytes(a2, a3);
    }

    public ByteBuf writeZero(int a2) {
        return this.Field1296.writeZero(a2);
    }

    public int indexOf(int a2, int a3, byte a4) {
        return this.Field1296.indexOf(a2, a3, a4);
    }

    public int bytesBefore(byte a2) {
        return this.Field1296.bytesBefore(a2);
    }

    public int bytesBefore(int a2, byte a3) {
        return this.Field1296.bytesBefore(a2, a3);
    }

    public int bytesBefore(int a2, int a3, byte a4) {
        return this.Field1296.bytesBefore(a2, a3, a4);
    }

    public int forEachByte(ByteBufProcessor a2) {
        return this.Field1296.forEachByte(a2);
    }

    public int forEachByte(int a2, int a3, ByteBufProcessor a4) {
        return this.Field1296.forEachByte(a2, a3, a4);
    }

    public int forEachByteDesc(ByteBufProcessor a2) {
        return this.Field1296.forEachByteDesc(a2);
    }

    public int forEachByteDesc(int a2, int a3, ByteBufProcessor a4) {
        return this.Field1296.forEachByteDesc(a2, a3, a4);
    }

    public ByteBuf copy() {
        return this.Field1296.copy();
    }

    public ByteBuf copy(int a2, int a3) {
        return this.Field1296.copy(a2, a3);
    }

    public ByteBuf slice() {
        return this.Field1296.slice();
    }

    public ByteBuf slice(int a2, int a3) {
        return this.Field1296.slice(a2, a3);
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

    public ByteBuffer nioBuffer(int a2, int a3) {
        return this.Field1296.nioBuffer(a2, a3);
    }

    public ByteBuffer internalNioBuffer(int a2, int a3) {
        return this.Field1296.internalNioBuffer(a2, a3);
    }

    public ByteBuffer[] nioBuffers() {
        return this.Field1296.nioBuffers();
    }

    public ByteBuffer[] nioBuffers(int a2, int a3) {
        return this.Field1296.nioBuffers(a2, a3);
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

    public String toString(Charset a2) {
        return this.Field1296.toString(a2);
    }

    public String toString(int a2, int a3, Charset a4) {
        return this.Field1296.toString(a2, a3, a4);
    }

    public int hashCode() {
        return this.Field1296.hashCode();
    }

    public boolean equals(Object a2) {
        return this.Field1296.equals(a2);
    }

    public int compareTo(ByteBuf a2) {
        return this.Field1296.compareTo(a2);
    }

    public String toString() {
        return this.Field1296.toString();
    }

    public ByteBuf retain(int a2) {
        return this.Field1296.retain(a2);
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

    public boolean release(int a2) {
        return this.Field1296.release(a2);
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