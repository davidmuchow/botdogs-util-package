package org.botdogs.misc.util;

public interface BDUpdatable {
    public abstract void update();
    
    public abstract String getID();

    public abstract void updateStatus();

    public abstract String getStatus();
}
