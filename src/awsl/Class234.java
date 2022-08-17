package awsl;

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

public class Class234 extends ByteBuf {
   protected ByteBuf Field1296;
   private static boolean Field1297;

   public Class234(ByteBuf a) {
      this.Field1296 = a;
   }

   public Class606 Method2092() {
      Class606 a = new Class606();
      String a = this.Method497();
      Method1270();
      String a = this.Method497();
      int a = this.readInt();
      String a = this.Method497();
      String a = this.Method497();
      String a = this.Method497();
      long a = this.readLong();
      long a = this.readLong();
      long a = this.readLong();
      boolean a = this.readBoolean();
      boolean a = this.readBoolean();
      a.Field2838 = a;
      a.Field2839 = a;
      a.Field2843 = a;
      a.Field2840 = a;
      a.Field2841 = a;
      a.Field2842 = a;
      a.Field2844 = a;
      a.Field2845 = a;
      a.Field2846 = a;
      a.Field2847 = a;
      a.Field2848 = a;
      a.trash(new String[5]);
      return a;
   }

   public void Method2093(Class606 a) {
      Method1269();
      this.Method496(a.Field2838);
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
      if (a.trash() == null) {
         Method1268(false);
      }

   }

   public void Method496(String a) {
      this.writeInt(a.getBytes(Charsets.UTF_8).length);
      this.writeBytes(a.getBytes(Charsets.UTF_8));
   }

   public String Method497() {
      byte[] a = new byte[this.readInt()];

      for(int a = 0; a < a.length; ++a) {
         a[a] = this.readByte();
      }

      return new String(a, Charsets.UTF_8);
   }

   public int Method10() {
      Method1269();
      int a = 0;
      int a = 0;
      byte a = this.readByte();
      a |= (a & 127) << a++ * 7;
      if (a > 5) {
         throw new RuntimeException("VarInt too big");
      } else {
         if ((a & 128) != 128) {
            ;
         }

         return a;
      }
   }

   public static int Method1612(int a) {
      for(int a = 1; a < 5; ++a) {
         if ((a & -1 << a * 7) == 0) {
            return a;
         }
      }

      return 5;
   }

   public void Method9(int a) {
      while((a & -128) != 0) {
         this.writeByte(a & 127 | 128);
         a >>>= 7;
      }

      this.writeByte(a);
   }

   public void Method2094(long a) {
      boolean var3 = Method1269();
      if ((a & -128L) != 0L) {
         this.writeByte((int)(a & 127L) | 128);
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

   public ByteBuf setIndex(int a, int a) {
      return this.Field1296.setIndex(a, a);
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

   public int ensureWritable(int a, boolean a) {
      return this.Field1296.ensureWritable(a, a);
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

   public ByteBuf getBytes(int a, ByteBuf a) {
      return this.Field1296.getBytes(a, a);
   }

   public ByteBuf getBytes(int a, ByteBuf a, int a) {
      return this.Field1296.getBytes(a, a, a);
   }

   public ByteBuf getBytes(int a, ByteBuf a, int a, int a) {
      return this.Field1296.getBytes(a, a, a, a);
   }

   public ByteBuf getBytes(int a, byte[] a) {
      return this.Field1296.getBytes(a, a);
   }

   public ByteBuf getBytes(int a, byte[] a, int a, int a) {
      return this.Field1296.getBytes(a, a, a, a);
   }

   public ByteBuf getBytes(int a, ByteBuffer a) {
      return this.Field1296.getBytes(a, a);
   }

   public ByteBuf getBytes(int a, OutputStream a, int a) throws IOException {
      return this.Field1296.getBytes(a, a, a);
   }

   public int getBytes(int a, GatheringByteChannel a, int a) throws IOException {
      return this.Field1296.getBytes(a, a, a);
   }

   public ByteBuf setBoolean(int a, boolean a) {
      return this.Field1296.setBoolean(a, a);
   }

   public ByteBuf setByte(int a, int a) {
      return this.Field1296.setByte(a, a);
   }

   public ByteBuf setShort(int a, int a) {
      return this.Field1296.setShort(a, a);
   }

   public ByteBuf setMedium(int a, int a) {
      return this.Field1296.setMedium(a, a);
   }

   public ByteBuf setInt(int a, int a) {
      return this.Field1296.setInt(a, a);
   }

   public ByteBuf setLong(int a, long a) {
      return this.Field1296.setLong(a, a);
   }

   public ByteBuf setChar(int a, int a) {
      return this.Field1296.setChar(a, a);
   }

   public ByteBuf setFloat(int a, float a) {
      return this.Field1296.setFloat(a, a);
   }

   public ByteBuf setDouble(int a, double a) {
      return this.Field1296.setDouble(a, a);
   }

   public ByteBuf setBytes(int a, ByteBuf a) {
      return this.Field1296.setBytes(a, a);
   }

   public ByteBuf setBytes(int a, ByteBuf a, int a) {
      return this.Field1296.setBytes(a, a, a);
   }

   public ByteBuf setBytes(int a, ByteBuf a, int a, int a) {
      return this.Field1296.setBytes(a, a, a, a);
   }

   public ByteBuf setBytes(int a, byte[] a) {
      return this.Field1296.setBytes(a, a);
   }

   public ByteBuf setBytes(int a, byte[] a, int a, int a) {
      return this.Field1296.setBytes(a, a, a, a);
   }

   public ByteBuf setBytes(int a, ByteBuffer a) {
      return this.Field1296.setBytes(a, a);
   }

   public int setBytes(int a, InputStream a, int a) throws IOException {
      return this.Field1296.setBytes(a, a, a);
   }

   public int setBytes(int a, ScatteringByteChannel a, int a) throws IOException {
      return this.Field1296.setBytes(a, a, a);
   }

   public ByteBuf setZero(int a, int a) {
      return this.Field1296.setZero(a, a);
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

   public ByteBuf readBytes(ByteBuf a, int a) {
      return this.Field1296.readBytes(a, a);
   }

   public ByteBuf readBytes(ByteBuf a, int a, int a) {
      return this.Field1296.readBytes(a, a, a);
   }

   public ByteBuf readBytes(byte[] a) {
      return this.Field1296.readBytes(a);
   }

   public ByteBuf readBytes(byte[] a, int a, int a) {
      return this.Field1296.readBytes(a, a, a);
   }

   public ByteBuf readBytes(ByteBuffer a) {
      return this.Field1296.readBytes(a);
   }

   public ByteBuf readBytes(OutputStream a, int a) throws IOException {
      return this.Field1296.readBytes(a, a);
   }

   public int readBytes(GatheringByteChannel a, int a) throws IOException {
      return this.Field1296.readBytes(a, a);
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

   public ByteBuf writeBytes(ByteBuf a, int a) {
      return this.Field1296.writeBytes(a, a);
   }

   public ByteBuf writeBytes(ByteBuf a, int a, int a) {
      return this.Field1296.writeBytes(a, a, a);
   }

   public ByteBuf writeBytes(byte[] a) {
      return this.Field1296.writeBytes(a);
   }

   public ByteBuf writeBytes(byte[] a, int a, int a) {
      return this.Field1296.writeBytes(a, a, a);
   }

   public ByteBuf writeBytes(ByteBuffer a) {
      return this.Field1296.writeBytes(a);
   }

   public int writeBytes(InputStream a, int a) throws IOException {
      return this.Field1296.writeBytes(a, a);
   }

   public int writeBytes(ScatteringByteChannel a, int a) throws IOException {
      return this.Field1296.writeBytes(a, a);
   }

   public ByteBuf writeZero(int a) {
      return this.Field1296.writeZero(a);
   }

   public int indexOf(int a, int a, byte a) {
      return this.Field1296.indexOf(a, a, a);
   }

   public int bytesBefore(byte a) {
      return this.Field1296.bytesBefore(a);
   }

   public int bytesBefore(int a, byte a) {
      return this.Field1296.bytesBefore(a, a);
   }

   public int bytesBefore(int a, int a, byte a) {
      return this.Field1296.bytesBefore(a, a, a);
   }

   public int forEachByte(ByteBufProcessor a) {
      return this.Field1296.forEachByte(a);
   }

   public int forEachByte(int a, int a, ByteBufProcessor a) {
      return this.Field1296.forEachByte(a, a, a);
   }

   public int forEachByteDesc(ByteBufProcessor a) {
      return this.Field1296.forEachByteDesc(a);
   }

   public int forEachByteDesc(int a, int a, ByteBufProcessor a) {
      return this.Field1296.forEachByteDesc(a, a, a);
   }

   public ByteBuf copy() {
      return this.Field1296.copy();
   }

   public ByteBuf copy(int a, int a) {
      return this.Field1296.copy(a, a);
   }

   public ByteBuf slice() {
      return this.Field1296.slice();
   }

   public ByteBuf slice(int a, int a) {
      return this.Field1296.slice(a, a);
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

   public ByteBuffer nioBuffer(int a, int a) {
      return this.Field1296.nioBuffer(a, a);
   }

   public ByteBuffer internalNioBuffer(int a, int a) {
      return this.Field1296.internalNioBuffer(a, a);
   }

   public ByteBuffer[] nioBuffers() {
      return this.Field1296.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int a, int a) {
      return this.Field1296.nioBuffers(a, a);
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

   public String toString(int a, int a, Charset a) {
      return this.Field1296.toString(a, a, a);
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

   public ReferenceCounted retain(int integer) {
      return this.retain(integer);
   }

   public ReferenceCounted retain() {
      return this.retain();
   }

   public int compareTo(Object object) {
      return this.compareTo((ByteBuf)object);
   }

   public static void Method1268(boolean boolean1) {
      Field1297 = boolean1;
   }

   public static boolean Method1269() {
      return Field1297;
   }

   public static boolean Method1270() {
      boolean var0 = Method1269();
      return true;
   }

   private static RuntimeException Method2095(RuntimeException runtimeException) {
      return runtimeException;
   }

   static {
      if (Method1269()) {
         Method1268(true);
      }

   }
}
