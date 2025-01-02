package com.everyone.common;

import java.util.Arrays;
import java.util.List;

public enum TypeEnum {
    ;

    private List<String> titleList;

    TypeEnum(List<String> titleList) {
        this.titleList = titleList;
    }

    public static TypeEnum findByVal(String v) {
        return Arrays.stream(TypeEnum.values())
                .filter(a -> a.hasCode(v))
                .findAny()
                .orElse(null);
    }

    public boolean hasCode(String val) {
        return titleList.stream().anyMatch(a -> a.equals(val));
    }
}
