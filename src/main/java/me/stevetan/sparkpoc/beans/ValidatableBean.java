package me.stevetan.sparkpoc.beans;

import java.io.Serializable;

/**
 * Created by stevetan on 19/8/16.
 */
public abstract class ValidatableBean implements Serializable {
    public boolean isValid() {
        return false;
    }
}
