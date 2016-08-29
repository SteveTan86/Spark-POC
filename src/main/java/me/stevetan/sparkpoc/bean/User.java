package me.stevetan.sparkpoc.bean;

import lombok.Builder;
import lombok.Data;

/**
 * Created by stevetan on 19/8/16.
 */
@Builder
@Data
public class User extends BaseBean {

    private String name;
    private String email;
    private String mobilePhoneNumber;

}
