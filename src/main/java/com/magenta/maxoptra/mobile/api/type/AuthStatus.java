package com.magenta.maxoptra.mobile.api.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AuthStatus")
@XmlEnum
public enum AuthStatus {
    OK,
    USER_NOT_FOUND
}
