package com.magenta.maxoptra.api.mobile.node.mns0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "MessageError")
@XmlEnum(Integer.class)
public enum MessageError {
    @XmlEnumValue("1") UNSUPPORTED_OPERATION(1),
    @XmlEnumValue("2") FIELD_IS_REQUIRED(2);

    Integer code;

    MessageError(Integer code) {
        this.code = code;
    }

}
