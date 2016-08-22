package me.stevetan.sparkpoc.configs;

import lombok.Getter;

/**
 * Created by stevetan on 22/8/16.
 */
public enum AppConfig {
    PORT("APP_PORT", "8080");

    @Getter
    private final String value;

    AppConfig(String envKeyName, String defaultValue) {
        String tempValue = System.getenv(envKeyName);

        if (tempValue == null || tempValue.isEmpty()) {
            this.value = defaultValue;
        } else {
            this.value = tempValue;
        }
    }
}
