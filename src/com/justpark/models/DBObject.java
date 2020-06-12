package com.justpark.models;

import java.util.Objects;

public abstract class DBObject {
    private final long uid;
    private static long NEW_UID = 0;

    public DBObject() {
        this.uid = NEW_UID++;
    }

    public long getUid() {
        return uid;
    }

    @Override
    public boolean equals(Object ob){
        if(this == ob) return true;
        if(ob==null || getClass() != ob.getClass()) return false;
        DBObject dbObject = (DBObject) ob;
        return uid==dbObject.uid;
    }

    @Override
    public int hashCode(){
        return Objects.hash(uid);
    }
}
