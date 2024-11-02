package io.github.dahuoyzs.runtime;

/**
 Type	Meaning 	    Used For

 0	    Varint	            int32, int64, uint32, uint64, sint32, sint64, bool, enum
 1	    64-bit	            fixed64, sfixed64, double
 2	    Length-delimited	string, bytes, embedded messages, packed repeated fields
 3	    Start group	        groups (deprecated)
 4	    End group	        groups (deprecated)
 5	    32-bit	            fixed32, sfixed32, float
 */
public enum WireType {
    VINT(0, "VINT", 0),
    BIT64(1, "DOUBLE", 8),
    OBJ_STR(2, "OBJ_STR", 0),
    START(3, "START", 0),
    END(4, "END", 0),
    BIT32(5, "FLOAT", 4),

    ;
    private int type;
    private String name;
    private int len;

    private WireType(int type,String name, int len) {
        this.type = type;
        this.name = name;
        this.len = len;
    }


    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLen() {
        return len;
    }

    public static WireType valueOf(int type) {
        for (WireType wireType : WireType.values()) {
            if (wireType.getType() == type) {
                return wireType;
            }
        }
        return START;
    }
}
