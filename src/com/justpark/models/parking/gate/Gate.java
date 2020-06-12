package com.justpark.models.parking.gate;

import com.justpark.models.accounts.Attendant;
import com.justpark.models.AutoExitPanel;
import com.justpark.models.DBObject;

public abstract class Gate extends DBObject {

    private GateType type;
    private String gateName;
    private Attendant attendant;
    private AutoExitPanel exitPanel;

    abstract void open();
    abstract  void close();
}
