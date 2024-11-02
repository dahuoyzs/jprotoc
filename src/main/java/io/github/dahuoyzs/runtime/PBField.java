package io.github.dahuoyzs.runtime;


public class PBField {
    //Tag
    long fieldNumber;
    int wireType;
    //len
    long length;
    //val
    Object val;

    public long getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(long fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public int getWireType() {
        return wireType;
    }

    public void setWireType(int wireType) {
        this.wireType = wireType;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "PBField{" +
                "fieldNumber=" + fieldNumber +
                ", wireType=" + wireType +
                ", length=" + length +
                ", val=" + val +
                '}';
    }
}
