package me.stevetan.sparkpoc.beans;

import lombok.Data;

/**
 * Created by stevetan on 19/8/16.
 */
@Data
public class User extends ValidatableBean {

    private String name;
    private String email;
    private String mobilePhoneNumber;


    @Override
    public boolean isValid() {
        // User must have either a valid email or mobile phone number
        return super.isValid() && (this.email != null || this.mobilePhoneNumber != null);
    }
}
